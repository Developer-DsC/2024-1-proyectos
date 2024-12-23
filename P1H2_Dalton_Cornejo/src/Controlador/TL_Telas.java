package Controlador;

import Entidades.LO_Telas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dalton
 */
public class TL_Telas {

    public static List<LO_Telas> Lista = new ArrayList<LO_Telas>();

    public static void Insert(LO_Telas op) {
        Lista.add(op);
    }

    public static void Delete(int pos) {
        Lista.remove(pos);
    }

    public static void Edit(LO_Telas op, int pos) {
        Lista.set(pos, op);
    }

    public static int Search(String nump) {

        int pos = -1;
        for (int i = 0; i < Lista.size(); i++) {
            if (Lista.get(i).getNumeroPieza().equals(nump)) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static LO_Telas getTelas(int pos) {
        return Lista.get(pos);
    }

    public static DefaultTableModel Visualizar() {
        String[] Columnas = {"Numero de pieza", "Nombre de la Pieza", "Numero de Cliente", "Cantidad de piezas"};
        String[] Datos = new String[4];
        DefaultTableModel dt = new DefaultTableModel(null, Columnas);

        for (int i = 0; i < Lista.size(); i++) {

            Datos[0] = Lista.get(i).getNumeroPieza();
            Datos[1] = Lista.get(i).getNombrePieza();
            Datos[2] = Lista.get(i).getNumeroCliente();
            Datos[3] = String.valueOf(Lista.get(i).getCantidad());

            dt.addRow(Datos);
        }
        return dt;
    }

    public static void aInfo() {
        String nup = JOptionPane.showInputDialog(null, "Digite un Numero de Pieza");
        String nop = "";
        int nuc = 0;
        double canp = 0;

        for (int i = 0; i < Lista.size(); i++) {
            if (Lista.get(i).getNumeroPieza().equals(nup)) {
                nop = nop + Lista.get(i).getNombrePieza();
                nuc = nuc + 1;
                canp = canp + Lista.get(i).getCantidad();
            }
        }
        JOptionPane.showMessageDialog(null, "Numero de pieza: " + nup + "\n"
                + "Nombre de pieza: " + nop + "\n"
                + "Numero de clientes: " + nuc + "\n"
                + "Cantidad total de piezas vendidas: " + canp);
    }

    public static void b10Clientes() {
        String nup = JOptionPane.showInputDialog(null, "Digite un Numero de Pieza");
        double total = 0;

        for (int i = 0; i < Lista.size(); i++) {
            if (Lista.get(i).getNumeroPieza().equals(nup)) {
                total = total + 1;
            }
        }

        if (total > 10) {
            JOptionPane.showMessageDialog(null, "La pieza: " + nup + " Si se vendio para mas de 10 clientes");
        } else {
            JOptionPane.showMessageDialog(null, "La pieza: " + nup + " NO se vendio para mas de 10 clientes");

        }
    }
}
