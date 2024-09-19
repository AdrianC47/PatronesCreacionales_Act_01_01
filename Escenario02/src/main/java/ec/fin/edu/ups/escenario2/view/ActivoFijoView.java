package ec.fin.edu.ups.escenario2.view;

import ec.fin.edu.ups.escenario2.controller.ActivoFijoController;
import ec.fin.edu.ups.escenario2.modelo.ActivoFijo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * @author marlon
 */
public class ActivoFijoView extends javax.swing.JFrame{

    ActivoFijoController activoFijoController;

    JTextField fcodigo = new JTextField(50);
    JTextField fnombres = new JTextField(50);
    JTextField fprecio = new JTextField(50);
    JTextField fcolor = new JTextField(50);
    JTextField fmarca = new JTextField(50);
    JTextField ftipo = new JTextField(50);
    JTextField fdescripcion = new JTextField(50);
    JTextField fgarantia = new JTextField(50);
    public ActivoFijoView(){
        super("Escenario 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(100,100);
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        activoFijoController = new ActivoFijoController();
        this.setLayout();
        GridBagConstraints grid = new GridBagConstraints();
        this.addLabels(grid);
        this.addFields(grid);
        this.addButtons(grid);
        this.pack();
        setVisible(true);
    }

    private void setLayout(){
        this.setLayout(new GridBagLayout());
    }
    private void addLabels(GridBagConstraints grid){
        JLabel lcodigo = new JLabel("Codigo:");
        JLabel lnombres = new JLabel("Nombres:");
        JLabel lprecio = new JLabel("Precio:");
        JLabel lcolor = new JLabel("Color:");
        JLabel lmarca = new JLabel("Marca:");
        JLabel ltipo = new JLabel("Tipo:");
        JLabel ldescripcion = new JLabel("Descripcion:");
        JLabel lgarantia = new JLabel("Garantía:");

        grid.gridx=0;
        grid.gridy=0;
        this.add(lcodigo, grid);
        grid.gridy=1;
        this.add(lnombres, grid);
        grid.gridy=2;
        this.add(lprecio, grid);
        grid.gridy=3;
        this.add(lcolor, grid);
        grid.gridy=4;
        this.add(lmarca, grid);
        grid.gridy=5;
        this.add(ltipo, grid);
        grid.gridy=6;
        this.add(ldescripcion, grid);
        grid.gridy=7;
        this.add(lgarantia, grid);
    }
    private void addFields(GridBagConstraints grid){


        grid.gridx=1;
        grid.gridy=0;
        this.add(fcodigo, grid);
        grid.gridy=1;
        this.add(fnombres, grid);
        grid.gridy=2;
        this.add(fprecio, grid);
        grid.gridy=3;
        this.add(fcolor, grid);
        grid.gridy=4;
        this.add(fmarca, grid);
        grid.gridy=5;
        this.add(ftipo, grid);
        grid.gridy=6;
        this.add(fdescripcion, grid);
        grid.gridy=7;
        this.add(fgarantia, grid);
    }

    private void addButtons(GridBagConstraints grid){
        JButton jButton = new JButton("Guardar");
        grid.gridx = 0;
        grid.gridy = 8;
        grid.gridwidth = 2;
        this.add(jButton, grid);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    process();
                    clean();
                }catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        JButton btnList = new JButton("Listar");
        grid.gridx = 0;
        grid.gridy = 9;
        grid.gridwidth = 2;
        this.add(btnList, grid);
        btnList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    list();
                }catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
    public void process(){
        String result = activoFijoController.addActivoFijo(this);
        if( result.isEmpty() || result == "") {
            javax.swing.JOptionPane.showMessageDialog(null, "Agregado!", "Activos Fijos", JOptionPane.INFORMATION_MESSAGE);
        }else{
            javax.swing.JOptionPane.showMessageDialog(null, result, "Activos Fijos",  JOptionPane.ERROR_MESSAGE);
        }
    }

    public void list(){
        List<ActivoFijo> activosFijos = activoFijoController.getActivosFijos();
        StringBuilder builder = new StringBuilder();
        builder.append("Listado de Activos Fijos");
        for(ActivoFijo activoFijo : activosFijos){
            builder.append(activoFijo.toString());
            builder.append("\n");
        }
        javax.swing.JOptionPane.showMessageDialog(null, builder.toString(), "Listado de Activos Fijos", JOptionPane.INFORMATION_MESSAGE);
    }
    public String getCodigo() {
        return fcodigo.getText();
    }
    public String getCodigoNombres() {
        return fnombres.getText();
    }
    public String getPrecio() {
        return fprecio.getText();
    }
    public String getColor() {
        return fcolor.getText();
    }
    public String getMarca() {
        return fmarca.getText();
    }public String getTipo() {
        return ftipo.getText();
    }
    public String getDescripcion() {
        return fdescripcion.getText();
    }
    public String getGarantia() {
        return fgarantia.getText();
    }

    public static void main(String[] args){
        new ActivoFijoView();
    }

    public void clean(){
        fcodigo.setText("");
        fnombres.setText("");
        fprecio.setText("");
        fcolor.setText("");
        fmarca.setText("");
        ftipo.setText("");
        fdescripcion.setText("");
        fgarantia.setText("");
    }
}
