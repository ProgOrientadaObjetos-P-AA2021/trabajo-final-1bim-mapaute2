/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetecuatro;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class EscrituraArchivoCiudad {
    
    private String nombreArchivo;
    private ObjectOutputStream salida; 
    private Ciudad registroCiudad;
    private ArrayList<Ciudad> listaCiudades;

    public EscrituraArchivoCiudad(String nombreArc) {
        nombreArchivo = nombreArc;
        establecerListaCiudades(); // obtener los valores (objetos)
                                    // que tiene el archivo.
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerListaCiudades().size() > 0) {
                for (int i = 0; i < obtenerListaCiudades().size(); i++) {
                    establecerRegistroCiudad(obtenerListaCiudades().get(i));
                    establecerSalida();
                }
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        } // fin de catch
    }
    
    public void establecerNombreArchivo(String n){
        nombreArchivo = n;
    }

    public void establecerRegistroCiudad(Ciudad c) {
        registroCiudad = c;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registroCiudad); // envía el registro como 
                                                  // objeto al archivo
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }

    // en el atributo listaProfesores obtenemos los registros 
    // del archivo
    public void establecerListaCiudades() {
        LecturaArchivoCiudad l = new LecturaArchivoCiudad(obtenerNombreArchivo());
        l.establecerCiudades();
        listaCiudades = l.obtenerCiudades();
    }

    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }
    
    public ArrayList<Ciudad> obtenerListaCiudades() {
        return listaCiudades;
    }

    public ObjectOutputStream obtenerSalida(){
        return salida;
    }
    public void cerrarArchivo() {
        try // cierra el archivo
        {
            if (salida != null) {
                salida.close();
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            
        } // fin de catch
    } 
    
}
