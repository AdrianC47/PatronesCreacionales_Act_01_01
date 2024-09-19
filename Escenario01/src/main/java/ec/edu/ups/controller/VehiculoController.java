/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.controller;

import ec.edu.ups.model.VehiculoFactory;
import java.util.ArrayList;
import java.util.List;
import ec.edu.ups.model.Vehiculo;
import ec.edu.ups.view.VehiculoView;

/**
 *
 * @author edisson
 */
public class VehiculoController {
    
    private VehiculoFactory vehiculoFactory;
    private VehiculoView vista;
    
    private List<Vehiculo> vehiculos;

//    public VehiculoController(VehiculoFactory vehiculoFactory, VehiculoView vista) {
//        this.vehiculoFactory = vehiculoFactory;
//        this.vista = vista;
//        this.vehiculos = new ArrayList<>();
//    }

    public VehiculoController(VehiculoFactory vehiculoFactory) {
        this.vehiculoFactory = vehiculoFactory;
        this.vehiculos = new ArrayList<>();
        
    }
 

    public void registrarVehiculo() {
        String tipo = vista.obtenerTipoVehiculo();
        String placa = vista.obtenerPlaca();
        String marca = vista.obtenerMarca();
        String modelo = vista.obtenerModelo();
        int año = vista.obtenerAño();

        Vehiculo vehiculo = vehiculoFactory.crearVehiculo(tipo, placa, marca, modelo, año);
        vehiculos.add(vehiculo);
        vista.mostrarCostoMatrícula(vehiculo);
    }
   
    public void mostrarVehiculos() {
        vista.mostrarListaVehiculos(vehiculos);
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
