package Entidades;

import javax.swing.JOptionPane;

/**
 * @author Dalton
 * @version 1.0
 * @created 17-Ago.-2023 10:11:39
 */
public class Cuadrado implements Figuras {

	private double Lado;

	public Cuadrado(){

	}

	/**
	 * 
	 * @param L
	 */
	public Cuadrado(double L){
            this.Lado=L;
	}

        @Override
	public double Area(){
            double area=Math.pow(Lado, 2);
		return area;
	}

        @Override
	public void imprimir(){
            JOptionPane.showMessageDialog(null, "Lado: "+Lado+
                                                            "\nÁrea:"+Area());
	}

	public double getLado(){
		return Lado;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setLado(double newVal){
		Lado = newVal;
	}

}