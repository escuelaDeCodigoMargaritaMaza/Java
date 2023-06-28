/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Usuario {
    private String nombre;
    private String folio;
    private int edad;
    Scanner sc = new Scanner(System.in);
    
    public Usuario(String nombre, String folio, int edad) {
     this.nombre = nombre;
     this.folio = folio;
     this.edad = edad;
    }
    
    //creareuin cosntructor vacio

    public Usuario() {
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    public void mostrarDatos(){
        System.out.println("Puedo mostrar los datos");
        //agrego
        System.out.println("Nombre: " + nombre);
       

        
    }
    public void modificarDatos(){
        System.out.println("Puedo modificar los datos");
        //agrego
        System.out.println("Ingresa el nuevo nombre: ");
        nombre = sc.nextLine();
    
    }
    public void poderParticipar(){
        if(edad<29 & edad > 18){
            System.out.println("El usuario tiene "+edad+" años, puede participar en el programa");
        }else{
            System.out.println("El usuario tiene "+edad+" años, no puede participar en el programa");
        }
    }
    
 

 
    
}
