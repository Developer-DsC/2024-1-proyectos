/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.EmpleadoJornalero;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabriel
 */
public class Tlistajornalero {
     public static List<EmpleadoJornalero> ListaJornalero = new ArrayList<EmpleadoJornalero>();

    public static void Insert(EmpleadoJornalero of) {
        ListaJornalero.add(of);
    }

    public static void Update(int pos, EmpleadoJornalero of) {
        ListaJornalero.set(pos, of);
    }

    public static void Remove(int pos) {
        ListaJornalero.remove(pos);
    }

    public static int Search(String ced) {
        int pos = -1;
        for (int i = 0; i < ListaJornalero.size(); i++) {
            if (ListaJornalero.get(i).equals(pos)) {
                 pos = i;
                break; 
            }
        }
        return pos;
    }

    public static EmpleadoJornalero getEmpleadoJornalero(int pos) {
        return ListaJornalero.get(pos);
    }

    public static DefaultTableModel MostrarTabla() {
        String[] Columnas = {"Cedula", "Nombre", "Apellido", "Sexo", "Fecha", "Estado", "Horas", "Tarifa", "Sueldo"};
        String[] Datos = new String[8];
        DefaultTableModel dt = new DefaultTableModel(null, Columnas);

        for (int i = 0; i < ListaJornalero.size(); i++) {

            Datos[0] = String.valueOf(ListaJornalero.get(i).getCedula());
            Datos[1] = ListaJornalero.get(i).getNombre();
            Datos[2] = ListaJornalero.get(i).getApellido();
            Datos[3] = String.valueOf(ListaJornalero.get(i).getSexo());
            Datos[4] = String.valueOf(ListaJornalero.get(i).getFechaNaci());
            Datos[5] = ListaJornalero.get(i).getEstado();
            Datos[6] = String.valueOf(ListaJornalero.get(i).getHoras());
            Datos[7] = String.valueOf(ListaJornalero.get(i).getTarifa());
            Datos[8] = String.valueOf(ListaJornalero.get(i).CalcularSueldo());

            dt.addRow(Datos);
        }
        return dt;
    }
}
