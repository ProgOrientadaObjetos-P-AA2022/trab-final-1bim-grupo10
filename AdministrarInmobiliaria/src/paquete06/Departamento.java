/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

/**
 *
 * @author reroes
 */
public class Departamento {

    String nombrePropietario, apellidos, identificacion, nombreConstructora,
            nombreBarrio, referencia, nombreCiudad, nombreEdificio, ubicacion,
            provincia;
    double precioMetro, costoFinal;
    int númeroMetros, id;
    double cuotaMensual;

    Propietario pro = new Propietario(nombrePropietario, apellidos, identificacion);
    Barrio bar = new Barrio(nombreBarrio, referencia);
    Ciudad ciu = new Ciudad(nombreCiudad, provincia);
    Constructora cons = new Constructora(nombreConstructora, id);
}
