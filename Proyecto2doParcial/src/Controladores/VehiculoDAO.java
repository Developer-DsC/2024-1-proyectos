package Controladores;

import Datos.Conexion;
import Entidades.Vehiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dalton
 */
public class VehiculoDAO {

    private static final String Consultar = "Select * from Vehiculo";
    private static final String Insertar = "Insert into Vehiculo values(?,?,?,?,?,?,?,?)";
    private static final String Eliminar = "Delete from Vehiculo where idVehiculo=?";
    private static final String Modificar = "Update Vehiculo set idVehiculo = ?,Placa = ?, idClase = ?, idTipo= ?,Color1=?, Color2=?,idCombustible=?,NumMotor=?,Marca=?,Modelo=?,Año=?,Cilindraje=?,Peso=?,idPersona  where idVehiculo =?";
    private static final String BuscarId = "Select * from Vehiculo where idVehiculo=?";

    public List<Vehiculo> ListarVehiculo() throws SQLException {
        Conexion con = new Conexion();
        Connection connection = con.ObtenerConexion();
        List<Vehiculo> ListaVehiculo = new ArrayList<>();
        try {
            Statement st = connection.createStatement();
            ResultSet resultado = st.executeQuery(Consultar);//susceptible de sql injection
            while (resultado.next()) {
                Vehiculo op = new Vehiculo();
                op.setIdVehiculo(resultado.getInt(1));
                op.setPlaca(resultado.getString(2));
                op.setIdClase(resultado.getInt(3));
                op.setIdTipo(resultado.getInt(4));
                op.setColor1(resultado.getString(5));
                op.setColor2(resultado.getString(6));
                op.setIdCombustible(resultado.getInt(7));
                op.setNumMotor(resultado.getString(8));
                op.setMarca(resultado.getString(9));
                op.setModelo(resultado.getString(10));
                op.setAño(resultado.getInt(11));
                op.setCilindraje(resultado.getString(12));
                op.setPeso(resultado.getInt(13));
                op.setIdPersona(resultado.getInt(14));
                ListaVehiculo.add(op);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ListaVehiculo;
    }

    public Vehiculo getVehiculo(int id) throws SQLException {
        Conexion con = new Conexion();
        Connection connection = con.ObtenerConexion();
        Vehiculo op = null;
        try {
            Statement st = connection.createStatement();
            ResultSet resultado = st.executeQuery(BuscarId + "='" + id + "'");
            while (resultado.next()) {
                op = new Vehiculo();
                op.setIdVehiculo(resultado.getInt(1));
                op.setPlaca(resultado.getString(2));
                op.setIdClase(resultado.getInt(3));
                op.setIdTipo(resultado.getInt(4));
                op.setColor1(resultado.getString(5));
                op.setColor2(resultado.getString(6));
                op.setIdCombustible(resultado.getInt(7));
                op.setNumMotor(resultado.getString(8));
                op.setMarca(resultado.getString(9));
                op.setModelo(resultado.getString(10));
                op.setAño(resultado.getInt(11));
                op.setCilindraje(resultado.getString(12));
                op.setPeso(resultado.getInt(13));
                op.setIdPersona(resultado.getInt(14));

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.getMessage();
        }
        return op;
    }

    public DefaultTableModel MostrarTablaVehiculo(List<Vehiculo> Lista) {
        String[] titulos = {"IdVehiculo", "Placa", "Clase", "Tipo", "Color1", "Color2", "Combustible", "Numero de Motor", "Marca", "Modelo", "Año", "Cilindraje", "Peso", "Persona"};
        String[] registro = new String[14];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        for (Vehiculo op : Lista) {
            registro[0] = String.valueOf(op.getIdVehiculo());
            registro[1] = op.getPlaca();
            registro[2] = String.valueOf(op.getIdClase());
            registro[3] = String.valueOf(op.getIdTipo());
            registro[4] = op.getColor1();
            registro[5] = op.getColor2();
            registro[6] = String.valueOf(op.getIdCombustible());
            registro[7] = op.getNumMotor();
            registro[8] = op.getMarca();
            registro[9] = op.getModelo();
            registro[10] = String.valueOf(op.getAño());
            registro[11] = op.getCilindraje();
            registro[12] = String.valueOf(op.getPeso());
            registro[13] = String.valueOf(op.getIdPersona());
            modelo.addRow(registro);
        }
        return modelo;
    }

    public boolean InsertarVehiculo(Vehiculo obp) {
        Conexion con = new Conexion();
        boolean op = false;
        try (Connection connection = con.ObtenerConexion()) {
            PreparedStatement pst = connection.prepareStatement(Insertar);
            pst.setInt(1, obp.getIdVehiculo());
            pst.setString(2, obp.getPlaca());
            pst.setInt(3, obp.getIdClase());
            pst.setInt(4, obp.getIdTipo());
            pst.setString(5, obp.getColor1());
            pst.setString(6, obp.getColor2());
            pst.setInt(7, obp.getIdCombustible());
            pst.setString(8, obp.getNumMotor());
            pst.setString(9, obp.getMarca());
            pst.setString(10, obp.getModelo());
            pst.setInt(11, obp.getAño());
            pst.setString(12, obp.getCilindraje());
            pst.setInt(13, obp.getPeso());
            pst.setInt(14, obp.getIdPersona());
            int n = pst.executeUpdate();
            if (n != 0) {
                op = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
        return op;
    }

    public boolean ModificarVehiculo(Vehiculo obp) {
        Conexion con = new Conexion();
        boolean op = false;
        try (Connection connection = con.ObtenerConexion()) {
            PreparedStatement pst = connection.prepareStatement(Modificar);
            pst.setInt(1, obp.getIdVehiculo());
            pst.setString(2, obp.getPlaca());
            pst.setInt(3, obp.getIdClase());
            pst.setInt(4, obp.getIdTipo());
            pst.setString(5, obp.getColor1());
            pst.setString(6, obp.getColor2());
            pst.setInt(7, obp.getIdCombustible());
            pst.setString(8, obp.getNumMotor());
            pst.setString(9, obp.getMarca());
            pst.setString(10, obp.getModelo());
            pst.setInt(11, obp.getAño());
            pst.setString(12, obp.getCilindraje());
            pst.setInt(13, obp.getPeso());
            pst.setInt(14, obp.getIdPersona());
            int n = pst.executeUpdate();
            if (n != 0) {
                op = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
        return op;
    }

    public boolean EliminarVehiculo(Vehiculo obp) {
        Conexion con = new Conexion();
        boolean op = false;
        try (Connection connection = con.ObtenerConexion()) {
            PreparedStatement pst = connection.prepareStatement(Eliminar);
            pst.setInt(1, obp.getIdVehiculo());
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
