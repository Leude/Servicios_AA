package proyecto.clases.conexion;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import proyecto.clases.principales.Trabajador;
import proyecto.conexion.Conexion;

public class AsistenciaBD extends Conexion {

    public void entradaAsistencia(Object empleado) {
        String sql = "INSERT INTO asistencia(id_empleado,hora_entrada) VALUES(?,sysdate)";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setObject(1, empleado);
            pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Asistencia Registrada Correctamente");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
    public void salidaAsistencia(Object id_empleado) {
        String sql ="UPDATE ASISTENCIA SET HORA_SALIDA=sysdate WHERE ID_EMPLEADO=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setObject(1, id_empleado);
            pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Datos del Empleado Cambiados con Exito");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error, ingrese correctamente los datos");
        }
    }
}
