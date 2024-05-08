    
    package com.mycompany.colecciones.logica;
    
    
    public class Evaluacion {
    
        public Evaluacion() {
        }
        
        public void insercion(){
            int[] numeros = {50,20,40,80,30};
            
            int auxiliar,posicion;
            for(int i =0;i<numeros.length;i++){
                posicion = i;
                auxiliar=numeros[i];   
                while ((posicion>0)&&(numeros[posicion-1]>auxiliar)){
                    numeros[posicion] =numeros[posicion-1];
                    posicion--;
                }
                numeros[posicion] = auxiliar;
            }
            
            
            for (int i = 0; i < numeros.length; i++) {
                System.out.println(numeros[i]);
            }
        }
        
        public void burbuja(){
            int[] numeros = {11,23,9,20};
            
             int auxiliar;
            for(int i=0;i<(numeros.length-1);i++){
                for(int j = 0;j<(numeros.length-1);j++){
                    if(numeros[j]>numeros[j+1]){
                        auxiliar=numeros[j];
                        numeros[j]=numeros[j+1];
                        numeros[j+1]=auxiliar;
                    }
    
                }
             }
                      
          System.out.println("\n areeglo en forma creciente");
          for(int i=0;i<(numeros.length);i++){
              System.out.println(numeros[i]);
          }
      }
  }
