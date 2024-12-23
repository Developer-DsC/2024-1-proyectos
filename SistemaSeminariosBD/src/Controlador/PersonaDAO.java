package Controlador;

import Datos.Conexion;
import Entidades.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PersonaDAO {

    private static final String Consultar = "Select * from persona";
    private static final String Insertar = "Insert into persona values(?,?,?,?,?,?,?,?)";
    private static final String Eliminar = "Delete from persona where IdPersona=?";
    private static final String Actualizar = "Update persona set IdPersona = ?,Cedula = ?, Nombres = ?, Apellido= ?,Edad=?,Mail=?, IdSexo=?,Idestado=? where IdPersona =?";
    private static final String BuscarId = "Select * from persona where IdPersona";

    public List<Persona> ListarPersona() throws SQLException {
        Conexion con = new Conexion();
        Connection connection = con.ObtenerConexion();
        List<Persona> ListaPersona = new ArrayList<>();
        try {
            Statement st = connection.createStatement();
            ResultSet resultado = st.executeQuery(Consultar);//susceptible de sql injection
            while (resultado.next()) {
                Persona op = new Persona();
                op.setIdPersona(resultado.getInt(1));
                op.setCedula(resultado.getString(2));
                op.setNombres(resultado.getString(3));
                op.setApellidos(resultado.getString(4));
                op.setEdad(resultado.getInt(5));
                op.setMail(resultado.getString(6));
                op.setIdSexo(resultado.getInt(7));
                op.setIdEstado(resultado.getInt(8));
                ListaPersona.add(op);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ListaPersona;
    }

    public Persona getPersona(int id) throws SQLException {
        Conexion con = new Conexion();
        Connection connection = con.ObtenerConexion();
        Persona op = null;
        try {
            Statement st = connection.createStatement();
            ResultSet resultado = st.executeQuery(BuscarId + "='" + id + "'");
            while (resultado.next()) {
                op = new Persona();
                op.setIdPersona(resultado.getInt(1));
                op.setCedula(resultado.getString(2));
                op.setNombres(resultado.getString(3));
                op.setApellidos(resultado.getString(4));
                op.setEdad(resultado.getInt(5));
                op.setMail(resultado.getString(6));
                op.setIdSexo(resultado.getInt(7));
                op.setIdEstado(resultado.getInt(8));

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.getMessage();
        }
        return op;
    }

    public DefaultTableModel MostrarTablaPersona(List<Persona> Lista) {
        String[] titulos = {"IdPersona", "Cedula", "Nombres", "Apellidos", "Edad", "Mail", "IdSexo", "IdEstado"};
        String[] registro = new String[8];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        for (Persona op : Lista) {
            registro[0] = String.valueOf(op.getIdPersona());
            registro[1] = op.getCedula();
            registro[2] = op.getNombres();
            registro[3] = op.getApellidos();
            registro[4] = String.valueOf(op.getEdad());
            registro[5] = op.getMail();
            registro[6] = String.valueOf(op.getIdSexo());
            registro[7] = String.valueOf(op.getIdEstado());
            modelo.addRow(registro);
        }
        return modelo;
    }

    public boolean InsertarPersona(Persona obp) {
        Conexion con = new Conexion();
        boolean op = false;
        try (Connection connection = con.ObtenerConexion()) {
            PreparedStatement pst = connection.prepareStatement(Insertar);
            pst.setInt(1, obp.getIdPersona());
            pst.setString(2, obp.getCedula());
            pst.setString(3, obp.getNombres());
            pst.setString(4, obp.getApellidos());
            pst.setInt(5, obp.getEdad());
            pst.setString(6, obp.getMail());
            pst.setInt(7, obp.getIdSexo());
            pst.setInt(8, obp.getIdEstado());
            int n = pst.executeUpdate();
            if (n != 0) {
                op = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
        return op;
    }

    public boolean ModificarPersona(Persona obp) {
        Conexion con = new Conexion();
        boolean op = false;
        try (Connection connection = con.ObtenerConexion()) {
            PreparedStatement pst = connection.prepareStatement(Actualizar);
            pst.setInt(1, obp.getIdPersona());
            pst.setString(2, obp.getCedula());
            pst.setString(3, obp.getNombres());
            pst.setString(4, obp.getApellidos());
            pst.setInt(5, obp.getEdad());
            pst.setString(6, obp.getMail());
            pst.setInt(7, obp.getIdSexo());
            pst.setInt(8, obp.getIdEstado());
            pst.setInt(9, obp.getIdPersona());
            int n = pst.executeUpdate();
            if (n != 0) {
                op = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
        return op;
    }

    public boolean EliminarPersona(Persona obp) {
        Conexion con = new Conexion();
        boolean op = false;
        try (Connection connection = con.ObtenerConexion()) {
            PreparedStatement pst = connection.prepareStatement(Eliminar);
            pst.setInt(1, obp.getIdPersona());
            int n = pst.executeUpdate();
            if (n != 0) {
                op = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
        return op;
    }
}
