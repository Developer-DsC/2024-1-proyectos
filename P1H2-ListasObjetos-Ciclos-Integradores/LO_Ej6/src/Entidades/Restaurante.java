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
public class Restaurante {
    private int id;
    private int NumMozo;
    private String NomMozo;
    private int NumMeza;
    private double importe;
    private int cantpersonas;

    public Restaurante() {
    }

    public Restaurante(int id, int NumMozo, String NomMozo, int NumMeza, double importe, int cantpersonas) {
        this.id = id;
        this.NumMozo = NumMozo;
        this.NomMozo = NomMozo;
        this.NumMeza = NumMeza;
        this.importe = importe;
        this.cantpersonas = cantpersonas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumMozo() {
        return NumMozo;
    }

    public void setNumMozo(int NumMozo) {
        this.NumMozo = NumMozo;
    }

    public String getNomMozo() {
        return NomMozo;
    }

    public void setNomMozo(String NomMozo) {
        this.NomMozo = NomMozo;
    }

    public int getNumMeza() {
        return NumMeza;
    }

    public void setNumMeza(int NumMeza) {
        this.NumMeza = NumMeza;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public int getCantpersonas() {
        return cantpersonas;
    }

    public void setCantpersonas(int cantpersonas) {
        this.cantpersonas = cantpersonas;
    }

   
    
    
}
