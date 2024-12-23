package Entidades;

import java.util.Date;

/**
 * @author Joffre Cartuche C
 * @version 1.0
 * @created 23-ene.-2023 11:09:04
 */
public abstract class Persona {

	private String Cedula;
	private String Nombre;
	private String Apellido;
	private char Sexo;
	private Date FechaNaci;
	private String Estado;
        private String Tipo;

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
	public Persona(){

	}
    public Persona(String Cedula, String Nombre, String Apellido, char Sexo, Date FechaNaci, String Estado,String tip) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Sexo = Sexo;
        this.FechaNaci = FechaNaci;
        this.Estado = Estado;
        this.Tipo=tip;
    }
	

	public String getCedula(){
		return Cedula;
	}

	public void setCedula(String newVal){
		Cedula = newVal;
	}

	public String getNombre(){
		return Nombre;
	}
	public void setNombre(String newVal){
		Nombre = newVal;
	}

	public String getApellido(){
		return Apellido;
	}
	public void setApellido(String newVal){
		Apellido = newVal;
	}

	public char getSexo(){
		return Sexo;
	}

	public void setSexo(char newVal){
		Sexo = newVal;
	}

	public Date getFechaNaci(){
		return FechaNaci;
	}

	public void setFechaNaci(Date newVal){
		FechaNaci = newVal;
	}
	public String getEstado(){
		return Estado;
	}

	public void setEstado(String newVal){
		Estado = newVal;
	}
	public int Edad(){
	    return 18;
	}

	public String ImprimirPersona(){
	   return "Cedula:" +this.Cedula +"\n"+
                  "Nombre: " + this.Nombre +"\n"+
                   "Apellido: " + this.Apellido+"\n"+
                   "Edad :" + Edad()+"\n"+
                   "Tipo :" + Tipo;
	}

	public abstract double CalcularPago();
	public abstract void Imprimir();

}