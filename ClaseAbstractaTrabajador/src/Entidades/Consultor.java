package Entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class Consultor extends Trabajador{
    private double Horas;
    private double Tarifa;

    public Consultor() {
    }

    public Consultor(double Horas, double Tarifa, String Cedula, String Nombres, String Apellidos, char sexo, String tipo, String Estado) {
        super(Cedula, Nombres, Apellidos, sexo, tipo, Estado);
        this.Horas = Horas;
        this.Tarifa = Tarifa;
    }

    @Override
    public void Imprimir() {
        JOptionPane.showMessageDialog(null, ImprimirTabajador() + "\n" + 
                "sueldo a cobrar :" + Calcular()
                +"\nTipo de trabajador: "+getTipo());    
    }
    @Override
    public double Calcular() {
        return Horas * Tarifa;
    }
    
}
