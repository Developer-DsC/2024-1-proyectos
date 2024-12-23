package Entidades;

/**
 *
 * @author Dalton
 */

import java.util.Date;
import javax.swing.JOptionPane;

public class EmpleadoComision extends Empleado{
    private double tarifaPorcentaje, ventasBrutas;

    public EmpleadoComision() {
    super();
    }

    public EmpleadoComision(double tarifaPorcentaje, double ventasBrutas, String codigo, String Cedula, String Nombre, String Apellido, Date FechaNaci, String Estado, String ciudad, String mes, String Tipo) {
        super(codigo, Cedula, Nombre, Apellido, FechaNaci, Estado, ciudad, mes, Tipo);
        this.tarifaPorcentaje = tarifaPorcentaje;
        this.ventasBrutas = ventasBrutas;
    }

    public double getTarifaPorcentaje() {
        return tarifaPorcentaje;
    }

    public void setTarifaPorcentaje(double tarifaPorcentaje) {
        this.tarifaPorcentaje = tarifaPorcentaje;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }

    @Override
    public double CalcularPago() {
       double porcentaje = tarifaPorcentaje/100;
       double total= ventasBrutas*porcentaje;
        
        return total;
    }

    @Override
    public void Imprimir() {
       JOptionPane.showMessageDialog(null, super.ImprimirEmpleado()+"\n"+
                                                "Porcentaje de tarifa :" + tarifaPorcentaje+"%" +"\n"+
                                                "Ventas Brutas :" + ventasBrutas+"\n"+
                                                "Total cobrar : " + CalcularPago());
    }
    
}
