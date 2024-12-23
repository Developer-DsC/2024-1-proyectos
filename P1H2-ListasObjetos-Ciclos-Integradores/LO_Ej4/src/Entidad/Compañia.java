/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class Compañia {
    
     private String Ubi;
    private int NumeroCliente;
    private int MesAnterior;
    private int MesActual;

    public Compañia() {
    }

    public Compañia(String Ubi, int NumeroCliente, int MesAnterior, int MesActual) {
        this.Ubi = Ubi;
        this.NumeroCliente = NumeroCliente;
        this.MesAnterior = MesAnterior;
        this.MesActual = MesActual;
    }

    public String getZona() {
        return Ubi;
    }

    public void setZona(String Zona) {
        this.Ubi = Zona;
    }

    public int getNumeroCliente() {
        return NumeroCliente;
    }

    public void setNumeroCliente(int NumeroCliente) {
        this.NumeroCliente = NumeroCliente;
    }

    public int getMesAnterior() {
        return MesAnterior;
    }

    public void setMesAnterior(int MesAnterior) {
        this.MesAnterior = MesAnterior;
    }

    public int getMesActual() {
        return MesActual;
    }

    public void setMesActual(int MesActual) {
        this.MesActual = MesActual;
    }

    public double Total() {
        double total = 0, A = 0, B = 0, C = 0;
        if (MesActual <= 100) {
            total = MesActual * 0.10;
        } else if (MesActual >= 101 && MesActual <= 200) {
            A = MesActual % 100;
            B = MesActual - A;
            B = B * 0.10;
            A = A * 0.12;
            total = A + B;
        } else if (MesActual >= 201) {
            A = MesActual % 100;
            B = MesActual - A;
            A = A * 0.15;
            B = (B - 100) * 0.12;
            C = 100 * 0.10;
            total = A + B + C;
        }
        return total;
    }

    public String Imprimir() {
        return "";
    }
}
