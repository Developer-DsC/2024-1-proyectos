package Entidades;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Joffre Cartuche C
 */
public class EmpleadoFijo extends Persona {

    private double SueldoBase;
    private double Comiones;

    public EmpleadoFijo(String ced, String nom, String ape, char sex, Date fn, String est, double SueldoBase, double Comiones) {
        super(ced, nom, ape, sex, fn, est);
        this.SueldoBase = SueldoBase;
        this.Comiones = Comiones;
    }

    public double getSueldoBase() {
        return SueldoBase;
    }

    public void setSueldoBase(double SueldoBase) {
        this.SueldoBase = SueldoBase;
    }

    public double getComiones() {
        return Comiones;
    }

    public void setComiones(double Comiones) {
        this.Comiones = Comiones;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public EmpleadoFijo() {
        super();
    }

    public double CalcularSueldo() {
        return SueldoBase + Comiones;
    }

    public void ImprimirFijo() {
        JOptionPane.showMessageDialog(null, super.ImprimirPersona() + "\n"
                + "Sueldo Cobrar :" + CalcularSueldo());
    }
}
