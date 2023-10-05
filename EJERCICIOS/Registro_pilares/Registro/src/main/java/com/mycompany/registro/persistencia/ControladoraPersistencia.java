
package com.mycompany.registro.persistencia;

import com.mycompany.registro.logica.Uusario;


public class ControladoraPersistencia {
    UusarioJpaController usuariojpa = new UusarioJpaController();

    public void guardar(Uusario usuario) {
            
        
        //creando en la BD el usuario
        usuariojpa.create(usuario);
    }
    
}
