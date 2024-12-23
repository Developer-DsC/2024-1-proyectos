package Controladores;

import Entidades.Legislador;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class TLista {

    public static List<Legislador> ListaLegislador = new ArrayList<Legislador>();

    public static void Insert(Legislador op) {
        ListaLegislador.add(op);
    }

    public static void Update(int pos, Legislador op) {
        ListaLegislador.set(pos, op);
    }

    public static void Delete(int pos) {
        ListaLegislador.remove(pos);
    }

    public static int Buscar(int id) {
        int pos = -1;
        for (int i = 0; i < ListaLegislador.size(); i++) {
            if (ListaLegislador.get(i).getIdCodigo()== id) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static DefaultTableModel VisualizarLista() {
        String[] Columna = {"ID", "Cedula", "Nombre", "Apellido", "Fecha de nacimiento", "Estado", "Proyectos presentados", "Sueldo"};
        String[] Datos = new String[7];
        DefaultTableModel dt = new DefaultTableModel(null, Columna);
        for (int i = 0; i < ListaLegislador.size(); i++) {
            Datos[0] = String.valueOf(ListaLegislador.get(i).getIdCodigo());
            Datos[1] = ListaLegislador.get(i).getCedula();
            Datos[2] = String.valueOf(ListaLegislador.get(i).getNombre());
            Datos[3] = String.valueOf(ListaLegislador.get(i).getApellido());
            Datos[4] = String.valueOf(ListaLegislador.get(i).getFechaNacimiento());
            Datos[5] = String.valueOf(ListaLegislador.get(i).getEstado());
            Datos[6] = String.valueOf(ListaLegislador.get(i).CalcularSueldo());

            dt.addRow(Datos);
        }
        return dt;
    }

    public static Persona getLegislador(int pos) {
        return ListaLegislador.get(pos);
    }

}
