package proyecto.clases.principales;

public class Turno {

    private String id_turno;
    private String hora_inicial;
    private String hora_final;

    public String getId_turno() {
        return id_turno;
    }

    public void setId_turno(String id_turno) throws IllegalArgumentException  {
        if(id_turno == null){
            throw new IllegalArgumentException("El id no es valido");
        }
        this.id_turno = id_turno;

    }

    public String getHora_inicial() {
        return hora_inicial;
    }

    public void setHora_inicial(String hora_inicial) throws IllegalArgumentException  {
        if(hora_inicial == null){
            throw new IllegalArgumentException();
        }
        this.hora_inicial = hora_inicial;
    }

    public String getHora_final() {
        return hora_final;
    }

    public void setHora_final(String hora_final) throws IllegalArgumentException  {
        if(hora_final == null){
            throw new IllegalArgumentException();
        }
        this.hora_final = hora_final;
    }

    @Override
    public String toString() {
        return "Turno{" + "id_turno=" + id_turno + '}';
    }
    
    
}
