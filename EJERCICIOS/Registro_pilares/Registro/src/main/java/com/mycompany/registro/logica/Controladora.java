
package com.mycompany.registro.logica;

import com.mycompany.registro.persistencia.ControladoraPersistencia;


public class Controladora {
    ControladoraPersistencia controlpersi = new ControladoraPersistencia();

    public void guardar(String text, String text0, String text1, String text2, String text3, String sexo, String pilares) {
        Uusario usuario = new Uusario();    
        usuario.setNombre(text);
        usuario.setApellido(text0);
        usuario.setTelefono(text1);
        usuario.setCorreo(text3);
        usuario.setCurp(text2);
        usuario.setSexo(sexo);
        
        //creamos el metodo para pasarle a la persistecia
        controlpersi.guardar(usuario);
    }
}
