package Controlador;

import Entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dalton
 */

public class TLista {

    public static List<Persona> Lista_persona = new ArrayList<Persona>();

    public static void añadir(Persona op) {
        Lista_persona.add(op);
    }

    public static void Editar(Persona op, int pos) {
        Lista_persona.set(pos, op);
    }

    public static void Eliminar(int pos) {
        Lista_persona.remove(pos);
    }

    public static int Buscar(String ced) {
        int pos = -1;
        for (int i = 0; i < Lista_persona.size(); i++) {
            if (Lista_persona.get(i).getCedula().equals(ced)) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static Persona getPersona(int pos) {

        return Lista_persona.get(pos);
    }

    public static DefaultTableModel Mostrar_tabla() {
        String[] Titulos = {"Cedula","Nombre","Apellidos","Edad"};
        String[] Datos = new String[4];
        DefaultTableModel dt = new DefaultTableModel(null, Titulos);
        for (int i = 0; i < Lista_persona.size(); i++) {
            Datos[0] = Lista_persona.get(i).getCedula();
            Datos[1] = Lista_persona.get(i).getNombre();
            Datos[2] = Lista_persona.get(i).getApellido(); 
            Datos[3] = String.valueOf(Lista_persona.get(i).getEdad());
            dt.addRow(Datos);
        }
        return dt;
    }

}
