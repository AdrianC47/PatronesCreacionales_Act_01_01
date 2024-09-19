package ec.fin.edu.ups.escenario2.modelo;

/**
 * @author marlon
 */
public class ActivoFijo {
    private String codigo;
    private String nombres;
    private double precio;
    private String color;
    private String marca;
    private String tipo;
    private String descripcion;
    private int garantia;

    // Getters for all attributes
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

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
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
}