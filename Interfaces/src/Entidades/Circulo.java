package Entidades;

import javax.swing.JOptionPane;

/**
 * @author Dalton
 * @version 1.0
 * @created 17-Ago.-2023 10:11:40
 */
public class Circulo implements Figuras {

	private double radio;

	public Circulo(){

	}

	/**
	 * 
	 * @param R
	 */
        
        
	public Circulo(double R){
            this.radio=R;
	}

        @Override
	public double Area(){
            
            double area= Math.PI* Math.pow(radio, 2);
		return area;
	}

        @Override
	public void imprimir(){
            JOptionPane.showMessageDialog(null, "Radio: "+radio+
                                                            "\nÁrea:"+Area());
	}

	public double getradio(){
		return radio;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setradio(double newVal){
		radio = newVal;
	}

}