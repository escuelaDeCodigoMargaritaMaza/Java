/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class POO {

    public static void main(String[] args) {
        
         //array list
        ArrayList<Usuario> usuariosActuales = new ArrayList();
        
        Usuario usuario1 = new Usuario("Juan","FOLIO1",23);
        usuariosActuales.add(usuario1);
        System.out.println("Nombre: " + usuario1.getNombre() );
        System.out.println("Folio: " + usuario1.getFolio());
        System.out.println("Edad: " + usuario1.getEdad());
        
        
        //instanciamos el nuevo objeto
        Usuario usuario2 = new Usuario();
        usuariosActuales.add(usuario2);
        //para pasarle datos voy por el set
        usuario2.setNombre("david");
        usuario2.setFolio("FOLIO2");
        usuario2.setEdad(26);
        System.out.println("Nombre: " + usuario2.getNombre() );
        System.out.println("Folio: " + usuario2.getFolio());
        System.out.println("Edad: " + usuario2.getEdad());
        
        //de la heredada
        Menor menor1 = new Menor("Miguel","55656547","Pedro","FOLIO3",10);
        
        System.out.println("Nombre menor: " + menor1.getNombre());
        
        //metodos
        usuario1.mostrarDatos();
        usuario1.modificarDatos();
        usuario1.mostrarDatos();
        
        menor1.mostrarDatos();
        
        usuario1.poderParticipar();
        
        
       
        Usuario usuario3 = new Usuario("Miguel", "FOLIO4", 23);
        usuariosActuales.add(usuario3);
        
        //impresión del total de usuarios
        System.out.println("Alumnos actuales en la clase: " + usuariosActuales.size());
        
        
    }
    
    
}
