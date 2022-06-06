/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.io.*;

/**
 *
 * @author Grupo 10
 */
public class Barrio implements Serializable{
    private String nombreBarrio;
    private String referencia;
    
    public Barrio(String b, String r){
        nombreBarrio = b;
        referencia = r;
    }
    public void establecerNombreBarrio(String bar){
        nombreBarrio = bar;
    }
    public String obtenerNombreBarrio(){
        return nombreBarrio;
    }
    
    public void establecerReferencia(String refe){
        referencia = refe;
    }
    public String obtenerReferencia(){
        return referencia;
    }
    @Override
    public String toString(){
        String cadena = String.format("Nombre barrio: %s Referencia: %s\n",nombreBarrio,referencia);
        return cadena;
    }
}
