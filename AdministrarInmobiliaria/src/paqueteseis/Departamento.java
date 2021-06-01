/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteseis;

import paquetedos.Propietario;
import paquetetres.Ubicacion;
import paquetecuatro.Ciudad;
import paquetecinco.Constructora;
/**
 *
 * @author reroes
 */
public class Departamento {
    
    private Propietario poDepar;
    private double precioMetroCua;
    private double numMetrosCua;
    private double valorMensual;
    private double cosFinal;
    private double precioDepa;
    private Ubicacion ubiDepar;
    private Ciudad ciuDepa;
    private String nomEdificio;
    private String UbiDeparEdi;
    private Constructora consDepa;
    
    public Departamento (Propietario pD,double pMC, double num,double vM,
            double peD,Ubicacion uD,Ciudad ciuD,String nE, String uDE,
            Constructora cD){
        
        poDepar = pD;
        precioMetroCua = pMC;
        numMetrosCua = num;
        valorMensual = vM;
        precioDepa = peD;
        ubiDepar = uD;
        ciuDepa = ciuD;
        nomEdificio = nE;
        UbiDeparEdi = uDE;
        consDepa = cD;
    }
    
    public void establecerPoDepar(Propietario tipo){
        poDepar = tipo;
    }
    public void establecerPrecioMetroCua(double tipo){
        precioDepa = tipo;
    }
    public void establecerNumMetrosCua(double tipo){
        numMetrosCua = tipo;
    }
    public void establecerValorMensual(double tipo){
        valorMensual = tipo;
    }
    public void establecerCosFinal(){
        cosFinal = (numMetrosCua * precioMetroCua)+(valorMensual*12);
    }
    public void establecerPrecioDepa(double tipo){
        precioDepa = tipo;
    }
    public void establecerUbiDepar(Ubicacion tipo){
        ubiDepar = tipo;
    }
    public void establecerCiuDepa(Ciudad tipo){
        ciuDepa = tipo;
    }
    public void establecerNomEdificio(String tipo){
        nomEdificio = tipo;
    }
    public void establecerConsDepa(Constructora tipo){
        consDepa = tipo;
    }
    
    
    public Propietario obtenerPoDepar(){
        return poDepar;
    }
    public double obtenerPrecioMetroCua(){
        return precioMetroCua;
    }
    public double obtenerNumMetrosCua(){
        return numMetrosCua;
    }
    public  double obtenerValorMensual(){
        return valorMensual;
    }
    public double obtenerCosFinal(){
        return cosFinal;
    }
    public double obtenerPrecioDepa(){
        return precioDepa;
    }
    public Ubicacion obtenerUbiDepar(){
        return ubiDepar;
    }
    public Ciudad obtenerCiuDepa(){
        return ciuDepa ;
    }
    public String obtenerNomEdificio(){
        return nomEdificio;
    }
    public Constructora obtenerCons(){
        return consDepa;
    }
}
    
    
