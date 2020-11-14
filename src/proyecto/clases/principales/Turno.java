package proyecto.clases.principales;

import java.sql.Date;

public class Turno {

    private String id_turno;
    private Date hora_inicial;
    private Date hora_final;

    public Turno() {
    }

    public String getId_turno() {
        return id_turno;
    }

    public void setId_turno(String id_turno) {
        this.id_turno = id_turno;
    }

    public Date getHora_inicial() {
        return hora_inicial;
    }

    public void setHora_inicial(Date hora_inicial) {
        this.hora_inicial = hora_inicial;
    }

    public Date getHora_final() {
        return hora_final;
    }

    public void setHora_final(Date hora_final) {
        this.hora_final = hora_final;
    }

}
