package Controladores;

import Datos.Conexion;
import Entidades.Clase;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author Dalton
 */
public class ClaseDAO {

    private static final String Consultar = "Select * from clase";

    public ArrayList<Clase> ListaClase() throws SQLException {
        Conexion con = new Conexion();
        Connection connection = con.ObtenerConexion();
        ArrayList<Clase> Lista = new ArrayList<>();
        try {
            Statement st = connection.createStatement();
            ResultSet resultado = st.executeQuery(Consultar);//susceptible de sql injection
            while (resultado.next()) {

                Clase oe = new Clase();
                oe.setIdClase(resultado.getInt(1));
                oe.setNombre(resultado.getString(2));
                oe.setDescripcion(resultado.getString(3));

                Lista.add(oe);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return Lista;
    }

    public void MostrarComboClase(JComboBox cmb) throws SQLException {

        ArrayList<Clase> Lista = ListaClase();
        for (int i = 0; i < Lista.size(); i++) {
            cmb.addItem(new Clase(Lista.get(i).getIdClase(), Lista.get(i).getNombre(), Lista.get(i).getDescripcion()));
        }
    }
}
