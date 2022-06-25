# Práctica 2.

## 2. VARIABLES

Objetivo: Verificar el dominio teórico y técnico del concepto de variable en el lenguaje
de java mediante preguntas de opción múltiple y ejercicios para desarrollar su código.
Indicaciones: Pedir responder cada una de las preguntas de manera acertada, breve y
clara, según sea el caso.

1. ¿Cuál de las siguientes líneas arrojaría un error de compilación? (Valor 1 punto)

          a. int balance = -30;
          b. double isRaining = false;
          c. String gradeOnTest = "A";
          d. char grade_on_test = 'F';

2. ¿Cuál de los siguientes valores es un char válido? (Valor 1 punto)

          a. "a"
          b. 'ab'
          c. 'F'
          d. 7

3. ¿A qué tipo de datos solo se le puede asignar uno de dos valores? (Valor 1 punto)

          a. char
          b. double
          c. boolean
          d. int

4. ¿Qué línea declara la variable bestProgrammingLanguage y la inicializa para que
sea "Java"? (Valor 1 punto)

          a. bestProgrammingLanguage = String "Java";
          b. string bestProgrammingLanguage = "Java";
          c. String bestProgrammingLanguage = "Java";
          d. "Java" = String bestProgrammingLanguage;


5. ¿Qué opción es un nombre de variable válido y sigue las convenciones de
nomenclatura de Java? (Valor 1 punto)

          a. 2ndPhoneNumber
          b. TimeUntilLaunch
          c. second_phone_number
          d. timeUntilLaunch

6. ¿Qué línea de código declara una variable llamada numConejos para almacenar
un número entero? (Valor 1 punto)

          a. numConejos = int;
          b. numConejos int;
          c. number numConejos;
          d. int numConejos;

7. ¿Qué valor NO se puede asignar a una variable con el tipo de datos double? (Valor
1 punto)

          a. "60"
          b. 6.7
          c. 5
          d. -.2

8. Supón que tienes un programa llamado Creador.java y dentro de este hemos
definido algunas variables relacionadas a James Gosling, el creador de Java como
se muestra a continuación: (Valor 2 puntos)

                    public class Creator {

                      public static void main(String[] args) {

                       String nombre = "James Gosling";

                       int yearCreado = 1995;

                      }

                    }

a. Dentro de main(), use System.out.println() para imprimir la variable
nombre.

b. Use el mismo comando para imprimir yearCreado.

c. Escribe la salida.


      Salida:
      James Gosling
      1995

9. Supón que tienes un programa llamado ContComentarios.java y dentro de este
tenemos el siguiente código definido: (Valor 2 puntos)

                //Esta es la declaración de la clase
                public class ContComentarios {
                  //Este es el método main que se ejecuta cuando compilas
                  public static void main(String[] args) {
                    //Aquí es donde vas a definir tu variable
                    //Aquí es donde vas a imprimir tu variable
                    }
                    //Este es el final de la class
                  }
                //Esto está afuera de la clase

El archivo ContComentarios.java tiene varios comentarios.

a. En tu cabeza, cuenta el número de comentarios. Luego, dentro del método main(),
declara una variable llamada numComentarios que contiene cuántos comentarios
contaste.

b. Imprime numComments.

c. Escribe la salida.

      Salida:
      6

10. Considera el código del siguiente programa escrito en Java cuyo nombre del
archivo es CuotaMercado.java: (Valor 2 puntos)

              public class CuotaMercado {
                public static void main(String[] args) {
                }
              }

Al año 2022, Android tiene el 70.97 por ciento de la cuota de mercado de los sistemas
operativos móviles.

a. Crea una variable llamada androidCuota que contenga este porcentaje como un
double.

b. Imprime en valor de androidShare en la consola.

c. Escribe la salida.

                Salida:
                70.97

11. Considera el código del siguiente programa escrito en Java cuyo nombre del
archivo es Booleans.java: (Valor 2 puntos)

              public class Booleans {
                public static void main(String[] args) {
                }
              }

a. Crea una variable llamada intsPuedeAlmacenarDecimales. Ponlo en verdadero
(True) si el tipo int puede contener un número decimal. Ponlo en falso (false) si el
tipo int no puede hacer esto.

b. Imprime la variable intsPuedeAlmacenarDecimales.

c. Escribe la salida.

                Salida:
                70.97

12. Considera el código del siguiente programa escrito en Java cuyo nombre del
archivo es Char.java: (Valor 2 puntos)

              public class Char {
                public static void main(String[] args) {
                }
              }
    
a. Escribe como comentario de una sola línea tu nombre

b. Crea una variable llamada primerLetra de tipo char y almacena ahí la primer
letra de tu nombre.

c. Imprime en la terminal el valor de la variable primerLetra.

d. Escribe la salida.


                Salida:
                M

13. Considera el código del siguiente programa escrito en Java cuyo nombre del
archivo es Poema.java: (Valor 2 puntos)

              public class Poema {
                public static void main(String[] args) {
                }
              }
    
a. Crea una variable llamada verso de tipo string y almacena ahí el verso “Aquí no
suceden cosas de mayor trascendencia que las rosas.”.

b. Invoca System.out.println() para imprimir el valor de la variable verso.

c. Escribe la salida.


                Salida:
                Aquí no suceden cosas de mayor trascendencia que las rosas.

14. Considera el código del siguiente programa escrito en Java cuyo nombre del
archivo es MiPerfil.java: (Valor 3 puntos)

              public class MyProfile {
                public static void main(String[] args) {

                }
              }
    
El archivo MiPerfil.java contiene una clase que representa tu perfil de contratación que
se presentará a potenciales empleadores.

a. En el método main(), crea una variable llamada nombre que contenga tu
nombre, como una secuencia de caracteres.

b. Crea una variable llamada edad que contenga tu edad como un número
entero.

c. Crea una variable llamada salarioDeseado que contenga tu salario
deseado por mes con una precisión de dos puntos decimales.

d. Crea una variable llamada genero que contenga un solo carácter, m
(masculino), f (femenino), n (para ninguno) u o (para otro).

e. Crea una variable llamada buscandoTrabajo que contenga si actualmente
estás abierto a ofertas de trabajo o no.

f. Iimprime el valor de cada una de las variables, una por cada línea.

g. Escribe la salida.


              Salida:
              Mi Nombre
              22
              500000.01
              n
              true
