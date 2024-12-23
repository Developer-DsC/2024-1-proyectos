package Entidades;

/**
 *
 * @author Dalton
 */
public class Persona {
    private int idPersona;
    private String Cedula;
    private String Nombres;
    private String Apellidos;
    private int Edad;
    private String Correo;
    private int idSexo;
    private int idEstado;

    public Persona() {
    }
    
    public Persona(int idPersona, String Cedula, String Nombres, String Apellidos, int Edad, String Correo, int idSexo, int idEstado) {
        this.idPersona = idPersona;
        this.Cedula = Cedula;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Edad = Edad;
        this.Correo = Correo;
        this.idSexo = idSexo;
        this.idEstado = idEstado;
    }

    public int getidPersona() {
        return idPersona;
    }

    public void setidPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public int getidSexo() {
        return idSexo;
    }

    public void setidSexo(int idSexo) {
        this.idSexo = idSexo;
    }

    public int getidEstado() {
        return idEstado;
    }

    public void setidEstado(int idEstado) {
        this.idEstado = idEstado;
    }

  
    
    
    

}

   