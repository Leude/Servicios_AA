package proyecto.clases.conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import proyecto.clases.principales.Sucursal;
import proyecto.conexion.Conexion;

public class SucursalBD extends Conexion{

    public void altaSucursal(Sucursal sucursal) {
        try {
            PreparedStatement pst = conn.prepareStatement("INSERT INTO SUCURSAL(NOMBRE_SUCURSAL) VALUES(?)");
            pst.setString(1, sucursal.getNombre_sucursal());
            pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en ingresar datos del sucursal");
        }
    }

    public Sucursal consultaSucursal(int id_sucursal) {
        Sucursal sucursal = null;
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM SUCURSAL WHERE ID_SUCURSAL = " + id_sucursal);
            while (rs.next()) {
                sucursal = new Sucursal();
                sucursal.setId_sucursal(rs.getInt("ID_SUCURSAL"));
                sucursal.setNombre_sucursal(rs.getString("NOMBRE_SUCURSAL"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en buscar datos del sucursal");
        }
        return sucursal;
    }

    public void cambioSucursal(Sucursal sucursal, int id_sucursal) {
        try {
            PreparedStatement pst = conn.prepareStatement("UPDATE SUCURSAL SET NOMBRE_SUCURSAL=? WHERE ID_SUCURSAL=?");
            pst.setString(1, sucursal.getNombre_sucursal());
            pst.setInt(2, id_sucursal);
            pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en actualizar datos del sucursal");
        }
    }

    //Eliminar datos de la DB
    public void bajaSucursal(int id_sucursal) {
        try {
            PreparedStatement pst = conn.prepareStatement("DELETE FROM SUCURSAL WHERE ID_SUCURSAL=?");
            pst.setInt(1, id_sucursal);
            pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en la eliminacion del sucursal");
        }
    }

    public ArrayList<Sucursal> listarSucursals() {
        ArrayList<Sucursal> listaSucursals = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT ID_SUCURSAL,NOMBRE_SUCURSAL "
                    + "FROM SUCURSAL");
            while (rs.next()) {
                Sucursal sucursal = new Sucursal();
                sucursal.setId_sucursal(rs.getInt("ID_SUCURSAL"));
                sucursal.setNombre_sucursal(rs.getString("NOMBRE_SUCURSAL"));
                listaSucursals.add(sucursal);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Error en listar los datos de los sucursal");
        }
        return listaSucursals;
    }
}
