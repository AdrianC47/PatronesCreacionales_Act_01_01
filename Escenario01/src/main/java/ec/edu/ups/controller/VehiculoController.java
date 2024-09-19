/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.controller;

import ec.edu.ups.model.VehiculoFactory;
import java.util.ArrayList;
import java.util.List;
import ec.edu.ups.model.Vehiculo;

/**
 *
 * @author edisson
 */
public class VehiculoController {
    
    private VehiculoFactory vehiculoFactory;

    private List<Vehiculo> vehiculos;

    public VehiculoController(VehiculoFactory vehiculoFactory) {
        this.vehiculoFactory = vehiculoFactory;
        this.vehiculos = new ArrayList<>();
        
    }

    
    public double registrarVehiculo(String tipo, String placa, String marca, String modelo, int año) {
        Vehiculo vehiculo = vehiculoFactory.crearVehiculo(tipo, placa, marca, modelo, año);
        if (vehiculo != null) {
            vehiculos.add(vehiculo);
            return vehiculo.calcularCostoMatricula();
        } else {
            return -1; // Indica que el tipo de vehículo no es válido
        }
    }
    
    public List<Vehiculo> obtenerVehiculos() {
        return vehiculos;
    }
}
