package Entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */

public class LO_Compañia_Electrica {

    private int Zona;
    private String NumeroCliente;
    private double MesAnt;
    private double MesAct;

    public LO_Compañia_Electrica(int Zona, String NumeroCliente, double MesAnt, double MesAct) {
        this.Zona = Zona;
        this.NumeroCliente = NumeroCliente;
        this.MesAnt = MesAnt;
        this.MesAct = MesAct;
    }

    public int getZona() {
        return Zona;
    }

    public void setZona(int Zona) {
        this.Zona = Zona;
    }

    public String getNumeroCliente() {
        return NumeroCliente;
    }

    public void setNumeroCliente(String NumeroCliente) {
        this.NumeroCliente = NumeroCliente;
    }

    public double getMesAnt() {
        return MesAnt;
    }

    public void setMesAnt(double MesAnt) {
        this.MesAnt = MesAnt;
    }

    public double getMesAct() {
        return MesAct;
    }

    public void setMesAct(double MesAct) {
        this.MesAct = MesAct;
    }

    public double Calcular() {
        double consant = 0;
        double consact = 0;
        
        //mes anterior
        if (MesAnt <= 100) {
            consant = MesAnt * 0.10;
        }
        if (MesAnt >= 101 && MesAnt <= 200) {
            consant = (100 * 0.10) + (MesAnt - 100) * 0.12;
        }
        if (MesAnt >= 200) {
            consant = (100 * 0.10) + (100 * 0.12) + (MesAnt - 200) * 0.15;
        }

        //mes actual
        if (MesAct <= 100) {
            consant = MesAct * 0.10;
        }
        if (MesAct >= 101 && MesAct <= 200) {
            consact = (100 * 0.10) + (MesAct - 100) * 0.12;
        }
        if (MesAct >= 200) {
            consact = (100 * 0.10) + (100 * 0.12) + (MesAct - 200) * 0.15;
        }
        return consact + consant;
    }
}
