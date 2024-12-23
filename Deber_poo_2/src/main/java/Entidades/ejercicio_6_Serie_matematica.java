package Entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class ejercicio_6_Serie_matematica {

    private int n;

    public ejercicio_6_Serie_matematica() {
    }

    public ejercicio_6_Serie_matematica(int x) {
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
        for (double i = 1; i <= n; i++) {
            s = s + (Potencia(-1, i + 1)) * (1 / i);

        }
        return s;
    }
    
    public String Serie_Cadena() {
        String s = "";
        String signo = "";
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                signo = "-";
            }
            if (i % 2 == 1) {
                signo = "+";
            }

            if (i == n) {
                s = s + "1/" + (int) (Potencia(-1, i + 1)) * (1 / i);
                System.out.print(s);
            } else {
                s = s + "1/" + (int) (Potencia(-1, i + 1)) * (1 / i) + signo;
            }
        }
        return s;
    }

    public void Imprimir() {
        JOptionPane.showMessageDialog(null, "1-" + Serie_Cadena() + " = " + Serie_valor());
    }
}
