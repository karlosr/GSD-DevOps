/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bbva.evaluation.gsddevops.parte2;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author roque
 */
@RestController
@RequestMapping("/api/rangos")
public class RangoFechasController {

    @PostMapping("/agrupar")
    public ResponseEntity<?> agruparRangoFechas(@RequestBody List<GestionRangoFechas> lstRangoDeFechas) {
        System.out.println("Rangos de fechas originales: " + lstRangoDeFechas);
        
        for (GestionRangoFechas range : lstRangoDeFechas) {
            if (range.getInicioDelRango() == null || range.getFinDelRango() == null) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                                     .body("Uno o más rangos tienen valores nulos en inicioDelRango o finDelRango.");
            }
        }
        System.out.println("                ");
        List<GestionRangoFechas> mergedRanges = (new AgrupacionRangoFechas()).agruparRangoFechas(lstRangoDeFechas);
        System.out.println("                ");
        return ResponseEntity.ok(mergedRanges);
    }    
}
