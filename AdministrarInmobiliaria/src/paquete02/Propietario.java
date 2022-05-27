/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Propietario {

    private String nombrePropietario, apellidos, identificacion;

    public Propietario(String a, String b, String c) {
        nombrePropietario = a;
        apellidos = b;
        identificacion = c;
    }

    public void establecerNombre(String c) {
        nombrePropietario = c;
    }

    public void establecerApellidos(String c) {
        apellidos = c;
    }

    public void establecerIdentificacion(String c) {
        identificacion = c;
    }

    public String obtenerNombre() {
        return nombrePropietario;
    }

    public String obtenerApellido() {
        return apellidos;
    }

    public String obtenerIdentificacion() {
        return identificacion;
    }
}
