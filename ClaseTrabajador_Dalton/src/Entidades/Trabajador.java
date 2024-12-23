package Entidades;

/**
 *
 * @author Dalton
 */

import java.util.Date;

public abstract class Trabajador {

    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Sexo;
    private String FechaNaci;
    private String Estado;
    private String Tipo;

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public Trabajador() {

    }

    public Trabajador(String Cedula, String Nombre, String Apellido, String Sexo, String FechaNaci, String Estado, String Tipo) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Sexo = Sexo;
        this.FechaNaci = FechaNaci;
        this.Estado = Estado;
        this.Tipo = Tipo;
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

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getFechaNaci() {
        return FechaNaci;
    }

    public void setFechaNaci(String FechaNaci) {
        this.FechaNaci = FechaNaci;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String newVal) {
        Estado = newVal;
    }

    public String ImprimirTrabajador() {
        return "Cedula:" + this.Cedula + "\n"
                + "Nombre: " + this.Nombre + "\n"
                + "Apellido: " + this.Apellido + "\n"
                + "Fecha de nacimiento :" + FechaNaci
                + "\nEstado: " + Estado
                + "\nSexo: " + Sexo
                + "\nTipo: " + Tipo;

    }

    public abstract double CalcularPago();

    public abstract void Imprimir();

}
