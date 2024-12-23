package Controlador;

import Entidades.Empleado;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dalton
 */
public class TLista_Compañia {

    public static List<Empleado> ListaEmpleados = new ArrayList<Empleado>();

    public static void Insertar(Empleado op) {
        ListaEmpleados.add(op);
    }

    public static void Modificar(int pos, Empleado op) {
        ListaEmpleados.set(pos, op);
    }

    public static void Eliminar(int pos) {
        ListaEmpleados.remove(pos);
    }

    public static int Buscar(String ced) {
        int pos = -1;
        for (int i = 0; i < ListaEmpleados.size(); i++) {
            if (ListaEmpleados.get(i).getCedula().equals(ced)) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static DefaultTableModel MostrarTablaEmpleados() {
        String[] Columna = {"Codigo", "Cedula", "Nombre", "Apellido", "Fecha", "Estado", "Ciudad", "mes","Tipo", "SueldoCobrar"};
        String[] Datos = new String[10];
        DefaultTableModel dt = new DefaultTableModel(null, Columna);
        for (int i = 0; i < ListaEmpleados.size(); i++) {

            Datos[0] = ListaEmpleados.get(i).getCodigo();
            Datos[1] = ListaEmpleados.get(i).getCedula();
            Datos[2] = ListaEmpleados.get(i).getNombre();
            Datos[3] = ListaEmpleados.get(i).getApellido();
            Datos[4] = String.valueOf(ListaEmpleados.get(i).getFechaNaci());
            Datos[5] = ListaEmpleados.get(i).getEstado();
            Datos[6] = ListaEmpleados.get(i).getCiudad();
            Datos[7] = ListaEmpleados.get(i).getMes();
            Datos[8] = ListaEmpleados.get(i).getTipo();
            Datos[9] = String.valueOf(ListaEmpleados.get(i).CalcularPago());

            dt.addRow(Datos);
        }
        return dt;
    }

    public static Empleado getEmpleado(int pos) {
        return ListaEmpleados.get(pos);

    }

}
