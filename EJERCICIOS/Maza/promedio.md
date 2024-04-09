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


# VERSION 4

	import java.util.Scanner;
	class Promedio{
	  public static void main (String args[]){
	  String nombre;
	  double cal1,cal2,cal3,cal4,promedio;
	  char grupo;
	  int edad;
	  boolean aprobo;
	  //variable de clase
	  Scanner entrada =  new Scanner(System.in);
	
	  //ASIGNO VALOR A LA VARIBLE
	  System.out.println("Ingresa el nombre del alumno");
	  nombre=entrada.nextLine();
	  nombre = nombre.toUpperCase();
	  System.out.println("Ingresa la calificación 1 de " + nombre);
	  cal1 = entrada.nextDouble() ;
	  entrada.nextLine();
	  System.out.println("Ingresa la calificación 2");
	  cal2 = entrada.nextDouble() ;
	  entrada.nextLine();
	  System.out.println("Ingresa la calificación 3");
	  cal3 = entrada.nextDouble() ;
	  entrada.nextLine();
	  System.out.println("Ingresa la calificación 4");
	  cal4 = entrada.nextDouble() ;
	  entrada.nextLine();
	  promedio=(cal1+cal2+cal3+cal4)/ 4;
	  System.out.println("Ingresa el grupo de " + nombre);
	  grupo= entrada.next().charAt(0);
	  System.out.println("Ingresa la edad de " + nombre);
	  edad=entrada.nextInt();
	  entrada.nextLine();
	
	  aprobo=promedio>6;
	
	  //si tiene una edad menor a 10 y su promedio es mayor a 9 tiene beca al 100
	  boolean beca100 = edad <= 10 && promedio >= 9;
	 
	  //si tiene una edad menor a 10 o su promedio es mayor a 9 tiene beca al 50
	  boolean beca50 = edad < 10 || promedio >= 9;	
	 
	
	 
	 //de asignacion 20 horas de asistemcia suman 1 punto 15 .5 punto y 10 .3 
	 int asistencia;
	 System.out.println("Ingresa las horas de asistencia de " + nombre);
	 asistencia = entrada.nextInt();
	 entrada.nextLine();
	
	
	 //si tiene reporte se le quita un punto
	 int rep;
	 boolean reporte = false;
	 System.out.println(nombre + " tiene reportes de conducta \n1.- SI\n2.- NO");
	 rep = entrada.nextInt();
	 entrada.nextLine();
	
	 
	  
	  if(asistencia <= 20 && asistencia > 15){
	    promedio += 1;
	  }else if(asistencia <=15 && asistencia > 10){
	    promedio += .5;
	  }else if(asistencia == 10 ){
	    promedio += .3;
	  }
	
	 
	
	 
	  if(rep == 1){
	    reporte = true;
	    --promedio;
	  }
	  
	
	
	
	  
	
	  System.out.println("\n\n=====================================================Datos del alumno:=======================================================\n-----------------------------------------------------------------------------------------------------\nNombre    Edad     grupo    Promedio    Aprobado       beca al 100%        beca al 50%            horas asistidas      reportes \n    -------------------------------------------------------------------------------------------------------------\n" + nombre + "        " + edad + "        "+ grupo+ "        " +Math.round(promedio)+ "        "+aprobo+ "            " + beca100+ "            " + beca50+ "            " + asistencia + "            "+ reporte);
	
	
	 }
	}

# VERSION 5

	import java.util.Scanner;
	class Promedio{
	  public static void main (String args[]){
	  String nombre, estatus, repetir = "si";
	  double cal, promedio=0;
	  char grupo;
	  int edad;
	  boolean aprobo;
	  //variable de clase
	  Scanner entrada =  new Scanner(System.in);
	
	
	  while(repetir == "si"){
	
	    
	    //ASIGNO VALOR A LA VARIBLE
	    System.out.println("Ingresa el nombre del alumno");
	    nombre=entrada.nextLine();
	    nombre = nombre.toUpperCase();
	
	    for(int i = 1; i <= 4; i++){
	      System.out.println("Ingresa la calificación " + i + "  de " + nombre);
	      cal = entrada.nextDouble();
	      entrada.nextLine();
	      promedio = (promedio + cal) / 4;
	    }
	    
	      
	    System.out.println("Ingresa el grupo de " + nombre);
	    grupo= entrada.next().charAt(0);
	    System.out.println("Ingresa la edad de " + nombre);
	    edad=entrada.nextInt();
	    entrada.nextLine();
	
	    aprobo=promedio>6;
	
	    //si tiene una edad menor a 10 y su promedio es mayor a 9 tiene beca al 100
	    boolean beca100 = edad <= 10 && promedio >= 9;
	  
	    //si tiene una edad menor a 10 o su promedio es mayor a 9 tiene beca al 50
	    boolean beca50 = edad < 10 || promedio >= 9;	
	  
	
	  
	  //de asignacion 20 horas de asistemcia suman 1 punto 15 .5 punto y 10 .3 
	  int asistencia;
	  System.out.println("Ingresa las horas de asistencia de " + nombre);
	  asistencia = entrada.nextInt();
	  entrada.nextLine();
	
	
	  //si tiene reporte se le quita un punto
	  int rep;
	  boolean reporte = false;
	  System.out.println(nombre + " tiene reportes de conducta \n1.- SI\n2.- NO");
	  rep = entrada.nextInt();
	  entrada.nextLine();
	
	  
	    
	    if(asistencia <= 20 && asistencia > 15){
	      promedio += 1;
	    }else if(asistencia <=15 && asistencia > 10){
	      promedio += .5;
	    }else if(asistencia == 10 ){
	      promedio += .3;
	    }
	
	  
	
	  
	    if(rep == 1){
	      reporte = true;
	      --promedio;
	    }
	    
	
	
	    if(promedio >= 9){
	      estatus = "EXCELENTE";
	    }else if(promedio > 7 && promedio < 9){
	      estatus = "MUY BIEN";
	    }else if(promedio >= 6 && promedio < 7){
	      estatus = "BIEN";
	    }else{
	      estatus = "MAL";
	    }
	    
	
	    System.out.println("\n\n=====================================================Datos del alumno:==========================================================\n-----------------------------------------------------------------------------------------------------\nNombre    Edad     grupo    Promedio    Aprobado       beca al 100%        beca al 50%            horas asistidas      reportes          status \n    -------------------------------------------------------------------------------------------------------------\n" + nombre + "        " + edad + "        "+ grupo+ "        " +Math.round(promedio)+ "        "+aprobo+ "            " + beca100+ "            " + beca50+ "            " + asistencia + "            "+ reporte  + "            "+estatus);
	
	    System.out.println("Deseas calcular el promedio de otro alumno SI/NO");
	    repetir = entrada.nextLine();
	    repetir = repetir.toLowerCase();
	  }
	  System.out.println("==========================================\nHasta luego\n===================================");
	}
	}

	
