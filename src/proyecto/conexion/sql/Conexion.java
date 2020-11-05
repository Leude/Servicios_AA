package proyecto.conexion.sql;

import java.sql.Connection;
import java.sql.SQLException;
import oracle.jdbc.pool.OracleDataSource;

public abstract class Conexion {

    protected Connection conn;
    boolean estado;

    public void abrirConexionSQL() {
        try {
            OracleDataSource ods = new OracleDataSource();
            ods.setURL("jdbc:oracle:thin:@//Ricardo:1521/XEPDB1"); // jdbc:oracle:thin@//[nombre de host]:[puerto]/[nombre de servicio BD]
            ods.setUser("CA"); // [nombre de usuario]
            ods.setPassword("123"); // [contraseña]
            conn = ods.getConnection();
            estado = true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            estado = false;
        }
    }

    public boolean getEstadoConexionSQL() {
        return estado;
    }

    public Connection getConexionSQL() {
        return conn;
    }

    public abstract void insertarTabla();

}
