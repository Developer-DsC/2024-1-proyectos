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
public class EmpresaTelas
{
    private int id;
    private int NumPieza;
    private String NombrePieza;
    private int  NumCliente;
    private int Cantidaddepiezasvendidas;

    public EmpresaTelas() {
    }

    public EmpresaTelas(int id, int NumPieza, String NombrePieza, int NumCliente, int Cantidaddepiezasvendidas) {
        this.id = id;
        this.NumPieza = NumPieza;
        this.NombrePieza = NombrePieza;
        this.NumCliente = NumCliente;
        this.Cantidaddepiezasvendidas = Cantidaddepiezasvendidas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumPieza() {
        return NumPieza;
    }

    public void setNumPieza(int NumPieza) {
        this.NumPieza = NumPieza;
    }

    public String getNombrePieza() {
        return NombrePieza;
    }

    public void setNombrePieza(String NombrePieza) {
        this.NombrePieza = NombrePieza;
    }

    public int getNumCliente() {
        return NumCliente;
    }

    public void setNumCliente(int NumCliente) {
        this.NumCliente = NumCliente;
    }

    public int getCantidaddepiezasvendidas() {
        return Cantidaddepiezasvendidas;
    }

    public void setCantidaddepiezasvendidas(int Cantidaddepiezasvendidas) {
        this.Cantidaddepiezasvendidas = Cantidaddepiezasvendidas;
    }

    
    
}
