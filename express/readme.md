## ¿Qué es Express?

Express es un marco de trabajo (framework) para Node.js que facilita la creación de aplicaciones web y APIs. Piensa en él como un conjunto de herramientas y funciones listas para usar que simplifican la creación de servidores web.

Inicializa un nuevo proyecto npm:

    npm init -y  //crea un json

Instala Express en tu proyecto:

    cd miPrimerProyectoExpress
    npm install express
    
Crear el Servidor Básico
Crea un archivo app.js y añade el siguiente código:

    const express = require('express');//Importar Express:
    const app = express(); //Crear una Aplicación Express:
    // Ruta principal que responde con un mensaje
    app.get('/', (req, res) => {    //Definir una Ruta GET
      res.send('¡Hola, bienvenido a tu primer servidor Express!');
    });
    // Iniciar el servidor en el puerto 3000
    app.listen(3000, () => {
      console.log('Servidor corriendo en http://localhost:3000');
    });

Ejecutar el Servidor
En tu terminal, ejecuta:

    node app.js
    
Abre tu navegador y ve a http://localhost:3000. Deberías ver el mensaje "¡Hola, bienvenido a tu primer servidor Express!".

## servir un HTML
Ahora se creará una estructura de archivos necesarios para servir un HTML

    /miPrimerProyectoExpress
          /public
              index.html
          app.js
          packege.json

Crea el Archivo index.html

    <!-- /public/index.html -->
    <!DOCTYPE html>
    <html lang="es">
    <head>
      <meta charset="UTF-8">
      <title>Bienvenida</title>
    </head>
    <body>
      <h1>¡Bienvenido a mi sitio web!</h1>
      <p>Esta es tu primera página servida con Express.</p>
    </body>
    </html>

Actualiza el Archivo app.js

    //Importamos los módulos express y path.
    const express = require('express');
    const path = require('path');
    const app = express();
    
    // Configura la carpeta pública para servir archivos estáticos
    app.use(express.static(path.join(__dirname, 'public')));
    
    // Ruta principal para servir el archivo HTML de bienvenida
    app.get('/', (req, res) => {
      res.sendFile(path.join(__dirname, 'public', 'index.html'));
    });
    
    // Iniciar el servidor en el puerto 3000
    app.listen(3000, () => {
      console.log('Servidor corriendo en http://localhost:3000');
    });
    
En la terminal escribe node app.js

## Manejo de formularios
 body-parser es un middleware en Node.js que ayuda a manejar datos del cuerpo de una solicitud HTTP. Cuando un cliente (como un navegador) envía una solicitud al servidor (como un formulario HTML), los datos se envían en el cuerpo de la solicitud. body-parser transforma estos datos en objetos JavaScript que puedes usar fácilmente en tu código.

 Actualiza el Archivo index.html
 
    <!DOCTYPE html>
    <html lang="es">
    <head>
      <meta charset="UTF-8">
      <title>Bienvenida</title>
    </head>
    <body>
      <h1>¡Bienvenido a mi sitio web!</h1>
      <p>Esta es tu primera página servida con Express.</p>
      
      <h2>Registro de Estudiantes</h2>
      <form id="studentForm">
        <input type="text" name="name" placeholder="Nombre" required><br>
        <input type="email" name="email" placeholder="Correo Electrónico" required><br>
        <input type="number" name="average" placeholder="Promedio" required step="0.01"><br>
        <button type="submit">Registrar</button>
      </form>
      <div id="response"></div>
    
      <script>
        document.getElementById('studentForm').addEventListener('submit', async function(event) {
          event.preventDefault(); //Evita que el formulario se envíe de manera tradicional, recargando la página.
          const formData = new FormData(this);//Crea un objeto FormData con los datos del formulario.
          const data = Object.fromEntries(formData);//Convierte FormData en un objeto JavaScript.
          const response = await fetch('/students', {  // Envía los datos al servidor usando fetch y el método POST.
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify(data)
          });
          const result = await response.json(); //Espera la respuesta del servidor y la convierte en un objeto JSON.
          //Muestra los datos del estudiante registrado en la página.
          document.getElementById('response').innerHTML = `    
            <p>Nombre: ${result.name}</p>
            <p>Correo: ${result.email}</p>
            <p>Promedio: ${result.average}</p>
          `;
          this.reset();   //Resetea el formulario después de enviar los datos.
        });
      </script>
    </body>
    </html>

FormData es una interfaz en JavaScript que facilita la construcción de conjuntos de pares clave/valor que representan los campos y valores de un formulario. Se puede utilizar para enviar datos del formulario de manera conveniente usando fetch

Object.fromEntries es un método que convierte una lista de pares clave/valor en un objeto. Es útil para transformar objetos FormData u otras estructuras similares en objetos JavaScript normales.

