/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetetres;

import java.io.Serializable;
/**
 *
 * @author reroes
 */
public class Ubicacion implements Serializable {
    
    private String nomBarrio;
    private String referencia;
    
    public Ubicacion(String nomBa, String refe){
        nomBarrio = nomBa;
        referencia = refe;
    }
    
    public void establecerNomBarrio(String tipo){
        nomBarrio = tipo;
    }
    public void establecerReferencia(String tipo){
        referencia = tipo;
    }
    
    public String obtenerNomBarrio(){
        return nomBarrio;
    }
    public String obtenerReferencia(){
        return referencia;
    }
}
