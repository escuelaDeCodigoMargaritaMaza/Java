La clase Scanner que se encuentra dentro del paquete java.util se usa para leer datos
de entrada de diferentes fuentes como flujos de entrada, usuarios, archivos, etc.

El paquete java. util, es uno de los principales paquetes que usaremos cuando estemos programando con el lenguaje Java, y junto al paquete java. lang es uno de los más utilizados en cualquier tipo de desarrollo informático basado en Java.

Tomemos un ejemplo.

![image](https://user-images.githubusercontent.com/91554777/180582330-2963470e-5439-4fce-8ce9-e3af0279f48d.png)

salida

      Ingresa tu nombre: Guadalupe
      Mi nombre es Guadalupe
      
 En el ejemplo anterior, observa la línea
 
 ![image](https://user-images.githubusercontent.com/91554777/180582385-62659be8-bd48-443c-a41a-89983d658190.png)

donde hemos creado un objeto llamado entrada a partir de la clase Scanner.

El parámetro System.in lo usamos para tomar el dato de entrada a través de la entrada
estándar. Funciona de la misma manera en que se capturan datos de entrada del
teclado.

Luego usamos el método nextLine() de la clase Scanner para leer/capturar una línea de
texto del usuario.

Ahora que tienes una noción vaga de lo que se puede hacer con la clase Scanner,
veamos algunas cosas más a fondo.

Como vimos en el ejemplo anterior, necesitamos importar el paquete java.util.Scanner
antes de poder usar la clase Scanner.

Una vez que importamos el paquete, podremos crear objetos a partir de la clase
Scanner

![image](https://user-images.githubusercontent.com/91554777/180582518-28b86ed2-3e9f-43eb-9a9c-b16d7809ef86.png)

En el ejemplo anterior, hemos creado objetos de la clase Scanner que leerán la entrada
de InputStream (flujos de entrada), File (archivos) y String (cadenas) respectivamente.

La clase Scanner proporciona varios métodos que nos permiten leer entradas de
diferentes tipos.

![image](https://user-images.githubusercontent.com/91554777/180582568-0d7eadba-9c53-4f65-bdfb-65a7bb0b3a5f.png)


