/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Datos.Conexion;
import Entidades.Estado;
import Entidades.Persona;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Joffre Cartuche C
 */
public class EstadoDAO {
    private static final String Consultar = "Select * from estado";
    public ArrayList<Estado> ListarEstado() throws SQLException
    { 
        Conexion con=new Conexion();
        Connection connection= con.ObtenerConexion();
        ArrayList<Estado> Lista = new ArrayList<>();
        try {
            Statement st=connection.createStatement();
            ResultSet resultado=st.executeQuery(Consultar);//susceptible de sql injection
            while(resultado.next())
            {
                Estado oe= new Estado(); 
                oe.setIdEstado(resultado.getInt(1));
                oe.setNombre(resultado.getString(2)); 
                oe.setDescripcion(resultado.getString(3));
                Lista.add(oe);
        }

        } catch (SQLException e)
        {
            System.out.println(e.getMessage()); 
        }
        return Lista;
    }
     public void MostrarComboEstado( JComboBox cmb) throws SQLException
    {
       
        ArrayList<Estado> Lista= ListarEstado();
        for(int i=0;i<Lista.size();i++)
        {
            cmb.addItem( new Estado(Lista.get(i).getIdEstado(),Lista.get(i).getNombre(),Lista.get(i).getDescripcion()));
        }
        
    }

    
}
