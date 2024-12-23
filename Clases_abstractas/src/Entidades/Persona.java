package Entidades;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class Persona {

    private int idCodigo;
    private String cedula;
    private String Apellido;
    private String Nombre;
    private Date FechaNacimiento;
    private String Estado;

    public Persona() {
    }

    public Persona(int idCodigo, String cedula, String Nombre, String Apellido, Date FechaNacimiento, String Estado) {
        this.idCodigo = idCodigo;
        this.cedula = cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.FechaNacimiento = FechaNacimiento;
        this.Estado = Estado;
    }

    public int getIdCodigo() {
        return idCodigo;
    }

    public void setIdCodigo(int idCodigo) {
        this.idCodigo = idCodigo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String imprimirPersona() {
        return "Id Código: " + idCodigo
                + "\nCédula: " + cedula
                + "\nNombre y Apellido: " + Nombre + " " + Apellido
                + "\nFecha de nacimiento: " + FechaNacimiento
                + "\nEstado: " + Estado;

    }
}
