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
public class Casa {
   
    private Propietario[] po;
    private double precimCua;
    private double numMetros;
    private double costoFinal;
    private Ubicacion[] ubi;
    private Ciudad[] ciu;
    private int numCuartos;
    private Constructora[] cons;
    
    public Casa (Propietario[] p,double pM,double n,Ubicacion[] u,Ciudad[] ci, 
            int nC,Constructora[] c){
        po = p;
        precimCua = pM;
        numMetros = n;
        ubi = u;
        ciu = ci;
        numCuartos = nC;
        cons = c;
    }
    
    public void establecerPo(Propietario[] tipo){
        po = tipo;
    }
    public void establecerPreciomCua(double tipo){
        precimCua = tipo;
    }
    public void establecerNumMetros(double tipo){
        numMetros = tipo;
    }
    public void establecerCostoFinal(){
        
        costoFinal = numMetros * precimCua; 
    
    }
    public void establecerUbi(Ubicacion[] tipo){
        ubi = tipo;
    }
    public void establecerCiu(Ciudad[] tipo){
        ciu = tipo;
    }
    public void establecerNumCuartos(int tipo){
        numCuartos = tipo;
    }
    public void establecerCons(Constructora[] tipo){
        cons = tipo;
    }
    
    
    public Propietario[] obtenerPo(){
        return po;
    }
    public double obtenerPreciomCua(){
        return precimCua;
    }
    public double obtenerNumMetros(){
        return numMetros;
    }
    public double obtenerCostoFinal(){
        return costoFinal;
    }
    public Ubicacion[] obtenerUbi(){
        return ubi;
    }
    public Ciudad[] obtenerCiu(){
        return ciu ;
    }
    public int obtenerNumCuartos(){
        return numCuartos;
    }
    public Constructora[] obtenerCons(){
        return cons;
    } 
    
    
}
