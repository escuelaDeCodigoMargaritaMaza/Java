# HERENCIA

El ejemplo que proponemos es un caso en el que vamos a simular el comportamiento que tendrían los diferentes integrantes de una de futbol; tanto los Futbolistas como el cuerpo técnico (Entrenadores, Masajistas, etc…). Para simular este comportamiento vamos a definir tres clases que van a representaran a objetos Futbolista, Entrenador y Masajista. De cada unos de ellos vamos a necesitar algunos datos que reflejaremos en los atributos y una serie de acciones que reflejaremos en sus métodos. Estos atributos y métodos los mostramos en el siguiente diagrama de clases:

![image](https://user-images.githubusercontent.com/91554777/180472111-11d66540-de91-435b-b629-bc9586e53b63.png)

omo se puede observar, vemos que en las tres clases tenemos atributos y métodos que son iguales ya que los tres tienen los atributos id, Nombre, Apellidos y Edad; y los tres tienen los métodos de Viajar y Concentrarse:

![image](https://user-images.githubusercontent.com/91554777/180472179-c38304cd-d399-40ce-80aa-db8062fa0962.png)

Lo que podemos ver en este punto es que estamos escribiendo mucho código repetido ya que las tres clases tienen métodos y atributos comunes, de ahi y como veremos enseguida, decimos que la herencia consiste en "sacar factor común" para no escribir código de más, por tanto lo que haremos sera crearnos una clase con el "código que es común a las tres clases" (a esta clase se le denomina en la herencia como "Clase Padre o SuperClase") y el código que es  especifico de cada clase, lo dejaremos en ella, siendo denominadas estas clases como "Clases Hijas", las cuales heredan de la clase padre todos los atributos y métodos públicos o protegidos. Es muy importante decir que las clases hijas no van a heredar nunca los atributos y métodos privados de la clase padre, así que mucho cuidado con esto

![image](https://user-images.githubusercontent.com/91554777/180472406-f6737ff3-21d3-4bcb-8875-0e8b857c3a14.png)

A nivel de código, las clases quedarían implementadas de la siguiente forma:

![image](https://user-images.githubusercontent.com/91554777/180472538-9b5d0b9f-db43-460a-89fb-4dde098c77b2.png)

extends: Esta palabra reservada, indica a la clase hija cual va a ser su clase padre, es decir que por ejemplo en la clase Futbolista al poner "public class Futbolista extends SeleccionFutbol" le estamos indicando a la clase 'Futbolista' que su clase padre es la clase 'SeleccionFutbol' o dicho de otra manera para que se entienda mejor, al poner esto estamos haciendo un "copy-paste dinámico" diciendo a la clase 'Futbolista' que se 'copie' todos los atributos y métodos públicos o protegidos de la clase 'SeleccionFutbol'. De aquí viene esa 'definición' que dimos de que la herencia en un 'copy-paste dinámico'.
protected:  sirve para indicar un tipo de visibilidad de los atributos y métodos de la clase padre y significa que cuando un atributo es 'protected' o protegido, solo es visible ese atributo o método desde una de las clases hijas y no desde otra clase.
super: sirve para llamar al constructor de la clase padre. Quizás en el código que hemos puesto no se ha visto muy bien, pero a continuación lo mostramos de formas más clara, viendo el constructor de los objetos pasándole los atributos:

¿Qué pasaría si el mismo método está presente tanto en la superclase como en la
subclase?

En este caso, el método en la subclase anula al método en la superclase. Este concepto
se conoce como método overriding en Java.

        class animal{
          // método en la superclase
          public void comer() {
          System.out.println("Puedo comer");
          }
        }
        // perro hereda animal
        class perro extends animal {
          // overriding el método comer()
          @Override
          public void comer() {
          System.out.println("Como comida para perros");
          }
        // nuevo método en la subclase
          public void ladrar() {
          System.out.println("Puedo ladrar");
          }
        }
        class Main {
          public static void main(String[] args) {
          // crea un objeto en la subclase
          perro labrador = new perro();
          // invoca el método comer()
          labrador.comer();
          labrador.ladrar();
          }
        }

Salida

    Como comida para perros
    Puedo ladrar
    
En el ejemplo anterior, el método eat() está presente tanto en la superclase animal como
en subclase perro.

Aquí, hemos creado un objeto labrador a partir de la subclase perro.

Ahora, cuando invocamos comer( ) utilizando el objeto labrador, el método dentro de la
subclase perro es invocado. Esto se debe a que el método dentro de la clase derivada
anula el método dentro de la clase base.

@Override es una anotación para decirle al compilador que estamos anulando un
método. Sin embargo, la anotación no es obligatoria.
Hay cinco tipos de herencia:

1. Herencia Única. En este tipo de herencia, una única subclase se extiende desde
una única superclase.

2. Herencia Multinivel. En la herencia multinivel, una subclase se extiende desde una
superclase y luego la misma subclase actúa como una superclase para otra clase.

3. Herencia Jerárquica. En la herencia jerárquica, múltiples subclases se extienden
desde una sola superclase.

4. Herencia Múltiple. En múltiples herencias, una sola subclase se extiende desde
múltiples superclases.

5. Herencia Híbrida. La herencia híbrida es una combinación de dos o más tipos de
herencia.

¿Por qué es importante usar la herencia en Java?

● El uso más importante de la herencia en Java es la reutilización del código. El
código que está presente en la clase principal puede ser utilizado directamente por
la clase hija.

● El método overriding es también conocido como polimorfismo de tiempo de
ejecución. Por lo tanto, podemos lograr el polimorfismo en Java con la ayuda de la
herencia.

# Polimorfismo en POO

Un ejemplo clásico de poliformismo es el siguiente. Podemos crear dos clases distintas: Gato y Perro, que heredan de la superclase Animal. La clase Animal tiene el método abstracto makesound() que se implementa de forma distinta en cada una de las subclases (gatos y perros suenan de forma distinta). Entonces, un tercer objeto puede enviar el mensaje de hacer sonido a un grupo de objetos Gato y Perro por medio de una variable de referencia de clase Animal, haciendo así un uso polimórfico de dichos objetos respecto del mensaje mover.

      class Animal {
        public void makeSound() {
          System.out.println("Grr...");
        }
      }
      class Cat extends Animal {
        public void makeSound() {
          System.out.println("Meow");
        }
      }
      class Dog extends Animal {
        public void makeSound() {
          System.out.println("Woof");
        }
      }

Como todos los objetos Gato y Perro son objetos Animales, podemos hacer lo siguiente

      public static void main(String[ ] args) {
        Animal a = new Dog();
        Animal b = new Cat();
        
Creamos dos variables de referencia de tipo Animal y las apuntamos a los objetos Gato y Perro. Ahora, podemos llamar a los métodos makeSound().

        a.makeSound();
        //Outputs "Woof"

        b.makeSound();
        //Outputs "Meow"
      }
      
 # Encapsulación en POO.
 
Anteriormente vimos que solo se puede acceder a las variables privadas (private) dentro
de la misma clase (una clase externa no tiene acceso a ellas). Sin embargo, es posible
acceder a ellas si proporcionamos métodos públicos (public) get y set.
El método get devuelve el valor de la variable y el método set establece un valor.
La sintaxis de ambos es que comienzan con get o set, seguido del nombre de la variable,
con la primera letra en mayúscula:

![image](https://user-images.githubusercontent.com/91554777/180476691-6c2c3df3-7c14-4be5-bf21-f35b0e11524c.png)

En el ejemplo anterior, el método get devuelve el valor de la variable nombre.

El método set toma un parámetro (nuevoNombre) y lo asigna a la variable nombre. La
palabra clave this se utiliza para referirse al objeto actual.

Sin embargo, ya que la variable nombre es declarada privada (private), no podemos
acceder a ella desde fuera de esta clase:

![image](https://user-images.githubusercontent.com/91554777/180476808-0efef7f2-c8d5-4de9-bc67-2143ab738a03.png)

Si la variable se hubiese declarado como pública (public), la salida sería:

      Carlos
      
Sin embargo, al intentar acceder a la variable privada (private) nombre, obtendremos
un error:

        Main.java:19: error: nombre has private access in Persona
        miObj.nombre = "Carlos";
        ^
        Main.java:20: error: nombre has private access in Persona
        System.out.println(miObj.nombre);
        
En su lugar, usamos los métodos getNombre() y setNombre() para acceder y actualizar
la variable:

![image](https://user-images.githubusercontent.com/91554777/180477048-057d0418-7753-44fe-93e0-1cc5ad66daef.png)

¿Cómo es usada la encapsulación?

● En Java, la encapsulación nos ayuda a mantener juntos los campos y métodos
relacionados, lo que hace que nuestro código sea más limpio y fácil de leer.

● Ayuda a tener control de los valores de nuestros atributos.

● Los métodos getter y setter proporcionan acceso de solo lectura o solo escritura
a nuestros atributos de la clase.

● Ayuda a desacoplar componentes de un sistema. Por ejemplo, podemos
encapsular el código en varios paquetes. Estos componentes desacoplados
(paquetes) se pueden desarrollar, probar y depurar de forma independiente y
simultánea. Y cualquier cambio en un componente en particular no tiene ningún
efecto en otros componentes.

● También podemos ocultar datos mediante la encapsulación. Estos se mantienen
ocultos de las clases externas.
