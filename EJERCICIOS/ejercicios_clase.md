Ejercicios realizados en la clase

    import java.util.Scanner;  
    public class TiposDeDatos {
        public static void main(String[] args) {
            // Declaración de variables
            int entero = 10000000;
            byte bytes = -45;
            long largo = 125985245;
            short corto = 1456;
            float decimal = 3;
            double doble = 3.1415137459874;
            boolean booleano = true;
            char caracter = 'A';
            String cadena = "Hola, mundo!";

            // Imprimir los valores de las variables
            System.out.println("Valor de entero: " + entero);
            System.out.println("Valor de byte: " + bytes);
            System.out.println("Valor de long: " + largo);
            System.out.println("Valor de short: " + corto);
            System.out.println("Valor de float: " + decimal);
            System.out.println("Valor de double: " + doble);
            System.out.println("Valor de booleano: " + booleano);
            System.out.println("Valor de caracter: " + caracter);
            System.out.println("Valor de cadena: " + cadena);

            // Realizar operaciones con los datos
            int suma = entero + entero;
            double multiplicacion = decimal * 5;
            boolean negacion = !booleano;
            char siguienteCaracter =(char) (caracter + 1);
            String concatenacion = cadena + " estoy aprendiendo java";

            // Imprimir los resultados de las operaciones
            System.out.println("Suma: " + suma);
            System.out.println("Multiplicación: " + multiplicacion);
            System.out.println("Negación: " + negacion);
            System.out.println("Siguiente caracter: " + siguienteCaracter);
            System.out.println("Concatenación: " + concatenacion);

            // scanner
            Scanner scanner = new Scanner(System.in);

            //entrada de cadena
            System.out.println("Ingresa una cadena de texto");
            cadena = scanner.nextLine();

            //entrada de caracter
            System.out.println("Ingresa un carcater");
            caracter=scanner.next().charAt(0);

            //entrada de entero
            System.out.println("Ingresa un número entero");
            entero=scanner.nextInt();

            //entrada de long
            System.out.println("Ingresa un número entero largo");
            largo=scanner.nextLong();

            //entrada de float
            System.out.println("Ingresa un número flotante");
            decimal=scanner.nextFloat();

            //entrada de boolean
            System.out.println("Ingresa un boleano");
            booleano=scanner.nextBoolean();

            System.out.println("Valor de entero: " + entero);
            System.out.println("Valor de byte: " + bytes);
            System.out.println("Valor de long: " + largo);
            System.out.println("Valor de short: " + corto);
            System.out.println("Valor de float: " + decimal);
            System.out.println("Valor de double: " + doble);
            System.out.println("Valor de booleano: " + booleano);
            System.out.println("Valor de caracter: " + caracter);
            System.out.println("Valor de cadena: " + cadena);



        }
    }
    
    
Ejercicio de calcular la edad
    
    
    //Dentro del paquete java.util, Scanner es una clase que nos permite obtener la entrada de datos primitivos.

        import java.util.Scanner;  
        //Podemos pensar que import java.util.*; también resuelve esto, pero lo que hacemos con el primer método es solo cargar la clase Scanner y no todas las demás disponibles.
        public class Scaner {

            public static void main(String[] args){
                String nombre;
                char sexo;
                int anio_nac;
                int anioActual = java.time.Year.now().getValue();
                int edad;


                //El siguiente paso para poder utilizar la clase Scanner es crear la variable Scanner como una variable de clase y crear el objeto Scanner como se muestra el la siguiente línea:
                Scanner scanner = new Scanner(System.in);
                //De este modo para crear un objeto Scanner, usaremos la nueva palabra clave seguida de una llamada al constructor de la clase Scanner. Lo que tenemos que tener en cuenta es que necesitamos introducir un parámetro que indique de dónde procederán la fuente de datos. En nuestro ejemplo usaré System.in para especificar la entrada de consola de teclado estándar aunque podemos pasar un objeto de clase File si queremos leer la entrada de un archivo. De este modo podemos manejar la clase al usar el objeto sc para manejar y almacenar los datos introducidos por el usuario.
                System.out.println("Ingresa tu nombre");
                nombre = scanner.nextLine();

                System.out.println("Ingresa tu sexo h/m");
                sexo=scanner.next().charAt(0); //guarda el primer caracter que se capture

                System.out.println("Ingrese el año de nacimiento: ");
                anio_nac = scanner.nextInt();

                edad = anioActual - anio_nac;

                // Mostrar la edad calculada
                System.out.println("La edad actual de "+nombre+ " es: " + edad);

                scanner.close(); //cerrar el scaner
            }
        }
