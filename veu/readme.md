# Introducción a Vue.js
Vue.js, uno de los frameworks de JavaScript más populares y versátiles para la creación de interfaces de usuario interactivas. Hoy vamos a sumergirnos en lo que hace que Vue.js sea tan especial y cómo pueden empezar a usarlo en sus propios proyectos.

## ¿Qué es Vue.js?
Vue.js es un framework progresivo de JavaScript, lo que significa que puedes usarlo gradualmente en tus proyectos. Es conocido por su simplicidad, flexibilidad y la capacidad de crear componentes reutilizables y escalables. Fue creado por Evan You y ha ganado popularidad gracias a su enfoque intuitivo y sus herramientas potentes.

## ¿Por qué Vue.js?

* Facilidad de Uso: Vue.js es fácil de aprender y empezar a usar. Su sintaxis es clara y amigable, lo que facilita el desarrollo de aplicaciones incluso para principiantes.

* Componentes Reutilizables: Permite crear componentes reutilizables que pueden ser fácilmente integrados y mantenidos.

* Reactividad: Vue.js tiene un sistema de reactividad muy potente que actualiza automáticamente la interfaz de usuario cuando cambian los datos.
  
* Comunidad Activa: Cuenta con una comunidad muy activa y una amplia gama de plugins y herramientas.

## Incorporar Vue.js: 
Puedes añadir Vue.js a tu proyecto de varias maneras, pero la más rápida es a través de una CDN:

## Crear una Instancia de Vue:
Vamos a crear nuestra primera instancia de Vue para entender cómo funciona:

    <!DOCTYPE html>
    <html lang="es">
    <head>
      <meta charset="UTF-8">
      <title>Hola Vue.js</title>
      <script src="https://cdn.jsdelivr.net/npm/vue@2"></script>
    </head>
    <body>
      <div id="app">
        {{ mensaje }}
      </div>
    
      <script>
        new Vue({  //Crea una nueva instancia de Vue. Piensa en esto como el punto de partida para usar Vue en tu aplicación. Una instancia de Vue controla una parte específica de tu página web.
          el: '#app',  //Especifica el elemento HTML al que se va a montar esta instancia de Vue. En este caso, es el elemento con el ID app. Vue tomará el control de este elemento y de todo lo que contiene.
          data: { //Define el estado de la instancia de Vue. Aquí declaramos todas las propiedades que queremos que Vue gestione.
            mensaje: '¡Hola, Vue.js!' 
          }
        });
      </script>
    </body>
    </html>

## otro ejemplo

    <!DOCTYPE html>
    <html lang="es">
    <head>
      <meta charset="UTF-8">
      <title>Introducción a Vue.js</title>
      <!-- Incluir Vue.js desde CDN -->
      <script src="https://cdn.jsdelivr.net/npm/vue@2"></script>
      <style>
        #app {
          font-family: Arial, sans-serif;
          text-align: center;
          margin-top: 50px;
        }
      </style>
    </head>
    <body>
      <div id="app">
        <h1>{{ mensaje }}</h1>  <!-- Vincula la variable mensaje del objeto data al DOM -->
        <button @click="contador++">Incrementar</button> <!-- es una directiva en Vue.js que se utiliza para agregar controladores de eventos a elementos HTML. Incrementa el valor de contador -->
        <button @click="resetear">Resetear</button> <!--Llama al método resetear para restablecer el contador. --> 
        <p>El contador está en: {{ contador }}</p>  <!--Vincula la variable contador del objeto data al DOM. --> 
      </div>
    
      <script>
        new Vue({   //Crea una nueva instancia de Vue.
          el: '#app',  //Especifica el elemento DOM al que se montará Vue
          data: {   //Define las propiedades reactivas mensaje y contador.
            mensaje: '¡Bienvenido a Vue.js!',
            contador: 0
          },
          methods: {   //Define el método resetear que restablece el contador a 0.
            resetear() {
              this.contador = 0;
            }
          }
        });
      </script>
    </body>
    </html>

Ahora crearemos la pagina principal del proyecto alumno con Veu

    <!DOCTYPE html>
    <html lang="es">
    <head>
      <meta charset="UTF-8">
      <title>Registro de Estudiantes</title>
      <!-- Incluir Vue.js desde CDN -->
      <script src="https://cdn.jsdelivr.net/npm/vue@2"></script>
    </head>
    <body>
      <div id="app">
        <h1>¡Bienvenido a mi sitio web!</h1>
        <p>Esta es una pagina frontend con veu.</p>
    
        <h2>Registro de Estudiantes</h2>
        <form @submit.prevent="registrarEstudiante">
          <input type="text" v-model="name" placeholder="Nombre" required><br>
          <input type="email" v-model="email" placeholder="Correo Electrónico" required><br>
          <input type="number" v-model="average" placeholder="Promedio" required step="0.01"><br>
          <button type="submit">Registrar</button>
        </form>
        <div v-if="student">
          <h3>Estudiante Registrado:</h3>
          <p>Nombre: {{ student.name }}</p>
          <p>Correo: {{ student.email }}</p>
          <p>Promedio: {{ student.average }}</p>
        </div>
      </div>
    
      <script>
        new Vue({
          el: '#app',
          data: {
            name: '',
            email: '',
            average: '',
            student: null
          },
          methods: {
            async registrarEstudiante() {
              const response = await fetch('/students', {
                method: 'POST',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify({ name: this.name, email: this.email, average: this.average })
              });
              this.student = await response.json();
              // Limpiar formulario
              this.name = '';
              this.email = '';
              this.average = '';
            }
          }
        });
      </script>
    </body>
    </html>

en html

<div id="app">: Este es el elemento al que Vue se va a montar.

<form @submit.prevent="registrarEstudiante">: Vincula la función registrarEstudiante al evento de envío del formulario.

v-model: Bindea los campos del formulario con las propiedades de Vue (name, email, average).

v-if="student": Muestra la información del estudiante registrado si existe (student no es null).

en el script

new Vue({ ... }): Crea una nueva instancia de Vue.

el: '#app': Monta Vue en el elemento con ID app.

data: { ... }: Define el estado reactivo de Vue, con propiedades para name, email, average y student.

methods: { ... }: Define métodos que se pueden llamar desde el HTML. Aquí, registrarEstudiante maneja el envío del formulario, envía una solicitud POST al servidor y actualiza la propiedad student con la respuesta del servidor. También resetea los campos del formulario.
