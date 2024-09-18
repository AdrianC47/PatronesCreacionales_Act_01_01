package Patron_1_2.Escenario_2;

public class ActivoFijoController {
    private ActivoFijo model;
    private ActivoFijoView view;

    public ActivoFijoController(ActivoFijo activoFijo, ActivoFijoView view) {
        this.model = activoFijo;
        this.view = view;
    }

    public void actualizarVista() {
        view.mostrarDetallesActivoFijo(model);
    }

    public void setActivoFijo(ActivoFijo activoFijo) {
        this.model = activoFijo;
    }
}

