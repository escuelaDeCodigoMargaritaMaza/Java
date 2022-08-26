# Práctica 11.
11. MÉTODOS DE ORDENAMIENTO

Objetivo: Verificar el dominio teórico y técnico del uso y manipulación de métodos de
ordenamiento en java mediante ejercicios para desarrollar su código, preguntas de
respuesta múltiple y abiertas.

Indicaciones: Pedir responder cada una de las preguntas de manera breve y clara.

1. ¿Cómo funciona el método de ordenamiento de la burbuja (Bubble Sort)? (Valor 1
punto)

          a. Funciona eligiendo un elemento como pivote y divide la matriz dada
          alrededor del pivote elegido.
          b. Funciona revisando cada elemento de la lista que va a ser ordenada con el
          siguiente, intercambiándolos de posición si están en el orden equivocado.
          c. Funciona dividiendo la matriz de entrada en dos mitades, se llama a sí
          mismo para las dos mitades, y luego fusiona las dos mitades ordenadas.

2. ¿Qué hace el método de ordenamiento de inserción (Insertion Sort)? (Valor 1
punto)

          a. Inserta un elemento en la posición correcta dentro de una lista que está
          desordenada.
          b. Inserta un elemento en la posición correcta dentro de una lista que no está
          ordenada.
          c. Inserta un elemento solo en la primera posición dentro de una list
          

3. Este ordenamiento sigue el principio "divide y vencerás", es un ordenamiento
rápido. (Valor 1 punto)

            a. Burbuja (Bubble sort)
            b. Inserción (Insertion sort)
            c. QuickSort
            
4. Se tiene el siguiente arreglo con 5 elementos, después de finalizar la primera
pasada,si aplicamos el método de ordenamiento de la burbuja, ¿Cuál sería el
orden del arreglo? Selecciona la respuesta correcta y escribe el procedimiento
para llegar a ella. (Valor 3 puntos)

![imagen](https://user-images.githubusercontent.com/91554777/187002220-d3015664-2d09-4733-aff2-475127482243.png)

          TU RESPUESTA AQUI
          
5. Se tiene el siguiente arreglo con 5 elementos, desarrolla el procedimiento para
ordenarlo por el método de ordenamiento de inserción: (Valor 3 puntos)

![imagen](https://user-images.githubusercontent.com/91554777/187002270-3dc86c99-26fd-436c-8427-ecda05393c96.png)

          TU RESPUESTA AQUI
          
6. Completa el siguiente código de tal forma que el resultado obtenido sea el que se
muestra en la imagen: (Valor 3 puntos)

![imagen](https://user-images.githubusercontent.com/91554777/187002359-6e36bb69-c059-4d04-95bf-52363aacf53b.png)


          public class metodoOrdenamiento{
            public void imprimeArreglo(String mensaje, int[] arreglo) {
               //TU CODIGO AQUI
             }
          }
            public void saltoLinea() {
            System.out.println("\n");
          }
          public static void main(String args[]) {
         
             //TU CODIGO AQUI
         
              metodoOrdenamiento objOrdena = new metodoOrdenamiento();
              objOrdena.imprimeArreglo("Arreglo inicial: ", arreglo);
              objOrdena.saltoLinea();
              for(int i=0; i<arreglo.length; i++) {
              System.out.println("i = " + i);
              for(int j=0; j<arreglo.length-1; j++) {
              objOrdena.imprimeArreglo(" Arreglo comparando: ", arreglo);
              System.out.println(" <----- j = " + j + " -- " + arreglo[j] + " > " + arreglo[j+1] + "?");
              if(arreglo[j] > arreglo[j+1]) {
              System.out.println(" ------- Intercambia " + arreglo[j] + " con " + arreglo[j+1]);
                
                //TU CODIGO AQUI
                
              objOrdena.imprimeArreglo(" Arreglo modificado: ", arreglo);
              objOrdena.saltoLinea();
              }
            }
          }
            objOrdena.saltoLinea();
            objOrdena.imprimeArreglo("Arreglo final: ", arreglo);
            }
          }

