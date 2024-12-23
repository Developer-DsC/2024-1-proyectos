package Entidades;

/**
 * @author Joffre Cartuche C
 * @version 1.0
 * @created 23-ago.-2023 20:35:23
 */
public class Sueldos {

	private int Codigo;
	private String Nombre;
	private int Antiguedad;
	private double Sueldo;
	public Sueldos(){
	}
	public Sueldos(int cod, String nom, int ant, double su){
            this.Codigo= cod;
            this.Nombre=nom;
            this.Antiguedad= ant;
            this.Sueldo=su;
	}

	public int getCodigo(){
		return Codigo;
	}
	public void setCodigo(int newVal){
		Codigo = newVal;
	}
	public String getNombre(){
		return Nombre;
	}
	public void setNombre(String newVal){
		Nombre = newVal;
	}

	public int getAntiguedad(){
		return Antiguedad;
	}

	public void setAntiguedad(int newVal){
		Antiguedad = newVal;
	}

	public double getSueldo(){
		return Sueldo;
	}

	public void setSueldo(double newVal){
		Sueldo = newVal;
	}

	public String Imprimir(){
	    return "Codigo :" +this.Codigo + "\n" +
                    "Nombre :" + this.Nombre + "\n" +
                    "Antiguedad :" + this.Antiguedad + "\n" +
                    "Sueldo :" + this.Sueldo;
	}

}