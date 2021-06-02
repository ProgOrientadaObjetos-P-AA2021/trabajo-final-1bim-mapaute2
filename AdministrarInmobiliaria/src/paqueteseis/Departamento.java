/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteseis;

import java.io.Serializable;
import java.util.Scanner;
import paquetedos.Propietario;
import paquetetres.Ubicacion;
import paquetecuatro.Ciudad;
import paquetecinco.Constructora;
/**
 *
 * @author reroes
 */
public class Departamento implements Serializable {
    
    private Propietario[] poDepar;
    private double precioMetroCua;
    private double numMetrosCua;
    private double valorMensual;
    private double cosFinal;
    private double precioDepa;
    private Ubicacion[] ubiDepar;
    private Ciudad[] ciuDepa;
    private String nomEdificio;
    private String UbiDeparEdi;
    private Constructora[] consDepa;
    private int max;
    
    Scanner leer = new Scanner(System.in);
    
    public Departamento (Propietario[] pD,
            Ubicacion[] uD,Ciudad[] ciuD,
            Constructora[] cD,int m){
        
        poDepar = pD;
        precioMetroCua = 10.15;
        numMetrosCua = 75;
        valorMensual = 500;
        precioDepa = 1200;
        ubiDepar = uD;
        ciuDepa = ciuD;
        consDepa = cD;
        max = m;
    }
    
    public void establecerPoDepar(Propietario[] tipo){
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
    public void establecerUbiDepar(Ubicacion[] tipo){
        ubiDepar = tipo;
    }
    public void establecerCiuDepa(Ciudad[] tipo){
        ciuDepa = tipo;
    }
    public void establecerNomEdificio(){
        for (int i = 0; i <max; i++) {
            System.out.printf("Ingrese el nombre del edificio %d\n", i+1);
            String nombreEdificio = leer.nextLine();
        }
    }
    public void establecerUbiDeparEdi(){
        for (int i = 0; i < max; i++) {
            System.out.printf("Ingrese la ubicación del "
                    + "departamento en el edificio %d\n", i+1);
            String ubiEdicio = leer.nextLine();
        }
    }   
    public void establecerConsDepa(Constructora[] tipo){
        consDepa = tipo;
    }
    
    
    public Propietario[] obtenerPoDepar(){
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
    public Ubicacion[] obtenerUbiDepar(){
        return ubiDepar;
    }
    public Ciudad[] obtenerCiuDepa(){
        return ciuDepa ;
    }
    public String obtenerNomEdificio(){
        return nomEdificio;
    }
    public String obtenerUbiDeparEdi(){
        return UbiDeparEdi;
    }
    public Constructora[] obtenerCons(){
        return consDepa;
    }
    
    @Override
    public String toString(){
        String cadena = "Datos de los Departamentos\n";
        
        for (int i = 0; i < obtenerPoDepar().length; i++) {
            cadena = String.format("%s\t\t%s - %s - %s\n", cadena, 
                  obtenerPoDepar()[i].obtenerNombre(),
                  obtenerPoDepar()[i].obtenerApellido(),
                  obtenerPoDepar()[i].obtenerIdentificacion());
        }
        cadena = String.format("%sEl precio por el metro cuadrado es:%.2f\n", cadena, 
                obtenerPrecioMetroCua());
        cadena = String.format("%sEl número de metros cuadrados es:%.2f\n", cadena, 
                obtenerNumMetrosCua());
        cadena = String.format("%El valor alícuota mensual es:%.2f\n", cadena, 
                obtenerValorMensual());
        cadena = String.format("%El precio es:%.2f\n", cadena, 
                obtenerPrecioDepa());
        cadena = String.format("%El nombre del edificio es:%.2f\n", cadena, 
                obtenerNomEdificio());
        cadena = String.format("%Ubicación del departamento en edificio es:%.2f\n", cadena, 
                obtenerUbiDeparEdi());
        
        for (int i = 0; i < obtenerUbiDepar().length; i++) {
            cadena = String.format("%sEl número de casa es: %s\n"
                    + "El nombre del barrio es: %s\n"
                    + "La referencia es: %s\n", cadena,
                obtenerUbiDepar()[i].obtenerCasa(),
                obtenerUbiDepar()[i].obtenerNomBarrio(),
                obtenerUbiDepar()[i].obtenerReferencia());
        }
        for (int i = 0; i < obtenerCiuDepa().length; i++) {
            cadena = String.format("%sEl nombre de la ciudad es:%s\n"
                    + "El nombre de la provincia es: %s\n", cadena, 
                obtenerCiuDepa()[i].obtenerNomCiudad(),
                obtenerCiuDepa()[i].obtenerNomProvincia());
        }
        for (int i = 0; i < obtenerCons().length; i++) {
            cadena = String.format("%sEl nombre de la constructora es: %s\n"
                    + "El ide es: %s\n", cadena, 
                obtenerCons()[i].obtenerNomConstructora(),
                obtenerCons()[i].obtenerIdeEmpresa());
        }
        cadena = String.format("%sEl costo final de la casa es:%.2f\n", cadena, 
                obtenerCosFinal());
        return cadena;
    } 
}
    
    
