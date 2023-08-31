import java.util.Scanner;

public class AdivinarOperacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean jugar = true;

        long inicio = System.currentTimeMillis();
        long fin = inicio + 120000; // 2 minutos en milisegundos

        int atinadas = 0;
        boolean adivinoCorrectamente = false;  //cambiará al atinar de forma correecta  

         while (jugar && System.currentTimeMillis() < fin) {  //IGUAL A jugar==true, dará 5 minutos de juego antes de terminar
            String clase;
            System.out.print("¿Qué nivel quieres jugar? FÁCIL (escribe 'a'), DIFÍCIL (escribe 'b'): ");
            clase = entrada.nextLine();
            int numer1 = 0;
            int numer2 = 0;

             

            switch (clase.toLowerCase()) { //conertir a minúscula
                case "a":
                    numer1 = (int) (Math.random() * 10);
                    numer2 = (int) (Math.random() * 9 + 1);
                    break;

                case "b":
                    numer1 = (int) (Math.random() * 100);
                    numer2 = (int) (Math.random() * 99 + 1);
                    break;

                default:
                    System.out.println("Opción inválida");
            }

            int opcion;
            double res;

            System.out.println("Selecciona la opción de la operación que quieres adivinar:\n" +
                    "1.- SUMA\n" +
                    "2.- RESTA\n" +
                    "3.- DIVISIÓN\n" +
                    "4.- MULTIPLICACIÓN");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print(" " + numer1 + " + " + numer2 + " = ");
                    res = entrada.nextDouble();
                    entrada.nextLine();

                    while(!adivinoCorrectamente){   //para no cambiar hasta adivinar la respuesta
                        if (res == numer1 + numer2) {
                            System.out.println("¡CORRECTO!");
                            adivinoCorrectamente = true;   //cambia el valor para permanecer en el ciclo
                            atinadas++; //sumo 1 a atinadas
                        } else {
                            System.out.println("¡INCORRECTO!");
                            System.out.print(" " + numer1 + " + " + numer2 + " = ");
                            res = entrada.nextDouble();
                            entrada.nextLine();
                        }
                       
                    }      
                    break;
                    
                    


                case 2:
                    System.out.print(" " + numer1 + " - " + numer2 + " = ");
                    res = entrada.nextDouble();
                    entrada.nextLine();
                    while(!adivinoCorrectamente){   //para no cambiar hasta adivinar la respuesta
                        if (res == numer1 - numer2) {
                            System.out.println("¡CORRECTO!");
                            adivinoCorrectamente = true;   //cambia el valor para permanecer en el ciclo
                            atinadas++; //sumo 1 a atinadas
                        } else {
                            System.out.println("¡INCORRECTO!");
                            System.out.print(" " + numer1 + " - " + numer2 + " = ");
                            res = entrada.nextDouble();
                            entrada.nextLine();
                        }
                       
                    }      
                    break;

                case 3:
                    System.out.print(" " + numer1 + " / " + numer2 + " = ");
                    res = entrada.nextDouble();
                    entrada.nextLine();
                    while(!adivinoCorrectamente){   //para no cambiar hasta adivinar la respuesta
                        if (res == numer1 / numer2) {
                            System.out.println("¡CORRECTO!");
                            adivinoCorrectamente = true;   //cambia el valor para permanecer en el ciclo
                            atinadas++; //sumo 1 a atinadas
                        } else {
                            System.out.println("¡INCORRECTO!");
                            System.out.print(" " + numer1 + " / " + numer2 + " = ");
                            res = entrada.nextDouble();
                            entrada.nextLine();
                        }
                       
                    }      
                    break;

                case 4:
                    System.out.print(" " + numer1 + " * " + numer2 + " = ");
                    res = entrada.nextDouble();
                    entrada.nextLine();
                    while(!adivinoCorrectamente){   //para no cambiar hasta adivinar la respuesta
                        if (res == numer1 * numer2) {
                            System.out.println("¡CORRECTO!");
                            adivinoCorrectamente = true;   //cambia el valor para permanecer en el ciclo
                            atinadas++; //sumo 1 a atinadas
                        } else {
                            System.out.println("¡INCORRECTO!");
                            System.out.print(" " + numer1 + " * " + numer2 + " = ");
                            res = entrada.nextDouble();
                            entrada.nextLine();
                        }
                       
                    }      
                    break;

                default:
                    System.out.println("Opción inválida");
            }

          

            System.out.print("¿Quieres jugar de nuevo? (Sí: 's', No: 'n'): ");
            String respuesta = entrada.nextLine();
            jugar = respuesta.equalsIgnoreCase("s");  //evalua si en minuscula o mayuscula se puso s, checar con un if
        }

        System.out.println("¡Gracias por jugar! Lograste atinar a " + atinadas + " operaciones ");
        entrada.close(); 
 

       
    }
}