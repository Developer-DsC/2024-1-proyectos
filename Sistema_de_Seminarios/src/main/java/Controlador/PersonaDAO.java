package Controlador;

import Datos.Conexion;
import Entidades.Persona;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dalton
 */
public class PersonaDAO {

    private static final String Insertar = "Insert into persona values(?,?,?,?,?,?,?,?)";
    private static final String Consultar = "Select * from persona";
    private static final String Eliminar = "Delete from Persona where idPersona=?";
    private static final String Actualizar = "Update persona set idPersona = ?,Cedula = ?, Nombres = ?, Apellidos= ?,Edad=?,Correo=?,idSexo = ?, idEstado=? where idPersona =?";
    private static final String BuscarId = "Select * from persona where idPersona =?";

    public List<Persona> ListaPersonas() throws SQLException {
        Conexion con = new Conexion();
        Connection connection = con.ObtenerConexion();
        List<Persona> ListaPersonas = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultado = statement.executeQuery(Consultar);//susceptible de sql injection

            while (resultado.next()) {
                Persona oe = new Persona();
                oe.setidPersona(resultado.getInt(1));
                oe.setCedula(resultado.getString(2));
                oe.setNombres(resultado.getString(3));
                oe.setApellidos(resultado.getString(4));
                oe.setEdad(resultado.getInt(5));
                oe.setCorreo(resultado.getString(6));
                oe.setidSexo(resultado.getInt(7));
                oe.setidEstado(resultado.getInt(8));

                ListaPersonas.add(oe);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ListaPersonas;
    }

    public Persona SearchEstudiante(int id) throws SQLException {
        Conexion con = new Conexion();
        Connection connection = con.ObtenerConexion();
        Persona oe = null;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultado = statement.executeQuery(BuscarId + "='" + id + "'");

            while (resultado.next()) {
                oe = new Persona();
                oe.setidPersona(resultado.getInt(1));
                oe.setCedula(resultado.getString(2));
                oe.setNombres(resultado.getString(3));
                oe.setApellidos(resultado.getString(4));
                oe.setEdad(resultado.getInt(5));
                oe.setCorreo(resultado.getString(6));
                oe.setidSexo(resultado.getInt(7));
                oe.setidEstado(resultado.getInt(8));

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.getMessage();
        }
        return oe;
    }

    public DefaultTableModel MostrarTablaEstudiante(List<Persona> Lista) {
        String[] titulos = {"idPersona", "Cedula", "Nombres", "Apellidos", "Edad", "Correo", "idSexo", "idEstado"};
        String[] registro = new String[8];
        DefaultTableModel dt = new DefaultTableModel(null, titulos);
        for (Persona oe : Lista) {
            registro[0] = String.valueOf(oe.getidPersona());
            registro[1] = oe.getCedula();
            registro[2] = oe.getNombres();
            registro[3] = oe.getApellidos();
            registro[4] = String.valueOf(oe.getEdad());
            registro[5] = oe.getCorreo();
            registro[6] = String.valueOf(oe.getidSexo());
            registro[7] = String.valueOf(oe.getidEstado());

            dt.addRow(registro);
        }
        return dt;
    }

}
