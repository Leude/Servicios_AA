//Futura interfaz del proyecto
package database;
//puede cambiarse a import java.sql.*
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import oracle.jdbc.pool.OracleDataSource;

public class SQL {
//Todavia en proceso de programar 1234
    public void abrir() throws SQLException {
        OracleDataSource ods = new OracleDataSource();
        ods.setURL("jdbc:oracle:thin:@//localhost:1521/XEPDB1"); 
        ods.setUser("sistema"); 
        ods.setPassword("GetStarted18c"); 
        Connection conn = ods.getConnection();
        PreparedStatement stmt = conn.prepareStatement("SELECT 'Hello World!' FROM dual");
        ResultSet rslt = stmt.executeQuery();
        while (rslt.next()) {
            System.out.println(rslt.getString(1));
        }
    }
}

