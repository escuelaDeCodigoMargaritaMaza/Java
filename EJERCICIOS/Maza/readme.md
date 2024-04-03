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
