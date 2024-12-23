package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author 
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
        int años = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date FechaActual = new Date();
            int cantidad = (int) ((FechaActual.getTime() - getFechaNacimiento().getTime()) / 86400000);
            años = cantidad / 365;
            int meses = (cantidad - (años * 365)) / 30;
            int dias = (cantidad - (años * 365) - (meses * 30));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ingrese una fecha de nacimiento valida");
        }

        double sueldototal = sueldo + comision - (sueldo * 0.0932);

        if (años >= 65) {
            sueldototal = sueldototal + 400;
        }
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
                + "\nTotal: " + (CalcularSueldo()));
    }
}
