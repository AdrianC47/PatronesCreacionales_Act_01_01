package ec.fin.edu.ups.escenario2.modelo.builder;

import ec.fin.edu.ups.escenario2.modelo.ActivoFijo;

/**
 * @author marlon
 */
public class ActivoFijoBuilder {
    private ActivoFijo activoFijo;

    public ActivoFijoBuilder(){
        activoFijo = new ActivoFijo();
    }

    public ActivoFijoBuilder addCodigo(String codigo) {
        this.activoFijo.setCodigo(codigo);
        return this;
    }

    public ActivoFijoBuilder addNombres(String nombres) {
        this.activoFijo.setNombres(nombres);
        return this;
    }

    public ActivoFijoBuilder addPrecio(double precio) {
        this.activoFijo.setPrecio(precio);
        return this;
    }

    public ActivoFijoBuilder addColor(String color) {
        this.activoFijo.setColor(color);
        return this;
    }

    public ActivoFijoBuilder addMarca(String marca) {
        this.activoFijo.setMarca(marca);
        return this;
    }

    public ActivoFijoBuilder addTipo(String tipo) {
        this.activoFijo.setTipo(tipo);
        return this;
    }

    public ActivoFijoBuilder addDescripcion(String descripcion) {
        this.activoFijo.setDescripcion(descripcion);
        return this;
    }

    public ActivoFijoBuilder addGarantia(int garantia) {
        this.activoFijo.setGarantia(garantia);
        return this;
    }

    public ActivoFijo build() {
        if (this.activoFijo.getCodigo() == null || this.activoFijo.getNombres() == null || this.activoFijo.getPrecio() == 0) {
            throw new IllegalStateException("Código, nombres, y precio son obligatorios");
        }
        return this.activoFijo;
    }
}
