package Entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class LO_Venta_Boletos {

    protected String idVenta;
    protected String compañia;
    protected String destino;
    protected int cantidad_boletos;
    protected String servicio;

    public LO_Venta_Boletos() {
    }

    public LO_Venta_Boletos(String idVenta, String compañia, String destino, int cantidad_boletos, String servicio) {
        this.idVenta = idVenta;
        this.compañia = compañia;
        this.destino = destino;
        this.cantidad_boletos = cantidad_boletos;
        this.servicio = servicio;
    }

    public String getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCantidad_boletos() {
        return cantidad_boletos;
    }

    public void setCantidad_boletos(int cantidad_boletos) {
        this.cantidad_boletos = cantidad_boletos;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

}