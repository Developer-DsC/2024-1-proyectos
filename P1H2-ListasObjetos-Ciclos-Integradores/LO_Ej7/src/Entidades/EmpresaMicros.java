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
public class EmpresaMicros {
    
    private int IdNumTick;
    private String Destino;
    private String Servicio;
    private int CantPasajes;

    public EmpresaMicros() {
    }

    public EmpresaMicros(int IdNumTick, String Destino, String Servicio, int CantPasajes) {
        this.IdNumTick = IdNumTick;
        this.Destino = Destino;
        this.Servicio = Servicio;
        this.CantPasajes = CantPasajes;
    }

    public int getIdNumTick() {
        return IdNumTick;
    }

    public void setIdNumTick(int IdNumTick) {
        this.IdNumTick = IdNumTick;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public String getServicio() {
        return Servicio;
    }

    public void setServicio(String Servicio) {
        this.Servicio = Servicio;
    }

    public int getCantPasajes() {
        return CantPasajes;
    }

    public void setCantPasajes(int CantPasajes) {
        this.CantPasajes = CantPasajes;
    }
    
}
