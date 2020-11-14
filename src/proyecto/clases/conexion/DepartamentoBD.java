package proyecto.clases.conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import proyecto.clases.principales.Departamento;
import proyecto.conexion.Conexion;

public class DepartamentoBD extends Conexion {

    public void altaDepartamento(Departamento departamento) {
        try {
            PreparedStatement pst = conn.prepareStatement("INSERT INTO DEPARTAMENTO(NOMBRE_DEPARTAMENTO) VALUES(?)");
            pst.setString(1, departamento.getNombre_departamento());
            pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en ingresar datos del departamento");
        }
    }

    public Departamento consultaDepartamento(int id_departamento) {
        Departamento departamento = null;
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM DEPARTAMENTO WHERE ID_DEPARTAMENTO = " + id_departamento);
            while (rs.next()) {
                departamento = new Departamento();
                departamento.setId_departamento(rs.getInt("ID_DEPARTAMENTO"));
                departamento.setNombre_departamento(rs.getString("NOMBRE_DEPARTAMENTO"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en buscar datos del departamento");
        }
        return departamento;
    }

    public void cambioDepartamento(Departamento departamento, int id_departamento) {
        try {
            PreparedStatement pst = conn.prepareStatement("UPDATE DEPARTAMENTO SET NOMBRE_DEPARTAMENTO=? WHERE ID_DEPARTAMENTO=?");
            pst.setString(1, departamento.getNombre_departamento());
            pst.setInt(2, id_departamento);
            pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en actualizar datos del departamento");
        }
    }

    //Eliminar datos de la DB
    public void bajaDepartamento(int id_departamento) {
        try {
            PreparedStatement pst = conn.prepareStatement("DELETE FROM DEPARTAMENTO WHERE ID_DEPARTAMENTO=?");
            pst.setInt(1, id_departamento);
            pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en la eliminacion del departamento");
        }
    }

    public ArrayList<Departamento> listarDepartamentos() {
        ArrayList<Departamento> listaDepartamentos = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT ID_DEPARTAMENTO,NOMBRE_DEPARTAMENTO "
                    + "FROM DEPARTAMENTO");
            while (rs.next()) {
                Departamento departamento = new Departamento();
                departamento.setId_departamento(rs.getInt("ID_DEPARTAMENTO"));
                departamento.setNombre_departamento(rs.getString("NOMBRE_DEPARTAMENTO"));
                listaDepartamentos.add(departamento);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Error en listar los datos de los departamento");
        }
        return listaDepartamentos;
    }
}
