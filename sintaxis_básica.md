Dentro de HolaMundo.java, teníamos una clase (class):

    public class HolaMundo{
    }


Marcamos el dominio de este concepto usando llaves: {}. La sintaxis dentro de las llaves
es parte de la clase.

Cada archivo tiene una clase principal que lleva el nombre del archivo. Nuestro nombre
de clase: HolaMundo y nuestro nombre de archivo: HolaMundo.java. Cada palabra está
en mayúscula.

Dentro de la clase teníamos un método main() que enumera las tareas de nuestro
programa:

    public static void main(String[] args) {
    }

Al igual que las clases, usamos llaves para marcar el comienzo y el final de un método.
public, static y void son sintaxis que aprenderemos más adelante. String[] args es un
marcador de posición para la información que queremos pasar a nuestro programa. Esta
sintaxis es necesaria para que el programa se ejecute, pero es más avanzada de lo que
necesitamos explorar en este momento.

Nuestro programa también mostraba el texto "¡Hola Mundo!" en la pantalla. Esto se logró
mediante una declaración de impresión:

    System.out.println("Hello World");

Desglosemos un poco más esta línea de código. No te preocupes si algunos de los
términos aquí son nuevos para tí. ¡Profundizaremos en lo que son todos estos con mucho
más detalle más adelante!

● System es una clase de Java incorporada que contiene herramientas útiles para
nuestros programas.

● out es la abreviatura de "output" (“salida”).

● println es la abreviatura de “print line” ("línea de impresión").

● punto y coma se utilizan para marcar el final de una declaración, una línea de
código que realiza una sola tarea.

Podemos usar System.out.println() siempre que queramos que el programa cree una
nueva línea en la pantalla después de generar un valor:

    System.out.println("¡Hola Mundo!");
    System.out.println("¡Hoy es un grandioso día para programar!");

Después de imprimir "¡Hola Mundo!", la terminal de salida crea una nueva línea para que
se emita la siguiente instrucción. Este programa imprimirá cada declaración en una
nueva línea así:

    ¡Hola Mundo!
    ¡Hoy es un gran día para programar!

También podemos generar información usando System.out.print(). Ten en cuenta que
estamos usando print(), no println(). A diferencia de System.out.println(), este tipo de
declaración de impresión genera todo en la misma línea. Por ejemplo:

    System.out.print("Hola ");
    System.out.print("Mundo");

El código anterior tendrá el siguiente resultado:

    Hola Mundo

En este ejemplo, si usaras print() o println() nuevamente, el nuevo texto se imprimirá
inmediatamente después de Mundo en la misma línea. Es importante recordar dónde
dejaste el "cursor" de tu programa. Si usas println(), el cursor se mueve a la siguiente
línea. Si usa print(), el cursor permanece en la misma línea.

En el futuro, todos los ejemplos usarán System.out.println() para generar valores.

Las personas también leen el código, y queremos que nuestras intenciones sean claras
para los humanos al igual que queremos que nuestras instrucciones sean claras para la
computadora.

Para esto, podemos escribir comentarios, notas para lectores humanos de nuestro
código. Estos comentarios no se ejecutan, por lo que no se necesita una sintaxis válida
dentro de un comentario.

Cuando los comentarios son cortos, usamos la sintaxis de una sola línea:

    // Contenido dentro de la clase

Cuando los comentarios son largos, usamos la sintaxis para varias líneas:

    /* Mi primer programa
    */

Otro tipo de opción de comentarios es el comentario de Javadoc, que se representa
mediante /** y */. Los comentarios de Javadoc se utilizan para crear documentación
para las API (interfaces de programación de aplicaciones). Al escribir comentarios de
Javadoc, recuerda que eventualmente se utilizarán en la documentación que tus usuarios
puedan leer, así que asegúrate de ser especialmente cuidadoso al escribir estos
comentarios.

Los comentarios de Javadoc generalmente se escriben antes de la declaración de
campos, métodos y clases (que veremos más adelante):

    /**
    La siguiente clase realiza la siguiente tarea...
    */
