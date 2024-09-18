package Patron_1_2;

import Patron_1_2.Escenario_1.Vehiculo;
import Patron_1_2.Escenario_1.VehiculoController;
import Patron_1_2.Escenario_1.VehiculoFactory;
import Patron_1_2.Escenario_1.VehiculoView;
import Patron_1_2.Escenario_2.ActivoFijo;
import Patron_1_2.Escenario_2.ActivoFijoController;
import Patron_1_2.Escenario_2.ActivoFijoView;

public class Main {
    public static void main(String[] args) {
        // Escenario 01: Registro de Vehículos
        Vehiculo vehiculo = VehiculoFactory.crearVehiculo("auto", "Toyota", "Corolla", 2020);
        VehiculoView vehiculoView = new VehiculoView();
        VehiculoController vehiculoController = new VehiculoController(vehiculo, vehiculoView);
        vehiculoController.actualizarVista();

        // Escenario 02: Gestión de Activos Fijos
        ActivoFijo activoFijo = new ActivoFijo.Builder("001", "Computador", 1500.00)
                .descripcion("Computador de escritorio")
                .ubicacion("Oficina 1")
                .responsable("Juan Perez")
                .fechaAdquisicion("2023-01-15")
                .estado("Nuevo")
                .build();
        ActivoFijoView activoFijoView = new ActivoFijoView();
        ActivoFijoController activoFijoController = new ActivoFijoController(activoFijo, activoFijoView);
        activoFijoController.actualizarVista();
    }
}

