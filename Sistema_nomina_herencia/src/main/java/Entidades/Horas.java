package Entidades;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 * @author Joffre Cartuche C
 * @version 1.0
 * @created 18-Jul.-2023 20:22:35
 */
public class Horas extends Empleado {

    private double HorasTrabajadas;
    private double Costo;

    /**
     *
     * @param cod
     * @param ced
     * @param nom
     * @param ape
     * @param fn
     * @param sex
     * @param est
     * @param ht
     * @param cos
     */
    public Horas(int cod, String ced, String nom, String ape, Date fn, char sex, String est, double ht, double cos) {
        super(cod, ced, nom, ape, fn, sex, est);
        this.HorasTrabajadas=ht;
        this.Costo=cos;
    }

    public Horas() {
        super();
    }

    /**
     *
     * @param ht
     * @param cos
     */
    public Horas(double ht, double cos) {
        this.Costo = cos;
        this.HorasTrabajadas = ht;
    }

    public double getHorasTrabajadas() {
        return HorasTrabajadas;
    }

    /**
     *
     * @param newVal
     */
    public void setHorasTrabajadas(double newVal) {
        HorasTrabajadas = newVal;
    }

    public double getCosto() {
        return Costo;
    }

    /**
     *
     * @param newVal
     */
    public void setCosto(double newVal) {
        Costo = newVal;
    }

    public double CalcularSueldo() {

        double sueldo = HorasTrabajadas * Costo;
        if (HorasTrabajadas > 40) {
            sueldo = sueldo + (sueldo * 1.5);
        }
        return sueldo;
    }

    public void Imprimir() {
        JOptionPane.showMessageDialog(null, ImprimirEmpleado()+"\n"+"\nHoras trabajadas: "+HorasTrabajadas+
                                                                           "\nCosto: "+Costo+
                                                                            "\n Total a cobrar: "+CalcularSueldo());

    }

}
