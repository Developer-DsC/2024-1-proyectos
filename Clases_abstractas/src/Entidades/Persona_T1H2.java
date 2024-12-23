package Entidades;

import java.util.Date;

/**
 *
 * @author Dalton
 */
public class Persona_T1H2 {

    private String idCodigo;
    private String Nombres;
    private String Apellidos;
    private String Sexo;
    private Date Fecha_Nacimiento;
    private String Estado;

    public Persona_T1H2() {
    }

    public Persona_T1H2(String idCodigo, String Nombres, String Apellidos, String Sexo, Date Fech_Nacimiento, String Estado) {
        this.idCodigo = idCodigo;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Sexo = Sexo;
        this.Fecha_Nacimiento = Fech_Nacimiento;
        this.Estado = Estado;
    }

    public String getIdCodigo() {
        return idCodigo;
    }

    public void setIdCodigo(String idCodigo) {
        this.idCodigo = idCodigo;
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

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public Date getFech_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFech_Nacimiento(Date Fech_Nacimiento) {
        this.Fecha_Nacimiento = Fech_Nacimiento;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String imprimirPersona() {

        return "Id Código: " + idCodigo
                + "\nNombre y Apellido: " + Nombres + " " + Apellidos
                + "\nFecha de nacimiento: " + Fecha_Nacimiento
                + "\nSexo: " + Sexo
                + "\nEstado: " + Estado;

    }
}
