//INTEGRANTES: JUAN DE DIOS ZARATE GARCES, RICARDO ANGEL ALVAREZ MACEDO, DIEGO IVAN GONZALES ALEMAN Y HUGO ALEJANDRO FLORES HERNANDEZ

package proyecto.conexion;

import java.sql.Connection;
import java.sql.SQLException;
import oracle.jdbc.pool.OracleDataSource;

public abstract class Conexion {
    private static final String url="jdbc:oracle:thin:@//localhost:1521/XEPDB1";
    private static final String user= "CA";
    private static final String password="123";
    protected static Connection conn;
 
    public Conexion() {
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
