//INTEGRANTES: JUAN DE DIOS ZARATE GARCES, RICARDO ANGEL ALVAREZ MACEDO, DIEGO IVAN GONZALES ALEMAN Y HUGO ALEJANDRO FLORES HERNANDEZ
package proyecto.clases.principales;

public class Supervisor {

    private int id_empleado;
    private int id_sucursal;
    private String id_turno;

    public Supervisor() {
    }

    public Supervisor(int id_empleado, int id_sucursal, String id_turno) {
        this.id_empleado = id_empleado;
        this.id_sucursal = id_sucursal;
        this.id_turno = id_turno;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) throws IllegalArgumentException  {
        if(id_empleado < 0){
            throw new IllegalArgumentException("El id no es valido");
        }
        this.id_empleado = id_empleado;
    }

    public int getId_sucursal() {
        return id_sucursal;
    }

    public void setId_sucursal(int id_sucursal) throws IllegalArgumentException  {
        if(id_sucursal < 0){
            throw new IllegalArgumentException("El id no es valido");
        }
        this.id_sucursal = id_sucursal;
    }

    public String getId_turno() {
        return id_turno;
    }

    public void setId_turno(String id_turno) throws IllegalArgumentException  {
        if(id_turno == null){
            throw new IllegalArgumentException("El id no es valido");
        }
        this.id_turno = id_turno;
    }

}
