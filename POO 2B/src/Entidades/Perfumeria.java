package Entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class Perfumeria {
    public String cliente;
    public double subtotal;
    public double total;
    public double dsc;

    public void importe() {
    }

    public Perfumeria() {
    }

    public Perfumeria(String cliente, double subtotal, double total,double dsc) {
        this.cliente = cliente;
        this.subtotal = subtotal;
        this.total = total;
        this.dsc = dsc;
    }

    public double calcular() {
        if (subtotal < 100) {
            dsc = subtotal * 0.5;
        }
        if (subtotal >= 100 && subtotal <= 500) {
            dsc = subtotal * 0.10;
        }
        if (subtotal > 500) {
            dsc = subtotal * 0.15;
        }
        total = subtotal - dsc;
        return total;
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, "Cliente: " + cliente
                + "\nSubtotal: $" + subtotal
                + "\nDescuento: $" + dsc
                + "\nTotal: $" + calcular());
    }

}
