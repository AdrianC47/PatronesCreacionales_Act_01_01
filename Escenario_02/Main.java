package Escenario_02;

public class Main {
    public static void main(String[] args) {
        ActivoFijo computador = new ActivoFijo.Builder("001", "Computador", 1500.00)
                .descripcion("Computador de escritorio")
                .ubicacion("Oficina 1")
                .responsable("Juan Perez")
                .fechaAdquisicion("2023-01-15")
                .estado("Nuevo")
                .build();

        ActivoFijo mesa = new ActivoFijo.Builder("002", "Mesa", 200.00)
                .ubicacion("Sala de reuniones")
                .build();

        System.out.println(computador);
        System.out.println(mesa);
    }
}

