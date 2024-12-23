package Entidades;

/**
 * @author Jerson
 * @version 1.0
 * @created 01-ago.-2023 8:07:10
 */
public class Persona {

    private String IdCodigo;
    private String Nombre;
    private String Apellidos;
    private String Sexo;
    private String FechaNacimiento;
    private String Estado;

    public Persona() {
    }

    public Persona(String IdCodigo, String Nombre, String Apellidos, String Sexo, String FechaNacimiento, String Estado) {
        this.IdCodigo = IdCodigo;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Sexo = Sexo;
        this.FechaNacimiento = FechaNacimiento;
        this.Estado = Estado;
    }

    public String getIdCodigo() {
        return IdCodigo;
    }

    public void setIdCodigo(String IdCodigo) {
        this.IdCodigo = IdCodigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String ImprimirPersona() {
        return "Codigo :" + IdCodigo + "\n"
                + "Nombres: " + Nombre + "\n" 
                + "Apellido: " + Apellidos + "\n"
                + "Fecha de Nacimiento :" + FechaNacimiento + "\n"
                + "Sexo :" + Sexo + "\n"
                + "Estado:" + Estado;
    }

}
