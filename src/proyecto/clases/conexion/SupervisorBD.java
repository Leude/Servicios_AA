package proyecto.clases.conexion;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import proyecto.clases.principales.Supervisor;
import proyecto.conexion.Conexion;

public class SupervisorBD extends Conexion {

    public void altaSupervisor(Supervisor trabajador) {
        try {
            PreparedStatement pst = conn.prepareStatement("INSERT INTO SUPERVISOR(ID_EMPLEADO, ID_SUCURSAL, ID_TURNO) VALUES (?,?,?)");
            pst.setInt(1, trabajador.getId_empleado());
            pst.setInt(2, trabajador.getId_sucursal());
            pst.setString(3, trabajador.getId_turno());
            pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Supervisor Registrado Correctamente");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error, complete los campos");
        }
    }

}
