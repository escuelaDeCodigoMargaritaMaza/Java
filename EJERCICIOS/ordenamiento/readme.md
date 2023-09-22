          package com.mycompany.ordenamiento;
          
          import java.util.LinkedList;
          import java.util.Scanner;
          import javax.swing.JOptionPane;
          
          public class Ordenamiento {
          
              public static void main(String[] args) {
                        Scanner sc=new Scanner(System.in);
                        int arreglo[],nElementos,auxiliar,posicion;
                        nElementos= Integer.parseInt(JOptionPane.showInputDialog("Dígita el número de elements"));
                        arreglo=new int[nElementos];
                        
                        for(int i=0;i<nElementos;i++){
                            System.out.println((i+1)+"digit un número");  
                            arreglo[i]=sc.nextInt();
                            }
                        
                        
                            //burbuja
                        for(int j=0;j<(nElementos-1);j++){
                            for(int k = 0;k<(nElementos-1);k++){
                                if(arreglo[k]>arreglo[k+1]){
                                    auxiliar=arreglo[k];
                                    arreglo[k]=arreglo[k+1];
                                    arreglo[k+1]=auxiliar;
                                }
                               
                            }
                         }
                        //mostrarlo en forma creciente
                        System.out.println("\n areeglo en forma creciente");
                        for(int l=0;l<nElementos;l++){
                            System.out.println(arreglo[l]);
                        }
                        
                        //mostrarlo en forme decreciente
                         System.out.println("\n areeglo en forma decreciente");
                         for(int m=(nElementos-1);m>=0;m--){
                            System.out.println(arreglo[m]);
                        }
                         
                         
                         //por insercion
                         for(int i =0;i<nElementos;i++){
                             posicion = i;
                             auxiliar=arreglo[i];   
                             while ((posicion>0)&&(arreglo[posicion-1]>auxiliar)){
                                 arreglo[posicion] =arreglo[posicion-1];
                                 posicion--;
                             }
                             arreglo[posicion] = auxiliar;
                         }
                         //en forma ascendente
                            System.out.println("Arreglo en forma ascendente");
                            for(int j=0;j<nElementos;j++){
                                System.out.println(arreglo[j]);
                            }
                            
                         //en forma descendente
