package Controlador;

import Entidades.LO_Compañia_Electrica;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dalton
 */
public class TL_Compañia_Electrica {

    public static List<LO_Compañia_Electrica> Lista = new ArrayList<LO_Compañia_Electrica>();

    public static void Insert(LO_Compañia_Electrica op) {
        Lista.add(op);
    }

    public static void Delete(int pos) {
        Lista.remove(pos);
    }

    public static void Edit(LO_Compañia_Electrica op, int pos) {
        Lista.set(pos, op);
    }

    public static int Search(String nus) {

        int pos = -1;
        for (int i = 0; i < Lista.size(); i++) {
            if (Lista.get(i).getNumeroCliente().equals(nus)) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static LO_Compañia_Electrica getFactura(int pos) {
        return Lista.get(pos);
    }

    public static DefaultTableModel Visualizar() {
        String[] Columnas = {"Zona", "Numero de Cliente", "Consumo mes anterior", "Consumo mes actual", "Total a pagar"};
        String[] Datos = new String[5];
        DefaultTableModel dt = new DefaultTableModel(null, Columnas);

        for (int i = 0; i < Lista.size(); i++) {

            Datos[0] = String.valueOf(Lista.get(i).getZona());
            Datos[1] = Lista.get(i).getNumeroCliente();
            Datos[2] = String.valueOf(Lista.get(i).getMesAnt());
            Datos[3] = String.valueOf(Lista.get(i).getMesAct());
            Datos[4] = String.valueOf(Lista.get(i).Calcular());

            dt.addRow(Datos);
        }
        return dt;
    }

    public static void Zona() {
        int nz = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione una Zona"));
        double total = 0;
        int cantusu = 0;

        for (int i = 0; i < Lista.size(); i++) {
            if (Lista.get(i).getZona() == nz) {
                cantusu = cantusu + 1;
                total = total + Lista.get(i).Calcular();
            }
        }
        JOptionPane.showMessageDialog(null, "Zona: " + nz + "\n"
                + "Cantidad de Usuarios en la Zona: " + cantusu + "\n"
                + "Total recaudado en la Zona: " + total);
    }
}
