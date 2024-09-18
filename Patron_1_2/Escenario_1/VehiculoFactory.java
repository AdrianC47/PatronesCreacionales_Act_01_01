package Patron_1_2.Escenario_1;

public class VehiculoFactory {
    public static Vehiculo crearVehiculo(String tipo, String marca, String modelo, int anio) {
        switch (tipo.toLowerCase()) {
            case "auto":
                return new Auto(marca, modelo, anio);
            case "camioneta":
                return new Camioneta(marca, modelo, anio);
            case "camion":
                return new Camion(marca, modelo, anio);
            default:
                throw new IllegalArgumentException("Tipo de vehículo desconocido: " + tipo);
        }
    }
}

