# EJEMPLO 1
 
Dada una cadena mostrar por pantalla la cantidad de vocales que tiene.

    import java.util.Scanner;

    public class CantidadVocales {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print(" Ingresa una palabra: ");
            String cad = sc.nextLine();
            int cantidadVocales = 0;
            //iteramos mientras el indice sea menor al tamanio total de la cadena
            for (int i = 0; i < cad.length(); i++) {
                char car = cad.charAt(i); //obtenemos el caracter en la posicion i
                //si el caracter es igual a "a", "e", "i", "o",  "u" entonces es vocal
                if (car == 'a' || car == 'e' || car ==  'i' || car == 'o' || car == 'u') {
                    cantidadVocales++; //contamos cantidad vocales +1
                }
            }
            //mostramos por pantalla cantidad de vocales
            System.out.println("La candidad de vocales es: " + cantidadVocales);
        }
    }
      
