package proyecto.clases.conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import proyecto.clases.principales.Turno;
import proyecto.conexion.Conexion;

public class TurnoBD extends Conexion {

    public void altaTurno(Turno turno) {
        try {
            PreparedStatement pst = conn.prepareStatement("INSERT INTO TURNO(ID_TURNO,HORA_INICIAL,HORA_FINAL) VALUES(?,?,?)");
            pst.setString(1, turno.getId_turno());
            pst.setDate(2, turno.getHora_inicial());
            pst.setDate(3, turno.getHora_final());
            pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en ingresar datos del turno");
        }
    }

    public Turno consultaTurno(String id_turno) {
        Turno turno = null;
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM TURNO WHERE ID_TURNO = " + id_turno);
            while (rs.next()) {
                turno = new Turno();
                turno.setId_turno(rs.getString("ID_TURNO"));
                turno.setHora_inicial(rs.getDate("HORA_INICIAL"));
                turno.setHora_final(rs.getDate("HORA_FINAL"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en buscar datos del turno");
        }
        return turno;
    }

    public void cambioTurno(Turno turno, String id_turno) {
        try {
            PreparedStatement pst = conn.prepareStatement("UPDATE TURNO SET ID_TURNO=?,HORA_INICIAL=?,HORA_FINAL=? WHERE ID_TURNO=?");
            pst.setString(1, turno.getId_turno());
            pst.setDate(2, turno.getHora_inicial());
            pst.setDate(3, turno.getHora_final());
            pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en actualizar datos del turno");
        }
    }

    //Eliminar datos de la DB
    public void bajaTurno(int id_turno) {
        try {
            PreparedStatement pst = conn.prepareStatement("DELETE FROM TURNO WHERE ID_TURNO=?");
            pst.setInt(1, id_turno);
            pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en la eliminacion del turno");
        }
    }

    public ArrayList<Turno> listarTurnos() {
        ArrayList<Turno> listaTurnos = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM TURNO");
            while (rs.next()) {
                Turno turno = new Turno();
                turno.setId_turno(rs.getString("ID_TURNO"));
                turno.setHora_inicial(rs.getDate("HORA_INICIAL"));
                turno.setHora_final(rs.getDate("HORA_FINAL"));
                listaTurnos.add(turno);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Error en listar los datos de los turno");
        }
        return listaTurnos;
    }
}
