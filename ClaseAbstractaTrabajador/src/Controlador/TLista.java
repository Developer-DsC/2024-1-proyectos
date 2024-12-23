package Controlador;

import Entidades.Trabajador;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dalton
 */
public class TLista {

    public static List<Trabajador> Lista = new ArrayList<Trabajador>();

    public static void Insertar(Trabajador ot) {
        Lista.add(ot);
    }

    public static void Modificar(int pos, Trabajador ot) {
        Lista.set(pos, ot);
    }

    public void Eliminar(int pos) {
        Lista.remove(pos);
    }

    public static int Buscar(String ced) {
        int pos = -1;
        for (int i = 0; i < Lista.size(); i++) {
            if (Lista.get(i).getCedula().equals(ced)) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static Trabajador getTrabajador(int pos) {
        return Lista.get(pos);
    }

    public static DefaultTableModel Mostrar() {
        String[] Columnas = {"Cedula", "Nombre", "Apellido", "Sexo", "Estado", "Tipo", "Sueldo"};
        String[] Datos = new String[7];
        DefaultTableModel dt = new DefaultTableModel(null, Columnas);

        for (int i = 0; i < Lista.size(); i++) {

            Datos[0] = String.valueOf(Lista.get(i).getCedula());
            Datos[1] = String.valueOf(Lista.get(i).getNombres());
            Datos[2] = String.valueOf(Lista.get(i).getApellidos());
            Datos[3] = String.valueOf(Lista.get(i).getSexo());
            Datos[4] = String.valueOf(Lista.get(i).getEstado());
            Datos[5] = String.valueOf(Lista.get(i).getTipo());
            Datos[6] = String.valueOf(Lista.get(i).Calcular());
            
            dt.addRow(Datos);
            
        }
        return dt;
    }
}
