package Entidades;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 * @author Joffre Cartuche C
 * @version 1.0
 * @created 18-Jul.-2023 20:22:48
 */
public class AsalariadoComision extends Asalariado {

    private double Porcentaje;

    public AsalariadoComision() {
        super();
    }

    /**
     *
     * @param cod
     * @param ced
     * @param nom
     * @param ape
     * @param fn
     * @param sex
     * @param est
     * @param sal
     * @param por
     */
    public AsalariadoComision(int cod, String ced, String nom, String ape, Date fn, char sex, String est, double sal, double por) {
        super(cod, ced, nom, ape, fn, sex, est, sal);
    }

    public double getPorcentaje() {
        return Porcentaje;
    }

    /**
     *
     * @param newVal
     */
    public void setPorcentaje(double newVal) {
        Porcentaje = newVal;
    }

    @Override
    public double CalcularSueldo() {
        double st = getSalario() + ((getSalario() * Porcentaje)/100)+getSalario()*0.10;
        return st;
    }

    @Override
    public void Imprimir() {
        JOptionPane.showMessageDialog(null, ImprimirEmpleado() + 
                    "\nSueldo mensual: "+getSalario()+
                    "\nPorcentaje: "+Porcentaje+
                    "\nTotal cobrar: "+CalcularSueldo());
    }

}
