package Entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class Aviones_boletos {

    private String nombre;
    private int destino;
    private int boletos_vendidos;

    public Aviones_boletos() {
    }

    public Aviones_boletos(String nom, int dest, int bol_v) {
        this.nombre = nom;
        this.destino = dest;
        this.boletos_vendidos = bol_v;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }

    public int getBoletos_vendidos() {
        return boletos_vendidos;
    }

    public void setBoletos_vendidos(int boletos_vendidos) {
        this.boletos_vendidos = boletos_vendidos;
    }

    public void Calcular(int dest, int adul, int tercera, int niñ) {
        double costo = 0;
        int consumo = 0;
        double total = 0;

        if (dest == 1) {
            System.out.println("if");
            costo = 200;
            consumo = 100;

            if ((adul > 0)) {
                total = costo - (0.40 * costo);
            }

            if (tercera > 0) {
                total = costo + costo - (costo * 0.40);

            }

            if (niñ > 0) {
                total = costo + costo - (costo * 0.50);
            }
        }

        if (dest == 2) {
            System.out.println("if");
            costo = 100;
            consumo = 50;

            if ((adul > 0)) {
                total = costo - (0.40 * costo);
            }

            if (tercera > 0) {
                total = costo + costo - (costo * 0.40);

            }

            if (niñ > 0) {
                total = costo + costo - (costo * 0.50);
            }
        }

        if (dest == 3) {
            System.out.println("if");
            costo = 80;
            consumo = 100;

            if ((adul > 0)) {
                total = costo - (0.40 * costo);
            }

            if (tercera > 0) {
                total = costo + costo - (costo * 0.40);

            }

            if (niñ > 0) {
                total = costo + costo - (costo * 0.50);
            }
        }

        JOptionPane.showMessageDialog(null, "Número de pesonas de la tercera edad: " + tercera
                + "\nNúmero de pesonas adultas: " + adul
                + "\nNúmero de niños: " + niñ
                + "\nEl consumo total es: " + consumo
                + "\nEl total a pagar es: " + total);

    }
}
