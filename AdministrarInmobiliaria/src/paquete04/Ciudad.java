/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class Ciudad {

    private String nombreCiudad, provincia;

    public Ciudad(String a, String b) {
        nombreCiudad = a;
        provincia = b;
    }

    public void establecerNombre(String c) {
        nombreCiudad = c;
    }

    public void establecerProvincia(String c) {
        provincia = c;
    }

    public String obtenerNombre() {
        return nombreCiudad;
    }

    public String obtenerProvincia() {
        return provincia;
    }

}
