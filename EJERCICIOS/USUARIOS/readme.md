# VERSION 1

    public class Usuario{
        public static void main(String[] args){
              String nombre_usuario;
              String apellido_paterno;
              String apellido_materno;
              String telefono_usuario;
              int edad;
              String correo_usuario;
              double calificacion;
              boolean inscrito_taller;
              //asigno valor a variables
              nombre_usuario = "David";
              apellido_paterno = "Santillán";
              apellido_materno = "Bretón";
              telefono_usuario = "5555555555";
              edad = 40;
              correo_usuario = "san@gmail.com";
              calificacion = 6.5;
    
               //imprimo datos en pantalla
               System.out.println("Nombre: " + nombre_usuario + "\nApellido Paterno: " + apellido_paterno+ "\nApellido Materno: " + apellido_materno+ "\nTeléfono: " + telefono_usuario + "\nCorreo: " + correo_usuario+ "\nEdad: " + edad);
               System.out.println("Obtuviste: " + calificacion + "Inscrito: " + (calificacion > 7));

     }
    }


# VERSION 2

        public class Usuario{
            public static void main(String[] args){
                String nombre = "Juan";
                String apellido = "Pérez";
                double cal1 = 8.0;
                double cal2 = 7.2;
                double cal3 = 9.0;
                int asistencias = 7;
                double promedio = (cal1 + cal2 + cal3) / 3;
                boolean aprobado = (asistencias == 10) || (promedio >= 6);
                System.out.print("Nombre: " + nombre + "\nApellido: " + apellido + "\nAprobado: " + aprobado);
        
               
         }  
        }

# VERSION 3

        import java.util.Scanner;
        
        public class Usuario{
            public static void main(String[] args){
                //crear variable de clase Scanner
                Scanner entrada = new Scanner(System.in);
        
                String nombre;
                String apellido;
                double cal1;
                double cal2;
                double cal3;
                int asistencias;
                boolean inscrito;
        
        
                System.out.println("Ingresa el nombre del usuario");
                nombre = entrada.nextLine();
        
                System.out.println("Ingresa el apellido del usuario");
                apellido = entrada.nextLine();
        
                System.out.println("Ingresa la calificación 1");
                cal1= entrada.nextDouble();
                entrada.nextLine();
        
                System.out.println("Ingresa la calificación 2");
                cal2= entrada.nextDouble();
                entrada.nextLine();
        
                System.out.println("Ingresa la calificación 3");
                cal3= entrada.nextDouble();
                entrada.nextLine();
        
                System.out.println("Ingresa el totral de asistencias del usuario");
                asistencias = entrada.nextInt();
                entrada.nextLine();
        
                String grupo;
                System.out.println("Ingresa el grupo del usuario");
                grupo = entrada.nextLine();
        
                System.out.println("Estas inscrito en algún grupo? true/false");
                inscrito = entrada.nextBoolean();
            
        
                double promedio = (cal1 + cal2 + cal3) / 3;
                boolean aprobado = (asistencias == 10) || (promedio >= 6);
                System.out.print("Nombre: " + nombre + "\nApellido: " + apellido + "\nAprobado: " + aprobado + "\nGrupo: " + grupo + "\nInscrito: " + inscrito);
        
               
         }  
        }


