package Controlador;

import Datos.Conexion;
import Entidades.Estado;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Dalton
 */
public class EstadoDAO {

    private static final String Consultar = "Select * from estado";

    public ArrayList<Estado> ListaEstado() throws SQLException {
        Conexion con = new Conexion();
        Connection connection = con.ObtenerConexion();
        ArrayList<Estado> Lista= new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultado = statement.executeQuery(Consultar);//susceptible de sql injection

            while (resultado.next()) {
                Estado oe = new Estado();
                oe.setIdEstado(resultado.getInt(1));
                oe.setNombre(resultado.getString(2));
                oe.setDescripcion(resultado.getString(3));

                ListaEstado().add(oe);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return Lista;
    }

    public void MostrarComboCategoria(JComboBox cmb) throws SQLException {
        ArrayList<Estado> Lista = ListaEstado();
        for (int i = 0; i < Lista.size(); i++) {
            cmb.addItem(new Estado(Lista.get(i).getIdEstado(), Lista.get(i).getNombre(), Lista.get(i).getDescripcion()));
        }
    }
}
