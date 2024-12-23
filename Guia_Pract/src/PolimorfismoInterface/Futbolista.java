package PolimorfismoInterface;

import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class Futbolista extends SeleccionFutbol {

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    private int dorsal;
    private String demarcacion;

    public Futbolista(int dorsal, String demarcacion) {
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public Futbolista(int dorsal, String demarcacion, int ide, String nom, String ape, int eda) {
        super(ide, nom, ape, eda);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    @Override
    public void jugarPartido() {
        super.jugarPartido(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void entrenar() {
        super.entrenar(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void viajar() {
        super.viajar(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void concentrarse() {
        super.concentrarse(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    

  

    public String entrevista() {
        return "Da una Entrevista";
    }

    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null, "ID:"+id+
                                                        "\nNombre: "+nombre+
                                                        "\nApellido: "+apellidos+
                                                        "\nEdad: "+edad+
                                                        "\nDorsal: "+dorsal+
                                                        "\nPosición: "+demarcacion);
                                                        
    }
    
}
