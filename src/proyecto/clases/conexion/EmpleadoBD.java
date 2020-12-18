//INTEGRANTES: JUAN DE DIOS ZARATE GARCES, RICARDO ANGEL ALVAREZ MACEDO, DIEGO IVAN GONZALES ALEMAN Y HUGO ALEJANDRO FLORES HERNANDEZ

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
        String sql = "UPDATE EMPLEADO SET NOMBRE= ?, PRIMER_APELLIDO= ?, SEGUNDO_APELLIDO= ?,TELEFONO=?,CORREO=?,DIRECCION=?,CLAVE=? WHERE ID_EMPLEADO= ?";
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

    public void bajaEmpleado(Object id_empleado) {
        String sql = "DELETE FROM EMPLEADO WHERE ID_EMPLEADO=?";
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
        String sql = "SELECT * FROM (SELECT * FROM empleado e WHERE id_empleado NOT IN (SELECT t.id_empleado FROM trabajador t) AND id_empleado NOT IN (SELECT g.id_empleado FROM gerente g) AND id_empleado NOT IN (SELECT s.id_empleado FROM supervisor s)) da WHERE da.id_empleado like '%" + bus + "%' or UPPER(da.nombre) like UPPER('%" + bus + "%') ORDER BY id_empleado";
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
        String sql = "SELECT * FROM (SELECT * FROM empleado e WHERE id_empleado IN "
                + "(SELECT t.id_empleado FROM trabajador t) OR id_empleado IN "
                + "(SELECT g.id_empleado FROM gerente g) OR id_empleado IN "
                + "(SELECT s.id_empleado FROM supervisor s)) da "
                + "WHERE da.id_empleado like '%" + bus + "%' or UPPER(da.nombre) like "
                + "UPPER('%" + bus + "%') ORDER BY id_empleado";
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

    public ArrayList<Empleado> listarBusquedaDeEmpleadosNoCumplenHorario(String fecha_1, String fecha_2) {
        String sql = "SELECT id_empleado,nombre,primer_apellido,segundo_apellido FROM empleado \n"
                + "WHERE id_empleado in\n"
                + "(SELECT a.id_empleado from Asistencia a\n"
                + "JOIN (SELECT id_empleado,hora_inicial FROM trabajador NATURAL JOIN turno UNION SELECT id_empleado,hora_inicial FROM gerente NATURAL JOIN turno\n"
                + "UNION SELECT id_empleado,hora_inicial from supervisor NATURAL JOIN turno) d ON (a.id_empleado=d.id_empleado)\n"
                + "WHERE a.hora_entrada BETWEEN TO_DATE('" + fecha_1 + "', 'DD/MM/YY') AND TO_DATE('" + fecha_2 + "', 'DD/MM/YY')\n"
                + "AND extract(HOUR from cast(a.hora_entrada as timestamp))+extract(MINUTE from cast(a.hora_entrada as timestamp))/100\n"
                + "NOT BETWEEN extract(hour from cast(d.hora_inicial as timestamp))+extract(MINUTE from cast(d.hora_inicial as timestamp))/100\n"
                + "and extract(hour from cast(d.hora_inicial as timestamp))+(extract(MINUTE from cast(d.hora_inicial as timestamp))+15)/100\n"
                + "GROUP BY a.id_empleado)";
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
                listaEmpleados.add(empleado);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error, no se pudo Listar ");
        }
        return listaEmpleados;
    }

    public ArrayList<Empleado> listarSupervisoresPorSucursales(String sucursal) {
        String sql = "SELECT id_empleado,em.nombre,em.primer_apellido,em.segundo_apellido,id_turno FROM supervisor\n"
                + "JOIN empleado em USING (id_empleado)\n"
                + "join sucursal su USING (id_sucursal)\n"
                + "WHERE su.nombre = '" + sucursal + "'";
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Empleado empleado = new Empleado();
                empleado.setId_empleado(rs.getInt(1));
                empleado.setNombre(rs.getString(2));
                empleado.setPrimer_apellido(rs.getString(3));
                empleado.setSegundo_apellido(rs.getString(4));
                empleado.setClave(rs.getString(5));
                listaEmpleados.add(empleado);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error, no se pudo Listar ");
        }
        return listaEmpleados;
    }

    public ArrayList<Empleado> listarEmpleadosPorSucursales(String sucursal) {
        String sql = "SELECT COUNT(d.id_empleado) FROM (SELECT id_empleado,id_turno,hora_inicial,s.nombre FROM trabajador NATURAL JOIN turno t NATURAL JOIN sucursal s UNION SELECT id_empleado,id_turno,hora_inicial,s.nombre FROM gerente NATURAL JOIN turno t NATURAL JOIN sucursal s UNION SELECT id_empleado,id_turno,hora_inicial,s.nombre FROM supervisor NATURAL JOIN turno t NATURAL JOIN sucursal s) d WHERE d.nombre = '" + sucursal + "'";
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Empleado empleado = new Empleado();
                empleado.setId_empleado(rs.getInt(1));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error, no se pudo Listar ");
        }
        return listaEmpleados;
    }
}
