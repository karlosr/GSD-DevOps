package com.bbva.evaluation.gsddevops.parte2;

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

    private Timestamp inicioDelRango;
    private Timestamp finDelRango;
    
    //    Constructor vacío
    public GestionRangoFechas() {}
    
    //    Contructor con los parámetros inicio y fin de los rangos de fechas bajo el tipo de dato java.sql.Timestamp 
    public GestionRangoFechas(Timestamp inicioDelRango, Timestamp finDelRango) {
        this.inicioDelRango = inicioDelRango;
        this.finDelRango = finDelRango;
    }
    
    //    Se sobre escribe el método toString para que al momento de mandar a imprimir el objeto, se imprima de la siguiente manera
    @Override
    public String toString() {
        return "Rango{" + 
                "inicioDelRango=" + inicioDelRango + 
                ", finDelRango=" + finDelRango + 
                "}";
    }

    /**
     * @return the inicioDelRango
     */
    public Timestamp getInicioDelRango() {
        return inicioDelRango;
    }

    /**
     * @param inicioDelRango the inicioDelRango to set
     */
    public void setInicioDelRango(Timestamp inicioDelRango) {
        this.inicioDelRango = inicioDelRango;
    }

    /**
     * @return the finDelRango
     */
    public Timestamp getFinDelRango() {
        return finDelRango;
    }

    /**
     * @param finDelRango the finDelRango to set
     */
    public void setFinDelRango(Timestamp finDelRango) {
        this.finDelRango = finDelRango;
    }
}
