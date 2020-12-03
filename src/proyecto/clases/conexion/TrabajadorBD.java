package proyecto.clases.conexion;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import proyecto.clases.principales.Trabajador;
import proyecto.conexion.Conexion;

public class TrabajadorBD extends Conexion {

    public void altaTrabajador(Trabajador trabajador) {
        try {
            PreparedStatement pst = conn.prepareStatement("INSERT INTO TRABAJADOR(ID_EMPLEADO, ID_DEPARTAMENTO, ID_SUCURSAL, ID_TURNO) VALUES (?,?,?,?)");
            pst.setInt(1, trabajador.getId_empleado());
            pst.setInt(2, trabajador.getId_departamento());
            pst.setInt(3, trabajador.getId_sucursal());
            pst.setString(4, trabajador.getId_turno());
            pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Trabajador Registrado Correctamente");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error, complete los campos");
        }
    }
}
