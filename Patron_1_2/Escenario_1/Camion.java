package Patron_1_2.Escenario_1;

public class Camion extends Vehiculo {
    public Camion(String marca, String modelo, int anio) {
        super(marca, modelo, anio);
    }

    @Override
    public double calcularCostoMatricula() {
        return 200.0;
    }
}
