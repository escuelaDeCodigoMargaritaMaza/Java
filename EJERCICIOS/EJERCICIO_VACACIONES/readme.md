Realizaremos un programa que no imprima a cuantos días de vacaciones tiene un trabajador, dependerá del departamento en el que este y los años que tenga de antiguedad. departamento 1: con 1 año de antiguedad tendrá derecho a días, de 6 días de vacaciones, de 2 a 6 años temdrá derecho a 14 día y con más de 7 días temdrá derecho a 20 días departamento 2: con 1 año de antiguedad tendrá derecho a días, de 7 días de vacaciones, de 2 a 6 años temdrá derecho a 15 día y con más de 7 días temdrá derecho a 22 días departamento 2: con 1 año de antiguedad tendrá derecho a días, de 10 días de vacaciones, de 2 a 6 años temdrá derecho a 20 día y con más de 7 días temdrá derecho a 30 días

## PASO 1

CREAMOS LA ESTRUCTURA

        public class Sistema{
           public static void main(String args[]){


          }
        }

IMPORTAMOS SCANNER PARA PODER SOLICITAR POR CONSOLA LOS DATOS Y CREAMOS EL METODO PARA PODER ALMACENAR LOS DATOS EN LAS VARIABLES

       import java.util.Scanner;

       public class Sistema{
         public static void main(String args[]){

           Scanner entrada = new Scanner(System.in);
           
         }
       }

CREAMOS LAS VARIABLES Y LES PASAMOS VALORES

        import java.util.Scanner;

        public class Sistema{
           public static void main(String args[]){

             Scanner entrada = new Scanner(System.in);
             String nombre = "";
             int clave = 0, antiguedad = 0;

             System.out.println("************************");
             System.out.println("*Bienvenido al sistema *");
             System.out.println("*************************");
             System.out.println(""); 
             System.out.println("");

             System.out.print("Cual es el nombre del trabajador?: ");
             nombre = entrada.nextLine();
             System.out.println("");

             System.out.print("Cuanto tiempo de servicio tiene el trabajador?: ");
             antiguedad = entrada.nextInt();
             System.out.println("");

             System.out.print("Cual es la clave del trabajador?: ");
             clave = entrada.nextInt();
             System.out.println("");

          }
        }
        
  ESTRUCTURAMOS LAS TRES CONDICIONES PRINCIPALES
  
        import java.util.Scanner;

        public class Sistema{
         public static void main(String args[]){

           Scanner entrada = new Scanner(System.in);
           String nombre = "";
           int clave = 0, antiguedad = 0;

           System.out.println("************************");
           System.out.println("*Bienvenido al sistema *");
           System.out.println("*************************");
           System.out.println(""); 
           System.out.println("");
           System.out.print("Cual es el nombre del trabajador?: ");
           nombre = entrada.nextLine();
           System.out.println("");

           System.out.print("Cuanto tiempo de servicio tiene el trabajador?: ");
           antiguedad = entrada.nextInt();
           System.out.println("");

           System.out.print("Cual es la clave del trabajador?: ");
           clave = entrada.nextInt();
           System.out.println("");

           if(clave == 1){

           } else if(clave == 2){

           } else if(clave == 3){

           } else { 
            System.out.println("Error!, la clave de departamento es incorrecta");
           }
         }
        }
        
INGRESAMOS LAS CONDICIONALES SECUNDARIAS DENTRO DE CADA CONDICIONAL PRINCIPAL

        import java.util.Scanner;

        public class Sistema{
         public static void main(String args[]){

           Scanner entrada = new Scanner(System.in);
           String nombre = "";
           int clave = 0, antiguedad = 0;

           System.out.println("************************");
           System.out.println("*Bienvenido al sistema *");
           System.out.println("*************************");
           System.out.println(""); 
           System.out.println("");

           System.out.print("Cual es el nombre del trabajador?: ");
           nombre = entrada.nextLine();
           System.out.println("");

           System.out.print("Cuanto tiempo de servicio tiene el trabajador?: ");
           antiguedad = entrada.nextInt();
           System.out.println("");

           System.out.print("Cual es la clave del trabajador?: ");
           clave = entrada.nextInt();
           System.out.println("");

           if(clave == 1){

             if(antiguedad == 1){
               System.out.println("El trabajador " + nombre + " tiene derecho a 6 dias de vacaciones");
             } else if(antiguedad >= 2 && antiguedad <= 6){
               System.out.println("El trabajador " + nombre + " tiene derecho a 14 dias de vacaciones");
             } else if(antiguedad >= 7){
               System.out.println("El trabajador " + nombre + " tiene derecho a 20 dias de vacaciones");
             } else {
               System.out.println("El trabajador aun no tiene derecho a vacaciones");
             }

           } else if(clave == 2){

             if(antiguedad == 1){
               System.out.println("El trabajador " + nombre + " tiene derecho a 7 dias de vacaciones");
             } else if(antiguedad >= 2 && antiguedad <= 6){
               System.out.println("El trabajador " + nombre + " tiene derecho a 15 dias de vacaciones");
             } else if(antiguedad >= 7){
               System.out.println("El trabajador " + nombre + " tiene derecho a 22 dias de vacaciones");
             } else {
               System.out.println("El trabajador aun no tiene derecho a vacaciones");
             }

           } else if(clave == 3){

             if(antiguedad == 1){
               System.out.println("El trabajador " + nombre + " tiene derecho a 10 dias de vacaciones");
             } else if(antiguedad >= 2 && antiguedad <= 6){
               System.out.println("El trabajador " + nombre + " tiene derecho a 20 dias de vacaciones");
             } else if(antiguedad >= 7){
               System.out.println("El trabajador " + nombre + " tiene derecho a 30 dias de vacaciones");
             } else {
               System.out.println("El trabajador aun no tiene derecho a vacaciones");
             }

           } else { 
            System.out.println("Error!, la clave de departamento es incorrecta");
           }
         }
        }
        
 AHORA VAMOS A ALMACENAR LOS NOMBRES DE LOS TRABAJADORES EN UN ARRAY
 
 
 
