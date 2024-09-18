package Patron_1_2.Escenario_1;

public class VehiculoController {
    private Vehiculo model;
    private VehiculoView view;

    public VehiculoController(Vehiculo model, VehiculoView view) {
        this.model = model;
        this.view = view;
    }

    public void actualizarVista() {
        view.mostrarDetallesVehiculo(model);
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.model = vehiculo;
    }
}

