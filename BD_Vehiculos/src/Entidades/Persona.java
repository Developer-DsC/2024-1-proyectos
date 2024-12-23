package Entidades;

/**
 *
 * @author Dalton
 */
public class Persona {

    private int idPersona;
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private int Edad;
    private int idSexo;
    private int idEstado;

    public Persona() {
    }

    public Persona(int idPersona, String Cedula, String Nombre, String Apellido, int Edad, int idSexo, int idEstado) {
        this.idPersona = idPersona;
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.idSexo = idSexo;
        this.idEstado = idEstado;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(int idSexo) {
        this.idSexo = idSexo;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    @Override
    public String toString() {
        return this.idPersona + " - " + this.Nombre;
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        return this.idPersona == ((Persona) obj).idPersona;
    }
}
