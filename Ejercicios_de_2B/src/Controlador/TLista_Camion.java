package Controlador;

import Entidades.Camiones;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dalton
 */
public class TLista_Camion {
    
    public static List<Camiones> ListaCamiones = new ArrayList<Camiones>();
    
    public static void Insert(Camiones op) {
        ListaCamiones.add(op);
    }

    public static void Edit(Camiones op, int pos) {
        ListaCamiones.set(pos, op);
    }

    public static void Delete(int pos) {
        ListaCamiones.remove(pos);
    }

    public static int Buscar(int id) {
        for (int i = 0; i < ListaCamiones.size(); i++) {
            if (ListaCamiones.get(i).getIdCamion()== id) {
                return i;
            }
        }
        return -1;
    }
    
    public static DefaultTableModel MostrarTabla() {
        String[] Columnas = {"ID", "Camion","Ecomiendas","Peso"};
        String[] Datos = new String[4];
        DefaultTableModel dt = new DefaultTableModel(null, Columnas);
        for (int i = 0; i < ListaCamiones.size(); i++) {
            if (ListaCamiones.get(i) instanceof Camiones) {
                Datos[0] = String.valueOf(ListaCamiones.get(i).getIdCamion());
                Datos[1] = ListaCamiones.get(i).getCamion();
                Datos[2] = String.valueOf(ListaCamiones.get(i).getEcomienda());
                Datos[3] = String.valueOf(ListaCamiones.get(i).getPesos());
                
                dt.addRow(Datos);
            }
        }
        return dt;
    }

}
