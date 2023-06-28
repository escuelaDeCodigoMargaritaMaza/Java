/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author Usuario
 */
public class Menor extends Usuario {
    String tutor;
    String telefono2;

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }
    
    

    public Menor(String tutor, String telefono2, String nombre, String folio, int edad) {
        super(nombre, folio, edad);
        this.tutor = tutor;
        this.telefono2 = telefono2;
    }
    

    
}
