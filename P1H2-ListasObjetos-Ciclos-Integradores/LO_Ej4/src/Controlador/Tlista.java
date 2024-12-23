/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidad.Compañia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Tlista {
    
    public static List<Compañia> ListaElectricidad = new ArrayList<Compañia>();
    
    
    public static void Insert(Compañia op) {
        ListaElectricidad.add(op);
    }
    
     public static int Buscar(String zona) {
        int pos = -1;
        for (int i = 0; i < ListaElectricidad.size(); i++) 
        {
            if (ListaElectricidad.get(i).getZona().equals(zona)) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static Compañia getElectricidad(int pos) 
    {
        return ListaElectricidad.get(pos);
    }

    public static DefaultTableModel VisualizarLista() 
    {
        String[] Columna = {"Zona", "Número de Cliente", "C. Mes Anterior", "C. Mes Actual", "Total"};
        String[] Datos = new String[5];
        DefaultTableModel dt = new DefaultTableModel(null, Columna);
        for (int i = 0; i < ListaElectricidad.size(); i++) {
            Datos[0] = ListaElectricidad.get(i).getZona();
            Datos[1] = String.valueOf(ListaElectricidad.get(i).getNumeroCliente());
            Datos[2] = String.valueOf(ListaElectricidad.get(i).getMesAnterior());
            Datos[3] = String.valueOf(ListaElectricidad.get(i).getMesActual());
            Datos[4] = String.valueOf(ListaElectricidad.get(i).Total());
            dt.addRow(Datos);
        }
        return dt;
    }

    public static int CantidadUsuarios(String num) 
    {
        int cant = 0;
        for (int i = 0; i < ListaElectricidad.size(); i++) {
            if (ListaElectricidad.get(i).getZona().equals(num)) {
                cant++;
            }

        }

        return cant;

    }

    public static double CantidadTotal(String num) 
    {
        double total = 0;
        for (int i = 0; i < ListaElectricidad.size(); i++) {
            if (ListaElectricidad.get(i).getZona().equals(num)) {
                total = total + ListaElectricidad.get(i).Total();
            }
        }
        return total;

    }

    public static void ImprimirZona(String n) 
    {
        for (int i = 0; i < ListaElectricidad.size(); i++) {
            if (ListaElectricidad.get(i).getZona().equals(n)) {
                JOptionPane.showMessageDialog(null, "Zona: " + n + "\nCantidad de Usuarios de la Zona: " + CantidadUsuarios(n) + "\nTotal Facturado en la zona:" + CantidadTotal(n));
                break;
            }

        }

    }
    
    
    
    
    
    
    
    
    
}
