import java.util.Scanner;

public class AdivinarOperacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final long inicio = System.currentTimeMillis();
        long fin = inicio + 120000; // 2 minutos en milisegundos

        int atinadas = 0;   //almacenará el número de aciertos
        System.out.println("#######################################\n ADIVINA LA OPERACION, TIENES DOS MINUTOS\n #######################################");
        int numer1 = 0;
        int numer2 = 0;

         
        


        while (System.currentTimeMillis() < fin) {  //IGUAL A jugar==true, dará 5 minutos de juego antes de terminar
            int opcion;
            opcion = (int) (Math.random() * (5 - 1)) + 1;
            boolean adivinoCorrectamente = false;  //cambiará al atinar de forma correecta 
            numer1 = (int) (Math.random() * (99 - 1)) + 1;
            numer2 = (int) (Math.random() * (9 + 1)) + 1;
            double res;
            switch (opcion) {  
                case 1:
                    System.out.print(" " + numer1 + " + " + numer2 + " = ");
                    res = entrada.nextDouble();
                    entrada.nextLine();

                    while(!adivinoCorrectamente){   //para no cambiar hasta adivinar la respuesta
                        if (res == numer1 + numer2) {
                            System.out.println("¡CORRECTO!, te quedan " + (fin - System.currentTimeMillis())/1000 + " segundos" );
                            adivinoCorrectamente = true;   //cambia el valor para permanecer en el ciclo
                            atinadas++; //sumo 1 a atinadas
                        } else {
                            System.out.println("¡INCORRECTO!, te quedan " + (fin - System.currentTimeMillis())/1000 + " segundos");
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
                            System.out.println("¡CORRECTO!, te quedan " + (fin - System.currentTimeMillis())/1000 + " segundos");
                            adivinoCorrectamente = true;   //cambia el valor para permanecer en el ciclo
                            atinadas++; //sumo 1 a atinadas
                        } else {
                            System.out.println("¡INCORRECTO!, te quedan " + (fin - System.currentTimeMillis())/1000 + " segundos");
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
                            System.out.println("¡CORRECTO!, te quedan " + (fin - System.currentTimeMillis())/1000 + " segundos");
                            adivinoCorrectamente = true;   //cambia el valor para permanecer en el ciclo
                            atinadas++; //sumo 1 a atinadas
                        } else {
                            System.out.println("¡INCORRECTO!, te quedan " + (fin - System.currentTimeMillis())/1000 + " segundos");
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
                            System.out.println("¡CORRECTO!, te quedan " + (fin - System.currentTimeMillis())/1000 + " segundos");
                            adivinoCorrectamente = true;   //cambia el valor para permanecer en el ciclo
                            atinadas++; //sumo 1 a atinadas
                        } else {
                            System.out.println("¡INCORRECTO!, te quedan " + (fin - System.currentTimeMillis())/1000 + " segundos");
                            System.out.print(" " + numer1 + " * " + numer2 + " = ");
                            res = entrada.nextDouble();
                            entrada.nextLine();
                        }
                         
                    }
                    break;
                    

                default:
                    System.out.println("Opción inválida");
            }

          

           
        }

        System.out.println("¡Gracias por jugar! Lograste atinar a " + atinadas + " operaciones ");
        entrada.close();
    }
}