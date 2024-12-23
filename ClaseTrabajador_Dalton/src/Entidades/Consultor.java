package Entidades;

/**
 *
 * @author Dalton
 */

import java.util.Date;
import javax.swing.JOptionPane;

public class Consultor extends Trabajador{
    private double Horas, Costo;

    public Consultor() {
    super();
    }

    public Consultor(double Horas, double Costo, String Cedula, String Nombre, String Apellido, String Sexo, String FechaNaci, String Estado, String Tipo) {
        super(Cedula, Nombre, Apellido, Sexo, FechaNaci, Estado, Tipo);
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
       JOptionPane.showMessageDialog(null, super.ImprimirTrabajador()+"\n"+
                                                "Horas :" + Horas +"\n"+
                                                "Costo :" + Costo+"\n"+
                                                "Total cobrar : " + CalcularPago());
    }
    
}
