/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.EmpleadoFijo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabriel
 */
public class Tlistafijo {

    public static List<EmpleadoFijo> ListaFijo = new ArrayList<EmpleadoFijo>();

    public static void Insert(EmpleadoFijo of) {
        ListaFijo.add(of);
    }

    public static void Update(int pos, EmpleadoFijo of) {
        ListaFijo.set(pos, of);
    }

    public static void Remove(int pos) {
        ListaFijo.remove(pos);
    }

    public static int Search(String ced) {
        int pos = -1;
        for (int i = 0; i < ListaFijo.size(); i++) {
            if (ListaFijo.get(i).equals(pos)) {
                 pos = i;
                break; 
            }
        }
        return pos;
    }

    public static EmpleadoFijo getEmpleadoFijo(int pos) {
        return ListaFijo.get(pos);
    }
    
    
    public static DefaultTableModel MostrarTabla() {
        String[] Columnas = {"Cedula", "Nombre", "Apellido", "Sexo", "Fecha", "Estado", "SueldoBase", "Comisiones", "Sueldo"};
        String[] Datos = new String[8];
        DefaultTableModel dt = new DefaultTableModel(null, Columnas);

        for (int i = 0; i < ListaFijo.size(); i++) {

            Datos[0] = String.valueOf(ListaFijo.get(i).getCedula());
            Datos[1] = ListaFijo.get(i).getNombre();
            Datos[2] = ListaFijo.get(i).getApellido();
            Datos[3] = String.valueOf(ListaFijo.get(i).getSexo());
            Datos[4] = String.valueOf(ListaFijo.get(i).getFechaNaci());
            Datos[5] = ListaFijo.get(i).getEstado();
            Datos[6] = String.valueOf(ListaFijo.get(i).getSueldoBase());
            Datos[7] = String.valueOf(ListaFijo.get(i).getComiones());
            Datos[8] = String.valueOf(ListaFijo.get(i).CalcularSueldo());

            dt.addRow(Datos);
        }
        return dt;
    }
}
