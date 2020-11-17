package proyecto.clases.conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import proyecto.clases.principales.Empleado;
import proyecto.conexion.Conexion;

public class EmpleadoBD extends Conexion {

    public void altaEmpleado(Empleado empleado) {
        try {
            PreparedStatement pst = conn.prepareStatement("INSERT INTO empleado(nombre,PRIMER_APELLIDO,SEGUNDO_APELLIDO) VALUES (?,?,?)");
            pst.setString(1, empleado.getNombre());
            pst.setString(2, empleado.getPrimer_apellido());
            pst.setString(3, empleado.getSegundo_apellido());
            pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Usuario Registrado Correctamente");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error, complete los campos");
        }
    }

    //buscar datos
    public ArrayList<Empleado> consultaEmpleado(int id_empleado) {
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM empleado where id_empleado = "+id_empleado);
            while (rs.next()) {
                Empleado empleado = new Empleado();
                empleado.setId_empleado(rs.getInt("ID_EMPLEADO"));
                empleado.setNombre(rs.getString("NOMBRE"));
                empleado.setPrimer_apellido(rs.getString("PRIMER_APELLIDO"));
                empleado.setSegundo_apellido(rs.getString("SEGUNDO_APELLIDO"));
                listaEmpleados.add(empleado);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error, no se pudo hacer la consulta");
        }
        return listaEmpleados;
    }

    public void cambioEmpleado(Empleado empleado, int id_empleado) {
        try {
            PreparedStatement pst = conn.prepareStatement("UPDATE EMPLEADO SET NOMBRE= ?, PRIMER_APELLIDO= ?, SEGUNDO_APELLIDO= ? WHERE ID_EMPLEADO= ?");
            pst.setString(1, empleado.getNombre());
            pst.setString(2, empleado.getPrimer_apellido());
            pst.setString(3, empleado.getSegundo_apellido());
            pst.setInt(4, id_empleado);
            pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Datos del Empleado Cambiados con Exito");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
           JOptionPane.showMessageDialog(null, "Error, ingrese correctamente los datos");
        }
    }

    //Eliminar datos de la DB
    public void bajaEmpleado(int id_empleado) {
        try {
            PreparedStatement pst = conn.prepareStatement("DELETE FROM EMPLEADO WHERE ID_EMPLEADO=?");
            pst.setInt(1, id_empleado);
            pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Se eliminaron correctamente: ");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error, ingrese los datos correctamente");
        }
    }
//PARA LISTAR TODOS LOS EMPLEADO DE LA BASE DE DATOS

    public ArrayList<Empleado> listarTodosLosEmpleados() {
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM EMPLEADO ORDER BY id_empleado ");
            while (rs.next()) {
                Empleado empleado = new Empleado();
                empleado.setId_empleado(rs.getInt("ID_EMPLEADO"));
                empleado.setNombre(rs.getString("NOMBRE"));
                empleado.setPrimer_apellido(rs.getString("PRIMER_APELLIDO"));
                empleado.setSegundo_apellido(rs.getString("SEGUNDO_APELLIDO"));
                listaEmpleados.add(empleado);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error, no se pudo Listar ");
        }
        return listaEmpleados;
    }
}
