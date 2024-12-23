package Entidades;

import java.util.Date;

/**
 *
 * @author Dalton
 */
public class Empleado {
	private int IdCodigo;
	private String Cedula;
	private String Nombres;
	private String Apellidos;
	private Date FechaNacimiento;
	private char Sexo;
	private String Estado;

    

	public Empleado(){
            
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
	 */
	public Empleado(int cod, String ced, String nom, String ape, Date fn, char sex, String est){
            this.IdCodigo=cod;
            this.Cedula=ced;
            this.Nombres=nom;
            this.Apellidos=ape;
            this.FechaNacimiento=fn;
            this.Sexo=sex;
            this.Estado=est;
	}

	public int getIdCodigo(){
		return IdCodigo;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setIdCodigo(int newVal){
		IdCodigo = newVal;
	}

	public String getCedula(){
		return Cedula;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setCedula(String newVal){
		Cedula = newVal;
	}

	public String getApellidos(){
		return Apellidos;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setApellidos(String newVal){
		Apellidos = newVal;
	}

	public Date getFechaNacimiento(){
		return FechaNacimiento;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setFechaNacimiento(Date newVal){
		FechaNacimiento = newVal;
	}

	public char getSexo(){
		return Sexo;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setSexo(char newVal){
		Sexo = newVal;
	}

	public String getEstado(){
		return Estado;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setEstado(String newVal){
		Estado = newVal;
	}

	public String ImprimirEmpleado(){
		return "Codigo: "+IdCodigo+"\nNombres: "+Nombres+
                        "\nApellido: "+Apellidos+
                        "\nCedula: "+Cedula+
                        "\nSexo: "+Sexo+
                        "\nFecha: "+FechaNacimiento+
                        "\nEstado: "+Estado;
	}

	public String getNombres(){
		return Nombres;
	}
}
