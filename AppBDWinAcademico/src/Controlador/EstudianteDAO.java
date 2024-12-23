
package Controlador;

import Datos.Conexion;
import Entidades.Estudiante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class EstudianteDAO {
    private static final String Insertar = "Insert into estudiante values(?,?,?,?,?,?,?)";
    private static final String Consultar = "Select * from estudiante";
    private static final String Eliminar = "Delete from estudiante where IdCodigo=?";
    private static final String Actualizar = "Update estudiante set IdCodigo = ?,Cedula = ?, Nombres = ?, Apellidos= ?, Sexo = ?,Edad=?,Ciudad=? where IdCodigo =?";
    private static final String ConsultarId = "Select * from estudiante where IdCodigo =?";
    public List<Estudiante> ListarEstudiante() throws SQLException
    { 
        Conexion con=new Conexion();
        Connection connection= con.ObtenerConexion();
        List<Estudiante> listaEstudiantes= new ArrayList<>();
        try {
            Statement statement=connection.createStatement();
            ResultSet resultado=statement.executeQuery(Consultar);//susceptible de sql injection
            while(resultado.next())
            {
                Estudiante oe= new Estudiante(); 
                oe.setIdCodigo(resultado.getInt(1));
                oe.setCedula(resultado.getString(2)); 
                oe.setNombres(resultado.getString(3));
                oe.setApellidos(resultado.getString(4));
                oe.setSexo(resultado.getString(5).charAt(0));
                oe.setEdad( Integer.parseInt(resultado.getString(6)));
                oe.setCiudad(resultado.getString(7));
                listaEstudiantes.add(oe);
        }

        } catch (SQLException e)
        {
            System.out.println(e.getMessage()); 
        }
        return listaEstudiantes;


}
    public List<Estudiante> Filtrar(String buscar)
    { 
        Conexion con=new Conexion();
       
        List<Estudiante> listaEstudiantes= new ArrayList<>();
        try {
             Connection connection= con.ObtenerConexion();
            Statement statement=connection.createStatement();//"Nombre like \""+txtBsucar.getText()+"%\" or Apellido like \""+txtBsucar.getText()+"%\"";
            String filtro=buscar+"_%";
            ResultSet resultado=statement.executeQuery("Select * from estudiante where Nombres like"+'"'+filtro+'"');//susceptible de sql injection
            while(resultado.next())
            {
                Estudiante oe= new Estudiante(); 
                oe.setIdCodigo(resultado.getInt(1));
                oe.setCedula(resultado.getString(2)); 
                oe.setNombres(resultado.getString(3));
                oe.setApellidos(resultado.getString(4));
                oe.setSexo(resultado.getString(5).charAt(0));
                oe.setEdad( Integer.parseInt(resultado.getString(6)));
                oe.setCiudad(resultado.getString(7));
                listaEstudiantes.add(oe);
        }

        } catch (SQLException e)
        {
            System.out.println(e.getMessage()); 
        }
        return listaEstudiantes;


}
     public Estudiante SearchEstudiante(int id) throws SQLException{
         Conexion con=new Conexion();
         Connection connection= con.ObtenerConexion();
         Estudiante oe=null;
        try {
            Statement statement=connection.createStatement();
            ResultSet resultado=statement.executeQuery("Select * from estudiante where IdCodigo ='"+id+"'");
            while(resultado.next()){
                oe= new Estudiante(); 
                oe.setIdCodigo(resultado.getInt(1));
                oe.setCedula(resultado.getString(2)); 
                oe.setNombres(resultado.getString(3));
                oe.setApellidos(resultado.getString(4));
                oe.setSexo(resultado.getString(5).charAt(0));
                oe.setEdad( Integer.parseInt(resultado.getString(6)));
                oe.setCiudad(resultado.getString(7)); 
               
                
             }                  
        } catch (SQLException e) 
        {
              System.out.println(e.getMessage());
              e.getMessage();
        }
        return oe;
    }
     public Estudiante FiltarEstudiante(String c)
     {
        Conexion con=new Conexion();
        Estudiante oe=null;
        Statement stmt;
     
        try {
             Connection connection= con.ObtenerConexion();
             Statement statement=connection.createStatement();
             ResultSet resultado = statement.executeQuery("select * from estudiante"+c);
            while (resultado.next()){
               
                oe= new Estudiante(); 
                oe.setIdCodigo(resultado.getInt(1));
                oe.setCedula(resultado.getString(2)); 
                oe.setNombres(resultado.getString(3));
                oe.setApellidos(resultado.getString(4));
                oe.setSexo(resultado.getString(5).charAt(0));
                oe.setEdad( Integer.parseInt(resultado.getString(6)));
                oe.setCiudad(resultado.getString(7));
            }
        } catch (SQLException ex) 
        {
                System.out.println(ex.getMessage());
                ex.getMessage();
        }
        return oe;
    } 
    
    
    public DefaultTableModel MostrarTablaEstudiante(List<Estudiante> Lista)
    {
        String [] titulos = {"IdCodigo","Cedula","Nombres","Apellidos","Sexo","Edad","Ciudad"};
        String[] registro = new String[7]; 
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        for(Estudiante oe : Lista)
        {
            registro[0]= String.valueOf(oe.getIdCodigo());
            registro[1]= oe.getCedula();
            registro[2]= oe.getNombres();
            registro[3]= oe.getApellidos();
            registro[4]= String.valueOf(oe.getSexo());
            registro[5]=  String.valueOf(oe.getEdad());
            registro[6]= oe.getCiudad();        
            modelo.addRow(registro);         
        }
     return modelo;
}
public boolean InsertarEstudiante(Estudiante oe)
{
        Conexion con=new Conexion(); boolean op=false;
        try(Connection connection= con.ObtenerConexion())
        {
        PreparedStatement pst= connection.prepareStatement(Insertar); 
        pst.setInt(1,oe.getIdCodigo());  
        pst.setString(2, oe.getCedula());
        pst.setString(3, oe.getNombres());
        pst.setString(4, oe.getApellidos());
        pst.setString(5, String.valueOf(oe.getSexo()));
        pst.setInt(6, oe.getEdad());
        pst.setString(7, oe.getCiudad());
        int n =pst.executeUpdate();
        if(n!=0)
        {
            op = true;
        }
        } catch (SQLException e)
        {
            System.out.println(e.getMessage()); 
            e.getMessage();
        }
    return op;

}
public boolean ActualizarEstudiante(Estudiante oe)
{
    Conexion con=new Conexion(); boolean op=false;
    try(Connection connection= con.ObtenerConexion())
    {
        PreparedStatement pst= connection.prepareStatement(Actualizar);
        pst.setInt(1,oe.getIdCodigo());  
        pst.setString(2, oe.getCedula());
        pst.setString(3, oe.getNombres());
        pst.setString(4, oe.getApellidos());
        pst.setString(5, String.valueOf(oe.getSexo()));
        pst.setInt(6, oe.getEdad());
        pst.setString(7, oe.getCiudad());
         pst.setInt(8,oe.getIdCodigo()); 
        int n =pst.executeUpdate();
        if(n!=0)
        {
            op = true;
        }
    } catch (SQLException e)
    {
        System.out.println(e.getMessage()); 
        e.getMessage();
    }
    return op;
}
public boolean Delete(Estudiante oe)
{
    Conexion con=new Conexion(); boolean op=false;
    try(Connection connection= con.ObtenerConexion())
    {
    PreparedStatement pst= connection.prepareStatement(Eliminar);
    pst.setInt(1,oe.getIdCodigo()); 
    int n =pst.executeUpdate(); 
    if(n!=0)
    {
        op = true;
    }
    } catch (SQLException e)
    {
        System.out.println(e.getMessage());
        e.getMessage();
    }
    return op;
  }
}
 


 

    


    

