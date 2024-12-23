/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.EmpresaTelas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class Tlista {

    public static List<EmpresaTelas> ListaVentas = new ArrayList<EmpresaTelas>();

    public static void Insert(EmpresaTelas op) {
        ListaVentas.add(op);
    }

    public static int Buscar(int id) {
        int pos = -1;
        for (int i = 0; i < ListaVentas.size(); i++) {
            if (ListaVentas.get(i).getId() == (id)) {
                pos = i;
                break;
            }
        }
        return pos;

    }

    public static EmpresaTelas getFactura(int pos) {
        return ListaVentas.get(pos);
    }

    /*
    private int id;
    private int NumPieza;
    private String NombrePieza;
    private int  NumCliente;
    private int Cantidaddepiezasvendidas;
     */
    public static DefaultTableModel VisualizarLista() {
        String[] Columna = {"Id", "Numero de Pieza", "NombrePieza", "Numero del Cliente", "Centidad pieza vend"};
        String[] Datos = new String[5];
        DefaultTableModel dt = new DefaultTableModel(null, Columna);
        for (int i = 0; i < ListaVentas.size(); i++) {
            Datos[0] = String.valueOf(ListaVentas.get(i).getId());
            Datos[1] = String.valueOf(ListaVentas.get(i).getNumPieza());
            Datos[2] = String.valueOf(ListaVentas.get(i).getNombrePieza());
            Datos[3] = String.valueOf(ListaVentas.get(i).getNumCliente());
            Datos[4] = String.valueOf(ListaVentas.get(i).getCantidaddepiezasvendidas());
            dt.addRow(Datos);
        }
        return dt;
    }

    //Por cada num de pieza informar su nombre y numero y cuanos clientes la pidieron y el total de piezas vendidas
    public static void LitA() {
        String anom1 = "", anom2 = "", anom3 = "";
        int anumpiez1 = 0, anumpiez2 = 0, anumpiez3 = 0, cont1 = 0, cont2 = 0, cont3 = 0;
        int acu1 = 0, acu2 = 0, acu3 = 0;

        for (int i = 0; i < ListaVentas.size(); i++) {
            if (ListaVentas.get(i).getNumPieza() == 1) {
                anom1 = ListaVentas.get(i).getNombrePieza();
                anumpiez1 = ListaVentas.get(i).getNumPieza();
                acu1 = acu1 + ListaVentas.get(i).getCantidaddepiezasvendidas();
                cont1 = ListaVentas.get(i).getNumCliente();
            }
            if (ListaVentas.get(i).getNumPieza() == 2) {
                anom2 = ListaVentas.get(i).getNombrePieza();
                anumpiez2 = ListaVentas.get(i).getNumPieza();
                acu1 = acu2 + ListaVentas.get(i).getCantidaddepiezasvendidas();
                cont2 = ListaVentas.get(i).getNumCliente();
            }
            if (ListaVentas.get(i).getNumPieza() == 3) {
                anom3 = ListaVentas.get(i).getNombrePieza();
                anumpiez3 = ListaVentas.get(i).getNumPieza();
                acu3 = acu3 + ListaVentas.get(i).getCantidaddepiezasvendidas();
                cont3 = ListaVentas.get(i).getNumCliente();
            }

        }
        JOptionPane.showMessageDialog(null, "Pieza N°: " + anumpiez1 + "\n"
                + "Nombre Pieza: " + anom1 + "\n"
                + "Cant Personas que la solicitaron: " + cont1 + "\n"
                + "Cantidad vendida: " + acu1);

        JOptionPane.showMessageDialog(null, "Pieza N°: " + anumpiez2 + "\n"
                + "Nombre Pieza: " + anom2 + "\n"
                + "Cant Personas que la solicitaron: " + cont2 + "\n"
                + "Cantidad vendida: " + acu2);

        JOptionPane.showMessageDialog(null, "Pieza N°: " + anumpiez3 + "\n"
                + "Nombre Pieza: " + anom3 + "\n"
                + "Cant Personas que la solicitaron: " + cont3 + "\n"
                + "Cantidad vendida: " + acu3);
    }

    public static void LitB()
    {
        String anum="";
        for (int i = 0; i < ListaVentas.size(); i++) {
            if(ListaVentas.get(i).getNumCliente()>10)
            {
                anum=+ListaVentas.get(i).getNumPieza()+"\n";
            }
        }
        JOptionPane.showMessageDialog(null, "El numero de las piezas con solicitadas mayores a 10 son: "+anum);
    }
     public static void LitC()
    {
        int acum1=0,acum2=0,acum3=0;
        for (int i = 0; i < ListaVentas.size(); i++) {
            if(ListaVentas.get(i).getNumPieza()==1)
            {
                acum1=acum1+ListaVentas.get(i).getCantidaddepiezasvendidas();
            }
            if(ListaVentas.get(i).getNumPieza()==2)
            {
                acum2=acum2+ListaVentas.get(i).getCantidaddepiezasvendidas();
            }
            if(ListaVentas.get(i).getNumPieza()==1)
            {
                acum3=acum3+ListaVentas.get(i).getCantidaddepiezasvendidas();
            }
        }
        if(acum1<acum2&&acum1<acum3)
        {
            JOptionPane.showMessageDialog(null, "El numero de las piezas con menor solicitudes es: 1");
        }
        if(acum2<acum1&&acum2<acum3)
        {
            JOptionPane.showMessageDialog(null, "El numero de las piezas con menor solicitudes es: 2");
        }
        if(acum3<acum2&&acum3<acum1)
        {
            JOptionPane.showMessageDialog(null, "El numero de las piezas con menor solicitudes es: 3");
        }
        
    }
}
