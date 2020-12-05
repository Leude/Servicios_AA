package proyecto.clases.principales;
public class Asistencia {
    String hora_entrada;
    String hora_salida;
    int id_empleado;

    public String getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(String hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    @Override
    public String toString() {
        return "Asistencia{" + "hora_entrada=" + hora_entrada + ", hora_salida=" + hora_salida + ", id_empleado=" + id_empleado + '}';
    }

    
    
}
