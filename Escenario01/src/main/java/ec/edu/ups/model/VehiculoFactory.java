/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.model;

/**
 *
 * @author edisson
 */
public class VehiculoFactory extends VehiculoAbstractFactory {

    @Override
    public Vehiculo crearVehiculo(String tipo,String placa, String marca, String modelo, int año) {
        tipo = tipo.trim().toLowerCase();
        switch (tipo.toLowerCase()) {
            case "auto":
                return new Auto(placa, marca, modelo, año, 2000);
            case "camioneta":
                return new Camioneta(placa, marca, modelo, año, "4x4");
            case "camion":
                return new Camion(placa, marca, modelo, año, 5000);
            default:
                throw new IllegalArgumentException("Tipo de vehículo no soportado: "+ tipo);
        }
    
    }

}
