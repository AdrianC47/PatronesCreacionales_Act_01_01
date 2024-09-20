package ec.fin.edu.ups.escenario2.controller;

import ec.fin.edu.ups.escenario2.modelo.builder.ActivoFijoBuilder;
import ec.fin.edu.ups.escenario2.modelo.ActivoFijo;
import ec.fin.edu.ups.escenario2.view.ActivoFijoView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author marlon
 */
public class ActivoFijoController {
    ActivoFijoBuilder activoFijoBuilder;
    ActivoFijoView activoFijoView;

    List<ActivoFijo> activoFijos;

    public ActivoFijoController(){
        activoFijoBuilder = new ActivoFijoBuilder();
        activoFijos = new ArrayList<>();
    }

    public List<ActivoFijo> getActivosFijos() {
        return activoFijos;
    }

    public String addActivoFijo(ActivoFijoView activoFijoView) {
        System.out.println("================================================================");
        System.out.println("Adding ActivoFijo...");
        activoFijoBuilder = new ActivoFijoBuilder();
        this.activoFijoView = activoFijoView;
        if(activoFijoView.getCodigo() == null && activoFijoView.getCodigoNombres() == null && activoFijoView.getPrecio() == null){
            //throw new IllegalStateException("Código, nombres, y precio son obligatorios");
            return "Código, nombres, y precio son obligatorios";
        }
        String sprecio = this.activoFijoView.getPrecio();
        double precio =0d;
        try{
            precio = Double.parseDouble(sprecio);
        }catch(Exception e){
            e.printStackTrace();
            return "Precio debe ser número";
        }


        int garantia = 0;
        String sgarantia = this.activoFijoView.getGarantia();
        if(sgarantia != null && !sgarantia.isEmpty()){
            try{
                garantia = Integer.parseInt(sgarantia);
            }catch(Exception e){
                e.printStackTrace();
                return "Garantía debe ser número";
            }
        }

        activoFijoBuilder.addCodigo(this.activoFijoView.getCodigo());
        activoFijoBuilder.addNombres(this.activoFijoView.getCodigoNombres());
        activoFijoBuilder.addPrecio(precio);
        activoFijoBuilder.addColor(this.activoFijoView.getColor());
        activoFijoBuilder.addMarca(this.activoFijoView.getMarca());
        activoFijoBuilder.addTipo(this.activoFijoView.getTipo());
        activoFijoBuilder.addDescripcion(this.activoFijoView.getDescripcion());
        activoFijoBuilder.addGarantia(garantia);
        ActivoFijo activoFijo = activoFijoBuilder.build();
        activoFijos.add(activoFijo);

        System.out.println("ActivoFijo Added!");
        return "";
    }
}
