/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

/**
 *
 * @author reroes
 */
public class Constructora {

    private String nombreConstructora;
    private int id;

    public Constructora(String a, int b) {
        nombreConstructora = a;
        id = b;
    }

    public void establecerConstructora(String c) {
        nombreConstructora = c;
    }

    public void establecerID(int c) {
        id = c;
    }

    public String obtenerConstructora() {
        return nombreConstructora;
    }

    public int obtenerID() {
        return id;
    }
}
