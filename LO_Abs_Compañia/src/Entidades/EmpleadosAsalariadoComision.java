package Entidades;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class EmpleadosAsalariadoComision extends EmpleadoComision {

    private double SalarioBase;

    public EmpleadosAsalariadoComision() {
    }

    public EmpleadosAsalariadoComision(double SalarioBase, double tarifaPorcentaje, double ventasBrutas, String codigo, String Cedula, String Nombre, String Apellido, Date FechaNaci, String Estado, String ciudad, String mes, String Tipo) {
        super(tarifaPorcentaje, ventasBrutas, codigo, Cedula, Nombre, Apellido, FechaNaci, Estado, ciudad, mes, Tipo);
        this.SalarioBase = SalarioBase;
    }
    
    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(double SalarioBase) {
        this.SalarioBase = SalarioBase;
    }

    @Override
    public double CalcularPago() {
        double total = SalarioBase + (SalarioBase * 0.10)+(this.getVentasBrutas()*this.getVentasBrutas()/100);
        return total;
    }

   
    public void Imprimira() {
        JOptionPane.showMessageDialog(null, super.ImprimirEmpleado()+ "\n"
                + "Salario base :" + SalarioBase + "\n"
                + "Total cobrar : " + CalcularPago());
    }

}
