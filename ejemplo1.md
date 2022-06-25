  ## Ejemplo 1
  En el iguiente ejemplo vereos la estructura de un programa básico en java que suma dos números

    public class Suma {   //recuerda el nombre de la clase sera el nombre del archivo .java
        public static void main(String[] args) {
            String nombre="David";
            int num1 = 5;
            int num2 = 6,
            int res = 0;
            //otra forma de declarar variables del mismo tipo será int num1=5,num2=6,res=0;
            res = num1 + num2;
            System.out.println("Hola " + nombre + " el resultado de sumar " + num1 + " mas " + num2 + ", es " + res);
        }
    }
    
Copia y pega el código en la aplicación web utilizada, nota como marcará error, eso se debe a la incopatibilidad de caracteres, busca la palabra acentuada y quita el acento

## Ejemplo 2
En este ejemplo vamos a solicitar que sea el usuario el que ingrese los datos, para ello debemos llamar a la libreria Scanner (S) que nos permitirá importar unas clases y métodos.
    
    import java.util.Scanner; //Importamos la libreria, SDK la trae 
    public class Suma {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in); //Lo que hace es traer la clase system para permitir ingresar datos, (in) es un nombre que damos nosotros, el segundo es parte del System
            String nombre="";
            int num1 = 0,num2 = 0,num3 = 0;
            System.out.println("cual es tu nombre");   //pedimos el nombre
            nombre = in.nextLine();  //Lo almacena en la variable in es el metodo creado y Line es de texto, para numeros usamos Int, in es el metodo creado, si le das otro nombre aqui va 
            System.out.println("dame el primer numero");
            num1 = in.nextInt();
            System.out.println("dame el segundo numero");
            num2 = in.nextInt();
            num3 = num1 + num2;
            System.out.println("Hola " + nombre + " el resultado de sumar " + num1 + " mas " + num2 + ", es " + num3);
        }
    }
    
## ejemplo 3

    import java.util.Scanner;
    public class condicion {
        public static void main(String[] args) {
            int num = 0;
            Scanner in = new Scanner(System.in);
            System.out.print("Ingrese un numero: ");
            num = in.nextInt();
            if(num>0){
                System.out.println("El numero "+num+" es positivo");
            }
            else {
                System.out.println("El numero "+num+" es negativo");
            }


        }
    }
    
## ejemplo 4

    public class Tablas {
        public static void main(String[] args) {
            int tabla,i;
         for (tabla=1; tabla<=10; tabla++)
         {
           System.out.println ("\n\nTabla del " +tabla);  //la \n nos da saltos de linea
           System.out.println ("---------------");
           for (i=1;i<=10;i++)
            {
             System.out.println (tabla + " x " + i + " = " + tabla*i);
            }
         }



        }
    }
