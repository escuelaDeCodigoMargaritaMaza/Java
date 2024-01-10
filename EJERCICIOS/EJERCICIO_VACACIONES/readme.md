Realizaremos un programa que no imprima a cuantos días de vacaciones tiene un trabajador, dependerá del departamento en el que este y los años que tenga de antiguedad. departamento A: con 1 o 2 año de antiguedad tendrá derecho a 5 días de vacaciones, de 3 a 5 años temdrá derecho a 7 día y con más de 5 años días temdrá derecho a 10 días departamento B: con 1  o 2 año de antiguedad tendrá derecho a 7 días de vacaciones, de 3 a 5 años temdrá derecho a 10 días y con más de 5 días temdrá derecho a 13 días; departamento C: con 1 o 2 años de antiguedad tendrá derecho a 10 días de vacaciones, de 3 a 5 años temdrá derecho a 13 días y con más de 5 días temdrá derecho a 15 días

                package vacaciones;

                import java.util.Scanner;
                public class Vacaciones {
                
                   
                    public static void main(String[] args) {
                        //declaración de variables
                        String nombre, departamento;
                        int antiguedad, contador;
                        boolean repetir = true;
                        Scanner entrada = new Scanner(System.in);
                        
                        System.out.println("================\nBIENVENIDO AL SISTEMA\n===============");
                        
                        while(repetir){
                            System.out.println("Ingresa el nombre del trabajador");
                            nombre= entrada.nextLine();
                            
                            System.out.println("Ingresa el departaento de "+nombre+"\nA\nB\nC");
                            departamento=entrada.nextLine();
                            
                            System.out.println("Ingresa la antiguedad de "+nombre);
                            antiguedad=entrada.nextInt();
                            entrada.nextLine();
                            
                            switch(departamento.toUpperCase()){
                                case "A":
                                    switch(antiguedad){
                                        case 1:
                                        case 2:
                                            System.out.println("A "+nombre+" le corresponden 5 días de vacaciones");
                                            
                                            break;
                                        case 3:
                                        case 4:
                                            System.out.println("A "+nombre+" le corresponden 7 días de vacaciones");
                                            
                                            break;
                                         case 0:
                                            System.out.println("A "+nombre+" Aún no le corresponden días de vacaciones");
                                            break;
                                         default:
                                             System.out.println("A "+nombre+" le corresponden 10 días de vacaciones");
                                    }
                                    
                                    break;
                                case "B":
                                    switch(antiguedad){
                                        case 1:
                                        case 2:
                                            System.out.println("A "+nombre+" le corresponden 7 días de vacaciones");
                                            
                                            break;
                                        case 3:
                                        case 4:
                                            System.out.println("A "+nombre+" le corresponden 10 días de vacaciones");
                                            
                                            break;
                                         case 0:
                                            System.out.println("A "+nombre+" Aún no le corresponden días de vacaciones");
                                            break;
                                         default:
                                             System.out.println("A "+nombre+" le corresponden 13 días de vacaciones");
                                    }
                                    break;
                                    
                                case "C":
                                    switch(antiguedad){
                                        case 1:
                                        case 2:
                                            System.out.println("A "+nombre+" le corresponden 10 días de vacaciones");
                                            
                                            break;
                                        case 3:
                                        case 4:
                                            System.out.println("A "+nombre+" le corresponden 13 días de vacaciones");
                                            
                                            break;
                                         case 0:
                                            System.out.println("A "+nombre+" Aún no le corresponden días de vacaciones");
                                            break;
                                         default:
                                             System.out.println("A "+nombre+" le corresponden 15 días de vacaciones");
                                    }
                                    
                                    break;
                                    
                                default:
                                    System.out.println("Departamento invalido");
                            }
                            
                            System.out.println("Deseas consultar otro trabajador?\n 1. SI\n2. NO");
                            contador=entrada.nextInt();
                            if(contador != 1){
                                repetir = false;
                            }
                        }
                        System.out.println("*************\nHASTA LUEGO\n*************");
                        
                        
                    }
                    
                }

# VERSION 2


                package vacaciones;
                
                import java.util.Scanner;
                public class Vacaciones {
                
                   
                    public static void main(String[] args) {
                        //declaración de variables
                        String nombre, departamento;
                        int antiguedad, contador,k=0;
                        boolean repetir = true;
                        Scanner entrada = new Scanner(System.in);
                        
                        //declaramos arreglos unidimencionales
                        String[] nombres = new String[5];
                        int[] vacaciones = new int[5];
                      
                        
                        System.out.println("================\nBIENVENIDO AL SISTEMA\n===============");
                        
                        while(k !=5 ){
                            System.out.println("Ingresa el nombre del trabajador");
                            nombre= entrada.nextLine();
                            nombres[k]=nombre;
                            
                            System.out.println("Ingresa el departaento de "+nombres[k]+"\nA\nB\nC");
                            departamento=entrada.nextLine();
                            
                            System.out.println("Ingresa la antiguedad de "+nombres[k]);
                            antiguedad=entrada.nextInt();
                            entrada.nextLine();
                            
                            switch(departamento.toUpperCase()){
                                case "A":
                                    switch(antiguedad){
                                        case 1:
                                        case 2:
                                            vacaciones[k]=5;
                                            
                                            break;
                                        case 3:
                                        case 4:
                                            vacaciones[k]=7;
                                            break;
                                         case 0:
                                            vacaciones[k]=0;
                                            break;
                                         default:
                                             vacaciones[k]=10;
                                    }
                                    
                                    break;
                                case "B":
                                    switch(antiguedad){
                                        case 1:
                                        case 2:
                                            vacaciones[k]=7;
                                            break;
                                        case 3:
                                        case 4:
                                            vacaciones[k]=10;
                                            break;
                                         case 0:
                                            vacaciones[k]=0;
                                            break;
                                         default:
                                             vacaciones[k]=13;
                                    }
                                    break;
                                    
                                case "C":
                                    switch(antiguedad){
                                        case 1:
                                        case 2:
                                            vacaciones[k]=10;
                                            break;
                                        case 3:
                                        case 4:
                                            vacaciones[k]=13;
                                            break;
                                         case 0:
                                            vacaciones[k]=0;
                                            break;
                                         default:
                                             vacaciones[k]=15;
                                    }
                                    
                                    break;
                                    
                                default:
                                    System.out.println("Departamento invalido");
                            }
                            //una forma de imrpimir
                            System.out.println("A "+nombres[k]+" le corresponden "+vacaciones[k]+" días de vacaciones");
                            k++;
                            
                            
                            
                        }
                        
                        //otra forma de imprimirlo
                        System.out.println("Nombre  días de vacaciones");
                        for(int i=0; i < nombres.length;i++){
                            System.out.println(nombres[i] + "    "+ vacaciones[i]);
                        }
                        
                        for(String i : nombres){
                            System.out.println(i);
                        }
                        
                        for(int i : vacaciones){
                            System.out.println(i);
                        }
                        
                         //tarea como podriamos juntarlo
                         
                         //consulta
                         
                        System.out.println("*************\nHASTA LUEGO\n*************");
                        
                        
                    }
                    
                }
