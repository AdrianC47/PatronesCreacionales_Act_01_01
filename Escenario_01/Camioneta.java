package Escenario_01;

public class Camioneta extends Vehiculo {
    public Camioneta(String marca, String modelo, int anio) {
        super(marca, modelo, anio);
    }

    @Override
    public double calcularCostoMatricula() {
        return 150.0;
    }
}
