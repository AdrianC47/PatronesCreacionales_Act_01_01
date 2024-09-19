/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.List;
import java.util.Scanner;

import controller.VehiculoController;
import controller.factory.VehiculoFactory;
import model.Vehiculo;

/**
 *
 * @author edisson
 */
public class VehiculoView {
    
    private Scanner scanner = new Scanner(System.in);
    
    public void mostrarCostoMatrícula(Vehiculo vehiculo) {
        System.out.println("El costo de la matrícula para el vehículo con placa " + vehiculo.getPlaca() + " es: " + vehiculo.calcularCostoMatricula());
    }

    public String obtenerTipoVehiculo() {
        System.out.print("Ingrese el tipo de vehículo (auto, camioneta, camion): ");
        return scanner.nextLine();
    }

    public String obtenerPlaca() {
        System.out.print("Ingrese la placa del vehículo: ");
        return scanner.nextLine();
    }

    public String obtenerMarca() {
        System.out.print("Ingrese la marca del vehículo: ");
        return scanner.nextLine();
    }

    public String obtenerModelo() {
        System.out.print("Ingrese el modelo del vehículo: ");
        return scanner.nextLine();
    }

    public int obtenerAño() {
        System.out.print("Ingrese el año del vehículo: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, ingrese un número válido para el año.");
            scanner.next();
        }
        int año = scanner.nextInt();
        scanner.nextLine();
        return año;
    }
    
    
    public void mostrarListaVehiculos(List<Vehiculo> vehiculos) {
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehículos registrados.");
        } else {
            System.out.println("Lista de vehículos registrados:");
            for (Vehiculo vehiculo : vehiculos) {
                System.out.println("Placa: " + vehiculo.getPlaca() + 
                                   ", Tipo: " + vehiculo.getClass().getSimpleName() + 
                                   ", Marca: " + vehiculo.getMarca() + 
                                   ", Modelo: " + vehiculo.getModelo() + 
                                   ", Año: " + vehiculo.getAño() + 
                                   ", Costo de matrícula: $" + vehiculo.calcularCostoMatricula());
            }
        }
    }

    public static void main(String[] args) {

        VehiculoFactory factory = new VehiculoFactory();
        VehiculoView vista = new VehiculoView();
        VehiculoController controller = new VehiculoController(factory, vista);


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Registrar vehículo");
            System.out.println("2. Mostrar lista de vehículos");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");

            int opcion;
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
                continue;
            }

            switch (opcion) {
                case 1:
                    controller.registrarVehiculo();
                    break;
                case 2:
                    controller.mostrarVehiculos();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
