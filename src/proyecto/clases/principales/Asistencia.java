package proyecto.clases.principales;
public class Asistencia {
    String hora_entrada;
    String hora_salida;
    int id_empleado;

    public String getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(String hora_entrada) throws IllegalArgumentException {
        if(hora_entrada == null){
            throw new IllegalArgumentException();
        }
        this.hora_entrada = hora_entrada;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) throws IllegalArgumentException {
        if(hora_salida == null){
            throw new IllegalArgumentException();
        }
        this.hora_salida = hora_salida;
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
        return "Asistencia{" + "hora_entrada=" + hora_entrada + ", hora_salida=" + hora_salida + ", id_empleado=" + id_empleado + '}';
    }
    
    
}
