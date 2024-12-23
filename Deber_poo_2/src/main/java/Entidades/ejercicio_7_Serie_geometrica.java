package Entidades;

import javax.swing.JOptionPane;

/**
 * @author Dalton
 * @version 1.0
 * @created 11-Jul.-2023 11:02:09
 */
public class ejercicio_7_Serie_geometrica {

    private int n;
    public int getn() {
        return n;
    }

    public ejercicio_7_Serie_geometrica() {
    }

    public  ejercicio_7_Serie_geometrica(int x) {
        this.n = x;
    }

    public double Potencia(double x, double y) {
        double f = 1;
        for (int i = 1; i <= y; i++) {
            f = f * x;
        }
        return f;
    }

    public double Serie_valor() {
        double s = 0;
        for (int i = 0; i <= n; i++) {
            s = s + (1 / Potencia(2, i));
            System.out.print(s);
        }
        return s;
    }

    public String Serie_Cadena() {
        String s = "";

        for (int i = 0; i <= n; i++) {
            if (i == n) {
                s = s + ("1/" + (int) Potencia(2, i));
                System.out.print(s);
            } else {
                s = s + ("1/" + (int) Potencia(2, i)) + " + ";
                System.out.print(s + "2");
            }
        }
        return s;
    }

    public void Imprimir() {
        JOptionPane.showMessageDialog(null, Serie_Cadena() + " = "+Serie_valor());
    }

}
