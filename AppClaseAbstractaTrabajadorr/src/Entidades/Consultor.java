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
 * @author Joffre Cartuche C
 */
public class Consultor extends Persona{
    private double Horas;
    private double Costo;

    public Consultor() {
    super();
    }

    public Consultor(String Cedula, String Nombre, String Apellido, char Sexo, Date FechaNaci, String Estado,String tip,double Horas,double Costo) {
        super(Cedula, Nombre, Apellido, Sexo, FechaNaci, Estado,tip);
        this.Horas = Horas;
        this.Costo = Costo;
    }
    
    
    public double getHoras() {
        return Horas;
    }

    public void setHoras(double Horas) {
        this.Horas = Horas;
    }

    public double getCosto() {
        return Costo;
    }

    public void setCosto(double Costo) {
        this.Costo = Costo;
    }
    
    
    @Override
    public double CalcularPago() {
        return Horas*Costo;
    }

    @Override
    public void Imprimir() {
       JOptionPane.showMessageDialog(null, super.ImprimirPersona()+"\n"+
                                                "Horas :" + Horas +"\n"+
                                                "Costo :" + Costo+"\n"+
                                                "Total cobrar : " + CalcularPago());
    }
    
}
