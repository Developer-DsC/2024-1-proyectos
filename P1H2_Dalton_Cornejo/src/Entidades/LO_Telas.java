package Entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class LO_Telas {

    private String NumeroPieza;
    private String NombrePieza;
    private String NumeroCliente;
    private double Cantidad;

    public LO_Telas(String NumeroPieza, String NombrePieza, String NumeroCliente, double Cantidad) {
        this.NumeroPieza = NumeroPieza;
        this.NombrePieza = NombrePieza;
        this.NumeroCliente = NumeroCliente;
        this.Cantidad = Cantidad;
    }

    public String getNumeroPieza() {
        return NumeroPieza;
    }

    public void setNumeroPieza(String NumeroPieza) {
        this.NumeroPieza = NumeroPieza;
    }

    public String getNombrePieza() {
        return NombrePieza;
    }

    public void setNombrePieza(String NombrePieza) {
        this.NombrePieza = NombrePieza;
    }

    public String getNumeroCliente() {
        return NumeroCliente;
    }

    public void setNumeroCliente(String NumeroCliente) {
        this.NumeroCliente = NumeroCliente;
    }

    public double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(double Cantidad) {
        this.Cantidad = Cantidad;
    }
}
