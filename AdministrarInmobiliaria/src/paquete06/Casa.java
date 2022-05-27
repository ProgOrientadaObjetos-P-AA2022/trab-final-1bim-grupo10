/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

import paquete03.Barrio;
import paquete02.Propietario;
import paquete04.Ciudad;
import paquete05.Constructora;

/**
 *
 * @author YO
 */
public class Casa {

    String nombrePropietario, apellidos, identificacion, nombreConstructora,
            nombreBarrio, referencia, nombreCiudad, nombreEdificio, ubicacion, 
            provincia;
    int númeroMetros;
    double costoFinal;
    double precioMetro;
    int id;
    double cuotaMensual;
    int numeroCuartos;

    Propietario pro = new Propietario(nombrePropietario, apellidos, identificacion);
    Barrio bar = new Barrio(nombreBarrio, referencia);
    Ciudad ciu = new Ciudad(nombreCiudad, provincia);
    Constructora cons = new Constructora(nombreConstructora, id);
}


