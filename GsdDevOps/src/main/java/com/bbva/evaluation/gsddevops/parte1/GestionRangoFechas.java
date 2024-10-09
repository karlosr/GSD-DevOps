package com.bbva.evaluation.gsddevops.parte1;

import java.sql.Timestamp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author roque
 */
public class GestionRangoFechas {

    Timestamp inicioDelRango;
    Timestamp finDelRango;

    //    Contructor con los parámetros inicio y fin de los rangos de fechas bajo el tipo de dato java.sql.Timestamp 
    public GestionRangoFechas(Timestamp inicioDelRango, Timestamp finDelRango) {
        this.inicioDelRango = inicioDelRango;
        this.finDelRango = finDelRango;
    }

    //    Se sobre escribe el método toString para que al momento de mandar a imprimir el objeto, se imprima de la siguiente manera
    @Override
    public String toString() {
        return "[" + inicioDelRango + ", " + finDelRango + "]";
    }
}
