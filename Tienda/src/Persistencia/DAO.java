package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DAO {

    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.jdbc.Driver";

    protected void conectarBase() throws Exception {
        try {
            Class.forName(DRIVER);
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
            conexion = DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        }
    }

    protected void desconectarBase() throws Exception {
        try {
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

    protected void insertarModificarEliminar(String query) throws Exception {
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(query);
        } catch (SQLException ex) {
            throw ex;
        } finally {
            desconectarBase();
        }
    }

    protected void consultarBase(String query) throws Exception {
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(query);
        } catch (Exception ex) {
            throw ex;
        }
    }
}
