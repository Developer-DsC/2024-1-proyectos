package Entidades;

/**
 * @author Jerson
 * @version 1.0
 * @created 01-ago.-2023 8:07:17
 */
public class Trabajador extends Persona {

	private String Tipo;

    public Trabajador() {
       
        super();
    }

    public Trabajador(String Tipo, String IdCodigo, String Nombre, String Apellidos, String Sexo, String FechaNacimiento, String Estado) {
        super(IdCodigo, Nombre, Apellidos, Sexo, FechaNacimiento, Estado);
        this.Tipo = Tipo;
    }

	
	
	public String getTipo(){
		return Tipo;
	}


	public void setTipo(String newVal){
		Tipo = newVal;
	}

	

	public double Calcularsueldo(){
		return 0;
	}

	public void Imprimir(){
            ImprimirPersona();
	}

}