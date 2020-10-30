//Futura interfaz del proyecto
package proyecto.conexion.sql;

import java.sql.*;
import oracle.jdbc.pool.OracleDataSource;

public class SQL {
//Todavia en proceso de programar 12344

    public void abrir() throws SQLException {
        OracleDataSource ods = new OracleDataSource();
        ods.setURL("jdbc:oracle:thin:@//Ricardo:1521/XEPDB1");
        ods.setUser("");
        ods.setPassword("");
        Connection conn = ods.getConnection();
        PreparedStatement stmt = conn.prepareStatement("SELECT 'Hello World!' FROM dual");
        ResultSet rslt = stmt.executeQuery();
        while (rslt.next()) {
            System.out.println(rslt.getString(1));
        }
    }
}
