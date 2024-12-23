package Controlador;

import Entidades.LO_Ventas_Año;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dalton
 */
public class TL_Ventas_Año {

    public static List<LO_Ventas_Año> ListaVentas = new ArrayList<LO_Ventas_Año>();

    public static void Insert(LO_Ventas_Año op) {
        ListaVentas.add(op);
    }

    public static int Buscar(int id) {
        int pos = -1;
        for (int i = 0; i < ListaVentas.size(); i++) {
            if (ListaVentas.get(i).getId() == (id)) {
                pos = i;
                break;
            }
        }
        return pos;

    }

    public static LO_Ventas_Año getFactura(int pos) {
        return ListaVentas.get(pos);
    }

    public static DefaultTableModel VisualizarLista() {
        String[] Columna = {"Id", "Dia", "Mes", "Año", "Cantidad facturas", "importe"};
        String[] Datos = new String[5];
        DefaultTableModel dt = new DefaultTableModel(null, Columna);
        for (int i = 0; i < ListaVentas.size(); i++) {
            Datos[0] = String.valueOf(ListaVentas.get(i).getId());
            Datos[1] = String.valueOf(ListaVentas.get(i).getDia());
            Datos[2] = String.valueOf(ListaVentas.get(i).getMes());
            Datos[3] = String.valueOf(ListaVentas.get(i).getAño());
            Datos[4] = String.valueOf(ListaVentas.get(i).getCantFact());
            Datos[4] = String.valueOf(ListaVentas.get(i).getImporte());
            dt.addRow(Datos);
        }
        return dt;
    }

    //total en meses
    public static void LitA() {
        double acum1 = 0, acum2 = 0, acum3 = 0, acum4 = 0, acum5 = 0, acum6 = 0, acum7 = 0, acum8 = 0, acum9 = 0, acum10 = 0, acum11 = 0, acum12 = 0;
        for (int i = 0; i < ListaVentas.size(); i++) {
            if (ListaVentas.get(i).getMes() == 1) {
                acum1 = acum1 + ListaVentas.get(i).getImporte();
            }
            if (ListaVentas.get(i).getMes() == 2) {
                acum2 = acum2 + ListaVentas.get(i).getImporte();
            }
            if (ListaVentas.get(i).getMes() == 3) {
                acum3 = acum3 + ListaVentas.get(i).getImporte();
            }
            if (ListaVentas.get(i).getMes() == 4) {
                acum4 = acum4 + ListaVentas.get(i).getImporte();
            }
            if (ListaVentas.get(i).getMes() == 5) {
                acum5 = acum5 + ListaVentas.get(i).getImporte();
            }
            if (ListaVentas.get(i).getMes() == 6) {
                acum6 = acum6 + ListaVentas.get(i).getImporte();
            }
            if (ListaVentas.get(i).getMes() == 7) {
                acum7 = acum7 + ListaVentas.get(i).getImporte();
            }
            if (ListaVentas.get(i).getMes() == 8) {
                acum8 = acum8 + ListaVentas.get(i).getImporte();
            }
            if (ListaVentas.get(i).getMes() == 9) {
                acum9 = acum9 + ListaVentas.get(i).getImporte();
            }
            if (ListaVentas.get(i).getMes() == 10) {
                acum10 = acum10 + ListaVentas.get(i).getImporte();
            }
            if (ListaVentas.get(i).getMes() == 11) {
                acum11 = acum11 + ListaVentas.get(i).getImporte();
            }
            if (ListaVentas.get(i).getMes() == 12) {
                acum12 = acum12 + ListaVentas.get(i).getImporte();
            }
        }
        JOptionPane.showMessageDialog(null, "Tota de importe por cada mes"+"\n"+
                                             "Enero: " +acum1+"\n"+
                "Febrero: " +acum2+"\n"+
                "Marzo: " +acum3+"\n"+
                "Abril: " +acum4+"\n"+
                "Mayo: " +acum5+"\n"+
                "Junio: " +acum6+"\n"+
                "Julio: " +acum7+"\n"+
                "Agosto: " +acum8+"\n"+
                "Septiembre: " +acum9+"\n"+
                "Octbbre: " +acum10+"\n"+
                "Noviembre: " +acum11+"\n"+
                "Diciembre: " +acum12);
    }

