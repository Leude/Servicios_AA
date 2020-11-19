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
            PreparedStatement pst = conn.prepareStatement("INSERT INTO DEPARTAMENTO(NOMBRE_DEPARTAMENTO) VALUES(?)");
            pst.setString(1, departamento.getNombre());
            pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Usuario Registrado Correctamente");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error, complete los campos");
        }
    }

    public ArrayList<Departamento> consultaDepartamento(int id_departamento) {
        ArrayList<Departamento> listaDepartamentoes = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM DEPARTAMENTO WHERE ID_DEPARTAMENTO = " + id_departamento);
            while (rs.next()) {
                Departamento departamento = new Departamento();
                departamento.setId_departamento(rs.getInt("ID_DEPARTAMENTO"));
                departamento.setNombre(rs.getString("NOMBRE_DEPARTAMENTO"));
                listaDepartamentoes.add(departamento);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error, no se pudo hacer la consulta");
        }
        return listaDepartamentoes;
    }

    public void cambioDepartamento(Departamento departamento, int id_departamento) {
        try {
            PreparedStatement pst = conn.prepareStatement("UPDATE DEPARTAMENTO SET NOMBRE_DEPARTAMENTO=? WHERE ID_DEPARTAMENTO=?");
            pst.setString(1, departamento.getNombre());
            pst.setInt(2, id_departamento);
            pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Datos del Empleado Cambiados con Exito");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error, ingrese correctamente los datos");
        }
    }

    //Eliminar datos de la DB
    public void bajaDepartamento(int id_departamento) {
        try {
            PreparedStatement pst = conn.prepareStatement("DELETE FROM DEPARTAMENTO WHERE ID_DEPARTAMENTO=?");
            pst.setInt(1, id_departamento);
            pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Se eliminaron correctamente: ");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error, ingrese los datos correctamente");
        }
    }

    public ArrayList<Departamento> listarTodosLosDepartamentos() {
        ArrayList<Departamento> listaDepartamentoes = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT ID_DEPARTAMENTO,NOMBRE_DEPARTAMENTO "
                    + "FROM DEPARTAMENTO");
            while (rs.next()) {
                Departamento departamento = new Departamento();
                departamento.setId_departamento(rs.getInt("ID_DEPARTAMENTO"));
                departamento.setNombre(rs.getString("NOMBRE_DEPARTAMENTO"));
                listaDepartamentoes.add(departamento);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error, no se pudo Listar ");
        }
        return listaDepartamentoes;
    }
}
