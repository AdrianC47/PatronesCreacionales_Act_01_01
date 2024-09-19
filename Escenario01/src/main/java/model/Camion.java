/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author edisson
 */
public class Camion extends Vehiculo{

    private double capacidadCarga;

    public Camion(String placa, String marca, String modelo, int año, double capacidadCarga) {
        super(placa, marca, modelo, año);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double calcularCostoMatricula() {
        return 500 + (capacidadCarga * 0.1); 
    }
    
}
