/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.Encomiendas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabriel
 */
public class Tlista {
    
    public static List<Encomiendas> Lista = new ArrayList<Encomiendas>();

    public static void Insert(Encomiendas op) {
        Lista.add(op);
    }

    public static void Edit(Encomiendas op, int pos) {
        Lista.set(pos, op);
    }

    public static void Delete(int pos) {
        Lista.remove(pos);
    }

    public static int Search(int id) {
        int pos = -1;
        for (int i = 0; i < Lista.size(); i++) {
            if (Lista.get(i).getIdCamion()== id) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static Encomiendas getEncomiendas(int pos) {
        return Lista.get(pos);
    }

    public static DefaultTableModel MostrarTabla() {
        String[] Columnas = {"Codigo", "Nombres", "Apellidos", "Sexo", "Dia", "Horas Trabajadas", "Piezas defectuosas", "Jornal Abonado"};
        String[] Datos = new String[8];
        DefaultTableModel dt = new DefaultTableModel(null, Columnas);

        for (int i = 0; i < Lista.size(); i++) {
            Datos[0] = Lista.get(i).getId();
            Datos[1] = Lista.get(i).getNombre();
            Datos[2] = Lista.get(i).getApellido();
            Datos[3] = String.valueOf(Lista.get(i).getSexo());
            Datos[4] = String.valueOf(Lista.get(i).getDia());
            Datos[5] = String.valueOf(Lista.get(i).getCantidadhoras());
            Datos[6] = String.valueOf(Lista.get(i).getCanidaddefect());
            Datos[7] = String.valueOf(Lista.get(i).getAbonado());
            dt.addRow(Datos);
        }
        return dt;
    }
}
