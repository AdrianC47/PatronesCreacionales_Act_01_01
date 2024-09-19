/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.model;

/**
 *
 * @author edisson
 */
public abstract class VehiculoAbstractFactory {
    
    public abstract Vehiculo crearVehiculo(String tipo,String placa, String marca,  String modelo, int año);
}
