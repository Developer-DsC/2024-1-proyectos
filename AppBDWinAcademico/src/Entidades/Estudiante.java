/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Joffre Cartuche C
 */
public class Estudiante {
    private int IdCodigo;
    private String Cedula;
    private String Nombres;
    private String Apellidos;
    private char Sexo;
    private int Edad;
    private String Ciudad;
    public Estudiante() {
    }
    public Estudiante(int IdCodigo, String Cedula, String Nombres, String Apellidos, char Sexo, int Edad, String Ciudad) {
        this.IdCodigo = IdCodigo;
        this.Cedula = Cedula;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Sexo = Sexo;
        this.Edad = Edad;
        this.Ciudad = Ciudad;
    }

    public int getIdCodigo() {
        return IdCodigo;
    }

    public void setIdCodigo(int IdCodigo) {
        this.IdCodigo = IdCodigo;
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

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }
    
    
    
}
