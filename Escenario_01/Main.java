package Escenario_01;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = VehiculoFactory.crearVehiculo("auto", "Toyota", "Corolla", 2020);
        System.out.println("Costo matrícula Auto: " + vehiculo1.calcularCostoMatricula());

        Vehiculo vehiculo2 = VehiculoFactory.crearVehiculo("camioneta", "Ford", "Ranger", 2019);
        System.out.println("Costo matrícula Camioneta: " + vehiculo2.calcularCostoMatricula());

        Vehiculo vehiculo3 = VehiculoFactory.crearVehiculo("camion", "Volvo", "FH", 2018);
        System.out.println("Costo matrícula Camión: " + vehiculo3.calcularCostoMatricula());
    }
}