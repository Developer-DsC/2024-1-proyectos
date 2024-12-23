/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class TLista {
    
    
    
    

    public static List<Cliente> ListClient = new ArrayList<Cliente>();

    public static void Insert(Cliente oe) {
        ListClient.add(oe);
    }

    public static int Buscar(String zona) {
        int pos = -1;
        for (int i = 0; i < ListClient.size(); i++) {
            if (ListClient.get(i).getCodigoZona().equals(zona)) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static Cliente getCliente(int pos) {
        return ListClient.get(pos);
    }

    public static DefaultTableModel VisualizarLista() {
        String[] Columna = {"Codigo Zona", "Codigo Sucursal", "Nombre Cliente", "Saldo"};
        String[] Datos = new String[4];
        DefaultTableModel dt = new DefaultTableModel(null, Columna);
        for (int i = 0; i < ListClient.size(); i++) {
            Datos[0] = ListClient.get(i).getCodigoZona();
            Datos[1] = String.valueOf(ListClient.get(i).getCodigoSucursal());
            Datos[2] = String.valueOf(ListClient.get(i).getNombreCliente());
            Datos[3] = String.valueOf(ListClient.get(i).getSaldoCliente());
            dt.addRow(Datos);
        }
        return dt;
    }

    public static double SumarSucursales(String suc) {
        double c = 0;
        for (int i = 0; i < ListClient.size(); i++) {
            if (ListClient.get(i).getCodigoSucursal().equals(suc)) {
                c += ListClient.get(i).getSaldoCliente();
            }
        }
        return c;
    }

    public static double SumarCantZon(String num) {
        double c = 0;
        for (int i = 0; i < ListClient.size(); i++) {
            if (ListClient.get(i).getCodigoZona().equals(num)) {
                c += ListClient.get(i).getSaldoCliente();
            }
        }
        return c;

    }

    public static void SumaGeneral() {
        double c = 0;
        for (int i = 0; i < ListClient.size(); i++) {

            c += ListClient.get(i).getSaldoCliente();
        }
        JOptionPane.showMessageDialog(null, "Suma General: "+ c);

    }

    public static void ImprimirTodo(String zona, String suc) {
        for (int i = 0; i < ListClient.size(); i++) {
            if (ListClient.get(i).getCodigoZona().equals(zona)) {
                if (ListClient.get(i).getCodigoSucursal().equals(suc)) {
                    JOptionPane.showMessageDialog(null, "Zona: " + zona
                            + "\nSucursal: " + suc
                            + "\nSuma acumulada de  sucursal:  " +SumarSucursales(suc) + ": "
                            + "\nTotal de la zona " + SumarCantZon(zona));
                    break;
                }
            }
        }
    }

}
