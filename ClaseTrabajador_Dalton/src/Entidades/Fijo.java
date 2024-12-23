package Entidades;

import java.util.Date;
import javax.swing.JOptionPane;
public class Fijo extends Trabajador {

	private double SueldoBasico;
	private double Comision;
	private double Impuesto;
	public Fijo(){
            super();
	}

    public Fijo(double SueldoBasico, double Comision, double Impuesto, String Cedula, String Nombre, String Apellido, String Sexo, String FechaNaci, String Estado, String Tipo) {
        super(Cedula, Nombre, Apellido, Sexo, FechaNaci, Estado, Tipo);
        this.SueldoBasico = SueldoBasico;
        this.Comision = Comision;
        this.Impuesto = Impuesto;
    }
	

	public double getSueldoBasico(){
		return SueldoBasico;
	}
	public void setSueldoBasico(double newVal){
		SueldoBasico = newVal;
	}

	public double getComision(){
		return Comision;
	}
	public void setComision(double newVal){
		Comision = newVal;
	}

	public double getImpuesto(){
		return Impuesto;
	}

	public void setImpuesto(double newVal){
		Impuesto = newVal;
	}
        @Override
	public double CalcularPago(){
	   return this.SueldoBasico + this.Comision - this.Impuesto;
	}
        @Override
	public void Imprimir(){
            JOptionPane.showMessageDialog(null, super.ImprimirTrabajador()+"\n"+
                                                "Sueldo :" + SueldoBasico +"\n"+
                                                "Comisiones :" + Comision+"\n"+
                                                "Impuestos: " + Impuesto +"\n"+
                                                "Sueldo cobrar :"+CalcularPago());
	}

}