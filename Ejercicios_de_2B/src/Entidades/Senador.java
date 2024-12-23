package Entidades;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class Senador extends Legislador {

    private double sueldo;
    private double comision;
    double DescuentoIESS=0.932;
    
    public Senador() {
    }

    public Senador(double sueldo, double comision, String provinciaRepresenta, String partidoPolitico, int num_oficina, int idCodigo, String cedula, String Nombre, String Apellido, Date FechaNacimiento, String Estado) {
        super(provinciaRepresenta, partidoPolitico, num_oficina, idCodigo, cedula, Nombre, Apellido, FechaNacimiento, Estado);
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

    @Override
    public double ProyectoPresentado() {
        return 0;
    }

    @Override
    public double CalcularSueldo() {
        double sueldototal = sueldo + comision;
        return sueldototal;
    }

    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null, imprimirPersona()
                + "\nTipo: Senador"
                + "\nDescontado por el IESS: 9.32%"
                + "\nSueldo: " + sueldo
                + "\nDescuento: " + (sueldo * 0.0932)
                + "\nComisión: " + comision
                + "\nTotal: " + (CalcularSueldo() - (sueldo * 0.0932)));
    }
}
