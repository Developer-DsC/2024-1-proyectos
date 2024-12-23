package Entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class alfajores {

    public int Goloso;
    public int sabroso;
    public int apetitoso;

    public alfajores() {
    }

    public alfajores(int go, int sa, int ap) {
        this.Goloso = go;
        this.sabroso = sa;
        this.apetitoso = ap;
    }

    public void Calcular() {
        double total = Goloso + sabroso + apetitoso;
        double pg = (Goloso * 100) / total;
        double ps = (sabroso * 100) / total;
        double pa = (apetitoso * 100) / total;
        JOptionPane.showMessageDialog(null, "Procentaje de Goloso :" + pg
                                                       + "\nPorcentaje de Sabroso: " + ps
                                                        + "\nPorcentaje de Apetitoso: " + pa);
        
    }
}
