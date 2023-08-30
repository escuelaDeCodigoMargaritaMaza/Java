import java.util.Scanner;

public class AdivinarOperacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean jugar = true;

        while (jugar) {  //IGUAL A jugar==true
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
                    if (res == numer1 + numer2) {
                        System.out.println("¡CORRECTO!");
                    } else {
                        System.out.println("¡INCORRECTO!");
                    }
                    break;

                case 2:
                    System.out.print(" " + numer1 + " - " + numer2 + " = ");
                    res = entrada.nextDouble();
                    entrada.nextLine();
                    if (res == numer1 - numer2) {
                        System.out.println("¡CORRECTO!");
                    } else {
                        System.out.println("¡INCORRECTO!");
                    }
                    break;

                case 3:
                    System.out.print(" " + numer1 + " / " + numer2 + " = ");
                    res = entrada.nextDouble();
                    entrada.nextLine();
                    if (res == numer1 / numer2) {
                        System.out.println("¡CORRECTO!");
                    } else {
                        System.out.println("¡INCORRECTO!");
                    }
                    break;

                case 4:
                    System.out.print(" " + numer1 + " * " + numer2 + " = ");
                    res = entrada.nextDouble();
                    entrada.nextLine();
                    if (res == numer1 * numer2) {
                        System.out.println("¡CORRECTO!");
                    } else {
                        System.out.println("¡INCORRECTO!");
                    }
                    break;

                default:
                    System.out.println("Opción inválida");
            }

            System.out.print("¿Quieres jugar de nuevo? (Sí: 's', No: 'n'): ");
            String respuesta = entrada.nextLine();
            jugar = respuesta.equalsIgnoreCase("s");  //evalua si en minuscula o mayuscula se puso s, checar con un if
        }

        System.out.println("¡Gracias por jugar!");
        entrada.close();
    }
}
