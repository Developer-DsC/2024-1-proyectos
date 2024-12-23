package ENTIDADES;

public class PERSONA {
    private String IdCodigo;
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private int Edad;
    private String Tipo;

    public PERSONA() {
    }

    public PERSONA(String IdCodigo, String Cedula, String Nombre, String Apellido, int Edad, String Tipo) {
        this.IdCodigo = IdCodigo;
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Tipo = Tipo;
    }

    public String getIdCodigo() {
        return IdCodigo;
    }

    public String getCedula() {
        return Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setIdCodigo(String IdCodigo) {
        this.IdCodigo = IdCodigo;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    
    
    
    
}
