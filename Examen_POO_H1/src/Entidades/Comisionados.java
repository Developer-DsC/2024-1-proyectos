package Entidades;

import javax.swing.JOptionPane;

/**
 * @author Jerson
 * @version 1.0
 * @created 01-ago.-2023 8:07:20
 */
public class Comisionados extends Trabajador {

    private double SalarioBase;

    public Comisionados() {
        super();
    }

    public Comisionados(double SalarioBase, String Tipo, String IdCodigo, String Nombre, String Apellidos, String Sexo, String FechaNacimiento, String Estado) {
        super(Tipo, IdCodigo, Nombre, Apellidos, Sexo, FechaNacimiento, Estado);
        this.SalarioBase = SalarioBase;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(double newVal) {
        SalarioBase = newVal;
    }
   
    public double calcularSueldo() {
        double comisión = SalarioBase * 0.1;
        return SalarioBase + comisión+100;
    }

    @Override
    public void Imprimir() {
        JOptionPane.showMessageDialog(null, ImprimirPersona() + "\n"
                + "Tipo: " + "Comisionado " + "\n"
                + "Descuento:" + "9.32%" + "\n"
                + "Total sueldo : " + calcularSueldo());

    }

}
