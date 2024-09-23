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
