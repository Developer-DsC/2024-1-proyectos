/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Dell
 */
public class Electricidad {
    private int Id;
    private int NumZon;
    private String Tipo;
    private double consumo;

    public Electricidad() {
    }

    public Electricidad(int Id, int NumZon, String Tipo, double consumo) {
        this.Id = Id;
        this.NumZon = NumZon;
        this.Tipo = Tipo;
        this.consumo = consumo;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getNumZon() {
        return NumZon;
    }

    public void setNumZon(int NumZon) {
        this.NumZon = NumZon;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
    
}
