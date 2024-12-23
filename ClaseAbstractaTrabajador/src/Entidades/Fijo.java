package Entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class Fijo extends Trabajador{
    private double sueldo;
    private double impuesto;
    private double comision;

    public Fijo() {
    }

    public Fijo(double sueldo, double impuesto, double comision, String Cedula, String Nombres, String Apellidos, char sexo, String tipo, String Estado) {
        super(Cedula, Nombres, Apellidos, sexo, tipo, Estado);
        this.sueldo = sueldo;
        this.impuesto = impuesto;
        this.comision = comision;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    
    
    @Override
    public void Imprimir() {
          JOptionPane.showMessageDialog(null, ImprimirTabajador() + "\n" + 
                "sueldo a cobrar :" + Calcular()
                +"\nTipo de trabajador: "+getTipo()); 
    }

    @Override
    public double Calcular() {
        return (sueldo+comision)-impuesto;
    }
    
}
