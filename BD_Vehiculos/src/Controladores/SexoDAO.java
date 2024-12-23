package Controladores;

/**
 *
 * @author Dalton
 */
import Datos.Conexion;
import Entidades.Sexo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JComboBox;

public class SexoDAO {

    private static final String Consultar = "Select * from Sexo";

    public ArrayList<Sexo> ListarEstado() throws SQLException {
        Conexion con = new Conexion();
        Connection connection = con.ObtenerConexion();
        ArrayList<Sexo> Lista = new ArrayList<>();
        try {
            Statement st = connection.createStatement();
            ResultSet resultado = st.executeQuery(Consultar);//susceptible de sql injection
            while (resultado.next()) {
                Sexo oe = new Sexo();
                oe.setIdSexo(resultado.getInt(1));
                oe.setNombre(resultado.getString(2));
                oe.setDescripcion(resultado.getString(3));
                Lista.add(oe);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return Lista;
    }

    public void MostrarComboSexo(JComboBox cmb) throws SQLException {

        ArrayList<Sexo> Lista = ListarEstado();
        for (int i = 0; i < Lista.size(); i++) {
            cmb.addItem(new Sexo(Lista.get(i).getIdSexo(), Lista.get(i).getNombre(), Lista.get(i).getDescripcion()));
        }
    }
}
