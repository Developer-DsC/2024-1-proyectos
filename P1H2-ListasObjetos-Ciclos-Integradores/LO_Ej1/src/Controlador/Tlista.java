/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.EmpresaBoletos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class Tlista {
    
    public static List<EmpresaBoletos> ListaVenta=new ArrayList<EmpresaBoletos>();
    
    public static void Insert(EmpresaBoletos oe)
    {
        ListaVenta.add(oe);
    }
     public static int Buscar(int cod) {
        int pos = -1;
        for (int i = 0; i < ListaVenta.size(); i++) {
            if (ListaVenta.get(i).getCodigo()==(cod)) {
                pos = i;
                break;
            }
        }
        return pos;

    }

    public static EmpresaBoletos getFactura(int pos) {
        return ListaVenta.get(pos);
    }

    
    public static double CalcularTotal(int pos)
    {
         
        double total=0, adif=0 ,adesc=0;
        if(ListaVenta.get(pos).getDestino().equals("Quito"))
        {
            if(ListaVenta.get(pos).getCompañia().equals("Rutas")){
                total=20*ListaVenta.get(pos).getCantPasajes();
                
                
            }
            if(ListaVenta.get(pos).getCompañia().equals("Cifa")){
                total=22*ListaVenta.get(pos).getCantPasajes();
               
            }
            if(ListaVenta.get(pos).getCompañia().equals("Calderon")){
                total=24*ListaVenta.get(pos).getCantPasajes();
                
            }            
        }
        if(ListaVenta.get(pos).getDestino().equals("Cuenca")) ///************************
        {
            if(ListaVenta.get(pos).getCompañia().equals("Rutas")){
                total=15*ListaVenta.get(pos).getCantPasajes();
                
            }
            if(ListaVenta.get(pos).getCompañia().equals("Cifa")){
                total=16.50*ListaVenta.get(pos).getCantPasajes();
                
            }
            if(ListaVenta.get(pos).getCompañia().equals("Calderon")){
                total=18*ListaVenta.get(pos).getCantPasajes();
                
            }            
        }
        if(ListaVenta.get(pos).getDestino().equals("Guayaquil")) ///************************
        {
            if(ListaVenta.get(pos).getCompañia().equals("Rutas")){
                total=30*ListaVenta.get(pos).getCantPasajes();
                
            }
            if(ListaVenta.get(pos).getCompañia().equals("Cifa")){
                total=33*ListaVenta.get(pos).getCantPasajes();
                
            }
            if(ListaVenta.get(pos).getCompañia().equals("Calderon")){
                total=36*ListaVenta.get(pos).getCantPasajes();
                
            }            
        }
        
        
        if(ListaVenta.get(pos).getServicio().equals("Comun"))
                {
                    if(ListaVenta.get(pos).getCantPasajes() >5)
                    {
                        adesc=20*0.15;
                        total-=adesc;
                        
                    }
                }
                if(ListaVenta.get(pos).getServicio().equals("Diferencial"))
                {
                    adif=20*0.20;
                    total+=adif;
                    if(ListaVenta.get(pos).getCantPasajes() >5)
                    {
                        adesc=20*0.15;
                        total-=adesc;
                        
                    }
                }
       
        
        return total;
    }
    public static void LitA(){
        double precioxtodvol=0;
        for (int i = 0; i < ListaVenta.size(); i++) {
            precioxtodvol+=CalcularTotal(i);
        }
        JOptionPane.showMessageDialog(null, "La cantidad recaudada por todas las ventas son: " + precioxtodvol);
    }
    public static DefaultTableModel VisualizarLista() {
        String[] Columna = {"Codigo", "Destino", "Compañia", "Cant Pasajes","Servicio","Total"};
        String[] Datos = new String[6];
        DefaultTableModel dt = new DefaultTableModel(null, Columna);
        for (int i = 0; i < ListaVenta.size(); i++) {
            Datos[0] = String.valueOf(ListaVenta.get(i).getCodigo());
            Datos[1] = ListaVenta.get(i).getDestino();
            Datos[2] = ListaVenta.get(i).getCompañia();
            Datos[3] = String.valueOf(ListaVenta.get(i).getCantPasajes());
            Datos[4] = ListaVenta.get(i).getServicio();
            Datos[5] =String.valueOf(CalcularTotal(i)) ;
            dt.addRow(Datos);
        }
        return dt;
    }
}
