package Entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class ejercicio_5_propiedad_matematica {

    private int n;

    public int getN() {
        return n;
    }

    public ejercicio_5_propiedad_matematica() {
    }

    public void setN(int n) {
        this.n = n;
    }

    public ejercicio_5_propiedad_matematica(int n) {
        this.n = n;
    }

    public double SerieValor(int n) {
        double f = 0;
        double valor = 0;
        for (int i = 0; i <= n; i++) {
            valor = valor + (n + 1) / 2;
            f += f + n * Math.pow(valor, 2);
        }
        System.out.println(f);

        return f;
    }

    public String Serie_Cadena() {
        String s = "";
        for (int i = 1; i <= n; i++) {
            if (i == n) {
                s = s +"("+i+")"+ "^3";
            } else {
                s = s +"("+i+")" + "^3+";
            }
        }
        return s;
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null,
                "El resultado es: " + Serie_Cadena() + "=" + SerieValor(n));
    }
}
