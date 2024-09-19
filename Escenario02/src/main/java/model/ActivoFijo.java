/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.Builder.ActivoFijoBuilder;

/**
 *
 * @author edisson
 */
public class ActivoFijo {
    
    public String codigo;
    private String nombres;
    private double precio;
    private String color;
    private String marca;
    private String tipo;
    private String descripcion;
    private int garantia;

    public ActivoFijo(ActivoFijoBuilder builder) {
        this.codigo = builder.getCodigo();
        this.nombres = builder.getNombres();
        this.precio = builder.getPrecio();
        this.color = builder.getColor();
        this.marca = builder.getMarca();
        this.tipo = builder.getTipo();
        this.descripcion = builder.getDescripcion();
        this.garantia = builder.getGarantia();
    }

    @Override
    public String toString() {
        return "ActivoFijo{" +
                "codigo='" + codigo + '\'' +
                ", nombres='" + nombres + '\'' +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", garantia=" + garantia +
                '}';
    }

    public static ActivoFijoBuilder builder() {
        return new ActivoFijoBuilder();
    }

}
