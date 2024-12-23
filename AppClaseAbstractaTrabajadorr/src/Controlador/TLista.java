
package Controlador;

import Entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class TLista {
    public static List<Persona> ListaTrabajadores= new ArrayList<Persona>();

    public static void Insert(Persona op)
    {
        ListaTrabajadores.add(op);
    }
    public static void Update(int pos,Persona op)
    {
        ListaTrabajadores.add(op);
    }
    public static void Delete(int pos)
    {
        ListaTrabajadores.remove(pos);
    }
     public static int Buscar(String ced)
    {
       int pos=-1;
       for(int i=0; i< ListaTrabajadores.size();i++)
       {
           if(ListaTrabajadores.get(i).getCedula().equals(ced))
           {
               pos=i;
               break;
           }
       }
       return pos;
    }
     public static DefaultTableModel VisualizarLista()
    {  
     String[] Columna={"Cedula","Nombres","Apellidos","Sexo","Edad","Estado","Tipo","Sueldo"};
     String[] Datos= new String[8];
     DefaultTableModel dt= new DefaultTableModel(null,Columna);
     for(int i=0; i< ListaTrabajadores.size(); i++)
     {
        Datos[0]= ListaTrabajadores.get(i).getCedula();
        Datos[1]= ListaTrabajadores.get(i).getNombre();
        Datos[2]= ListaTrabajadores.get(i).getApellido();
        Datos[3]= String.valueOf(ListaTrabajadores.get(i).getSexo());
        Datos[4]= String.valueOf(ListaTrabajadores.get(i).Edad());
        Datos[5]= ListaTrabajadores.get(i).getEstado();
        Datos[6]= ListaTrabajadores.get(i).getTipo();
        Datos[7]= String.valueOf(ListaTrabajadores.get(i).CalcularPago());
        dt.addRow(Datos);
     }
      return dt;
 }
     public static Persona getTrabajador(int pos)
     {
         return ListaTrabajadores.get(pos);
     }
     
}