    //Venta con mayor importe mes y dia que fue
    public static void LitB() {
        double aimport = 0, aid = 0;
        int adia = 0, ames = 0;
        for (int i = 0; i < ListaVentas.size(); i++) {
            if (ListaVentas.get(i).getImporte() > aimport);
            {
                aimport = ListaVentas.get(i).getImporte();
                adia = ListaVentas.get(i).getDia();
                ames = ListaVentas.get(i).getMes();
                aid = ListaVentas.get(i).getId();

            }
        }
        JOptionPane.showMessageDialog(null, "Venta con mayor importe mes y dia que fue:" + "\n"
                + "Id: " + aid + "\n"
                + "Dia: " + adia + "\n"
                + "Mes: " + ames);
    }

    //cantidad de dias en el año con facturas inferiores a 16
    public static void LitC() {
        int cont1=0;
        for (int i = 0; i < ListaVentas.size(); i++) {
            if(ListaVentas.get(i).getCantFact()<16)
            {
                cont1++;
            }
        }
        JOptionPane.showMessageDialog(null, "Cantidad de dias en el año con facturas inferiores a 16:"+"\n"+
                "Cant: " +cont1);
    }

    //total recaudado al año
    public static void LitD() {
        double total=0,acum1 = 0, acum2 = 0, acum3 = 0, acum4 = 0, acum5 = 0, acum6 = 0, acum7 = 0, acum8 = 0, acum9 = 0, acum10 = 0, acum11 = 0, acum12 = 0;
        for (int i = 0; i < ListaVentas.size(); i++) {
            if (ListaVentas.get(i).getMes() == 1) {
                acum1 = acum1 + ListaVentas.get(i).getImporte();
            }
            if (ListaVentas.get(i).getMes() == 2) {
                acum2 = acum2 + ListaVentas.get(i).getImporte();
            }
            if (ListaVentas.get(i).getMes() == 3) {
                acum3 = acum3 + ListaVentas.get(i).getImporte();
            }
            if (ListaVentas.get(i).getMes() == 4) {
                acum4 = acum4 + ListaVentas.get(i).getImporte();
            }
            if (ListaVentas.get(i).getMes() == 5) {
                acum5 = acum5 + ListaVentas.get(i).getImporte();
            }
            if (ListaVentas.get(i).getMes() == 6) {
                acum6 = acum6 + ListaVentas.get(i).getImporte();
            }
            if (ListaVentas.get(i).getMes() == 7) {
                acum7 = acum7 + ListaVentas.get(i).getImporte();
            }
            if (ListaVentas.get(i).getMes() == 8) {
                acum8 = acum8 + ListaVentas.get(i).getImporte();
            }
            if (ListaVentas.get(i).getMes() == 9) {
                acum9 = acum9 + ListaVentas.get(i).getImporte();
            }
            if (ListaVentas.get(i).getMes() == 10) {
                acum10 = acum10 + ListaVentas.get(i).getImporte();
            }
            if (ListaVentas.get(i).getMes() == 11) {
                acum11 = acum11 + ListaVentas.get(i).getImporte();
            }
            if (ListaVentas.get(i).getMes() == 12) {
                acum12 = acum12 + ListaVentas.get(i).getImporte();
            }
        }
        total=acum1+acum2+acum3+acum4+acum5+acum6+acum7+acum8+acum9+acum10+acum11+acum12;
        JOptionPane.showMessageDialog(null, "La cantidad total del año fue:"+"\n"+
                                            "Cant Año: " +total );
    }

}
