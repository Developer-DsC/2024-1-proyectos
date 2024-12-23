package Entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class Venta_alfajores {

    int alfajores;

    public Venta_alfajores(int cantidad) {
        this.alfajores = cantidad;
    }

    public void calcular() {
        double cant = alfajores;

        int entero = (int) cant / 12;
        int residuo = (int) cant % 12;

        double precio = entero * 5 + residuo * 0.5;

        JOptionPane.showMessageDialog(null, "El número de cajas vendidas es: " + entero
                + "\n El número de sueltos es: " + residuo
                + "\nEl precio total fue: $" + precio);

    }
}
