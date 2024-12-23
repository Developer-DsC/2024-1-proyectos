package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dalton
 */
public class Conexion {

    private static Connection conexion = null;
    private static final String usr = "usuario";
    private static final String pswd = "12345678";
    private static final String url = "jdbc:mysql://localhost:3306/proyecto2dosemestre";

    public Conexion() {
    }

    public Connection ObtenerConexion() throws SQLException {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            conexion = DriverManager.getConnection(url, usr, pswd);
            System.out.println("conexion exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return conexion;
    }
}
