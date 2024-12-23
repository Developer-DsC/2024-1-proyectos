/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.Factura;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Tlista {

    public static List<Factura> ListaVentas = new ArrayList<Factura>();

    public static void Insert(Factura op) {
        ListaVentas.add(op);
    }

    public static int Buscar(String Ubi) {
        int pos = -1;
        for (int i = 0; i < ListaVentas.size(); i++) {
            if (ListaVentas.get(i).getNumFact().equals(Ubi)) {
                pos = i;
                break;
            }
        }
        return pos;

    }

    public static Factura getFactura(int pos) {
        return ListaVentas.get(pos);
    }

    public static DefaultTableModel VisualizarLista() {
        String[] Columna = {"Numero de Factura", "Número de Articulo ", "Cantidad en litros ", "Precio Unitario","Total"};
        String[] Datos = new String[5];
        DefaultTableModel dt = new DefaultTableModel(null, Columna);
        for (int i = 0; i < ListaVentas.size(); i++) {
            Datos[0] = ListaVentas.get(i).getNumFact();
            Datos[1] = String.valueOf(ListaVentas.get(i).getNumArt());
            Datos[2] = String.valueOf(ListaVentas.get(i).getCant());
            Datos[3] = String.valueOf(ListaVentas.get(i).getPreUnit());
            Datos[4] = String.valueOf(ListaVentas.get(i).getPreUnit()*ListaVentas.get(i).getCant());
            dt.addRow(Datos);
        }
        return dt;
    }

    public static void TotalFacturado() {
        int pos = -1;
        double total = 0;
        for (int i = 0; i < ListaVentas.size(); i++) {
            total += ListaVentas.get(i).getCant() * ListaVentas.get(i).getPreUnit();

        }
        JOptionPane.showMessageDialog(null, "Total Facturado es: " + total);
    }

    public static void LitrosArticulo1() {
        int c = 0;
        for (int i = 0; i < ListaVentas.size(); i++) {
            if (ListaVentas.get(i).getNumArt().equals("1")) {
                c += ListaVentas.get(i).getCant();
            }
        }
        JOptionPane.showMessageDialog(null, "La cantidad de litros en el artículo 1 es: " + c);

    }

    public static void FacturasMas300() {
        int c = 0;
        for (int i = 0; i < ListaVentas.size(); i++) {
            if (ListaVentas.get(i).TotFact() > 300.0) {
                c++;
            }
        }
        JOptionPane.showMessageDialog(null, "Cantidad de Facturas de mayres a $300: " + c);

    }

}
