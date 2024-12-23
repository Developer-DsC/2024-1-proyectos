package Entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class Juegos {

    private String Nombre_cliente;
    private int tipo_juego;

    public Juegos() {
    }

    public Juegos(String Nombre_cliente, int tipo_juego) {
        this.Nombre_cliente = Nombre_cliente;
        this.tipo_juego = tipo_juego;
    }

    public String getNombre_cliente() {
        return Nombre_cliente;
    }

    public void setNombre_cliente(String Nombre_cliente) {
        this.Nombre_cliente = Nombre_cliente;
    }

    public int getTipo_juego() {
        return tipo_juego;
    }

    public void setTipo_juego(int tipo_juego) {
        this.tipo_juego = tipo_juego;
    }

    public void Calcular(int adul, int tercera, int niñ) {

        String nombre_juego = "";
        int cant_personas = adul + tercera + niñ;
        if (tipo_juego == 1) {
            double costo1 = 0;
            double costo2 = 0;
            double costo3 = 0;
            double total1 = 0;
            double total2 = 0;
            double total3 = 0;
            double descuento1 = 0;
            double descuento2 = 0;
            double descuento3 = 0;
            costo1 = 10 * adul;
            if (adul > 0) {
                descuento1 = costo1 * 0;
                total1 = costo1 - descuento1;

            }
            if (tercera > 0) {
                costo2 = 10 * tercera;
                descuento2 = costo2 * 0.50;
                total2 = costo2 - descuento2;
            }
            if (niñ > 0) {
                costo3 = 10 * niñ;
                descuento3 = costo3 * 0.30;
                total3 = costo3 - descuento3;

            }
            double totalsumado=total1+total2+total3;
            nombre_juego = "Montaña Rusa";

            JOptionPane.showMessageDialog(null, "             BOLETOS" + "\nAdultos: " + adul + "\nTercera Edad: " + tercera + "\nNiños: " + niñ);

            JOptionPane.showMessageDialog(null, "             BOLETOS"
                    + "\nTotal a pagar de Adultos: " + costo1
                    + "\nTotal a pagar de personas de la tercera edad: " + costo2
                    + "\nTotal a pagar de niños: " + costo3);
            JOptionPane.showMessageDialog(null, "             BOLETOS"
                    + "\nDescuento adultos: " + descuento1
                    + "\nDescuento Tercera edad: " + descuento2
                    + "\nDescuento Niños: " + descuento3
                    +"\nTOTAL DE PERSONAS ATENDIDAS:"+cant_personas);
            
            JOptionPane.showMessageDialog(null, "TOTAL SUMADO: "+totalsumado);
        }
        
        if (tipo_juego == 2) {
            double costo1 = 0;
            double costo2 = 0;
            double costo3 = 0;
            double total1 = 0;
            double total2 = 0;
            double total3 = 0;
            double descuento1 = 0;
            double descuento2 = 0;
            double descuento3 = 0;
            costo1 = 8 * adul;
            if (adul > 0) {
                descuento1 = costo1 * 0;
                total1 = costo1 - descuento1;

            }
            if (tercera > 0) {
                costo2 = 8 * tercera;
                descuento2 = costo2 * 0.50;
                total2 = costo2 - descuento2;
            }
            if (niñ > 0) {
                costo3 = 8 * niñ;
                descuento3 = costo3 * 0.30;
                total3 = costo3 - descuento3;

            }
            double totalsumado=total1+total2+total3;
            nombre_juego = "Chaos";

            JOptionPane.showMessageDialog(null, "             BOLETOS" + "\nAdultos: " + adul + "\nTercera Edad: " + tercera + "\nNiños: " + niñ);

            JOptionPane.showMessageDialog(null, "             BOLETOS"
                    + "\nTotal a pagar de Adultos: " + costo1
                    + "\nTotal a pagar de personas de la tercera edad: " + costo2
                    + "\nTotal a pagar de niños: " + costo3);
            JOptionPane.showMessageDialog(null, "             BOLETOS"
                    + "\nDescuento adultos: " + descuento1
                    + "\nDescuento Tercera edad: " + descuento2
                    + "\nDescuento Niños: " + descuento3
                    +"\nTOTAL DE PERSONAS ATENDIDAS:"+cant_personas);
            
            JOptionPane.showMessageDialog(null, "TOTAL SUMADO: "+totalsumado);
        }
        
        if (tipo_juego == 3) {
            double costo1 = 0;
            double costo2 = 0;
            double costo3 = 0;
            double total1 = 0;
            double total2 = 0;
            double total3 = 0;
            double descuento1 = 0;
            double descuento2 = 0;
            double descuento3 = 0;
            costo1 = 6 * adul;
            if (adul > 0) {
                descuento1 = costo1 * 0;
                total1 = costo1 - descuento1;

            }
            if (tercera > 0) {
                costo2 = 6 * tercera;
                descuento2 = costo2 * 0.50;
                total2 = costo2 - descuento2;
            }
            if (niñ > 0) {
                costo3 = 6 * niñ;
                descuento3 = costo3 * 0.30;
                total3 = costo3 - descuento3;

            }
            double totalsumado=total1+total2+total3;
            nombre_juego = "Montaña Rusa";

            JOptionPane.showMessageDialog(null, "             BOLETOS" + "\nAdultos: " + adul + "\nTercera Edad: " + tercera + "\nNiños: " + niñ);

            JOptionPane.showMessageDialog(null, "             BOLETOS"
                    + "\nTotal a pagar de Adultos: " + costo1
                    + "\nTotal a pagar de personas de la tercera edad: " + costo2
                    + "\nTotal a pagar de niños: " + costo3);
            JOptionPane.showMessageDialog(null, "             BOLETOS"
                    + "\nDescuento adultos: " + descuento1
                    + "\nDescuento Tercera edad: " + descuento2
                    + "\nDescuento Niños: " + descuento3
                    +"\nTOTAL DE PERSONAS ATENDIDAS:"+cant_personas);
            
            JOptionPane.showMessageDialog(null, "TOTAL SUMADO: "+totalsumado);
        }
    }
}