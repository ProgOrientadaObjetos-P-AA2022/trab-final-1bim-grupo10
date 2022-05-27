/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

/**
 *
 * @author reroes
 */
public class Barrio {

    private String nombreBarrio, referencia;

    public Barrio(String a, String b) {
        nombreBarrio = a;
        referencia = b;
    }

    public void establecerNombre(String c) {
        nombreBarrio = c;
    }

    public void establecerReferencia(String c) {
        referencia = c;
    }

    public String obtenerNombre() {
        return nombreBarrio;
    }

    public String obtenerReferencia() {
        return referencia;
    }
}
