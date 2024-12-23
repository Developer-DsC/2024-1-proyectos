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
public class Estado {
    private int IdEstado;
    private String Nombre;
    private String Descripcion;
    public Estado() {
    }
    public Estado(int id) {
        IdEstado=id;
    }
    public Estado(int IdEstado, String Nombre, String Descripcion) {
        this.IdEstado = IdEstado;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
    }

    public int getIdEstado() {
        return IdEstado;
    }

    public void setIdEstado(int IdEstado) {
        this.IdEstado = IdEstado;
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
    @Override
    public String toString()
    {
        return this.IdEstado+" - "+ this.Nombre;
    }
    @Override
    public boolean equals(Object obj)
    {
        return this.IdEstado == ((Estado)obj).IdEstado;
    }
    
    
}
