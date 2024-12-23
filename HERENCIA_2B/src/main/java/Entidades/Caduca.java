package Entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class Caduca extends Productos {

    private int dias_caduca;
    int cantidad_productoss = getCantidad_productos();
    double pprecio = getPrecio();

    public Caduca() {
    }

    public Caduca(int dias_caduca, String nombre, double precio, int cantidad_productos) {
        super(nombre, precio, cantidad_productos);
        this.dias_caduca = dias_caduca;
    }

    public int getDias_caduca() {
        return dias_caduca;
    }

    public void setDias_caduca(int dias_caduca) {
        this.dias_caduca = dias_caduca;
    }

    public double Calcular(int cantidad_produtos) {
        double total = pprecio * cantidad_productoss;
        double total2 = 0;

        if (dias_caduca == 1) {
            total2 = total / 4;
        }

        if (dias_caduca == 2) {
            total2 = total / 3;
        }

        if (dias_caduca == 3) {
            total2 = total / 2;
        }
        return total2;
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, (toStringProductos()
                + "\nDías para caducar: " + dias_caduca
                + "\nTipo: Caducadero "
                + "\nTotal: " + Calcular(cantidad_productoss)));
    }
}
