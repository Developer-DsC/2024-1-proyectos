package Controlador;

import Entidades.LO_Factura;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dalton
 */
public class TL_Factura {

    public static List<LO_Factura> Lista = new ArrayList<LO_Factura>();

    public static void Insert(LO_Factura op) {
        Lista.add(op);
    }

    public static void Delete(int pos) {
        Lista.remove(pos);
    }

    public static void Edit(LO_Factura op, int pos) {
        Lista.set(pos, op);
    }

    public static int Search(String fac) {

        int pos = -1;
        for (int i = 0; i < Lista.size(); i++) {
            if (Lista.get(i).getFactura().equals(fac)) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static LO_Factura getFactura(int pos) {
        return Lista.get(pos);
    }

    public static DefaultTableModel Visualizar() {
        String[] Columnas = {"Numero de Factura", "Numero de Articulo", "Cantidad de litros", "Precio por litro", "Total a Pagar"};
        String[] Datos = new String[5];
        DefaultTableModel dt = new DefaultTableModel(null, Columnas);

        for (int i = 0; i < Lista.size(); i++) {

            Datos[0] = Lista.get(i).getFactura();
            Datos[1] = Lista.get(i).getArticulo();
            Datos[2] = String.valueOf(Lista.get(i).getCantidad());
            Datos[3] = String.valueOf(Lista.get(i).getPrecio());
            Datos[4] = String.valueOf(Lista.get(i).Calcular());

            dt.addRow(Datos);
        }
        return dt;
    }

    public static double Total() {
        double total = 0;
        for (int i = 0; i < Lista.size(); i++) {
            total = total + Lista.get(i).Calcular();
        }
        return total;
    }

    public static double Articulo1() {
        double cont = 0;
        for (int i = 0; i < Lista.size(); i++) {
            if (Lista.get(i).getArticulo().equals("1")) {
                cont = cont + Lista.get(i).getCantidad();
            }
        }
        return cont;
    }

    public static int Facturas300() {
        int F300 = 0;
        for (int i = 0; i < Lista.size(); i++) {
            if (Lista.get(i).Calcular() > 300) {
                F300 = F300 + 1;
            }
        }
        return F300;
    }
}
