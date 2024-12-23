package Controlador;

import Entidades.Trabajador;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class TLista {

    public static List<Trabajador> ListaTrabajadores = new ArrayList<Trabajador>();

    public static void Insertar(Trabajador op) {
        ListaTrabajadores.add(op);
    }

    public static void Modificar(int pos, Trabajador op) {
        ListaTrabajadores.set(pos, op);
    }

    public static void Eliminar(int pos) {
        ListaTrabajadores.remove(pos);
    }

    public static int Buscar(String ced) {
        int pos = -1;
        for (int i = 0; i < ListaTrabajadores.size(); i++) {
            if (ListaTrabajadores.get(i).getCedula().equals(ced)) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static DefaultTableModel MostrarTablaTrabajadores() {
        String[] Columna = {"Cedula", "Nombre", "Apellido", "Sexo", "Estado", "Tipo", "Fecha", "SueldoCobrar"};
        String[] Datos = new String[8];
        DefaultTableModel dt = new DefaultTableModel(null, Columna);
        for (int i = 0; i < ListaTrabajadores.size(); i++) {

            Datos[0] = ListaTrabajadores.get(i).getCedula();
            Datos[1] = ListaTrabajadores.get(i).getNombre();
            Datos[2] = ListaTrabajadores.get(i).getApellido();
            Datos[3] = ListaTrabajadores.get(i).getSexo();
            Datos[4] = ListaTrabajadores.get(i).getEstado();
            Datos[5] = ListaTrabajadores.get(i).getTipo();
            Datos[6] = ListaTrabajadores.get(i).getFechaNaci();
            Datos[7] = String.valueOf(ListaTrabajadores.get(i).CalcularPago());

            dt.addRow(Datos);
        }
        return dt;
    }

    public static Trabajador getTrabajador(int pos) {
        return ListaTrabajadores.get(pos);

    }

}
