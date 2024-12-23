/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.Universidad;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Joffre Cartuche C
 */
public class TListaUniversidad {
    public static List<Universidad> ListaU=new ArrayList<Universidad>();
    
    public static Vector<Universidad> VectorUniversidades()
    {
         Vector<Universidad> Lista= new Vector<Universidad>();
         Universidad ou;
        try{
             ou=new Universidad();
             ou.setIdUniversidad(0);
             ou.setNombre("<Seleccione categoria>");
             ou.setCantidad(0);
             Lista.add(ou);
           for(int i=0;i<ListaU.size();i++)
           {
               ou= new Universidad();
               ou.setIdUniversidad(ListaU.get(i).getIdUniversidad());
               ou.setNombre(ListaU.get(i).getNombre());
               ou.setCantidad(ListaU.get(i).getCantidad());
               Lista.add(ou);
               
           }
            
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        
        }
        return Lista;
    }
     public static DefaultComboBoxModel MostrarComboBoxUniversidades()
    {
        DefaultComboBoxModel dcm= new DefaultComboBoxModel(VectorUniversidades() );
        return dcm;
    }

}
