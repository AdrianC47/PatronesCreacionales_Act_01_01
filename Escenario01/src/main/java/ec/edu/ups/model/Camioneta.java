/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.model;

/**
 *
 * @author edisson
 */
public class Camioneta extends Vehiculo{

    private String traccion;

    public Camioneta(String placa, String marca, String modelo, int año, String traccion) {
        super(placa, marca, modelo, año);
        this.traccion = traccion;
    }

    @Override
    public double calcularCostoMatricula() {
        if(traccion.equals("4x4"))
        return (1.5*4)+300;
        else return 300;
    }
    
}
