 Creación de una clase con atributos y metodos
 
    public class Usuario{
        //Atributos
        String nombre;
        String folio;

        //metodos
        public static void main(String[]args){
            Usuario usuario1=new Usuario();

            usuario1.nombre="David";
            usuario1.folio="A8484";
            System.out.println("El nombre del usuario es "+usuario1.nombre);
            System.out.println("El folio del usuario es "+usuario1.folio);

            Usuario usuario2=new Usuario();

            usuario2.nombre="Pedro";
            usuario2.folio="B8459";
            System.out.println("El nombre del usuario es "+usuario2.nombre);
            System.out.println("El folio del usuario es "+usuario2.folio);
        }
    }



      public class Usuario{
          //Atributos
          String nombre;
          String folio;

          //metodo para pedir los datos
          Scanner in = new Scanner (System.in);	
          public void leerDatos(){
             System.out.println("Cual es el nombre del usuario?: ");
             nombre = in.nextLine();
             System.out.println("ingresa el folio del usuario");
             folio=in.nextLine();

            }
              //metodo para imprimir los datos
         public void muestraDatos(){
          System.out.println("El nombre del usuario es : "  + nombre);
              System.out.println("El folio del usuario es : "  + folio);


         }
          public static void main(String[]args){
              Usuario usuario1=new Usuario();
              usuario1.leerDatos();
              usuario1.muestraDatos();

         }

      }
