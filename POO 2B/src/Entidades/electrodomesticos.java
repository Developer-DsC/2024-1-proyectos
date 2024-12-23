package Entidades;

import javax.swing.JOptionPane;

/**
 * @author Dalton
 * @version 1.0
 * @created 13-Jul.-2023 10:21:08
 */
public class electrodomesticos {

    private String color;
    private char consumo_energetico;
    private int peso;
    private double precio_base;

    public void electrodomesticos() {

    }

    public electrodomesticos(String color, char consumo_energetico, int peso, double precio_base) {
        this.color = color;
        this.consumo_energetico = consumo_energetico;
        this.peso = peso;
        this.precio_base = precio_base;
    }

    public String comprobarColor() {
        String auxcolor="";
    if (color.equals("")){
             auxcolor="Blanco";
         }
    return auxcolor;
    }

    public int comprobarConsumoEnergetico() {

        int consumo_precio = 0;
        if (consumo_energetico == 1) {
            consumo_precio = 100;
        }

        if (consumo_energetico == 2) {
            consumo_precio = 80;
        }
        if (consumo_energetico == 3) {
            consumo_precio = 60;
        }
        if (consumo_energetico == 4) {
            consumo_precio = 50;
        }
        return consumo_precio;
    }

    public int comprobarPeso() {
        int precio = 0;
        if (peso < 0 && peso > 20) {
            precio = 10;
        }

        if (peso >= 20 && peso < 50) {
            precio = 50;
        }

        if (peso >= 50 && peso < 80) {
            precio = 80;
        }

        if (peso >= 80) {
            precio = 100;
        }
        return precio;
    }
    
     public double precioFinal() {
        double total=0;
        total= precio_base+comprobarConsumoEnergetico()+comprobarPeso();
        return total;
    }

    public String getcolor() {
        return color;
    }

    public int getconsumo_energetico() {
        return consumo_energetico;
    }

    public double getpeso() {
        return peso;
    }

    public double getprecio_base() {
        return precio_base;
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, "Factura\n"+
                                                        "Precio base: "+precio_base+
                                                        "\nColor: "+color+
                                                        "\nConsumo elegido: " + consumo_energetico+
                                                        "\nPeso: "+peso+
                                                        "Precio final: "+precioFinal());
    }
    
    /**
     *
     * @param newVal
     */
    public void setcolor(String newVal) {
        color = newVal;
    }

    /**
     *
     * @param newVal
     */
    public void setconsumo_energetico(char newVal) {
        consumo_energetico = newVal;
    }

    /**
     *
     * @param newVal
     */
    public void setpeso(int newVal) {
        peso = newVal;
    }

    /**
     *
     * @param newVal
     */
    public void setprecio_base(double newVal) {
        precio_base = newVal;
    }

}
