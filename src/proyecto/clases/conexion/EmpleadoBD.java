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
        String sql = "INSERT INTO empleado(NOMBRE,PRIMER_APELLIDO,SEGUNDO_APELLIDO,TELEFONO,CORREO,DIRECCION,CLAVE) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, empleado.getNombre());
            pst.setString(2, empleado.getPrimer_apellido());
            pst.setString(3, empleado.getSegundo_apellido());
            pst.setString(4, empleado.getTelefono());
            pst.setString(5, empleado.getCorreo());
            pst.setString(6, empleado.getDireccion());
            pst.setString(7, empleado.getClave());
            pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Usuario Registrado Correctamente");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error, complete los campos");
        }
    }

    public void cambioEmpleado(Empleado empleado, Object id_empleado) {
        String sql ="UPDATE EMPLEADO SET NOMBRE= ?, PRIMER_APELLIDO= ?, SEGUNDO_APELLIDO= ?,TELEFONO=?,CORREO=?,DIRECCION=?,CLAVE=? WHERE ID_EMPLEADO= ?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, empleado.getNombre());
            pst.setString(2, empleado.getPrimer_apellido());
            pst.setString(3, empleado.getSegundo_apellido());
            pst.setString(4, empleado.getTelefono());
            pst.setString(5, empleado.getCorreo());
            pst.setString(6, empleado.getDireccion());
            pst.setString(7, empleado.getClave());
            pst.setObject(8, id_empleado);
            pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Datos del Empleado Cambiados con Exito");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error, ingrese correctamente los datos");
        }
    }

    //Eliminar datos de la DB
    public void bajaEmpleado(Object id_empleado) {
        String sql ="DELETE FROM EMPLEADO WHERE ID_EMPLEADO=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setObject(1, id_empleado);
            pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Se eliminaron correctamente: ");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error, Este Empleado tiene un Rol de Trabajo");
        }
    }

    public ArrayList<Empleado> listarBusquedaDeEmpleadosSinAsignar(String bus) {
        String sql = "SELECT * FROM (SELECT * FROM empleado e WHERE id_empleado NOT IN (SELECT t.id_empleado FROM trabajador t) AND id_empleado NOT IN (SELECT g.id_empleado FROM gerente g) AND id_empleado NOT IN (SELECT s.id_empleado FROM supervisor s)) da WHERE da.id_empleado like '%"+bus+"%' or UPPER(da.nombre) like UPPER('%"+bus+"%') ORDER BY id_empleado";
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Empleado empleado = new Empleado();
                empleado.setId_empleado(rs.getInt("ID_EMPLEADO"));
                empleado.setNombre(rs.getString("NOMBRE"));
                empleado.setPrimer_apellido(rs.getString("PRIMER_APELLIDO"));
                empleado.setSegundo_apellido(rs.getString("SEGUNDO_APELLIDO"));
                empleado.setTelefono(rs.getString("TELEFONO"));
                empleado.setCorreo(rs.getString("CORREO"));
                empleado.setDireccion(rs.getString("DIRECCION"));
                empleado.setClave(rs.getString("CLAVE"));
                listaEmpleados.add(empleado);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error, no se pudo Listar ");
        }
        return listaEmpleados;
    }

    public ArrayList<Empleado> listarBusquedaDeEmpleadosAsignados(String bus) {
        String sql = "SELECT * FROM (SELECT * FROM empleado e WHERE id_empleado IN (SELECT t.id_empleado FROM trabajador t) OR id_empleado IN (SELECT g.id_empleado FROM gerente g) OR id_empleado IN (SELECT s.id_empleado FROM supervisor s)) da WHERE da.id_empleado like '%"+bus+"%' or UPPER(da.nombre) like UPPER('%"+bus+"%') ORDER BY id_empleado";
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Empleado empleado = new Empleado();
                empleado.setId_empleado(rs.getInt("ID_EMPLEADO"));
                empleado.setNombre(rs.getString("NOMBRE"));
                empleado.setPrimer_apellido(rs.getString("PRIMER_APELLIDO"));
                empleado.setSegundo_apellido(rs.getString("SEGUNDO_APELLIDO"));
                empleado.setTelefono(rs.getString("TELEFONO"));
                empleado.setCorreo(rs.getString("CORREO"));
                empleado.setDireccion(rs.getString("DIRECCION"));
                empleado.setClave(rs.getString("CLAVE"));
                listaEmpleados.add(empleado);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error, no se pudo Listar ");
        }
        return listaEmpleados;
    }

    public ArrayList<Empleado> listarBusquedaDeEmpleados(String bus) {
        String sql = "SELECT * FROM EMPLEADO WHERE id_empleado like '%" + bus + "%' or UPPER(nombre) like UPPER('%" + bus + "%') ORDER BY id_empleado";
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Empleado empleado = new Empleado();
                empleado.setId_empleado(rs.getInt("ID_EMPLEADO"));
                empleado.setNombre(rs.getString("NOMBRE"));
                empleado.setPrimer_apellido(rs.getString("PRIMER_APELLIDO"));
                empleado.setSegundo_apellido(rs.getString("SEGUNDO_APELLIDO"));
                empleado.setTelefono(rs.getString("TELEFONO"));
                empleado.setCorreo(rs.getString("CORREO"));
                empleado.setDireccion(rs.getString("DIRECCION"));
                empleado.setClave(rs.getString("CLAVE"));
                listaEmpleados.add(empleado);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error, no se pudo Listar ");
        }
        return listaEmpleados;
    }

}
