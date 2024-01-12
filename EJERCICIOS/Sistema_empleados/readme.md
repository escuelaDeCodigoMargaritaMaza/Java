![image](https://github.com/escuelaDeCodigoMargaritaMaza/Java/assets/91554777/37fc62ac-a95d-4ede-be23-2708ff4e5adc)

# VERSION 1 

### PUBLIC
      package com.mycompany.controlempleados;
      
      import logica.Empleado;
      
      public class ControlEmpleados {
      
          public static void main(String[] args) {
              //instanciamos y atendemos el warning, ahora creamos los geters y seters en Empleado
              Empleado empleado1=new Empleado();
              
              empleado1.setNumero_de_empleado(1);
              empleado1.setNombre("Miguel");
              empleado1.setDomicilio("Calle 1 numerro 5");
              empleado1.setEmail("miguel@gmail.com");
              empleado1.setFecha_nac("15-12-1996");
              empleado1.setGenero("hombre");
              
              //visualizarlos
              
              System.out.println("Número de empleado:" + empleado1.getNumero_de_empleado());
              
              empleado1.mostrarDatos();
              
              //empleado 2 con constructor con datos
              Empleado empleado2=new Empleado(2,"Pedro","Calle3 numero5","556678788","pedro@gmail.com","15-11-1985","hombre");
              empleado2.mostrarDatos();
          }
      
      }

### LOGICA
          package logica;
          
          public class Empleado {
              int numero_de_empleado;
              String nombre,domicilio,telefono,email,fecha_nac,genero;
          
              //creamos el constructor vacio, clic derecho, instanciamos el primer objeto en el public
              public Empleado() {
              }
              
              //constructor con datos
          
              public Empleado(int numero_de_empleado, String nombre, String domicilio, String telefono, String email, String fecha_nac, String genero) {
                  this.numero_de_empleado = numero_de_empleado;
                  this.nombre = nombre;
                  this.domicilio = domicilio;
                  this.telefono = telefono;
                  this.email = email;
                  this.fecha_nac = fecha_nac;
                  this.genero = genero;
              }
              
              
              //geters y seters
          
              public int getNumero_de_empleado() {
                  return numero_de_empleado;
              }
          
              public void setNumero_de_empleado(int numero_de_empleado) {
                  this.numero_de_empleado = numero_de_empleado;
              }
          
              public String getNombre() {
                  return nombre;
              }
          
              public void setNombre(String nombre) {
                  this.nombre = nombre;
              }
          
              public String getDomicilio() {
                  return domicilio;
              }
          
              public void setDomicilio(String domicilio) {
                  this.domicilio = domicilio;
              }
          
              public String getTelefono() {
                  return telefono;
              }
          
              public void setTelefono(String telefono) {
                  this.telefono = telefono;
              }
          
              public String getEmail() {
                  return email;
              }
          
              public void setEmail(String email) {
                  this.email = email;
              }
          
              public String getFecha_nac() {
                  return fecha_nac;
              }
          
              public void setFecha_nac(String fecha_nac) {
                  this.fecha_nac = fecha_nac;
              }
          
              public String getGenero() {
                  return genero;
              }
          
              public void setGenero(String genero) {
                  this.genero = genero;
              }
              
              //metodo para visualizar datos
              public void mostrarDatos(){   //método para mostrar los datos camelCase
                  System.out.println("Número de empleado: "+ this.numero_de_empleado + "\nnombre: "+ this.nombre+"\nDomicilio: "+this.domicilio);
              }
              
          }
