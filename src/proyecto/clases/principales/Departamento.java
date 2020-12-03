package proyecto.clases.principales;

public class Departamento {

    private String nombre;
    private int id_departamento;
    private String direccion;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_departamento() {
        return id_departamento;
    }

    public void setId_departamento(int id_departamento) {
        this.id_departamento = id_departamento;
    }

    @Override
    public String toString() {
        return "Departamento{" + "nombre=" + nombre + '}';
    }
    
    
}
