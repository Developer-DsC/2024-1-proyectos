package Entidades;

import javax.print.attribute.standard.JobStateReason;
import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class ejercicio_3_Venta_Articulos {

    private int codigo_articulo;
    private String nombre_articulo;
    private int cantidad_vendida;
    private int cantidad_cajas;

    public ejercicio_3_Venta_Articulos() {
    }

    public int getCodigo_articulo() {
        return codigo_articulo;
    }

    public String getNombre_articulo() {
        return nombre_articulo;
    }

    public int getCantidad_vendida() {
        return cantidad_vendida;
    }

    public int getCantidad_cajas() {
        return cantidad_cajas;
    }

    public void setCodigo_articulo(int codigo_articulo) {
        this.codigo_articulo = codigo_articulo;
    }

    public void setNombre_articulo(String nombre_articulo) {
        this.nombre_articulo = nombre_articulo;
    }

    public void setCantidad_vendida(int cantidad_vendida) {
        this.cantidad_vendida = cantidad_vendida;
    }

    public void setCantidad_cajas(int cantidad_cajas) {
        this.cantidad_cajas = cantidad_cajas;
    }
    
    

    public ejercicio_3_Venta_Articulos(int codigo_articulo, String nombre_articulo, int cantidad_vendida) {
        this.codigo_articulo = codigo_articulo;
        this.nombre_articulo = nombre_articulo;
        this.cantidad_vendida = cantidad_vendida;
    }

    public double calcular() {
        double importe = 0;
        int cajas = 0;
        int entero = 0;
        double residuo = 0;

        if (codigo_articulo == 1) {
            importe = cantidad_vendida * 10;
            entero = (int) cantidad_vendida / 10;
            cantidad_cajas = entero;
        }

        if (codigo_articulo == 2) {
            entero = (int) cantidad_vendida / 10;
            residuo = (int) cantidad_vendida % 10;

            importe = residuo * 7 + entero * 65;
            cantidad_cajas = entero;
        }

        if (codigo_articulo == 3) {
            entero = (int) cantidad_vendida / 10;
            cantidad_cajas = entero;
            importe = cantidad_vendida * 3;
            System.out.println("Importe: " + importe);
            if (cantidad_vendida >= 10) {
                int auximporte = cantidad_vendida * 3;
                importe = cantidad_vendida * 3 - ((10 * auximporte) / 100);
                System.out.println("10% es: " + ((10 * auximporte) / 100));
            }
        }

        if (codigo_articulo == 4) {
            entero = (int) cantidad_vendida / 10;
            cantidad_cajas = entero;
            importe=cantidad_vendida*1;
        }
        return importe;
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, "Factura"
                + "\nNombre del producto: " + nombre_articulo
                + "\nCodigo seleccionado: " + codigo_articulo
                + "\nUnidades vendidas: " + cantidad_vendida
                + "\nTotal de cajas: " + cantidad_cajas
                + "\nEl total vendido es: $" + calcular());

    }

}
