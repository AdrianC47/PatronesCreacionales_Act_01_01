package controller.Builder;

import model.ActivoFijo;

public class ActivoFijoBuilder {
    private String codigo;
    private String nombres;
    private double precio;
    private String color;
    private String marca;
    private String tipo;
    private String descripcion;
    private int garantia;

    public ActivoFijoBuilder addCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public ActivoFijoBuilder addNombres(String nombres) {
        this.nombres = nombres;
        return this;
    }

    public ActivoFijoBuilder addPrecio(double precio) {
        this.precio = precio;
        return this;
    }

    public ActivoFijoBuilder addColor(String color) {
        this.color = color;
        return this;
    }

    public ActivoFijoBuilder addMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public ActivoFijoBuilder addTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public ActivoFijoBuilder addDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public ActivoFijoBuilder addGarantia(int garantia) {
        this.garantia = garantia;
        return this;
    }

    public ActivoFijo construir() {
        return new ActivoFijo(this);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getGarantia() {
        return garantia;
    }
}
