/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.EmpresaMicros;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class Tlista {

    public static List<EmpresaMicros> ListaEmpresaMicros = new ArrayList<EmpresaMicros>();

    public static void Insert(EmpresaMicros op) {
        ListaEmpresaMicros.add(op);
    }

    public static int Buscar(int id) {
        int pos = -1;
        for (int i = 0; i < ListaEmpresaMicros.size(); i++) {
            if (ListaEmpresaMicros.get(i).getIdNumTick() == (id)) {
                pos = i;
                break;
            }
        }
        return pos;

    }

    public static EmpresaMicros getVenta(int pos) {
        return ListaEmpresaMicros.get(pos);
    }

    
    public static DefaultTableModel VisualizarLista() {
        String[] Columna = {"IdNumTick", "Destino", "Servicio", "CantPasajes", "Total"};
        String[] Datos = new String[5];
        DefaultTableModel dt = new DefaultTableModel(null, Columna);
        for (int i = 0; i < ListaEmpresaMicros.size(); i++) {
            Datos[0] = String.valueOf(ListaEmpresaMicros.get(i).getIdNumTick());
            Datos[1] = String.valueOf(ListaEmpresaMicros.get(i).getDestino());
            Datos[2] = String.valueOf(ListaEmpresaMicros.get(i).getServicio());
            Datos[3] = String.valueOf(ListaEmpresaMicros.get(i).getCantPasajes());
            Datos[4] = String.valueOf(Calcular(i));
            dt.addRow(Datos);
        }
        return dt;
    }

    public static double Calcular(int i ) {
    double costoTotal = 0;
    int totalTickets = 0;
    int pos=Buscar(i);
   
        int cantidadPasajes = ListaEmpresaMicros.get(i).getCantPasajes();
        totalTickets += cantidadPasajes;

        if (ListaEmpresaMicros.get(i).getServicio().equals("Comun")) {
            costoTotal += 43 * cantidadPasajes;
        } else if (ListaEmpresaMicros.get(i).getServicio().equals("Diferencial")) {
            costoTotal += 55 * cantidadPasajes;
        }
    

    // Aplicar descuento si el total de tickets es mayor o igual a 10
    if (totalTickets >= 10) {
        double descuento = costoTotal * 0.10;
        costoTotal -= descuento;
    }

    return costoTotal;
}


    //Cantidad de pasajes x destino
    public static void LitA() {
        int cont1 = 0, cont2 = 0, cont3 = 0;
        for (int i = 0; i < ListaEmpresaMicros.size(); i++) {
            if (ListaEmpresaMicros.get(i).getDestino().equals("Mendoza")) {
                cont1=cont1 + ListaEmpresaMicros.get(i).getCantPasajes();
            }
            if (ListaEmpresaMicros.get(i).getDestino().equals("Neuquen")) {
                cont2=cont2 + ListaEmpresaMicros.get(i).getCantPasajes();
            }
            if (ListaEmpresaMicros.get(i).getDestino().equals("Corrientes")) {
                cont3=cont3 + ListaEmpresaMicros.get(i).getCantPasajes();
            }
        }
        JOptionPane.showMessageDialog(null, "Cantidad de pasajes segun el destino" + "\n"
                + "Mendoza: " + cont1 + "\n"
                + "Neuquen: " + cont2 + "\n"
                + "Corrientes: " + cont3);
    }

    //recaudacion total de diferencial y comun
    public static void LitB() {
        double acum1 = 0, acum2 = 0;
        for (int i = 0; i < ListaEmpresaMicros.size(); i++) {

            if (ListaEmpresaMicros.get(i).getServicio().equals("Comun")) {
                acum1 = acum1 + Calcular(i);
            }
            if (ListaEmpresaMicros.get(i).getServicio().equals("Diferencial")) {
                acum2 = acum2 + Calcular(i);
            }
        }
        JOptionPane.showMessageDialog(null, "Recaudacion total de diferencial y comun" + "\n"
                + "Comun: " + acum1 + "\n"
                + "Diferencial: " + acum2);
    }

    //NumTiket con mayor importe
    public static void LitC() {
        int anumtik = -1;
        double aimp = 0;
        for (int i = 0; i < ListaEmpresaMicros.size(); i++) {
            if (Calcular(i) > aimp) {
                aimp = Calcular(i);
                anumtik = ListaEmpresaMicros.get(i).getIdNumTick();
            }
        }
        JOptionPane.showMessageDialog(null, "El NumTiket con mayor importe es: " + anumtik + " Importe: "+ aimp);
    }

    //cantidad de pasajes ven para comun y diferencial
    public static void LitD() {
        double acum1 = 0, acum2 = 0;
        for (int i = 0; i < ListaEmpresaMicros.size(); i++) {

            if (ListaEmpresaMicros.get(i).getServicio().equals("Comun")) {
                acum1 = acum1 + ListaEmpresaMicros.get(i).getCantPasajes();
            }
            if (ListaEmpresaMicros.get(i).getServicio().equals("Diferencial")) {
                acum2 = acum2 + ListaEmpresaMicros.get(i).getCantPasajes();
            }
        }
        JOptionPane.showMessageDialog(null, "Cantidad de pasajes vend para comun y diferencial" + "\n"
                + "Comun: " + acum1 + "\n"
                + "Diferencial: " + acum2);
    }

    //destino con mayor recaudacion en pesos
    public static void LitE() {

        double acum1 = 0, acum2 = 0, acum3 = 0;
        for (int i = 0; i < ListaEmpresaMicros.size(); i++) {
            if (ListaEmpresaMicros.get(i).getDestino().equals("Mendoza")) {
                acum1 = acum1 + Calcular(i);
            }
            if (ListaEmpresaMicros.get(i).getDestino().equals("Neuquen")) {
                acum2 = acum2 + Calcular(i);
            }
            if (ListaEmpresaMicros.get(i).getDestino().equals("Corrientes")) {
                acum3 = acum3 + Calcular(i);
            }
        }
        if (acum1 > acum2 && acum1 > acum3) {
            JOptionPane.showMessageDialog(null, "El destino con mayor recaudacion es Mendoza");
        }
        if (acum2 > acum1 && acum2 > acum3) {
            JOptionPane.showMessageDialog(null, "El destino con mayor recaudacion es Neuquen");
        }
        if (acum3 > acum2 && acum3 > acum1) {
            JOptionPane.showMessageDialog(null, "El destino con mayor recaudacion es Corrientes");
        }

    }

    //porcentaje de ventas de cada destino en base a la cant de pasajes vendidos
    public static void LitF() {
        double acum1 = 0, acum2 = 0, acum3 = 0,porc1=0,porc2=0,porc3=0,total=0;
        for (int i = 0; i < ListaEmpresaMicros.size(); i++) {
            if (ListaEmpresaMicros.get(i).getDestino().equals("Mendoza")) {
                acum1 = acum1 + ListaEmpresaMicros.get(i).getCantPasajes();
            }
            if (ListaEmpresaMicros.get(i).getDestino().equals("Neuquen")) {
                acum2 = acum2 + ListaEmpresaMicros.get(i).getCantPasajes();
            }
            if (ListaEmpresaMicros.get(i).getDestino().equals("Corrientes")) {
                acum3 = acum3 + ListaEmpresaMicros.get(i).getCantPasajes();
            }
        }
        total=acum1+acum2+acum3;
        porc1=(acum1/total)*100;
        porc2=(acum2/total)*100;
        porc3=(acum3/total)*100;
        JOptionPane.showMessageDialog(null, "Porcentaje de ventas"+"\n"+
                "Mendoza: " + porc1 + "\n"+
                "Neuquen: " + porc2 + "\n"+
                        "Corrientes: " + porc3);
    }

    //cantidad de pasajes del destino 1 clase diferencial
    public static void LitG() {
        int cont=0;
        for (int i = 0; i < ListaEmpresaMicros.size(); i++) {
            if(ListaEmpresaMicros.get(i).getDestino().equals("Mendoza"))
            {
                if(ListaEmpresaMicros.get(i).getServicio().equals("Diferencial"))
                {
                    cont++;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Cantidad de pasajes del destino 1 en dierencial"
        +"\n"+"Cant: " + cont);
    }
}
