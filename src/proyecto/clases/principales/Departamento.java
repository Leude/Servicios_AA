//INTEGRANTES: JUAN DE DIOS ZARATE GARCES, RICARDO ANGEL ALVAREZ MACEDO, DIEGO IVAN GONZALES ALEMAN Y HUGO ALEJANDRO FLORES HERNANDEZ
package proyecto.clases.principales;

public class Departamento {

    private String nombre;
    private int id_departamento;
    private String direccion;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) throws IllegalArgumentException {
        if(direccion == null){
            throw new IllegalArgumentException();
        }
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws IllegalArgumentException  {
        if(nombre == null){
            throw new IllegalArgumentException();
        }
        this.nombre = nombre;
    }

    public int getId_departamento() {
        return id_departamento;
    }

    public void setId_departamento(int id_departamento) throws IllegalArgumentException  {
        if(id_departamento<0){
            throw new IllegalArgumentException("El id no es valido");
        }
        this.id_departamento = id_departamento;
    }

    @Override
    public String toString() {
        return "Departamento{" + "nombre=" + nombre + '}';
    }
    
    
}
