# VERSION 1

          class Promedio{
              public static void main (String args[]){
          	String nombre;
          	double cal1,cal2,cal3,cal4,promedio;
          	
          	nombre="Juan";
          	cal1=5;
          	cal2=5;
          	cal3=5;
          	cal4=5;
          
          
          	promedio=(cal1+cal2+cal3+cal4)/ 4;
          	
          	//System.out.print("El promedio de \n" + nombre + "\nes de: " + promedio + "\nde sus calificciones "+"\n"+ cal1+ "\n"+cal2+ "\n"+cal3+ "\n"+cal4);
          
                  System.out.println("El promedio de ");
          	System.out.println(nombre);
          	System.out.println("es de: " + promedio);
          	System.out.println("de sus calificciones ");
          	System.out.println(cal1);
          	System.out.println(cal2);
          	System.out.println(cal3);
          	System.out.println(cal4);
          
          	boolean aprobo;
          	
          	aprobo=promedio>6;
          	System.out.println("Aprobado:  "+aprobo);
          	
          	System.out.println("==========\n========\n===========");
          
          	nombre="Pedro";
          	cal1=2;
          	cal2=10;
          	cal3=8.9;
          	cal4=7.7;
          	System.out.print("El promedio de \n" + nombre + "\nes de: " + promedio + "\nde sus calificciones "+"\n"+ cal1+ "\n"+cal2+ "\n"+cal3+ "\n"+cal4 + "\nAprobo: "+ aprobo);
          System.out.println("==========\n========\n===========");
          
          	nombre="Miguel";
          	cal1=7;
          	cal2=1;
          	cal3=8.9;
          	cal4=8.7;
          	System.out.print("El promedio de \n" + nombre + "\nes de: " + promedio + "\nde sus calificciones "+"\n"+ cal1+ "\n"+cal2+ "\n"+cal3+ "\n"+cal4 + "\nAprobo: "+ aprobo);
          
           }
          }



# VERSION 2

	class Promedio{
	    public static void main (String args[]){
		String nombre;
	  	double cal1,cal2,cal3,cal4,promedio;
	    	char grupo;
	    	int edad;
	    	boolean aprobo;
	
	  	//ASIGNO VALOR A LA VARIBLE
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
	    
		
		
	  
	 
	
	
	 }
	}


# VERSION 3

	class Promedio{
	    public static void main (String args[]){
		String nombre;
	  	double cal1,cal2,cal3,cal4,promedio;
	    	char grupo;
	    	int edad;
	    	boolean aprobo;
	
	  	//ASIGNO VALOR A LA VARIBLE
	  	nombre="Juan";
	  	cal1=7.5;
	  	cal2=5.6;
	  	cal3=8.9;
	  	cal4=7.4;
	    	promedio=(cal1+cal2+cal3+cal4)/ 4;
	        grupo='a';
	        edad=9;
	    	aprobo=promedio>6;
	
		//si tiene una edad menor a 10 y su promedio es mayor a 9 tiene beca al 100
		boolean beca100 = edad <= 10 && promedio >= 9;
		System.out.println("Beca al 100%: " + beca100);
	
		//si tiene una edad menor a 10 o su promedio es mayor a 9 tiene beca al 50
		boolean beca50 = edad < 10 || promedio >= 9;	
		System.out.println("Beca al 50%: " + beca50);
	  
	 	
	
		
	
	  	System.out.println("\n\n===============================Datos del alumno:=============================================\n---------------------------------------------------------------------------------------\nNombre    Edad     grupo    Promedio    Aprobado       beca al 100%        beca al 50%\n --------------------------------------------------------------------------------------\n" + nombre + "        " + edad + "        "+ grupo+ "        " +promedio+ "        "+aprobo+ "            " + beca100+ "            " + beca50);
	
		
	
		
	    	//de asignacion 20 horas de asistemcia suman 1 punto 15 .5 punto y 10 .3 
		int asistencia;
		asistencia = 15;
		 promedio += .5;
	 	System.out.println("\n \nPromedio con puntos extras por asistencia: " + promedio);
	
		//si tiene reporte se le quita un punto
		boolean reporte = true;
		--promedio;
		System.out.println("Promedio en caso de tener reportes: " + promedio);
	
		//clase Math redondear
	        //método round
		System.out.println("Promedio Con round: " + Math.round(promedio)); 
	
		// método floor
		System.out.println("Promedio Con floor: " + Math.floor(promedio));
	
		//método ceil
		 System.out.println("Promedio Con ceil: " + Math.ceil(promedio));
		
	 }
	}


	
