package Entidades;

/**
 *
 * @author Dalton
 */
public class LO_Mesas_Mozos {
    private int IDventa;
    private String nombre_mozo;
    private int numero_mesa;
    private double importe;
    private int cantidad;

    public LO_Mesas_Mozos() {
    }

    public LO_Mesas_Mozos(int IDventa, String nombre_mozo, int numero_mesa, double importe, int cantidad) {
        this.IDventa = IDventa;
        this.nombre_mozo = nombre_mozo;
        this.numero_mesa = numero_mesa;
        this.importe = importe;
        this.cantidad = cantidad;
    }

    public int getIDventa() {
        return IDventa;
    }

    public void setIDventa(int IDventa) {
        this.IDventa = IDventa;
    }

    public String getNombre_mozo() {
        return nombre_mozo;
    }

    public void setNombre_mozo(String nombre_mozo) {
        this.nombre_mozo = nombre_mozo;
    }

    public int getNumero_mesa() {
        return numero_mesa;
    }

    public void setNumero_mesa(int numero_mesa) {
        this.numero_mesa = numero_mesa;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}