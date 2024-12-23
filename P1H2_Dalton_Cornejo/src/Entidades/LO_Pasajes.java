package Entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class LO_Pasajes {

    private String Ticket;
    private String Destino;
    private String Clase;
    private double Cantidad;

    public LO_Pasajes(String Ticket, String Destino, String Clase, double Cantidad) {
        this.Ticket = Ticket;
        this.Destino = Destino;
        this.Clase = Clase;
        this.Cantidad = Cantidad;
    }

    public String getTicket() {
        return Ticket;
    }

    public void setTicket(String Ticket) {
        this.Ticket = Ticket;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public String getClase() {
        return Clase;
    }

    public void setClase(String Clase) {
        this.Clase = Clase;
    }

    public double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(double Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double Calcular() {
        double precio = 0;

        if (Clase.equals("Comun")) {
            precio = 43;
        }
        if (Clase.equals("Diferencial")) {
            precio = 55;
        }

        double total = Cantidad * precio;

        if (Cantidad >= 10) {
            total = total - (total * 0.1);
        }
        
        return total;
    }
}
