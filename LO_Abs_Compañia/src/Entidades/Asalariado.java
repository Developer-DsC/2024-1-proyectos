package Entidades;

import java.util.Date;
import javax.swing.JOptionPane;

public class Asalariado extends Empleado {

    private double SalarioMensual;
    private double Bonificaciones;
    private double decimos;
    private double DescuentosAnticipo;

    public Asalariado() {
        super();
    }

    public Asalariado(double SalarioMensual, double Bonificaciones, double decimos, double DescuentosAnticipo, String codigo, String Cedula, String Nombre, String Apellido, Date FechaNaci, String Estado, String ciudad, String mes, String Tipo) {
        super(codigo, Cedula, Nombre, Apellido, FechaNaci, Estado, ciudad, mes, Tipo);
        this.SalarioMensual = SalarioMensual;
        this.Bonificaciones = Bonificaciones;
        this.decimos = decimos;
        this.DescuentosAnticipo = DescuentosAnticipo;
    }

    

    


    public double getDecimos() {
        return decimos;
    }

    public void setDecimos(double decimos) {
        this.decimos = decimos;
    }

    public double getSalarioMensual() {
        return SalarioMensual;
    }

    public void setSalarioMensual(double SalarioMensual) {
        this.SalarioMensual = SalarioMensual;
    }

    public double getBonificaciones() {
        return Bonificaciones;
    }

    public void setBonificaciones(double Bonificaciones) {
        this.Bonificaciones = Bonificaciones;
    }

    public double getDescuentosAnticipo() {
        return DescuentosAnticipo;
    }

    public void setDescuentosAnticipo(double DescuentosAnticipo) {
        this.DescuentosAnticipo = DescuentosAnticipo;
    }

    @Override
    public double CalcularPago() {
        double total=SalarioMensual;
        double porciento = (DescuentosAnticipo * 100) / SalarioMensual;

        if (porciento <= 40) {
            
            total = SalarioMensual + porciento+decimos;
            
        } else {
            JOptionPane.showMessageDialog(null,"Descuento mayor al 40%");
        }
        return total;
    }

    @Override
    public void Imprimir() {  
        JOptionPane.showMessageDialog(null, super.ImprimirEmpleado() + "\n"
                + "Salario Mensual :" + SalarioMensual + "\n"
                + "Bonificaciones :" + Bonificaciones + "\n"
                + "Descuentos del anticipo: " + DescuentosAnticipo + "\n"
                + "Sueldo cobrar :" + CalcularPago());
    }

}
