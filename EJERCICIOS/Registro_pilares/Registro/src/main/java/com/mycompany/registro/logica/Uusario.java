
package com.mycompany.registro.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Uusario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
     private int folio;
     private String nombre;
     private String apellido;
     private String curp;
     private String sexo;
     private String telefono;
     private String correo;

    public Uusario() {
    }

    public Uusario(int folio, String nombre, String apellido, String curp, String sexo, String telefono, String correo) {
        this.folio = folio;
        this.nombre = nombre;
        this.apellido = apellido;
        this.curp = curp;
        this.sexo = sexo;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
     
     
}
