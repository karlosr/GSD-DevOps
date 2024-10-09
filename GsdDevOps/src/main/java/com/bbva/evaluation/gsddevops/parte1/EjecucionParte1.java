/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bbva.evaluation.gsddevops.parte1;

import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;

/**
 *
 * @author roque
 */
public class EjecucionParte1 {
    public static void main(String[] args) {
        List<GestionRangoFechas> listaDeRangosDeFechasOriginales = new ArrayList<>();
        AgrupacionRangoFechas objAgrupacionRangoFechas = new AgrupacionRangoFechas();

    //        Lista de rango de fechas provistas en el ejercicio de evaluación, se pueden cambiar por cualquier otra lista
        listaDeRangosDeFechasOriginales.add(new GestionRangoFechas(Timestamp.valueOf("2024-01-01 15:30:00 "), Timestamp.valueOf("2024-03-01 15:00:00 ")));
        listaDeRangosDeFechasOriginales.add(new GestionRangoFechas(Timestamp.valueOf("2024-02-01 15:15:00 "), Timestamp.valueOf("2024-05-01 14:45:00 ")));
        listaDeRangosDeFechasOriginales.add(new GestionRangoFechas(Timestamp.valueOf("2023-10-01 13:00:00 "), Timestamp.valueOf("2023-11-01 13:45:00 ")));

    //        Se imprime la lista de rangos de fechas original y la lista de rangos de fechas procesadas y agrupadas
        System.out.println("Rangos de fechas originales: " + listaDeRangosDeFechasOriginales);
        List<GestionRangoFechas> listaDeRangosDeFechasAgrupadas = objAgrupacionRangoFechas.agruparRangoFechas(listaDeRangosDeFechasOriginales);
        System.out.println("Rangos de fechas agrupados: " + listaDeRangosDeFechasAgrupadas);
    }    
}
