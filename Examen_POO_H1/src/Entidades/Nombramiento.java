package Entidades;

import javax.swing.JOptionPane;

/**
 * @author Jerson
 * @version 1.0
 * @created 01-ago.-2023 8:07:14
 */
public class Nombramiento extends Trabajador {

    private double SalarioMensual;
    private double Anticipo;

    public Nombramiento() {
        super();
    }

    public Nombramiento(double SalarioMensual, double Anticipo, String Tipo, String IdCodigo, String Nombre, String Apellidos, String Sexo, String FechaNacimiento, String Estado) {
        super(Tipo, IdCodigo, Nombre, Apellidos, Sexo, FechaNacimiento, Estado);
        this.SalarioMensual = SalarioMensual;
        this.Anticipo = Anticipo;
    }

    public double getAnticipo() {
        return Anticipo;
    }

    public void setAnticipo(double Anticipo) {
        this.Anticipo = Anticipo;
    }

    public double getSalarioMensual() {
        return SalarioMensual;
    }

    /**
     *
     * @param newVal
     */
    public void setSalarioMensual(double newVal) {
        SalarioMensual = newVal;
    }

    
    public double calcularSueldo() {
        double segurosocial = SalarioMensual * 0.0932;

        return SalarioMensual - segurosocial-Anticipo;
    }

    @Override
    public void Imprimir() {
        JOptionPane.showMessageDialog(null, ImprimirPersona() + "\n"
                + "Tipo: " + "Nombramineto " + "\n"
                + "Descuento:" + "9.32%" + "\n"
                + "Total sueldo : " + calcularSueldo());

    }

}
