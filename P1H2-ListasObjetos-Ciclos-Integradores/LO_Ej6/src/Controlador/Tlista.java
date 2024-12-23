/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.Restaurante;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class Tlista {

    public static List<Restaurante> ListaRestaurante = new ArrayList<Restaurante>();

    public static void Insert(Restaurante op) {
        ListaRestaurante.add(op);
    }

    public static int Buscar(int id) {
        int pos = -1;
        for (int i = 0; i < ListaRestaurante.size(); i++) {
            if (ListaRestaurante.get(i).getId() == (id)) {
                pos = i;
                break;
            }
        }
        return pos;

    }

    public static Restaurante getFactura(int pos) {
        return ListaRestaurante.get(pos);
    }

    /*
    private int id;
    private int NumMozo;
    private String NomMozo;
    private int NumMeza;
    private double importe;
    private int cantpersonas;
     */
    public static DefaultTableModel VisualizarLista() {
        String[] Columna = {"Id", "NumMozo", "NomMozo", "NumMeza", "Importe", "Cantpersonas"};
        String[] Datos = new String[6];
        DefaultTableModel dt = new DefaultTableModel(null, Columna);
        for (int i = 0; i < ListaRestaurante.size(); i++) {
            Datos[0] = String.valueOf(ListaRestaurante.get(i).getId());
            Datos[1] = String.valueOf(ListaRestaurante.get(i).getNumMozo());
            Datos[2] = String.valueOf(ListaRestaurante.get(i).getNomMozo());
            Datos[3] = String.valueOf(ListaRestaurante.get(i).getNumMeza());
            Datos[4] = String.valueOf(ListaRestaurante.get(i).getImporte());
            Datos[5] = String.valueOf(ListaRestaurante.get(i).getCantpersonas());
            dt.addRow(Datos);
        }
        return dt;
    }

    //Cant personas atendidas por cada mozo
    public static void LitA() {
        int cant1 = 0, cant2 = 0, cant3 = 0;
        for (int i = 0; i < ListaRestaurante.size(); i++) {
            if (ListaRestaurante.get(i).getNomMozo().equals("Juan")) {
                cant1 = cant1 + ListaRestaurante.get(i).getCantpersonas();
            }
            if (ListaRestaurante.get(i).getNomMozo().equals("Naomi")) {
                cant2 = cant2 + ListaRestaurante.get(i).getCantpersonas();
            }
            if (ListaRestaurante.get(i).getNomMozo().equals("Milena")) {
                cant3 = cant3 + ListaRestaurante.get(i).getCantpersonas();
            }
        }
        JOptionPane.showMessageDialog(null, "Cantidad de personas atendidas" + "\n"
                + "Mozo1 : Juan : " + cant1 + " Personas Atendidas" + "\n"
                + "Mozo2 : Naomi : " + cant2 + " Personas Atendidas" + "\n"
                + "Mozo3 : Milena : " + cant3 + " Personas Atendidas");
    }
    //recaudacion por cada mozo

    public static void LitB() {
        double acum1 = 0, acum2 = 0, acum3 = 0;
        for (int i = 0; i < ListaRestaurante.size(); i++) {
            if (ListaRestaurante.get(i).getNomMozo().equals("Juan")) {
                acum1 = acum1 + ListaRestaurante.get(i).getImporte();
            }
            if (ListaRestaurante.get(i).getNomMozo().equals("Naomi")) {
                acum2 = acum2 + ListaRestaurante.get(i).getImporte();
            }
            if (ListaRestaurante.get(i).getNomMozo().equals("Milena")) {
                acum3 = acum3 + ListaRestaurante.get(i).getImporte();
            }
        }
        JOptionPane.showMessageDialog(null, "Recaudacion por cada mozo" + "\n"
                + "Mozo1 : Juan : " + acum1 + "$ de recaudacion " + "\n"
                + "Mozo2 : Naomi : " + acum2 + "$ de recaudacion  " + "\n"
                + "Mozo3 : Milena : " + acum3 + "$ de recaudacion  ");
    }
    //numero de mesa con mayor importe

    public static void LitC() {
        double acum1 = 0, acum2 = 0, acum3 = 0;
        for (int i = 0; i < ListaRestaurante.size(); i++) {
            if (ListaRestaurante.get(i).getNumMeza() == 1) {
                acum1 = acum1 + ListaRestaurante.get(i).getImporte();
            }
            if (ListaRestaurante.get(i).getNumMeza() == 2) {
                acum2 = acum2 + ListaRestaurante.get(i).getImporte();
            }
            if (ListaRestaurante.get(i).getNumMeza() == 3) {
                acum3 = acum3 + ListaRestaurante.get(i).getImporte();
            }
        }

        if (acum1 > acum2 && acum1 > acum3) {
            JOptionPane.showMessageDialog(null, "La mesa con mayor importe es la mesa 1");
        }
        if (acum2 > acum1 && acum2 > acum3) {
            JOptionPane.showMessageDialog(null, "La mesa con mayor importe es la mesa 2");
        }
        if (acum3 > acum2 && acum3 > acum1) {
            JOptionPane.showMessageDialog(null, "La mesa con mayor importe es la mesa 3");
        }
    }
    //personas totales de cada mesa 

    public static void LitD() {
        double cont1 = 0, cont2 = 0, cont3 = 0;
        for (int i = 0; i < ListaRestaurante.size(); i++) {
            if (ListaRestaurante.get(i).getNumMeza() == 1) {
                cont1 = cont1 + ListaRestaurante.get(i).getCantpersonas();
            }
            if (ListaRestaurante.get(i).getNumMeza() == 2) {
                cont2 = cont2 + ListaRestaurante.get(i).getCantpersonas();
            }
            if (ListaRestaurante.get(i).getNumMeza() == 3) {
                cont3 = cont3 + ListaRestaurante.get(i).getCantpersonas();
            }
        }
        JOptionPane.showMessageDialog(null, "Personas totales de cada mesa " + "\n"
                + "Mesa 1: " + cont1 + "\n"
                + "Mesa 2: " + cont2 + "\n"
                + "Mesa 2: " + cont3);
    }
    //numero de mozo que atendio a menos personas

    public static void LitE() {
        double acum1 = 0, acum2 = 0, acum3 = 0;
        for (int i = 0; i < ListaRestaurante.size(); i++) {
            if (ListaRestaurante.get(i).getNomMozo().equals("Juan")) {
                acum1 = acum1 + ListaRestaurante.get(i).getCantpersonas();
            }
            if (ListaRestaurante.get(i).getNomMozo().equals("Naomi")) {
                acum2 = acum2 + ListaRestaurante.get(i).getCantpersonas();
            }
            if (ListaRestaurante.get(i).getNomMozo().equals("Milena")) {
                acum3 = acum3 + ListaRestaurante.get(i).getCantpersonas();
            }
        }
        if (acum1 < acum2 && acum1 < acum3) {
            JOptionPane.showMessageDialog(null, "La mozo con menor cantidad de personas atendidas es Juan");
        }
        if (acum2 < acum1 && acum2 < acum3) {
            JOptionPane.showMessageDialog(null, "La mozo con menor cantidad de personas atendidas es Naomi");
        }
        if (acum3 < acum2 && acum3 < acum1) {
            JOptionPane.showMessageDialog(null, "La mozo con menor cantidad de personas atendidas es Milena");
        }

    }
    //porcentaje de recaudacion de cada mozo

    public static void LitF() {
        double acum1 = 0, acum2 = 0, acum3 = 0, total = 0;
        double prom1 = 0, prom2 = 0, prom3 = 0;
        for (int i = 0; i < ListaRestaurante.size(); i++) {
            if (ListaRestaurante.get(i).getNomMozo().equals("Juan")) {
                acum1 = acum1 + ListaRestaurante.get(i).getImporte();
            }
            if (ListaRestaurante.get(i).getNomMozo().equals("Naomi")) {
                acum2 = acum2 + ListaRestaurante.get(i).getImporte();
            }
            if (ListaRestaurante.get(i).getNomMozo().equals("Milena")) {
                acum3 = acum3 + ListaRestaurante.get(i).getImporte();
            }
        }
        total = acum1 + acum2 + acum3;
        prom1 = (acum1 / total) * 100;
        prom2 = (acum2 / total) * 100;
        prom3 = (acum3 / total) * 100;

        JOptionPane.showMessageDialog(null, "Porcentaje de importe por cada mozo" + "\n"
                + "Mozo1 : Juan : " + prom1 + "% de recaudacion " + "\n"
                + "Mozo2 : Naomi : " + prom2 + "% de recaudacion  " + "\n"
                + "Mozo3 : Milena : " + prom3 + "% de recaudacion  ");
    }
    //cantidad de cuentas con importe menores a 50$

    public static void LitG() {
        int cont=0;
        for (int i = 0; i < ListaRestaurante.size(); i++) {
            if(ListaRestaurante.get(i).getImporte()<50)
            {
                cont++;
            }
        }
        JOptionPane.showMessageDialog(null, "Cantidad de cuentas con importe menores a 50$"+"\n"+
                "Cantidad: "+cont);
    }
}
