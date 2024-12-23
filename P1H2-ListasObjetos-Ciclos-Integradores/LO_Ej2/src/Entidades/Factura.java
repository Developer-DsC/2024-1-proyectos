/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public class Factura {
    private String NumFact;
    private String NumArt;
    private int Cant;
    private double PreUnit;

    public Factura() {
    }

    public Factura(String NumFact, String NumArt, int Cant, double PreUnit) {
        this.NumFact = NumFact;
        this.NumArt = NumArt;
        this.Cant = Cant;
        this.PreUnit = PreUnit;
    }

    public String getNumFact() {
        return NumFact;
    }

    public void setNumFact(String NumFact) {
        this.NumFact = NumFact;
    }

    public String getNumArt() {
        return NumArt;
    }

    public void setNumArt(String NumArt) {
        this.NumArt = NumArt;
    }

    public int getCant() {
        return Cant;
    }

    public void setCant(int Cant) {
        this.Cant = Cant;
    }

    public double getPreUnit() {
        return PreUnit;
    }

    public void setPreUnit(double PreUnit) {
        this.PreUnit = PreUnit;
    }
    
    
    
    public double TotFact()
    {
        return Cant*PreUnit;
    }
    
    
    public String ImprimirFact()
    {
        return "Numero de Factura: "+NumFact+"\n"+
               "Numero de Articulo: "+NumArt+"\n"+
                "Cantidad: "+Cant+"\n"+
                "Precio Unitario: "+PreUnit+"\n"+
                "Total : "+TotFact();
    }
    
    
    
}
