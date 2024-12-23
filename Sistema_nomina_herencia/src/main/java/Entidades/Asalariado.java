package Entidades;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 * @author Joffre Cartuche C
 * @version 1.0
 * @created 18-Jul.-2023 20:22:15
 */
public class Asalariado extends Empleado {

	private double Salario;


	public Asalariado(){
            super();
	}

	/**
	 * 
	 * @param cod
	 * @param ced
	 * @param nom
	 * @param ape
	 * @param fn
	 * @param sex
	 * @param est
	 * @param sal
	 */
	public Asalariado(int cod, String ced, String nom, String ape, Date fn, char sex, String est, double sal){
            super(cod, ced, nom, ape, fn, sex, est);
            this.Salario=sal;
	}

	public double getSalario(){
		return Salario;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setSalario(double newVal){
		Salario = newVal;
	}

	public double CalcularSueldo(){
		return Salario;
	}

	public void Imprimir(){
            JOptionPane.showMessageDialog(null, ImprimirEmpleado() + 
                    "\nSueldo semanal: "+Salario+
                    "\nTotal cobrar: "+CalcularSueldo());
	}

}