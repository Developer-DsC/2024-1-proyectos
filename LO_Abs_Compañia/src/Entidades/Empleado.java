package Entidades;

/**
 *
 * @author Dalton
 */
import java.util.Date;

public abstract class Empleado {

    private String codigo;
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private Date FechaNaci;
    private String Estado;
    private String ciudad;
    private String mes;
    private String Tipo;

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public Empleado() {

    }

    public Empleado(String codigo, String Cedula, String Nombre, String Apellido, Date FechaNaci, String Estado, String ciudad, String mes, String Tipo) {
        this.codigo = codigo;
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.FechaNaci = FechaNaci;
        this.Estado = Estado;
        this.ciudad = ciudad;
        this.mes = mes;
        this.Tipo = Tipo;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String newVal) {
        Cedula = newVal;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String newVal) {
        Nombre = newVal;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String newVal) {
        Apellido = newVal;
    }

    public Date getFechaNaci() {
        return FechaNaci;
    }

    public void setFechaNaci(Date FechaNaci) {
        this.FechaNaci = FechaNaci;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String newVal) {
        Estado = newVal;
    }

    public String ImprimirEmpleado() {
        return "Codigo" + codigo
                + "\nCedula:" + this.Cedula + "\n"
                + "Nombre: " + this.Nombre + "\n"
                + "Apellido: " + this.Apellido + "\n"
                + "Fecha de nacimiento :" + FechaNaci
                + "\nEstado: " + Estado
                + "\nCiudad: " + ciudad
                + "\nTipo: " + Tipo;

    }

    public abstract double CalcularPago();

    public abstract void Imprimir();

}
