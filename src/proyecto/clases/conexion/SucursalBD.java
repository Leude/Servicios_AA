package proyecto.clases.conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import proyecto.clases.principales.Sucursal;
import proyecto.conexion.Conexion;

public class SucursalBD extends Conexion {

    public void altaSucursal(Sucursal sucursal) {
        try {
            PreparedStatement pst = conn.prepareStatement("INSERT INTO SUCURSAL(NOMBRE_SUCURSAL) VALUES(?)");
            pst.setString(1, sucursal.getNombre());
            pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Usuario Registrado Correctamente");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error, complete los campos");
        }
    }

    public ArrayList<Sucursal> consultaSucursal(int id_sucursal) {
        ArrayList<Sucursal> listaSucursales = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM SUCURSAL WHERE ID_SUCURSAL = " + id_sucursal);
            while (rs.next()) {
                Sucursal sucursal = new Sucursal();
                sucursal.setId_sucursal(rs.getInt("ID_SUCURSAL"));
                sucursal.setNombre(rs.getString("NOMBRE_SUCURSAL"));
                listaSucursales.add(sucursal);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error, no se pudo hacer la consulta");
        }
        return listaSucursales;
    }

    public void cambioSucursal(Sucursal sucursal, int id_sucursal) {
        try {
            PreparedStatement pst = conn.prepareStatement("UPDATE SUCURSAL SET NOMBRE_SUCURSAL=? WHERE ID_SUCURSAL=?");
            pst.setString(1, sucursal.getNombre());
            pst.setInt(2, id_sucursal);
            pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Datos del Empleado Cambiados con Exito");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error, ingrese correctamente los datos");
        }
    }

    //Eliminar datos de la DB
    public void bajaSucursal(int id_sucursal) {
        try {
            PreparedStatement pst = conn.prepareStatement("DELETE FROM SUCURSAL WHERE ID_SUCURSAL=?");
            pst.setInt(1, id_sucursal);
            pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Se eliminaron correctamente: ");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error, ingrese los datos correctamente");
        }
    }

    public ArrayList<Sucursal> listarTodasLasSucursales() {
        ArrayList<Sucursal> listaSucursales = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT ID_SUCURSAL,NOMBRE_SUCURSAL "
                    + "FROM SUCURSAL");
            while (rs.next()) {
                Sucursal sucursal = new Sucursal();
                sucursal.setId_sucursal(rs.getInt("ID_SUCURSAL"));
                sucursal.setNombre(rs.getString("NOMBRE_SUCURSAL"));
                listaSucursales.add(sucursal);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error, no se pudo Listar ");
        }
        return listaSucursales;
    }
}
