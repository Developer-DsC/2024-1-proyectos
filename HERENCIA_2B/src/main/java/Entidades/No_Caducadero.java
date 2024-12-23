package Entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class No_Caducadero extends Productos {

    private String tipo;
    int cantidad_productoss = getCantidad_productos();

    public No_Caducadero() {
    }

    public No_Caducadero(String tipo, String nombre, double precio, int cantidad_productos) {
        super(nombre, precio, cantidad_productos);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double Calcular(int cantidad_productos) {
        double total = getPrecio() * cantidad_productos;
        return total;
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, (toStringProductos()
                + "\nTipo: No caducadero"
                + "\nTotal: " + Calcular(cantidad_productoss)));
    }
}
