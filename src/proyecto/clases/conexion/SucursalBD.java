//INTEGRANTES: JUAN DE DIOS ZARATE GARCES, RICARDO ANGEL ALVAREZ MACEDO, DIEGO IVAN GONZALES ALEMAN Y HUGO ALEJANDRO FLORES HERNANDEZ

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
            PreparedStatement pst = conn.prepareStatement("INSERT INTO SUCURSAL(NOMBRE,DIRECCION) VALUES(?,?)");
            pst.setString(1, sucursal.getNombre());
            pst.setString(2, sucursal.getDireccion());
            pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Usuario Registrado Correctamente");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error, complete los campos");
        }
    }

    public void cambioSucursal(Sucursal sucursal, Object id_sucursal) {
        try {
            PreparedStatement pst = conn.prepareStatement("UPDATE SUCURSAL SET NOMBRE=?,DIRECCION=? WHERE ID_SUCURSAL=?");
            pst.setString(1, sucursal.getNombre());
            pst.setString(2, sucursal.getDireccion());
            pst.setObject(3, id_sucursal);
            pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Datos del Empleado Cambiados con Exito");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error, ingrese correctamente los datos");
        }
    }

    public void bajaSucursal(Object id_sucursal) {
        try {
            PreparedStatement pst = conn.prepareStatement("DELETE FROM SUCURSAL WHERE ID_SUCURSAL=?");
            pst.setObject(1, id_sucursal);
            pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Se eliminaron correctamente: ");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error, ingrese los datos correctamente");
        }
    }

    public ArrayList<Sucursal> listarBusquedaDeSucursales(String bus) {
        String sql = "SELECT * FROM SUCURSAL WHERE ID_SUCURSAL LIKE '%" + bus + "%' OR UPPER(NOMBRE) LIKE UPPER('%" + bus + "%') ORDER BY ID_SUCURSAL";
        ArrayList<Sucursal> listaSucursales = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Sucursal sucursal = new Sucursal();
                sucursal.setId_sucursal(rs.getInt("ID_SUCURSAL"));
                sucursal.setNombre(rs.getString("NOMBRE"));
                sucursal.setDireccion(rs.getString("DIRECCION"));
                listaSucursales.add(sucursal);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error, no se pudo Listar ");
        }
        return listaSucursales;
    }
}
