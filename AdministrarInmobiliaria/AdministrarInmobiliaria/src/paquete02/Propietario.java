/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.io.*;

/**
 *
 * @author Grupo 10
 */
public class Propietario implements Serializable{
    private String nombres;
    private String apellidos;
    private String identificacion;
    public Propietario(String n, String a, String id){
        nombres = n;
        apellidos = a;
        identificacion = id;
    }
    public void establecerNombres(String noms){
        nombres = noms;
    }
    
    public void establecerApellidos(String apes){
        apellidos = apes;
    }
    
    public void establecerIdentificacion(String id){
        identificacion = id;
    }
    
    public String obtenerNombres(){
        return nombres;
    }
    
    public String obtenerApellidos(){
        return apellidos;
    }
    
    public String obtenerIdentificacion(){
        return identificacion;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Nombres: %s Apellidos: %s Identificacion: %s\n",nombres,apellidos,identificacion);
        return cadena;
}
}
