/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Gabriel
 */
public class Tipo {

    private int idTipo;
    private String Nombre;
    private String Descripcion;

    public Tipo() {
    }

    public Tipo(int idTipo, String Nombre, String Descripcion) {
        this.idTipo = idTipo;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String toString() {
        return this.Nombre;
    }
}
