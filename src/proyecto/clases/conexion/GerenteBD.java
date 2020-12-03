package proyecto.clases.conexion;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import proyecto.clases.principales.Gerente;
import proyecto.conexion.Conexion;

public class GerenteBD extends Conexion {

    public void altaGerente(Gerente trabajador) {
        try {
            PreparedStatement pst = conn.prepareStatement("INSERT INTO GERENTE(ID_EMPLEADO, ID_SUCURSAL, ID_TURNO) VALUES (?,?,?)");
            pst.setInt(1, trabajador.getId_empleado());
            pst.setInt(2, trabajador.getId_sucursal());
            pst.setString(3, trabajador.getId_turno());
            pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Gerente Registrado Correctamente");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "En esta sucursal ya esta asignado un gerente");
        }
    }

}
