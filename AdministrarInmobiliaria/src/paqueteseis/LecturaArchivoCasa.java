/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteseis;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import paquetedos.Propietario;

/**
 *
 * @author usuario
 */
public class LecturaArchivoCasa {
    
    private ObjectInputStream entrada;
    private ArrayList<Casa> casas;
    private String nombreArchivo;

    public LecturaArchivoCasa(String n) {
        nombreArchivo = n;
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {
            try // abre el archivo
            {
                entrada = new ObjectInputStream(
                        new FileInputStream(n));
            } // fin de try
            catch (IOException ioException) {
                System.err.println("Error al abrir el archivo." + ioException);
            } // fin de catch
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }
    

    public void establecerCasas() {
        // 
        casas = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Casa registro = (Casa) entrada.readObject();
                    casas.add(registro);
                } catch (EOFException endOfFileException) {
                    return; // se llegó al fin del archivo
                    // System.err.println("Fin de archivo: " + endOfFileException);

                } catch (IOException ex) {
                    System.err.println("Error al leer el archivo: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("No se pudo crear el objeto: " + ex);
                } catch (Exception ex) {
                    System.err.println("No hay datos en el archivo: " + ex);

                }
            }
        }
    }

    public ArrayList<Casa> obtenerCasas() {
        return casas;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    @Override
    public String toString(){
        String cadena = "Datos de Casas\n";
        for (int i = 0; i < obtenerCasas().size(); i++) {
            Casa ca = obtenerCasas().get(i);
            for ( i = 0; i < obtenerCasas().size(); i++) {              
                cadena = String.format("%s\t\t%s - %s - %s\n", cadena, 
                      ca.obtenerPo()[i].obtenerNombre(),
                      ca.obtenerPo()[i].obtenerApellido(),
                      ca.obtenerPo()[i].obtenerIdentificacion());
            }
            cadena = String.format("%sEl precio por el metro cuadrado es:%.2f\n", cadena, 
                    ca.obtenerPreciomCua());

            for ( i = 0; i < obtenerCasas().size(); i++) {
                cadena = String.format("%sEl número de metros son: %.2f\n", cadena, 
                  ca.obtenerNumMetros());
            }
            for (i = 0; i <obtenerCasas().size(); i++) {
                cadena = String.format("%sEl costo final por casa es: %.2f\n", cadena, 
                    ca.obtenerCostoFinal());
            }
            for (i = 0; i < obtenerCasas().size(); i++) {
                cadena = String.format("%sEl nombre del barrio es:%s\n"
                        + "La referencia es: %s\n", cadena, 
                    ca.obtenerUbi()[i].obtenerNomBarrio(),
                    ca.obtenerUbi()[i].obtenerReferencia());
            }
            for (i = 0; i < obtenerCasas().size(); i++) {
                cadena = String.format("%sEl nombre de la ciudad es:%s\n"
                        + "El nombre de la provincia es: %s\n", cadena, 
                    ca.obtenerCiu()[i].obtenerNomCiudad(),
                    ca.obtenerCiu()[i].obtenerNomProvincia());
            }
            for ( i = 0; i < obtenerCasas().size(); i++) {
                cadena = String.format("%sEl nombre de la constructora es: %s\n"
                        + "El ide es: %s\n", cadena, 
                    ca.obtenerCons()[i].obtenerNomConstructora(),
                    ca.obtenerCons()[i].obtenerIdeEmpresa());
            }
            for (i = 0; i < obtenerCasas().size(); i++) {
                cadena = String.format("%sEl número de cuartos: %s\n",cadena, 
                    ca.obtenerNumCuartos());
            }
        }
         
        return cadena;
    }

    // cierra el archivo y termina la aplicación
    public void cerrarArchivo() {
        try // cierra el archivo y sale
        {
            if (entrada != null) {
                entrada.close();
            }
            System.exit(0);
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del método cerrarArchivo
    
}
