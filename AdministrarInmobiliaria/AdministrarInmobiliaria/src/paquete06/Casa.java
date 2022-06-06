/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

import java.io.*;
import paquete02.*;
import paquete03.*;
import paquete04.*;
import paquete05.*;

/**
 *
 * @author Grupo 10
 */
public class Casa implements Serializable{
    private Propietario propietario;
    private double precioMetroCuadrado;
    private double numeroMetrosCuadrados;
    private double costoFinal;
    private Barrio barrio;
    private Ciudad ciudad;
    private int numeroCuartos;
    private Constructora constructora;
    
    public Casa(double pM, double nM,int nC,Propietario p,Barrio b,Ciudad c,Constructora C){
        precioMetroCuadrado = pM;
        numeroMetrosCuadrados = nM;
        numeroCuartos = nC;
        propietario = p;
        barrio = b;
        ciudad = c;
        constructora = C;
    }
    
    public void establecerPropietario(Propietario c){
        propietario = c;
    }
    
    public Propietario obtenerPropietario(){
        return propietario;
    }
    
    public void establecerPrecioMetroCuadrado(double c){
        precioMetroCuadrado = c;
    }
    public double obtenerPrecioMetroCuadrado(){
        return precioMetroCuadrado;
    }
    
    public void establecerNumeroMetrosCuadrados(double c){
        numeroMetrosCuadrados = c;
    }
    public double obtenerNumeroMetrosCuadrados(){
        return numeroMetrosCuadrados;
    }
    
    public void establecerCostoFinal(){
        costoFinal = precioMetroCuadrado * numeroMetrosCuadrados;
    }
    
    public double obtenerCostoFinal(){
        return costoFinal;
    }
    
    public void establecerBarrio(Barrio c){
        barrio = c;
    }
    public Barrio obtenerBarrio(){
        return barrio;
    }
    
    public void establecerCiudad(Ciudad c){
        ciudad = c;
    }
    public Ciudad obtenerCiudad(){
        return ciudad;
    }
    
    public void establecerNumeroCuartos(int c){
        numeroCuartos = c;
    }
    public int obtenerNumeroCuartos(){
        return numeroCuartos;
    }
    
    public void establecerConstructora(Constructora c){
        constructora = c;
    }
    public Constructora obtenerConstructora(){
        return constructora;
    }
    
    public String toString() {
        
        String cadena = String.format("Informacion casa:\n"
                + "PROPIETARIO\n"
                + "Nombres: %s Apellidos: %s Identificacion: %s\n"
                + "Precio metro cuadrado: %.2f Numero metros Cuadrados: %.2f Numero Cuartos: %d Costo final: %.2f\n"
                + "BARRIO\n"
                + "Nombre barrio: %s Referencia: %s\n"
                + "CIUDAD\n"
                + "Nombre Ciudad: %s Nombre Provincia: %s \n"
                + "CONSTRUCTORA\n"
                + "Nombre Constructora: %s Id Empresa: %s\n"
                ,propietario.obtenerNombres(),propietario.obtenerApellidos(),propietario.obtenerIdentificacion(),
                precioMetroCuadrado,numeroCuartos,numeroMetrosCuadrados,costoFinal,
                barrio.obtenerNombreBarrio(),barrio.obtenerReferencia(),
                ciudad.obtenerNombreCuidad(),ciudad.obtenerNombreProvincia(),
                constructora.obtenerNombreConstructora(),constructora.obtenerIdEmpresa());
        return cadena;
    }
}
