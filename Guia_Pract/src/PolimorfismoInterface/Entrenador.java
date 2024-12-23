package PolimorfismoInterface;

import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */

public class Entrenador extends SeleccionFutbol {

    private int idFed;

    public Entrenador() {
        super();
    }

    public Entrenador(int idFed) {
        this.idFed = idFed;
    }

    public Entrenador(int idFed, int ide, String nom, String ape, int eda) {
        super(ide, nom, ape, eda);
        this.idFed = idFed;
    }

   

    public int getIdFederacion() {
        return idFed;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFed = idFederacion;
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

   

    public String planificarEntrenamiento() {
        return "Planificar un Entrenamiento";
    }
    
    public void imprimir(){
         JOptionPane.showMessageDialog(null, "ID:"+id+
                                                        "\nNombre: "+nombre+
                                                        "\nApellido: "+apellidos+
                                                        "\nEdad: "+edad+
                                                        "\nId de federación: "+idFed);
                                                        
    
    }
}
