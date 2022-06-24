# SENTENCIAS
El compilador de Java ejecuta el código de arriba a abajo. Las declaraciones en el
código se ejecutan según el orden en que aparecen. Sin embargo, Java proporciona
sentencias que se pueden usar para controlar el flujo del código Java. Estas
declaraciones se denominan declaraciones de flujo de control. Es una de las
características fundamentales de Java, que proporciona un flujo fluido de programa.

## Declaración if
Imagina que estamos escribiendo un programa que inscribe a los estudiantes a cursos.

● Si un estudiante ha completado los requisitos previos, puede inscribirse en un
curso.

● De lo contrario, deberá tomar los cursos previos que requiere.

No pueden tomar Física II sin terminar Física I.

Representamos este tipo de toma de decisiones en nuestro programa en Java utilizando
sentencias condicionales o de flujo de control. Antes de este punto, nuestro código se
ejecutaba línea por línea de arriba hacia abajo, pero las declaraciones condicionales nos
permiten ser selectivos en qué partes se ejecutarán.

Las declaraciones condicionales verifican una condición booleana (boolean) y ejecutan
un bloque de código según la condición. Las llaves marcan el alcance de un bloque
condicional similar a un método o clase.

Sintaxis

      if (condicion) {
        // bloque de código a ejecutar si la condición es verdadera
        }
        
      int x = 20;
      int y = 18;
      if (x > y) {
       System.out.println("x es mayor que y");
      }
      
## Declaración if-else
Hemos visto cómo ejecutar un bloque de código usando un condicional, pero ¿qué pasa
si hay dos posibles bloques de código que nos gustaría ejecutar?
Por ejemplo, si un estudiante tiene el curso previo requerido, entonces se inscribe en el
curso seleccionado, de lo contrario, se inscribe en el curso previo requerido.
Creamos una rama condicional alternativa con la palabra clave else.

Sintaxis

      if (condicion) {
        //bloque de código a ejecutar si la condición es verdadera
      } else {
        //bloque de código a ejecutar si la condición es falsa
      }
      
 EJEMPLO
 
       if (tienePrerequisito) {
         // Inscríbete en el curso
       } else {
         // Inscríbete en curso previo requerido
       }
       
  Ejemplo.
  
      int numero = 10;
        // comprueba si el número es mayor que 0
      if (numero > 0) {
       System.out.println("El número es positivo.");
      }
       // ejecutar este bloque si el número no es mayor que 0
      else {
       System.out.println("El número no es positivo.");
      }
      
## Declaración if-else-if
La declaración if-else-if contiene la declaración if seguida de varias declaraciones else-if.
En otras palabras, podemos decir que es la cadena de sentencias if-else las que crean
un árbol de decisión donde el programa puede entrar en el bloque de código donde la
condición es verdadera. También podemos definir una sentencia else al final de la
cadena.

Sintaxis

      if(condicion1) {
        statement 1; //se ejecuta cuando la condicion1 es verdadera
      }
      else if(condicion2) {
       statement 2; //se ejecuta cuando la condicion2 es verdadera
      }
      ...
      else {
       statement 2; //se ejecuta cuando todas las condiciones son falsas
      }
      
 
Imagina que nuestro programa ahora está seleccionando el curso apropiado para un
estudiante. Verificaremos su envío para encontrar la inscripción correcta al curso.
La declaración condicional ahora tiene múltiples condiciones que se evalúan de arriba
hacia abajo:

      String course = "Teatro";
      if (course.equals("Biologia")) {
        // Inscríbete en el curso de Biología.
      } else if (course.equals("Algebra")) {
        // Inscríbete en el curso de Álgebra
      } else if (course.equals("Teatro")) {
       // Inscríbete en el curso de Teatro
      } else {
        System.out.println("¡Curso no encontrado!");
      }
      
 EJEMPLO
 
      int resultadoPrueba= 72;
      if (resultadoPrueba >= 90) {
        System.out.println("A");
      } else if (resultadoPrueba >= 80) {
        System.out.println("B");
      } else if (resultadoPrueba >= 70) {
        System.out.println("C");
      } else if (resultadoPrueba >= 60) {
        System.out.println("D");
      } else {
        System.out.println("F");
      }
      // imprime C
      
## Declaraciones condicionales anidadas
Podemos crear estructuras condicionales más complejas creando declaraciones
condicionales anidadas, que se crean colocando declaraciones condicionales dentro de
otras declaraciones condicionales.

Sintaxis

      if (condición exterior) {
      if (condición anidada) {
        Instrucción a ejecutar si ambas condiciones son verdaderas
      }
      else{
        se ejecuta cuando la condición anidada es falsa
      }
      }
      
Cuando implementamos declaraciones condicionales anidadas, la declaración externa se
evalúa primero. Si la condición externa es verdadera (true), entonces se evalúa la
declaración anidada interna.

Vamos a crear un programa que nos ayude a decidir qué ponernos según el clima:

EJEMPLO

      int temp = 45;
      boolean lluvia = true;
      if (temp < 60)
      {
       System.out.println ("B!Utiliza una chamarra!");
      if (lluvia == true)
      {
       System.out.println ("Consigue una sombrilla.");
      }
      else
      {
       System.out.println ("No es necesario que lleves tu sombrilla.");
      }
      }
      
En el fragmento de código anterior, nuestro compilador verificará la condición en la
primera declaración if-then: temp < 60. Dado que temp tiene un valor de 45, esta
condición es verdadera; por lo tanto, nuestro programa imprimirá ¡Utiliza una chamarra!
Luego, evaluaremos la condición de la declaración if-then anidada: lluvia == true. Esta
condición también es verdadera (true), por lo que Consigue una sombrilla también se
imprime en la pantalla.

Ten en cuenta que, si la primera condición fuera falsa (false), la condición anidada no se
evaluaría.
