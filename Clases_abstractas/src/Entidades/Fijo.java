package Entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class Fijo extends Trabajador{
    private double sueldo;
    private double impuesto;

    public Fijo(double sueldo, double impuesto, String cedula, String nombres, String Sexo, String Estado) {
        super(cedula, nombres, Sexo, Estado);
        this.sueldo = sueldo;
        this.impuesto = impuesto;
    }
    
    
  
    
     @Override
    public double CalcularSueldo() {
        return sueldo-impuesto;
    }
    
    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null, ImprimirTrabajador()+
                                                        "\nImpuesto:" +impuesto+
                                                        "\nSueldo:"+sueldo+
                                                        "\nSueldo calculado: "+CalcularSueldo());
    }
    
    
    
    
}
