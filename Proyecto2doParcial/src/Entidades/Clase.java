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
public class Clase {

    private int idClase;
    private String Nombre;
    private String Descripcion;

    public Clase() {
    }

    public Clase(int idClase, String Nombre, String Descripcion) {
        this.idClase = idClase;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
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
