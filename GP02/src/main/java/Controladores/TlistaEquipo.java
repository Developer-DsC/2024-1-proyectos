package Controladores;

import static Formularios.Main.integrantes;
import Entidades.Entrenador;
import Entidades.Futbolista;
import Entidades.Masajista;
import Entidades.SeleccionFutbol;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dalton
 */
public class TlistaEquipo {

    public static List<SeleccionFutbol> ListaSeleccion = new ArrayList<SeleccionFutbol>();

    public static void Insert(SeleccionFutbol op) {
        ListaSeleccion.add(op);
    }

    public static void Edit(SeleccionFutbol op, int pos) {
        ListaSeleccion.set(pos, op);
    }

    public static void Delete(int pos) {
        ListaSeleccion.remove(pos);
    }

    public static int Buscar(int ced) {
        for (int i = 0; i < ListaSeleccion.size(); i++) {
            if (ListaSeleccion.get(i).getId() == ced) {
                return i;
            }
        }
        return -1;
    }

    public static DefaultTableModel ImprimirListaFutbolista() {
        String[] Columnas = {"ID", "Nombre", "Apellido", "Edad", "Dorsal", "Posicion de juego"};
        String[] Datos = new String[6];
        DefaultTableModel dt = new DefaultTableModel(null, Columnas);
        for (int i = 0; i < ListaSeleccion.size(); i++) {
            if (ListaSeleccion.get(i) instanceof Futbolista) {
                Datos[0] = String.valueOf(ListaSeleccion.get(i).getId());
                Datos[1] = ListaSeleccion.get(i).getNombre();
                Datos[2] = ListaSeleccion.get(i).getApellidos();
                Datos[3] = String.valueOf(ListaSeleccion.get(i).getEdad());
                Datos[4] = String.valueOf(((Futbolista) ListaSeleccion.get(i)).getDorsal());
                Datos[5] = ((Futbolista) ListaSeleccion.get(i)).getDemarcacion();
                dt.addRow(Datos);
            }
        }
        return dt;
    }

    public static DefaultTableModel ImprimirListaEntrenador() {
        String[] Columnas = {"ID", "Nombre", "Apellido", "Edad", "ID Federacion"};
        String[] Datos = new String[5];
        DefaultTableModel dt = new DefaultTableModel(null, Columnas);
        for (int i = 0; i < ListaSeleccion.size(); i++) {
            if (ListaSeleccion.get(i) instanceof Entrenador) {
                Datos[0] = String.valueOf(ListaSeleccion.get(i).getId());
                Datos[1] = ListaSeleccion.get(i).getNombre();
                Datos[2] = ListaSeleccion.get(i).getApellidos();
                Datos[3] = String.valueOf(ListaSeleccion.get(i).getEdad());
                Datos[4] = String.valueOf(((Entrenador) ListaSeleccion.get(i)).getIdFederacion());
                dt.addRow(Datos);
            }
        }
        return dt;
    }

    public static DefaultTableModel ImprimirListaMasajista() {
        String[] Columnas = {"ID", "Nombre", "Apellido", "Edad", "Titulacion", "Años experiencia"};
        String[] Datos = new String[6];
        DefaultTableModel dt = new DefaultTableModel(null, Columnas);
        for (int i = 0; i < ListaSeleccion.size(); i++) {
            if (ListaSeleccion.get(i) instanceof Masajista) {
                Datos[0] = String.valueOf(ListaSeleccion.get(i).getId());
                Datos[1] = ListaSeleccion.get(i).getNombre();
                Datos[2] = ListaSeleccion.get(i).getApellidos();
                Datos[3] = String.valueOf(ListaSeleccion.get(i).getEdad());
                Datos[4] = ((Masajista) ListaSeleccion.get(i)).getTitulacion();
                Datos[5] = String.valueOf(((Masajista) ListaSeleccion.get(i)).getAniosExperiencia());
                dt.addRow(Datos);
            }
        }
        return dt;
    }

    public static SeleccionFutbol getSeleccionado(int pos) {
        return ListaSeleccion.get(pos);
    }

    public static void concentracion() {
        String res = "";
        for (SeleccionFutbol integrante : ListaSeleccion) {
            res += integrante.getNombre() + " " + integrante.getApellidos() + " -> " + integrante.concentrarse() + "\n";
        }
        JOptionPane.showMessageDialog(null, res);
    }

    public static void viaje() {
        String res = "";
        for (SeleccionFutbol integrante : ListaSeleccion) {
            res += integrante.getNombre() + " " + integrante.getApellidos() + " -> " + integrante.viajar() + "\n";
        }

        JOptionPane.showMessageDialog(null, res);
    }

    public static void entrenamiento() {
        String res = "";
        for (SeleccionFutbol integrante : ListaSeleccion) {
            res += integrante.getNombre() + " "
                    + integrante.getApellidos() + " -> " + integrante.entrenar() + "\n";
        }
        JOptionPane.showMessageDialog(null, res);
    }

    public static void partido() {
        String res = "";
        for (SeleccionFutbol integrante : ListaSeleccion) {
            res += integrante.getNombre() + " " + integrante.getApellidos() + " -> " + integrante.jugarPartido() + "\n";
        }
        JOptionPane.showMessageDialog(null, res);
    }

    public static void planificarPartido() {
        String res = "";
        for (SeleccionFutbol integrante : ListaSeleccion) {
            if (integrante instanceof Entrenador) {
                res += integrante.getNombre() + " " + integrante.getApellidos() + " -> " + ((Entrenador) integrante).planificarEntrenamiento() + "\n";
            }

        }
        JOptionPane.showMessageDialog(null, res);
    }

    public static void entrevista() {
        String res = "";
        for (SeleccionFutbol integrante : ListaSeleccion) {
            if (integrante instanceof Futbolista) {
                res += integrante.getNombre() + " " + integrante.getApellidos() + " -> " + ((Futbolista) integrante).entrevista() + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, res);
    }

    public static void masaje() {
        String res = "";
        for (SeleccionFutbol integrante : ListaSeleccion) {
            if (integrante instanceof Masajista) {
                res += integrante.getNombre() + " " + integrante.getApellidos() + " -> " + ((Masajista) integrante).darMasaje() + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, res);
    }

}
