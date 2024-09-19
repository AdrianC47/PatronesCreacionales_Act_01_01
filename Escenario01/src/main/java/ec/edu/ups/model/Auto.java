/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.model;

/**
 *
 * @author edisson
 */
public class Auto extends Vehiculo{
    
    private int cilindraje;

    public Auto(String placa, String marca, String modelo, int año, int cilindraje) {
        super(placa, marca, modelo, año);
        this.cilindraje = cilindraje;
    }

    @Override
    public double calcularCostoMatricula() {
        return 200 + (cilindraje * 0.5);
    }
    
}
