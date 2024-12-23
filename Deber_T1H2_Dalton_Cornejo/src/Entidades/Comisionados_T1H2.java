package Entidades;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class Comisionados_T1H2 extends Trabajadores_T1H2{
    private double porcentaje_ventas;
    private double salario;

    public Comisionados_T1H2() {
    }

    public Comisionados_T1H2(double salario, int tipo, String idCodigo, String Nombres, String Apellidos, String Sexo, Date Fech_Nacimiento, String Estado) {
        super(tipo, idCodigo, Nombres, Apellidos, Sexo, Fech_Nacimiento, Estado);
     
        this.salario = salario;
    }

 

    public double getPorcentaje_ventas() {
        return porcentaje_ventas;
    }

    public void setPorcentaje_ventas(double porcentaje_ventas) {
        this.porcentaje_ventas = porcentaje_ventas;
    }
    
   
    @Override
     public double Calcular_Sueldo(){
         porcentaje_ventas=salario*0.10;
         double sueldototal=salario+porcentaje_ventas;
        return sueldototal+100;
    }
    
    @Override
    public void imprimir(){
        porcentaje_ventas=salario+salario*0.10;
         JOptionPane.showMessageDialog(null, 
                 imprimirPersona() 
                + "\nTipo: Comisionados"     
                + "\nSueldo: " + salario
                + "\nPorcentaje: "+porcentaje_ventas
                + "\nTotal: " + Calcular_Sueldo());
    }
}
