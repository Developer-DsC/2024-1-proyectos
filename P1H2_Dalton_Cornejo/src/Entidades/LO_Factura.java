package Entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class LO_Factura {

    private String NumeroFactura;
    private String Articulo;
    private double Cantidad;
    private double Precio;

    public LO_Factura(String Factura, String Articulo, double Cantidad, double Precio) {
        this.NumeroFactura = Factura;
        this.Articulo = Articulo;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
    }

    public String getFactura() {
        return NumeroFactura;
    }

    public void setFactura(String Factura) {
        this.NumeroFactura = Factura;
    }

    public String getArticulo() {
        return Articulo;
    }

    public void setArticulo(String Articulo) {
        this.Articulo = Articulo;
    }

    public double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(double Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public double Calcular() {
        return Cantidad * Precio;
    }

    public void Imprimir() {
        JOptionPane.showMessageDialog(null, "Factura N. : " + NumeroFactura + "\n"
                + "Numero del articulo: " + Articulo + "\n"
                + "Cantidad de Litros: " + Cantidad + "\n "
                + "Precio por litro: " + Precio + "\n"
                + "Total a pagar: " + Calcular()
        );
    }
}
