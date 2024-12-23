package Controladores;

import Entidades.Empleado;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dalton
 */
public class TLista {

    public static List<Empleado> ListVB = new ArrayList<>();

    public static void Insertar(Empleado op) {
        ListVB.add(op);
    }

    public static void Modificar(Empleado op, int pos) {
        ListVB.set(pos, op);
    }

    public static void Eliminar(int pos) {
        ListVB.remove(pos);
    }

    public static int Buscar(int id) {
        int pos = -1;
        for (int i = 0; i < ListVB.size(); i++) {
            if (ListVB.get(i).getCodigo() == id) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static DefaultTableModel Visualizar() {
        String[] Titulo = {"Código", "Nombres", "Apellidos", "Sexo", "Día", "Cantidad de horas", "Cantidad de piezas", "Jornal"};
        String[] Datos = new String[9];
        DefaultTableModel registro = new DefaultTableModel(null, Titulo);
        for (int i = 0; i < ListVB.size(); i++) {
            Datos[0] = String.valueOf(ListVB.get(i).getCodigo());
            Datos[1] = ListVB.get(i).getNombre();
            Datos[2] = ListVB.get(i).getApellido();
            Datos[3] = ListVB.get(i).getSexo();
            Datos[4] = String.valueOf(ListVB.get(i).getDia());
            Datos[5] = String.valueOf(ListVB.get(i).getCant_horas());
            Datos[6] = String.valueOf(ListVB.get(i).getCant_pienzas_def());
            Datos[7] = String.valueOf(ListVB.get(i).getJornal());
            registro.addRow(Datos);
        }
        return registro;
    }
    
    
    public static double prom1 = 0, prom2 = 0, prom3 = 0;

    public static Empleado MenorCant() {

     double cant1 = 0, tot1 = 0, cant2 = 0, tot2 = 0, cant3 = 9999, tot3 = 0;

              Empleado PiezasDefectuosas = null;
    int minDefectuosas = Integer.MAX_VALUE;

    for (Empleado trabajador : ListVB) {
        if (trabajador.getCant_pienzas_def()< minDefectuosas && trabajador.getDia()<16) {
            PiezasDefectuosas = trabajador;
            minDefectuosas = trabajador.getCant_pienzas_def();
        }
    }
    return PiezasDefectuosas;
    }



    public static void TotalGanado() {
        double cant1 = 0, cant2 = 0, cant3 = 0;
        MenorCant();
        for (int i = 0; i < ListVB.size(); i++) {

            if (ListVB.get(i).getNombre().equals("Bruno")) {
                cant1 = cant1 + ListVB.get(i).getJornal();
                System.out.println(cant1);

            }

            if (ListVB.get(i).getNombre().equals("Noemi")) {
                cant2 = cant2 + ListVB.get(i).getJornal();
            }
            if (ListVB.get(i).getNombre().equals("Juan")) {
                cant3 = cant3 + ListVB.get(i).getJornal();

            }

        }
        System.out.println(prom1);
        if (prom1 < 5) {
            cant1 = cant1 + 100;
        }
        if (prom2 < 5) {
            cant3 = cant3 + 100;
        }
        if (prom3 < 5) {
            cant3 = cant3 + 100;
        }
        JOptionPane.showMessageDialog(null, "Total Ganado en el mes:"
                + "\nBruno: " + cant1
                + "\nNoemi: " + cant2
                + "\nJuan: " + cant3);
    }

    public static Empleado getEmpleado(int pos) {
        return ListVB.get(pos);
    }
}
