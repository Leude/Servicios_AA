package proyecto.clases.conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Ingresar datos");
        }
    }

    //buscar datos
    public Empleado consultaEmpleado(int id_empleado) {
        Empleado empleado = null;
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM EMPLEADO WHERE ID_EMPLEADO= " + id_empleado);
            while (rs.next()) {
                empleado = new Empleado();
                empleado.setId_empleado(rs.getInt("ID_EMPLEADO"));
                empleado.setNombre(rs.getString("NOMBRE"));
                empleado.setPrimer_apellido(rs.getString("PRIMER_APELLIDO"));
                empleado.setSegundo_apellido(rs.getString("SEGUNDO_APELLIDO"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Consulatar Datos");
        }
        return empleado;
    }

    public void cambioEmpleado(Empleado empleado, int id_empleado) {
        try {
            PreparedStatement pst = conn.prepareStatement("UPDATE EMPLEADO SET NOMBRE= ?, PRIMER_APELLIDO= ?, SEGUNDO_APELLIDO= ? WHERE ID_EMPLEADO= ?");
            pst.setString(1, empleado.getNombre());
            pst.setString(2, empleado.getPrimer_apellido());
            pst.setString(3, empleado.getSegundo_apellido());
            pst.setInt(4, id_empleado);
            pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Cambiar Datos");
        }
    }

    //Eliminar datos de la DB
    public void bajaEmpleado(int id_empleado) {
        try {
            PreparedStatement pst = conn.prepareStatement("DELETE FROM EMPLEADO WHERE ID_EMPLEADO=?");
            pst.setInt(1, id_empleado);
            pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en borrar Datos");
        }
    }
//PARA LISTAR TODOS LOS EMPLEADO DE LA BASE DE DATOS

    public ArrayList<Empleado> listarEmpleados() {
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT ID_EMPLEADO,NOMBRE, PRIMER_APELLIDO, SEGUNDO_APELLIDO FROM EMPLEADO");
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
            System.out.println("Error en Listado");
        }
        return listaEmpleados;
    }
}
