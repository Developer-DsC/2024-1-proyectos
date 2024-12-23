package Controlador;

import Entidades.Banco;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dalton
 */
public class Tlista {

    public static List<Banco> ListaVentas = new ArrayList<Banco>();

    public static void Insert(Banco op) {
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

    public static Banco getFactura(int pos) {
        return ListaVentas.get(pos);
    }

    /*
     private int id;
    private String Nombre;
    private String Sucursal;
    private int NumSucursal;
    private String transaccion;
    private double monto;
     */
    public static DefaultTableModel VisualizarLista() {
        String[] Columna = {"Id", "Nombre", "Sucursal", "NumSucursal", "Transaccion", "Monto"};
        String[] Datos = new String[6];
        DefaultTableModel dt = new DefaultTableModel(null, Columna);
        for (int i = 0; i < ListaVentas.size(); i++) {
            Datos[0] = String.valueOf(ListaVentas.get(i).getId());
            Datos[1] = String.valueOf(ListaVentas.get(i).getNombre());
            Datos[2] = String.valueOf(ListaVentas.get(i).getSucursal());
            Datos[3] = String.valueOf(ListaVentas.get(i).getNumSucursal());
            Datos[4] = String.valueOf(ListaVentas.get(i).getTransaccion());
            Datos[5] = String.valueOf(ListaVentas.get(i).getMonto());
            dt.addRow(Datos);
        }
        return dt;
    }

    //Cantidad de depositos mayores a 1000
    public static void LitA() {
        int contador = 0;
        for (int i = 0; i < ListaVentas.size(); i++) {

            if (ListaVentas.get(i).getTransaccion().equals("D")) {
                if (ListaVentas.get(i).getMonto() > 1000) {
                    contador++;
                }
            }

        }
        JOptionPane.showMessageDialog(null, "La cantidad de depositos mayores a 1000 son: " + contador);
    }

    //Nombre del cliente que hizo la mayor extraccion y su sucursal
    public static void LitB() {
        double aextraccion = 0;
        String aCliente = "", asucursal = "";
        for (int i = 0; i < ListaVentas.size(); i++) {
            if (ListaVentas.get(i).getTransaccion().equals("E")) {
                if (ListaVentas.get(i).getMonto() > aextraccion) {
                    aextraccion=ListaVentas.get(i).getMonto();
                    aCliente=ListaVentas.get(i).getNombre();
                    asucursal=ListaVentas.get(i).getSucursal();
                }
            }

        }JOptionPane.showMessageDialog(null, "Nombre del cliente que hizo la mayor extraccion y su sucursal:" + "\n"+
                                                "Cliente: " +aCliente+"\n"+
                 "Monto de Extraccion: " +aextraccion+"\n"+
                 "Sucursal: " +asucursal);
    }

    //porcentaje de cada sucursal de dep y extracion
    
    
    
    /*
    double total = valor1 + valor2;

        double porcentaje1 = (valor1 / total) * 100.0;
        double porcentaje2 = (valor2 / total) * 100.0;
    */
    public static void LitC() {
        double porc1=0,porc2=0,porc3=0,porc_1=0,porc_2=0,porc_3=0;
            int cont1=0,cont2=0,cont3=0,cont_1=0,cont_2=0,cont_3=0;
            double total1=0,total2=0,total3=0;
        for (int i = 0; i < ListaVentas.size(); i++) {
            
            
            if(ListaVentas.get(i).getSucursal().equals("Virreyes"))
            {
                if(ListaVentas.get(i).getTransaccion().equals("D"))
                {
                    cont1++;
                }
                if(ListaVentas.get(i).getTransaccion().equals("E"))
                {
                    cont_1++;
                }
                total1=cont1+cont_1;
                porc1=(cont1/total1)*100;
                porc_1=(cont_1/total1)*100;
                
            }
            if(ListaVentas.get(i).getSucursal().equals("San Fernando"))
            {
                if(ListaVentas.get(i).getTransaccion().equals("D"))
                {
                    cont2++;
                }
                if(ListaVentas.get(i).getTransaccion().equals("E"))
                {
                    cont_2++;
                }
                total2=cont2+cont_2;
                porc2=(cont2/total2)*100;
                porc_2=(cont_2/total2)*100;
                
            }
            if(ListaVentas.get(i).getSucursal().equals("Tigre"))
            {
                if(ListaVentas.get(i).getTransaccion().equals("D"))
                {
                    cont3++;
                }
                if(ListaVentas.get(i).getTransaccion().equals("E"))
                {
                    cont_3++;
                }
                total3=cont3+cont_3;
                porc3=(cont3/total3)*100;
                porc_3=(cont_3/total3)*100;
                
            }
            
        }
        JOptionPane.showMessageDialog(null, "El porcentaje de Depositos de la sucursal Virreyes: "  + "\n"+
                                                "Depositos: " + porc1+ "\n"+
                                                 "Extraccion: " + porc_1);
        JOptionPane.showMessageDialog(null, "El porcentaje de Depositos de la sucursal San Fernando: "  + "\n"+
                                                "Depositos: " + porc2+ "\n"+
                                                 "Extraccion: " + porc_2);
        JOptionPane.showMessageDialog(null, "El porcentaje de Depositos de la sucursal Tigre: "  + "\n"+
                                                "Depositos: " + porc3+ "\n"+
                                                 "Extraccion: " + porc_3);
    }

    
    
    
    
    //Total depositado en cada sucursal
    public static void LitD() {
        double acum1=0,acum2=0,acum3=0;
        for (int i = 0; i < ListaVentas.size(); i++) {
            if(ListaVentas.get(i).getSucursal().equals("Virreyes"))
            {
                if(ListaVentas.get(i).getTransaccion().equals("D"))
                {
                    acum1=acum1+ListaVentas.get(i).getMonto();
                }
            }
            if(ListaVentas.get(i).getSucursal().equals("San Fernando"))
            {
                if(ListaVentas.get(i).getTransaccion().equals("D"))
                {
                    acum2=acum2+ListaVentas.get(i).getMonto();
                }
            }
            if(ListaVentas.get(i).getSucursal().equals("Tigre"))
            {
                if(ListaVentas.get(i).getTransaccion().equals("D"))
                {
                    acum3=acum3+ListaVentas.get(i).getMonto();
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Monto depositado en Sucursal Virreyes"+ "\n"+
                                                "Monto:"+acum1+ "\n"+
                                            "Monto depositado en Sucursal San Fernando"+ "\n"+
                                                 "Monto:"+acum2+ "\n"+
                                             "Monto depositado en Sucursal Tigre"+ "\n"+
                                                 "Monto:"+acum3);
    }

    //Cantidad de depositos en la sucursal tigre
    public static void LitE() {
        int cont=0;
        for (int i = 0; i < ListaVentas.size(); i++) {
            if(ListaVentas.get(i).getSucursal().equals("Tigre"))
            {
                if(ListaVentas.get(i).getTransaccion().equals("D"))
                {
                    cont++;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "La cantidad de depositos en la Sucursal"+"\n"+
                "Tigre es: " + cont);
    }

    //El nombre y numero de cada uno de los clientes que hayan echo extracciones por mas de 500
    public static void LitF() {
        int anum=0;
        String Anom="";
        for (int i = 0; i < ListaVentas.size(); i++) {
            if(ListaVentas.get(i).getTransaccion().equals("E"))
            {
                if(ListaVentas.get(i).getMonto()>500)
                {
                    anum=ListaVentas.get(i).getId();
                    Anom=ListaVentas.get(i).getNombre();
                    JOptionPane.showMessageDialog(null, "Transaciones por mas de 500"+"\n"+
                            "Nombre: " + Anom+"\n"+
                            "Numero: " + anum);
                }
            }
        }
    }

    //Determinar la sucursal que recibio mas depositos 
    public static void LitG() {
        double acum1=0,acum2=0,acum3=0;
        for (int i = 0; i < ListaVentas.size(); i++) {
            if(ListaVentas.get(i).getSucursal().equals("Virreyes"))
            {
                if(ListaVentas.get(i).getTransaccion().equals("D"))
                {
                    acum1=acum1+ListaVentas.get(i).getMonto();
                }
            }
            if(ListaVentas.get(i).getSucursal().equals("San Fernando"))
            {
                if(ListaVentas.get(i).getTransaccion().equals("D"))
                {
                    acum2=acum2+ListaVentas.get(i).getMonto();
                }
            }
            if(ListaVentas.get(i).getSucursal().equals("Tigre"))
            {
                if(ListaVentas.get(i).getTransaccion().equals("D"))
                {
                    acum3=acum3+ListaVentas.get(i).getMonto();
                }
            }
        }
        
        
        if(acum1>acum2&&acum1>acum3)
        {
         JOptionPane.showMessageDialog(null, "La sucursal con mayor dep es: Virreyes");
        }
        if(acum2>acum1&&acum2>acum3)
        {
         JOptionPane.showMessageDialog(null, "La sucursal con mayor dep es: San Fernando");
        }
        if(acum3>acum2&&acum3>acum1)
        {
         JOptionPane.showMessageDialog(null, "La sucursal con mayor dep es: Tigre");
        }
        
    }
}
