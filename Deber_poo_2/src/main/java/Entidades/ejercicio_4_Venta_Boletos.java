package Entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class ejercicio_4_Venta_Boletos {

    protected String compañia;
    protected String destino;
    protected int cantidad_boletos;
    protected String servicio;

    public ejercicio_4_Venta_Boletos() {

    }

    public String getCompañia() {
        return compañia;
    }

    public String getDestino() {
        return destino;
    }

    public int getCantidad_boletos() {
        return cantidad_boletos;
    }

    public String getServicio() {
        return servicio;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setCantidad_boletos(int cantidad_boletos) {
        this.cantidad_boletos = cantidad_boletos;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
    
    

    public ejercicio_4_Venta_Boletos(String compañia, String destino, int cantidad_boletos, String servicio) {
        this.compañia = compañia;
        this.destino = destino;
        this.cantidad_boletos = cantidad_boletos;
        this.servicio = servicio;
    }

    public void calcular() {
        double st = 0;
        double descuento = 0;

        if (compañia.equals("Rutas Orenses")) {
            System.out.println("Compiló if Rutas Orenses");

            if (destino.equals("Quito")) {
                st = 20 * cantidad_boletos;
                System.out.println("\nCompiló if Quito =" + st);
            }
            if (destino.equals("Cuenca")) {
                st = 15 * cantidad_boletos;
                System.out.println("\nCompiló if Cuenca " + st);
            }
            if (destino.equals("Guayaquil")) {
                st = 30 * cantidad_boletos;
                System.out.println("\nCompiló if Guayaquiil " + st);
            }
        }

        if (compañia.equals("Cifa")) {
            if (destino.equals("Quito")) {
                st = 22 * cantidad_boletos;
            }
            if (destino.equals("Cuenca")) {
                st = 16.50 * cantidad_boletos;
            }
            if (destino.equals("Guayaquil")) {
                st = 33 * cantidad_boletos;
            }
        }

        if (compañia.equals("Calderon")) {
            if (destino.equals("Quito")) {
                st = 24 * cantidad_boletos;
            }
            if (destino.equals("Cuenca")) {
                st = 18 * cantidad_boletos;
            }
            if (destino.equals("Guayaquil")) {
                st = 36 * cantidad_boletos;
            }
        }

        if (cantidad_boletos >= 5) {
            descuento = st * 0.15;

            st = st - descuento;
        }

        if (servicio.equals("Diferencial")) {
            st = st + (st * 0.20);
        }

        JOptionPane.showMessageDialog(null, "Cooperativa: " + compañia
                + "\nDestino: " + destino
                + "\nCantidad de boletos: " + cantidad_boletos
                + "\nTipo de tipo de boleto: " + servicio
                + "\nTotal: " + st
                + "\nDescuento aplicado: " + descuento);
    }
}
