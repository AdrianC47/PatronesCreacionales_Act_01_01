package Escenario_02;

public class ActivoFijo {
    private String codigo;
    private String nombre;
    private double precio;
    private String descripcion;
    private String ubicacion;
    private String responsable;
    private String fechaAdquisicion;
    private String estado;

    private ActivoFijo(Builder builder) {
        this.codigo = builder.codigo;
        this.nombre = builder.nombre;
        this.precio = builder.precio;
        this.descripcion = builder.descripcion;
        this.ubicacion = builder.ubicacion;
        this.responsable = builder.responsable;
        this.fechaAdquisicion = builder.fechaAdquisicion;
        this.estado = builder.estado;
    }

    public static class Builder {
        private final String codigo;
        private final String nombre;
        private final double precio;
        private String descripcion;
        private String ubicacion;
        private String responsable;
        private String fechaAdquisicion;
        private String estado;

        public Builder(String codigo, String nombre, double precio) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.precio = precio;
        }

        public Builder descripcion(String descripcion) {
            this.descripcion = descripcion;
            return this;
        }

        public Builder ubicacion(String ubicacion) {
            this.ubicacion = ubicacion;
            return this;
        }

        public Builder responsable(String responsable) {
            this.responsable = responsable;
            return this;
        }

        public Builder fechaAdquisicion(String fechaAdquisicion) {
            this.fechaAdquisicion = fechaAdquisicion;
            return this;
        }

        public Builder estado(String estado) {
            this.estado = estado;
            return this;
        }

        public ActivoFijo build() {
            return new ActivoFijo(this);
        }
    }

    @Override
    public String toString() {
        return "ActivoFijo{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", responsable='" + responsable + '\'' +
                ", fechaAdquisicion='" + fechaAdquisicion + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}

