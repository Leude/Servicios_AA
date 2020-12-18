//INTEGRANTES: JUAN DE DIOS ZARATE GARCES, RICARDO ANGEL ALVAREZ MACEDO, DIEGO IVAN GONZALES ALEMAN Y HUGO ALEJANDRO FLORES HERNANDEZ
package proyecto.clases.principales;

import proyecto.vista.LoginSistema;

public class Controlador {

    public Controlador() {

    }

    public void iniciar() {
        LoginSistema ls = new LoginSistema();
        ls.setVisible(true);
    }

}
