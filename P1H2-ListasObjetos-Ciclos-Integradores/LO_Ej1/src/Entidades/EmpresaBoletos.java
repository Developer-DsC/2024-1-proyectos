/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Controlador.Tlista;
import static Controlador.Tlista.ListaVenta;

/**
 *
 * @author Dell
 */
public class EmpresaBoletos {
    private int Codigo;
    private String Destino;
    private String Compañia;
    private int CantPasajes;
    private String Servicio;

    public EmpresaBoletos() {
    }

    public EmpresaBoletos(int Codigo, String Destino, String Compañia, int CantPasajes, String Servicio) {
        this.Codigo = Codigo;
        this.Destino = Destino;
        this.Compañia = Compañia;
        this.CantPasajes = CantPasajes;
        this.Servicio = Servicio;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public String getCompañia() {
        return Compañia;
    }

    public void setCompañia(String Compañia) {
        this.Compañia = Compañia;
    }

    public int getCantPasajes() {
        return CantPasajes;
    }

    public void setCantPasajes(int CantPasajes) {
        this.CantPasajes = CantPasajes;
    }

    public String getServicio() {
        return Servicio;
    }

    public void setServicio(String Servicio) {
        this.Servicio = Servicio;
    }
    

    public  String ImprimirPersona()
    {
        return "Codigo: " + this.Codigo + "\n"+
                "Destino: " + this.Destino + "\n"+
                "Compañia: "+this.Compañia+"\n"+
                "Cntidad de pasajes: " + this.CantPasajes+"\n"+
                "Servicio: " + this.Servicio;
    }
}
