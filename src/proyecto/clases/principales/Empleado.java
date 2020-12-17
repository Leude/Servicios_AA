package proyecto.clases.principales;

public class Empleado {

    private String nombre;
    private String primer_apellido;
    private String segundo_apellido;
    private int id_empleado;
    private String clave;
    private String telefono;
    private String correo;
    private String direccion;

    public String getClave() {
        return clave;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) throws IllegalArgumentException  {
        this.direccion = direccion;
    }

    public void setClave(String clave) throws IllegalArgumentException  {
        this.clave = clave;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono)  {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) throws IllegalArgumentException  {
        
        this.correo = correo;
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

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) throws IllegalArgumentException  {
        if(primer_apellido == null){
            throw new IllegalArgumentException();
        }
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) throws IllegalArgumentException  {
        if(segundo_apellido == null){
            throw new IllegalArgumentException();
        }
        this.segundo_apellido = segundo_apellido;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) throws IllegalArgumentException  {
        if(id_empleado<0){
            throw new IllegalArgumentException("El id no es valido");
        }
        this.id_empleado = id_empleado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + '}';
    }
    
}
