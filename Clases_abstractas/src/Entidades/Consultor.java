package Entidades;

import javax.swing.JOptionPane;

/**
 * @author Dalton
 * @version 1.0
 * @created 15-Ago.-2023 10:10:28
 */
public class Consultor extends Trabajador {

    private double Horas;
    private double Tarifa;

    public Consultor(double Horas, double Tarifa, String cedula, String nombres, String Sexo, String Estado) {
        super(cedula, nombres, Sexo, Estado);
        this.Horas = Horas;
        this.Tarifa = Tarifa;
    }

 

  

    public void Consultor(String cedula, String nombres, String Sexo, String Estado, double Horas, double Tarifa) {

    }

    public double getHoras() {
        return Horas;
    }

    public double getTarifa() {
        return Tarifa;
    }

    public void setHoras(double newVal) {
        Horas = newVal;
    }

    public void setTarifa(double newVal) {
        Tarifa = newVal;
    }

    @Override
    public double CalcularSueldo() {
        return Horas*Tarifa;
    }

    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null, ImprimirTrabajador()+
                                                        "\nHoras:" +Horas+
                                                        "\nTarifa:"+Tarifa+
                                                        "\nSueldo calculado: "+CalcularSueldo());
    }

}
