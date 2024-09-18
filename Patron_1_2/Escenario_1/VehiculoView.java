package Patron_1_2.Escenario_1;

public class VehiculoView {
    public void mostrarDetallesVehiculo(Vehiculo vehiculo) {
        System.out.println("Marca: " + vehiculo.marca);
        System.out.println("Modelo: " + vehiculo.modelo);
        System.out.println("Año: " + vehiculo.anio);
        System.out.println("Costo de Matrícula: " + vehiculo.calcularCostoMatricula());
    }
}

