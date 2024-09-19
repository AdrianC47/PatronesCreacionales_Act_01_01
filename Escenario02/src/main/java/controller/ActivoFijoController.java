/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.HashMap;
import java.util.Map;

import model.ActivoFijo;

/**
 *
 * @author edisson
 */
public class ActivoFijoController {
    
     private Map<String, ActivoFijo> activos = new HashMap<>();

    public void crearActivoFijo(ActivoFijo activo) {
        activos.put(activo.codigo, activo);
    }

    public ActivoFijo listarActivoFijo(String codigo) {
        return activos.get(codigo);
    }
}
