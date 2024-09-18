package Patron_1_2.Escenario_1;

public class Auto extends Vehiculo {
    public Auto(String marca, String modelo, int anio) {
        super(marca, modelo, anio);
    }

    @Override
    public double calcularCostoMatricula() {
        return 100.0;
    }
}

