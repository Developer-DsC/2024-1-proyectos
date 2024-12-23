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
public class Combustible {
    
    private int idCombustible;
    private String Nombre;
    private String Descripcion;

    public Combustible() {
    }

    public Combustible(int idCombustible, String Nombre, String Descripcion) {
        this.idCombustible = idCombustible;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
    }

    public int getIdCombustible() {
        return idCombustible;
    }

    public void setIdCombustible(int idCombustible) {
        this.idCombustible = idCombustible;
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
