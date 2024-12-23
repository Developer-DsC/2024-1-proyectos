/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class EmpleadoJornalero extends Persona {

    private double horas;
    private double tarifa;

    public EmpleadoJornalero() {
        super();
    }

    public EmpleadoJornalero(String ced, String nom, String ape, char sex, Date fn, String est, double hor, double tar) {
        super(ced, nom, ape, sex, fn, est);
        this.horas = hor;
        this.tarifa = tar;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public double CalcularSueldo() {
        return horas * tarifa;
    }

    public void ImprimirJornalero() {
        JOptionPane.showMessageDialog(null, super.ImprimirPersona() + "\n"
                + "Sueldo Cobrar :" + CalcularSueldo());
    }
}
