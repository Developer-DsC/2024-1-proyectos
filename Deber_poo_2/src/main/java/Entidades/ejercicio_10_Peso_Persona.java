package Entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class ejercicio_10_Peso_Persona {

    private double estatura;
    private double peso;
    public int edad;

    public ejercicio_10_Peso_Persona() {
    }

    public ejercicio_10_Peso_Persona(double estatura, double peso, int edad) {
        this.estatura = estatura;
        this.peso = peso;
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void calcular() {
        double x;
        x = estatura - peso;
        if (edad <= 0 || peso <= 0 || estatura <= 0) {
            JOptionPane.showMessageDialog(null, "Ingrese una edad valida");
        } else {
            if (edad >= 1 && edad <= 20) {

                if (x < 1.10 && x > 0.90) {
                    JOptionPane.showMessageDialog(null, "Peso normal");
                } else if (x > 1.10) {
                    JOptionPane.showMessageDialog(null, "Peso normal");
                } else if (x < 0.90) {
                    JOptionPane.showMessageDialog(null, "Peso normal");
                }

            } else if (edad > 20 && edad <= 30) {

                if (x < 1.15 && x > 0.85) {
                    JOptionPane.showMessageDialog(null, "Peso normal");
                } else if (x > 1.15) {
                    JOptionPane.showMessageDialog(null, "Peso normal");
                } else if (x < 0.85) {
                    JOptionPane.showMessageDialog(null, "Peso normal");
                }

            } else if (edad > 30 && edad <= 40) {

                if (x < 1.10 && x > 0.80) {
                    JOptionPane.showMessageDialog(null, "Peso normal");
                } else if (x > 1.10) {
                    JOptionPane.showMessageDialog(null, "Peso normal");
                } else if (x < 0.80) {
                    JOptionPane.showMessageDialog(null, "Peso normal");
                }

            } else if (edad > 40) {

                if (x < 1.10 && x > 0.75) {
                    JOptionPane.showMessageDialog(null, "Peso normal");
                } else if (x > 1.10) {
                    JOptionPane.showMessageDialog(null, "Peso normal");
                } else if (x < 0.75) {
                    JOptionPane.showMessageDialog(null, "Peso normal");
                }

            }
        }

    }
}
