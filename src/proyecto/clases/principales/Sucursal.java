package proyecto.clases.principales;

public class Sucursal {

    private int id_sucursal;
    private String nombre;
    private String direccion;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) throws IllegalArgumentException  {
        if(direccion == null){
            throw new IllegalArgumentException();
        }
        this.direccion = direccion;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws IllegalArgumentException  {
        if(nombre == null){
            throw new IllegalArgumentException();
        }
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Sucursal{" + "nombre=" + nombre + '}';
    }
    
    
}
