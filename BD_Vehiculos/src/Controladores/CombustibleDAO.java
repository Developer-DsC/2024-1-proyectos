package Controladores;

/**
 *
 * @author Dalton
 */
import Datos.Conexion;
import Entidades.Combustible;
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
public class CombustibleDAO {

    private static final String Consultar = "Select * from Combustible";

    public ArrayList<Combustible> ListarEstado() throws SQLException {
        Conexion con = new Conexion();
        Connection connection = con.ObtenerConexion();
        ArrayList<Combustible> Lista = new ArrayList<>();
        try {
            Statement st = connection.createStatement();
            ResultSet resultado = st.executeQuery(Consultar);//susceptible de sql injection
            while (resultado.next()) {
                Combustible oe = new Combustible();
                oe.setIdCombustible(resultado.getInt(1));
                oe.setNombre(resultado.getString(2));
                oe.setDescripcion(resultado.getString(3));
                Lista.add(oe);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return Lista;
    }

    public void MostrarComboCombustible(JComboBox cmb) throws SQLException {

        ArrayList<Combustible> Lista = ListarEstado();
        for (int i = 0; i < Lista.size(); i++) {
            cmb.addItem(new Combustible(Lista.get(i).getIdCombustible(), Lista.get(i).getNombre(), Lista.get(i).getDescripcion()));
        }
    }
}
