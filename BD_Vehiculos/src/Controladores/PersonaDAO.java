package Controladores;

/**
 *
 * @author Dalton
 */
import Datos.Conexion;
import Entidades.Persona;
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
public class PersonaDAO {

    private static final String Consultar = "Select * from Persona";

    public ArrayList<Persona> ListarEstado() throws SQLException {
        Conexion con = new Conexion();
        Connection connection = con.ObtenerConexion();
        ArrayList<Persona> Lista = new ArrayList<>();
        try {
            Statement st = connection.createStatement();
            ResultSet resultado = st.executeQuery(Consultar);//susceptible de sql injection
            while (resultado.next()) {
                Persona oe = new Persona();
                oe.setIdPersona(resultado.getInt(1));
                oe.setCedula(resultado.getString(2));
                oe.setNombre(resultado.getString(3));
                oe.setApellido(resultado.getString(4));
                oe.setEdad(resultado.getInt(5));
                oe.setIdSexo(resultado.getInt(6));
                oe.setIdEstado(resultado.getInt(7));
                Lista.add(oe);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return Lista;
    }

    public void MostrarComboPersona(JComboBox cmb) throws SQLException {

        ArrayList<Persona> Lista = ListarEstado();
        for (int i = 0; i < Lista.size(); i++) {
            cmb.addItem(new Persona(Lista.get(i).getIdPersona(), Lista.get(i).getCedula(), Lista.get(i).getNombre(), Lista.get(i).getApellido(), Lista.get(i).getEdad(), Lista.get(i).getIdSexo(), Lista.get(i).getIdEstado()));
        }
    }
}
