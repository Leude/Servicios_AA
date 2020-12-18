//INTEGRANTES: JUAN DE DIOS ZARATE GARCES, RICARDO ANGEL ALVAREZ MACEDO, DIEGO IVAN GONZALES ALEMAN Y HUGO ALEJANDRO FLORES HERNANDEZ
package proyecto.clases.conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import proyecto.clases.principales.Asistencia;
import proyecto.conexion.Conexion;

public class AsistenciaBD extends Conexion {

    public void entradaAsistencia(int empleado) {
        String sql = "INSERT INTO asistencia(id_empleado,hora_entrada) VALUES(?,sysdate)";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setObject(1, empleado);
            pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Asistencia Registrada Correctamente");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    public void salidaAsistencia(int id_empleado) {
        String sql = "UPDATE ASISTENCIA SET HORA_SALIDA=sysdate WHERE ID_EMPLEADO=? AND HORA_ENTRADA LIKE SYSDATE";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setObject(1, id_empleado);
            pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Registro de Salida Realizado");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error, ingrese correctamente los datos");
        }
    }

    public ArrayList<Asistencia> listarBusquedaDeAsistidos(String fecha_inicial, String fecha_final) {
        String sql = "SELECT id_empleado, TO_CHAR((hora_entrada),'HH24:MI') HORA_ENTRADA, TO_CHAR((hora_salida),'HH24:MI') HORA_SALIDA FROM asistencia WHERE hora_entrada BETWEEN TO_DATE('" + fecha_inicial + "', 'DD/MM/YY') AND TO_DATE('" + fecha_final + "', 'DD/MM/YY')";
        ArrayList<Asistencia> listaAsistidos = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Asistencia asistencia = new Asistencia();
                asistencia.setId_empleado(rs.getInt(1));
                asistencia.setHora_entrada(rs.getString(2));
                asistencia.setHora_salida(rs.getString(3));

                listaAsistidos.add(asistencia);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo listar, Ingrese correctamente el dia,mes y año");
        }
        return listaAsistidos;
    }

}