Actualiza app.js

    const express = require('express');//Importa el framework Express para crear servidores web.
    const bodyParser = require('body-parser'); //Middleware para manejar datos del cuerpo de las solicitudes HTTP.
    const path = require('path'); //Módulo de Node.js para trabajar con rutas de archivos.
    const Student = require('./Student'); //Importa la clase Student definida en un archivo separado.
    
    const app = express();  //Crea una instancia de la aplicación Express.
    const students = []; //Una lista vacía para almacenar instancias de estudiantes.
    
    app.use(bodyParser.urlencoded({ extended: false }));  //Configura bodyParser para manejar datos de formularios.
    app.use(bodyParser.json()); //Configura bodyParser para manejar datos JSON.
    app.use(express.static(path.join(__dirname, 'public'))); //Configura Express para servir archivos estáticos desde la carpeta public.
    
    // Ruta para agregar un nuevo estudiante
    app.post('/students', (req, res) => {  //Define una ruta POST para manejar el registro de nuevos estudiantes.
      const { name, email, average } = req.body;   //Extrae name, email, y average del cuerpo de la solicitud (req.body).
      const student = new Student(name, email, average);  //Crea una nueva instancia de Student con los datos proporcionados.
      students.push(student);   //Añade la nueva instancia de estudiante a la lista students.
      res.status(201).send(student.getDetails());  //Responde con los detalles del estudiante registrado y un código de estado 201 (Creado).
    });

    // Iniciar el servidor en el puerto 3000
    app.listen(3000, () => {
      console.log('Servidor corriendo en http://localhost:3000');
    });

Ahora creamos la clase Student que permitira crear los objetos alumnos, crea un archivo Student.js

        // Student.js
        class Student {
            constructor(name, email, average) {
              this.name = name;
              this.email = email;
              this.average = average;
            }
          
            getDetails() {
              return {
                name: this.name,
                email: this.email,
                average: this.average
              };
            }
          }
          
          module.exports = Student;

json

    {
      "name": "expres",
      "version": "1.0.0",
      "main": "app.js",
      "scripts": {
        "start": "node app.js",
        "test": "echo \"Error: no test specified\" && exit 1"
      },
      "keywords": [],
      "author": "",
      "license": "ISC",
      "description": "",
      "dependencies": {
        "express": "^4.21.1",
        "mysql": "^2.18.1"
      }
    }

En tu terminal, navega a la carpeta de tu proyecto y ejecuta:

      npm install

Iniciar el Servidor:

Ejecuta:

    npm start

Acceder a la Aplicación:

Abre tu navegador y visita http://localhost:3000

npm install. Este comando se utiliza para instalar todas las dependencias especificadas en el archivo package.json. Esto asegura que todas las bibliotecas y módulos necesarios estén disponibles en tu proyecto. Piensa en ello como comprar todos los ingredientes antes de empezar a cocinar según la receta.

## Conectar a una BD

Instalar el Módulo mysql

Primero, necesitamos instalar el módulo mysql que nos permitirá conectar Node.js con la base de datos MySQL. Ejecuta esto en tu terminal:

        npm install mysql

Configurar la Conexión a la Base de Datos

Actualiza tu archivo app.js para incluir la configuración de la base de datos:

        const express = require('express');
        const bodyParser = require('body-parser');
        const path = require('path');
        const mysql = require('mysql');
        const Student = require('./Student');
        
        const app = express();
        const students = [];
        
        // Configuración de la conexión a la base de datos MySQL
        const db = mysql.createConnection({
          host: 'localhost',
          user: 'tu_usuario',
          password: 'tu_contraseña',
          database: 'tu_base_de_datos'
        });
        
        db.connect((err) => {
          if (err) {
            console.error('Error al conectar a la base de datos:', err);
            return;
          }
          console.log('Conectado a la base de datos MySQL');
        });
        
        app.use(bodyParser.urlencoded({ extended: false }));
        app.use(bodyParser.json());
        app.use(express.static(path.join(__dirname, 'public')));
        
        // Ruta para agregar un nuevo estudiante
        app.post('/students', (req, res) => {
          const { name, email, average } = req.body;
          const student = new Student(name, email, average);
          students.push(student);
        
          // Insertar estudiante en la base de datos
          const query = 'INSERT INTO estudiantes (nombre, correo, promedio) VALUES (?, ?, ?)';
          db.query(query, [name, email, average], (err, result) => {
            if (err) {
              console.error('Error al insertar estudiante en la base de datos:', err);
              res.status(500).send('Error al registrar el estudiante');
              return;
            }
            res.status(201).send(student.getDetails());
          });
        });

        // Iniciar el servidor en el puerto 3000
        app.listen(3000, () => {
          console.log('Servidor corriendo en http://localhost:3000');
        });

Crear la Tabla en MySQL

Abre MySQL Workbench y crea una tabla para almacenar los estudiantes:

        CREATE TABLE estudiantes (
          id INT AUTO_INCREMENT PRIMARY KEY,
          nombre VARCHAR(100),
          correo VARCHAR(100),
          promedio DECIMAL(3,2)
        );

Probar la Conexión

        npm start

Abre tu navegador y visita http://localhost:3000.
