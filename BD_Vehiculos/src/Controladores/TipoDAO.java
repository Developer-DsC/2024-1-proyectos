package Controladores;

/**
 *
 * @author Dalton
 */

import Datos.Conexion;
import Entidades.Tipo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JComboBox;

public class TipoDAO {

    private static final String Consultar = "Select * from Tipo";

    public ArrayList<Tipo> ListarEstado() throws SQLException {
        Conexion con = new Conexion();
        Connection connection = con.ObtenerConexion();
        ArrayList<Tipo> Lista = new ArrayList<>();
        try {
            Statement st = connection.createStatement();
            ResultSet resultado = st.executeQuery(Consultar);//susceptible de sql injection
            while (resultado.next()) {
                Tipo oe = new Tipo();
                oe.setIdTipo(resultado.getInt(1));
                oe.setNombre(resultado.getString(2));
                oe.setDescripcion(resultado.getString(3));
                Lista.add(oe);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return Lista;
    }

    public void MostrarComboTipo(JComboBox cmb) throws SQLException {

        ArrayList<Tipo> Lista = ListarEstado();
        for (int i = 0; i < Lista.size(); i++) {
            cmb.addItem(new Tipo(Lista.get(i).getIdTipo(), Lista.get(i).getNombre(), Lista.get(i).getDescripcion()));
        }
    }
}
