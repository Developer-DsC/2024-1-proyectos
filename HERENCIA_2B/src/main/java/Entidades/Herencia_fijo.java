package Entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */

public class Herencia_fijo extends Herencia {

    private double sueldo;
    private double comision;

    public Herencia_fijo() {
        super();
    }

    public Herencia_fijo(String ced, String nom, char sex, int edad, double sueldo, double comision) {
        super(ced, nom, sex, edad);
        this.sueldo = sueldo;
        this.comision = comision;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public double CalcularSueldo(){
        
        
        return sueldo+comision;
    }
    public void imprimir(){
        JOptionPane.showMessageDialog(null, imprimir_persona()+"\nSueldo :"+CalcularSueldo()+"\nComisión: "+comision);
    }
}
