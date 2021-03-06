//INTEGRANTES: JUAN DE DIOS ZARATE GARCES, RICARDO ANGEL ALVAREZ MACEDO, DIEGO IVAN GONZALES ALEMAN Y HUGO ALEJANDRO FLORES HERNANDEZ

package proyecto.clases.conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import proyecto.clases.principales.Turno;
import proyecto.conexion.Conexion;

public class TurnoBD extends Conexion {

    public void altaTurno(Turno turno) {
        try {
            PreparedStatement pst = conn.prepareStatement("INSERT INTO TURNO(ID_TURNO,HORA_INICIAL,HORA_FINAL) VALUES (?,TO_DATE(?, 'HH24:MI'),TO_DATE(?, 'HH24:MI'))");
            pst.setString(1, turno.getId_turno());
            pst.setString(2, turno.getHora_inicial());
            pst.setString(3, turno.getHora_final());
            pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Turno Registrado");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Turno no Registrado");
        }
    }

    public void cambioTurno(Turno turno, String id_turno) {
        try {
            PreparedStatement pst = conn.prepareStatement("UPDATE TURNO SET ID_TURNO=?, HORA_INICIAL=TO_DATE(?, 'HH24:MI'), HORA_FINAL=TO_DATE(?, 'HH24:MI') WHERE ID_TURNO=?");
            pst.setString(1, turno.getId_turno());
            pst.setString(2, turno.getHora_inicial());
            pst.setString(3, turno.getHora_final());
            pst.setString(4, id_turno);
            pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Turno se a actualizado");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Turno no se pudo actualizar los datos");
        }
    }

    public void bajaTurno(String id_turno) {
        try {
            PreparedStatement pst = conn.prepareStatement("DELETE FROM TURNO WHERE ID_TURNO=?");
            pst.setString(1, id_turno);
            pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Turno Eliminado");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Turno No Eliminado");
        }
    }

    public ArrayList<Turno> listarBusquedaDeTurnos(String bus) {

        ArrayList<Turno> listaTurnos = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT id_turno ID_TURNO, TO_CHAR((hora_inicial),'HH24:MI') HORA_INICIAL,TO_CHAR((hora_final),'HH24:MI') HORA_FINAL FROM turno WHERE UPPER(ID_TURNO) LIKE UPPER('%" + bus + "%') ORDER BY ID_TURNO");
            while (rs.next()) {
                Turno turno = new Turno();
                turno.setId_turno(rs.getString(1));
                turno.setHora_inicial(rs.getString(2));
                turno.setHora_final(rs.getString(3));
                listaTurnos.add(turno);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Todos los Turno no se pudieron Listar");
        }
        return listaTurnos;
    }
}
