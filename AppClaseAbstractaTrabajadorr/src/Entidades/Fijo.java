package Entidades;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 * @author Joffre Cartuche C
 * @version 1.0
 * @created 23-ene.-2023 11:27:45
 */
public class Fijo extends Persona {

	private double SueldoBasico;
	private double Comision;
	private double Impuesto;
	public Fijo(){
            super();
	}
	public Fijo(String ced, String nom, String ape, char sex, Date fn, String est,String tip, double sb, double com, double imp){
            super(ced,nom, ape, sex, fn, est,tip);
            this.SueldoBasico=sb;
            this.Comision=com;
            this.Impuesto=imp;
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
            JOptionPane.showMessageDialog(null, super.ImprimirPersona()+"\n"+
                                                "Sueldo :" + SueldoBasico +"\n"+
                                                "Comisiones :" + Comision+"\n"+
                                                "Impuestos: " + Impuesto +"\n"+
                                                "Sueldo cobrar :"+CalcularPago());
	}

}