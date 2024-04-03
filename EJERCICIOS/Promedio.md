        public static void main (String args[]){
      	String nombre;
      	double cal1,cal2,cal3,cal4,promedio;
        char grupo;
        int edad;
        boolean aprobo;


      	
      	nombre="Juan";
      	cal1=7.5;
      	cal2=5.6;
      	cal3=8.9;
      	cal4=7.4;
      
      
      	promedio=(cal1+cal2+cal3+cal4)/ 4;

        grupo='a';

        edad=10;
      
      	
      	aprobo=promedio>6;

      	System.out.println("Datos del alumno: \n--------------------------------------------\nNombre    Edad     grupo    Promedio    Aprobado\n -----------------------------------------\n" + nombre + "        " + edad + "        "+ grupo+ "        " +promedio+ "        "+aprobo);
        
      //si tiene una edad menor a 10 y su promedio es mayor a 9 tiene beca al 100
      boolean beca100= edad<=10 && promedio>=9;

      System.out.println("-----------------------------------\nbeca al 100: "+beca100);
      	
      //si tiene una edad menor a 10 o su promedio es mayor a 9 tiene beca al 50
      boolean beca50= edad<=10 || promedio>=9;
      System.out.println("beca al 50: "+beca50);    
      
      //de asignacion 20 horas de asistemcia suman 1 punto 15 .5 punto y 10 .3 
      int asistencia = 20;
      int extra=1;
      promedio += extra;
      System.out.println("Promedio con puntos extras: "+promedio);

      //si tiene reporte se le quita un punto
      boolean reporte = true;
      --promedio; 
      System.out.println("Promedio con reporte: "+promedio);

      //rounded
      System.out.println("Promedio Con round: " + Math.round(promedio));
	
	  System.out.println("Promedio Con floor: " + Math.floor(promedio));
	
	  System.out.println("Promedio Con ceil: " + Math.ceil(promedio));
       }
      }

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

# VERSION 2
    
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
            entrada.nextLine();
            if(cal1 > 10 || cal1 < 0){
                System.out.println("Dato invalido");
            }else{
                System.out.println("Ingresa el nombre de la materia");
                materia2 = entrada.nextLine();
                System.out.println("Ingresa la calificacion");
                cal2 = entrada.nextDouble();
                entrada.nextLine();
                if(cal2 > 10 || cal2 < 0){
                      System.out.println("Dato invalido");
                 }else{
                      System.out.println("Ingresa el nombre de la materia");
                      materia3 = entrada.nextLine();
                      System.out.println("Ingresa la calificacion");
                      cal3 = entrada.nextDouble();
                      entrada.nextLine();
                      if(cal3 > 10 || cal3 < 0){
                         System.out.println("Dato invalido");
                      }else{
                         System.out.println("Ingresa el nombre de la materia");
                         materia4 = entrada.nextLine();
                         System.out.println("Ingresa la calificacion");
                         cal4 = entrada.nextDouble();
                         entrada.nextLine();
                          if(cal4 > 10 || cal4 < 0){
                            System.out.println("Dato invalido");
                          }else{
                            System.out.println("Ingresa el grupo al que pertenece el alumno "+nombre_alumno);
                            grupo=entrada.nextLine();
            
                            promedio=(cal1+cal2+cal3+cal4)/4;
            
            //CONDICIONAL AÑADIDA
                           if(promedio>=9){
                             System.out.println("EXCELENTE");
                           }else if(promedio >=8){
                             System.out.println("MUY BIEN");
                           }else if(promedio>=6){
                             System.out.println("BIEN");
                           }else{
                            System.out.println("REPROBADO");
                           }
                            
                          }
    
                         
                      }
                      
                 }
               
            }
            
            
            //calcular edad
            // int anioActual = java.time.Year.now().getValue();
            //length longitud si
            
         
            
        }
    }


