package proyecto.clases.conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import proyecto.clases.principales.Departamento;
import proyecto.conexion.Conexion;

public class DepartamentoBD extends Conexion {

    public void altaDepartamento(Departamento departamento) {
        try {
            PreparedStatement pst = conn.prepareStatement("INSERT INTO DEPARTAMENTO(NOMBRE,DIRECCION) VALUES(?,?)");
            pst.setString(1, departamento.getNombre());
            pst.setString(2, departamento.getDireccion());
            pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Usuario Registrado Correctamente");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error, complete los campos");
        }
    }

    public void cambioDepartamento(Departamento departamento, Object id_departamento) {
        try {
            PreparedStatement pst = conn.prepareStatement("UPDATE DEPARTAMENTO SET NOMBRE=?,DIRECCION=? WHERE ID_DEPARTAMENTO=?");
            pst.setString(1, departamento.getNombre());
            pst.setString(2, departamento.getDireccion());
            pst.setObject(3, id_departamento);
            pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Datos del Empleado Cambiados con Exito");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error, ingrese correctamente los datos");
        }
    }

    public void bajaDepartamento(Object id_departamento) {
        try {
            PreparedStatement pst = conn.prepareStatement("DELETE FROM DEPARTAMENTO WHERE ID_DEPARTAMENTO=?");
            pst.setObject(1, id_departamento);
            pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Se eliminaron correctamente: ");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error, ingrese los datos correctamente");
        }
    }

    public ArrayList<Departamento> listarBusquedaDeDepartamentos(String bus) {
        String sql = "SELECT * FROM DEPARTAMENTO WHERE ID_DEPARTAMENTO LIKE '%" + bus + "%' OR UPPER(NOMBRE) LIKE UPPER('%" + bus + "%') ORDER BY ID_DEPARTAMENTO";
        ArrayList<Departamento> listaDepartamentoes = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Departamento departamento = new Departamento();
                departamento.setId_departamento(rs.getInt("ID_DEPARTAMENTO"));
                departamento.setNombre(rs.getString("NOMBRE"));
                departamento.setDireccion(rs.getString("DIRECCION"));
                listaDepartamentoes.add(departamento);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error, no se pudo Listar ");
        }
        return listaDepartamentoes;
    }
}
