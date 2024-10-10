/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bbva.evaluation.gsddevops.parte2;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author roque
 */
public class AgrupacionRangoFechas {

    public List<GestionRangoFechas> agruparRangoFechas(List<GestionRangoFechas> lstRangosDeFechas) {
        if (lstRangosDeFechas.isEmpty()) {
            return new ArrayList<>();
        }

        // Se efectúa el ordenamiento ascendente de los rangos de fechas con base al tiempo de inicio, dentro de la misma lista que las contiene
        Collections.sort(lstRangosDeFechas, Comparator.comparing(GestionRangoFechas::getInicioDelRango));

        // Lista que contendrá los rangos de fechas Agrupados dependiendo de la evaluación que se realice
        List<GestionRangoFechas> lstRangoFechasAgrupadas = new ArrayList<>();

        // Se obtiene el primer rango de fechas con base a la lista
        GestionRangoFechas actualRangoDeFechas = lstRangosDeFechas.get(0);

        for (int i = 1; i < lstRangosDeFechas.size(); i++) {
            GestionRangoFechas siguienteRangoDeFechas = lstRangosDeFechas.get(i);

            // Se valida si los rangos de fechas se empalman (o son contiguos) con base a sus fechas de  fin y de inicio, para lo cual en dado caso que soincidan, estos se agrupan
            //y se toma la fecha inicial del primer rango y la fecha fin del segundo rango
            if (actualRangoDeFechas.getFinDelRango().after(siguienteRangoDeFechas.getInicioDelRango()) ||
                    actualRangoDeFechas.getFinDelRango().equals(siguienteRangoDeFechas.getInicioDelRango()) ) {
                actualRangoDeFechas.setFinDelRango(
                        new Timestamp(Math.max(actualRangoDeFechas.getFinDelRango().getTime(), siguienteRangoDeFechas.getFinDelRango().getTime())  ));
            } else {
                // En caso de que no se empalmen, se agrega el rango actual a la lista y se continúa la validación con el siguiente
                lstRangoFechasAgrupadas.add(actualRangoDeFechas);
                actualRangoDeFechas = siguienteRangoDeFechas;
            }
        }

        // Se añade el último rango
        lstRangoFechasAgrupadas.add(actualRangoDeFechas);

        return lstRangoFechasAgrupadas;
    }
}
