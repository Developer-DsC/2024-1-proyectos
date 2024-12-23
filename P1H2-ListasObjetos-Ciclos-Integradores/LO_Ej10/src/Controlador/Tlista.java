/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.Electricidad;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class Tlista {
    public static List<Electricidad> ListaVentas = new ArrayList<Electricidad>();
    
    
    
    public static void Insert(Electricidad op) {
        ListaVentas.add(op);
    }

    public static int Buscar(int  id) {
        int pos = -1;
        for (int i = 0; i < ListaVentas.size(); i++) {
            if (ListaVentas.get(i).getId()==(id)) {
                pos = i;
                break;
            }
        }
        return pos;

    }

    public static Electricidad getFactura(int pos) {
        return ListaVentas.get(pos);
    }

    public static DefaultTableModel VisualizarLista() {
        String[] Columna = {"Id", "NumZon", "Tipo", "Consumo"};
        String[] Datos = new String[4];
        DefaultTableModel dt = new DefaultTableModel(null, Columna);
        for (int i = 0; i < ListaVentas.size(); i++) {
            Datos[0] = String.valueOf(ListaVentas.get(i).getId());
            Datos[1] = String.valueOf(ListaVentas.get(i).getNumZon());
            Datos[2] = String.valueOf(ListaVentas.get(i).getTipo());
            Datos[3] = String.valueOf(ListaVentas.get(i).getConsumo());
            
            dt.addRow(Datos);
        }
        return dt;
    }
    
    //num zona con mayor cant de usuarios
    public static void LitA()
    {
       int  azon=0;
       double acum1=0,acum2=0,acum3=0,acum4=0,acum5=0,acum6=0,acum7=0,acum8=0,acum9=0,acum10=0;
       
     for (int i = 0; i < ListaVentas.size(); i++) {
            if(ListaVentas.get(i).getNumZon()==1)
            {
                acum1++;
            }
            if(ListaVentas.get(i).getNumZon()==2)
            {
                acum2++;
            }
            if(ListaVentas.get(i).getNumZon()==3)
            {
                acum3++;
            }
            if(ListaVentas.get(i).getNumZon()==4)
            {
                acum4++;
            }
            if(ListaVentas.get(i).getNumZon()==5)
            {
                acum5++;
            }
            if(ListaVentas.get(i).getNumZon()==6)
            {
                acum6++;
            }
            if(ListaVentas.get(i).getNumZon()==7)
            {
                acum7++;
            }
            if(ListaVentas.get(i).getNumZon()==8)
            {
                acum8++;
            }
            if(ListaVentas.get(i).getNumZon()==9)
            {
                acum9++;
            }
            if(ListaVentas.get(i).getNumZon()==10)
            {
                acum10++;
            }
        }
        if(acum1>acum2&&acum1>acum3&&acum1>acum4&&acum1>acum5&&acum1>acum6&&acum1>acum7&&acum1>acum8&&acum1>acum9&&acum1>acum10)
        {
            JOptionPane.showMessageDialog(null, "El numero de zona con mayor cant de usuarios es Zon:1");
        }
        if(acum2>acum3&&acum2>acum1&&acum2>acum4&&acum2>acum5&&acum2>acum6&&acum2>acum7&&acum2>acum8&&acum2>acum9&&acum2>acum10)
        {
            JOptionPane.showMessageDialog(null, "El numero de zona con mayor cant de usuarios es Zon:2");
        }
        //
        if(acum3>acum1&&acum3>acum2&&acum3>acum4&&acum3>acum5&&acum3>acum6&&acum3>acum7&&acum3>acum8&&acum3>acum9&&acum3>acum10)
        {
            JOptionPane.showMessageDialog(null, "El numero de zona con mayor cant de usuarios es Zon:3");
        }
        if(acum4>acum1&&acum4>acum3&&acum4>acum2&&acum4>acum5&&acum4>acum6&&acum4>acum7&&acum4>acum8&&acum4>acum9&&acum4>acum10)
        {
            JOptionPane.showMessageDialog(null, "El numero de zona con mayor cant de usuarios es Zon:4");
        }
        if(acum5>acum1&&acum5>acum2&&acum5>acum3&&acum5>acum4&&acum5>acum6&&acum5>acum7&&acum5>acum8&&acum5>acum9&&acum5>acum10)
        {
            JOptionPane.showMessageDialog(null, "El numero de zona con mayor cant de usuarios es Zon:5");
        }
        if(acum6>acum1&&acum6>acum2&&acum6>acum3&&acum6>acum4&&acum6>acum7&&acum6>acum8&&acum6>acum9&&acum6>acum10&&acum6>acum5)
        {
            JOptionPane.showMessageDialog(null, "El numero de zona con mayor cant de usuarios es Zon:6");
        }
        if(acum7>acum1&&acum7>acum2&&acum7>acum3&&acum7>acum4&&acum7>acum5&&acum7>acum6&&acum7>acum8&&acum7>acum9&&acum7>acum10)
        {
            JOptionPane.showMessageDialog(null, "El numero de zona con mayor cant de usuarios es Zon:7");
        }
        if(acum8>acum1&&acum8>acum2&&acum8>acum3&&acum8>acum4&&acum8>acum5&&acum8>acum6&&acum8>acum7&&acum8>acum9&&acum8>acum10)
        {
            JOptionPane.showMessageDialog(null, "El numero de zona con mayor cant de usuarios es Zon:8");
        }
        if(acum9>acum1&&acum9>acum2&&acum9>acum3&&acum9>acum4&&acum9>acum5&&acum9>acum6&&acum9>acum7&&acum9>acum8&&acum9>acum10)
        {
            JOptionPane.showMessageDialog(null, "El numero de zona con mayor cant de usuarios es Zon:9");
        }
        if(acum10>acum1&&acum10>acum2&&acum10>acum3&&acum10>acum4&&acum10>acum5&&acum10>acum6&&acum10>acum7&&acum10>acum8&&acum10>acum9)
        {
            JOptionPane.showMessageDialog(null, "El numero de zona con mayor cant de usuarios es Zon:10");
        }
    }
    //num zona menor consumo
    public static void LitB()
    {
        int  azon=0;
       double acum1=0,acum2=0,acum3=0,acum4=0,acum5=0,acum6=0,acum7=0,acum8=0,acum9=0,acum10=0;
       
     for (int i = 0; i < ListaVentas.size(); i++) {
            if(ListaVentas.get(i).getNumZon()==1)
            {
                acum1+=ListaVentas.get(i).getConsumo();
            }
            if(ListaVentas.get(i).getNumZon()==2)
            {
                acum2+=ListaVentas.get(i).getConsumo();
            }
            if(ListaVentas.get(i).getNumZon()==3)
            {
                acum3+=ListaVentas.get(i).getConsumo();
            }
            if(ListaVentas.get(i).getNumZon()==4)
            {
                acum4+=ListaVentas.get(i).getConsumo();
            }
            if(ListaVentas.get(i).getNumZon()==5)
            {
                acum5+=ListaVentas.get(i).getConsumo();
            }
            if(ListaVentas.get(i).getNumZon()==6)
            {
                acum6+=ListaVentas.get(i).getConsumo();
            }
            if(ListaVentas.get(i).getNumZon()==7)
            {
                acum7+=ListaVentas.get(i).getConsumo();
            }
            if(ListaVentas.get(i).getNumZon()==8)
            {
                acum8+=ListaVentas.get(i).getConsumo();
            }
            if(ListaVentas.get(i).getNumZon()==9)
            {
                acum9+=ListaVentas.get(i).getConsumo();
            }
            if(ListaVentas.get(i).getNumZon()==10)
            {
                acum10+=ListaVentas.get(i).getConsumo();
            }
        }
        if(acum1<acum2&&acum1<acum3&&acum1<acum4&&acum1<acum5&&acum1<acum6&&acum1<acum7&&acum1<acum8&&acum1<acum9&&acum1<acum10)
        {
            JOptionPane.showMessageDialog(null, "El numero de zona con menor consumo de usuarios es Zon:1");
        }
        if(acum2<acum3&&acum2<acum1&&acum2<acum4&&acum2<acum5&&acum2<acum6&&acum2<acum7&&acum2<acum8&&acum2<acum9&&acum2<acum10)
        {
            JOptionPane.showMessageDialog(null, "El numero de zona con menor consumo de usuarios es Zon:2");
        }
        //
        if(acum3<acum1&&acum3<acum2&&acum3<acum4&&acum3<acum5&&acum3<acum6&&acum3<acum7&&acum3<acum8&&acum3<acum9&&acum3<acum10)
        {
            JOptionPane.showMessageDialog(null, "El numero de zona con menor consumo de usuarios es Zon:3");
        }
        if(acum4<acum1&&acum4<acum3&&acum4<acum2&&acum4<acum5&&acum4<acum6&&acum4<acum7&&acum4<acum8&&acum4<acum9&&acum4<acum10)
        {
            JOptionPane.showMessageDialog(null, "El numero de zona con menor consumo de usuarios es Zon:4");
        }
        if(acum5<acum1&&acum5<acum2&&acum5<acum3&&acum5<acum4&&acum5<acum6&&acum5<acum7&&acum5<acum8&&acum5<acum9&&acum5<acum10)
        {
            JOptionPane.showMessageDialog(null, "El numero de zona con menor consumo de usuarios es Zon:5");
        }
        if(acum6<acum1&&acum6<acum2&&acum6<acum3&&acum6<acum4&&acum6<acum7&&acum6<acum8&&acum6<acum9&&acum6<acum10&&acum6<acum5)
        {
            JOptionPane.showMessageDialog(null, "El numero de zona con menor consumo de usuarios es Zon:6");
        }
        if(acum7<acum1&&acum7<acum2&&acum7<acum3&&acum7<acum4&&acum7<acum5&&acum7<acum6&&acum7<acum8&&acum7<acum9&&acum7<acum10)
        {
            JOptionPane.showMessageDialog(null, "El numero de zona con menor consumo de usuarios es Zon:7");
        }
        if(acum8<acum1&&acum8<acum2&&acum8<acum3&&acum8<acum4&&acum8<acum5&&acum8<acum6&&acum8<acum7&&acum8<acum9&&acum8<acum10)
        {
            JOptionPane.showMessageDialog(null, "El numero de zona con menor consumo de usuarios es Zon:8");
        }
        if(acum9<acum1&&acum9<acum2&&acum9<acum3&&acum9<acum4&&acum9<acum5&&acum9<acum6&&acum9<acum7&&acum9<acum8&&acum9<acum10)
        {
            JOptionPane.showMessageDialog(null, "El numero de zona con menor consumo de usuarios es Zon:9");
        }
        if(acum10<acum1&&acum10<acum2&&acum10<acum3&&acum10<acum4&&acum10<acum5&&acum10<acum6&&acum10<acum7&&acum10<acum8&&acum10<acum9)
        {
            JOptionPane.showMessageDialog(null, "El numero de zona con menor consumo de usuarios es Zon:10");
        }
    }
    //num usuario mayor consumo
    public static void LitC()
    {
        double aconsumo=0;
                int anum=0;
        for (int i = 0; i < ListaVentas.size(); i++) {
            if(aconsumo<ListaVentas.get(i).getConsumo())
            {
                aconsumo=ListaVentas.get(i).getConsumo();
                anum=ListaVentas.get(i).getId();
            }
        }
        JOptionPane.showMessageDialog(null, "Nu}mero de el cliente con mayor consumo: "+anum);
    }
}
