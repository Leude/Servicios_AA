package proyecto.main;

import proyecto.conexion.Conexion;
import proyecto.pantalla.LoginSistema;
public class ControlDeAsistencias {

    public static void main(String[] args) {
       LoginSistema ls = new LoginSistema();
        Conexion conn = new Conexion();
        conn.abrirConexionSQL();
       ls.setVisible(true);
    }
    
}
