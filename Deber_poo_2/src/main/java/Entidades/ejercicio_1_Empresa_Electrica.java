package Entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class ejercicio_1_Empresa_Electrica {

    private String cliente;
    private double kw;

    public ejercicio_1_Empresa_Electrica() {
    }

    public String getCliente() {
        return cliente;
    }

    public double getKw() {
        return kw;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setKw(double kw) {
        this.kw = kw;
    }

    public ejercicio_1_Empresa_Electrica(String cliente, double kw) {
        this.cliente = cliente;
        this.kw = kw;
    }

    public double calcular() {
        
        double consumo_total = 0;

        if (kw <= 100) {
            consumo_total = kw * 0.10;
            System.out.print("\nCompiló primer if");
        }

        if (kw > 100 && kw <= 200) {
            consumo_total = 100 * 0.10 + (kw - 100) * 0.12;
            System.out.print("\nCompiló segundo if");

        }

        if (kw > 200) {
            consumo_total = 100 * 0.10 + 100 * 0.12 + (kw - 200) * 0.15;
            System.out.print("\nCompiló tercer if");

        }
        return consumo_total;
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, "            FACTURA"
                + "\nCliente: " + this.cliente
                + "\nCosumo: " + this.kw + " Kw"
                + "\nTotal a pagar: $" + calcular());
    }

}
