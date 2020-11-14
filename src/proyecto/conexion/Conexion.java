package proyecto.conexion;

import java.sql.Connection;
import java.sql.SQLException;
import oracle.jdbc.pool.OracleDataSource;

public class Conexion {
    private String url="jdbc:oracle:thin:@//Ricardo:1521/XEPDB1";
    private String user= "CA";
    private String password="123";
    protected Connection conn;

    public void abrirConexionSQL() {
        try {
            OracleDataSource ods = new OracleDataSource();
            ods.setURL(url); // jdbc:oracle:thin@//[nombre de host]:[puerto]/[nombre de servicio BD]
            ods.setUser(user); // [nombre de usuario]
            ods.setPassword(password); // [contraseña]
            conn = ods.getConnection();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
