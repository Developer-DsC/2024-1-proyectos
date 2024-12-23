package Entidades;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 * @author Joffre Cartuche C
 * @version 1.0
 * @created 18-Jul.-2023 20:22:41
 */
public class Comision extends Empleado {

	private double Porcentaje;
	private double VentasBrutas;


	public Comision(){
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
	 * @param por
	 * @param vb
	 */
	public Comision(int cod, String ced, String nom, String ape, Date fn, char sex, String est, double por, double vb){
            super(cod, ced, nom, ape, fn, sex, est);
            this.VentasBrutas=vb;
            this.Porcentaje=por;
	}

	public double getPorcentaje(){
		return Porcentaje;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setPorcentaje(double newVal){
		Porcentaje = newVal;
	}

	public double getVentasBrutas(){
		return VentasBrutas;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setVentasBrutas(double newVal){
		VentasBrutas = newVal;
	}

	public double CalcularSueldo(){
		return (VentasBrutas*Porcentaje/100);
	}

	public void Imprimir(){
            JOptionPane.showMessageDialog(null, ImprimirEmpleado()+"\nVentas brutas= "+VentasBrutas+
                                                                                "\nPorcentaje= "+Porcentaje+
                                                                                "\nTotal a cobrar= "+CalcularSueldo());
	}

}