# VERSION 1 

    import java.util.Scanner;
    public class Promedio {
    
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            String nombre_alumno,materia1,materia2,materia3,materia4,grupo;
            double cal1,cal2,cal3,cal4,promedio;
            
            System.out.println("Ingresa el nombre del alumno");
            nombre_alumno = entrada.nextLine();
            nombre_alumno=nombre_alumno.toUpperCase();
            
            System.out.println("Ingresa el nombre de la materia");
            materia1 = entrada.nextLine();
            materia1=materia1.toUpperCase();
            System.out.println("Ingresa la calificacion");
            cal1 = entrada.nextDouble();
            System.out.println("Ingresa el nombre de la materia");
            materia2 = entrada.nextLine();
            System.out.println("Ingresa la calificacion");
            cal2 = entrada.nextDouble();
            System.out.println("Ingresa el nombre de la materia");
            materia3 = entrada.nextLine();
            System.out.println("Ingresa la calificacion");
            cal3 = entrada.nextDouble();
            System.out.println("Ingresa el nombre de la materia");
            materia4 = entrada.nextLine();
            System.out.println("Ingresa la calificacion");
            cal4 = entrada.nextDouble();
            //consumir el espacio
            System.out.println("Ingresa el grupo al que pertenece el alumno "+nombre_alumno);
            grupo=entrada.nextLine();
            
            promedio=(cal1+cal2+cal3+cal4)/4;
            
            
            System.out.println("calificaciones de "+ nombre_alumno+ ": \n"+ materia1 + " : "+cal1+", "+cal2+", "+cal3+", "+cal4+"\npromedio: "+promedio);
            System.out.println("Aprobado? "+ (promedio>=6)+ "grupo "+grupo);
            
            //calcular edad
            // int anioActual = java.time.Year.now().getValue();
            //length longitud si
            
         
            
        }
    }
