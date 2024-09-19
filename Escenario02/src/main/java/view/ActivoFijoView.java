/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.ActivoFijoController;
import controller.Builder.ActivoFijoBuilder;
import model.ActivoFijo;

/**
 *
 * @author edisson
 */
public class ActivoFijoView {
    
    public void ingresarActivoFijo(ActivoFijo activo) {
        System.out.println("Ingresando activo fijo: " + activo);
    }

    public void mostrarDetallesActivoFijo(String codigo, ActivoFijoController controlador) {
        ActivoFijo activo = controlador.listarActivoFijo(codigo);
        if (activo != null) {
            System.out.println("Detalles del activo fijo: " + activo);
        } else {
            System.out.println("Activo fijo con código " + codigo + " no encontrado.");
        }
    }

    public static void main(String[] args) {

        ActivoFijoController controlador = new ActivoFijoController();
        ActivoFijoView vista = new ActivoFijoView();

        ActivoFijo activoFijo = ActivoFijo.builder()
                .addCodigo("001")
                .addNombres("Computador")
                .addPrecio(1500.00)
                .addColor("Negro")
                .addMarca("Dell")
                .addTipo("Electrónico")
                .addDescripcion("Computador de escritorio")
                .addGarantia(2)
                .construir();

        vista.ingresarActivoFijo(activoFijo);
        controlador.crearActivoFijo(activoFijo);

        vista.mostrarDetallesActivoFijo("001", controlador);
    }
}
