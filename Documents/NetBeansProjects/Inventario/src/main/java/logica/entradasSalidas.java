package logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class entradasSalidas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_es;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    private String entradas;
    private String salidas;

    public entradasSalidas() {
    }

    public entradasSalidas(int id_es, Date fecha, String entradas, String salidas) {
        this.id_es = id_es;
        this.fecha = fecha;
        this.entradas = entradas;
        this.salidas = salidas;
    }

    public int getId_es() {
        return id_es;
    }

    public void setId_es(int id_es) {
        this.id_es = id_es;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEntradas() {
        return entradas;
    }

    public void setEntradas(String entradas) {
        this.entradas = entradas;
    }

    public String getSalidas() {
        return salidas;
    }

    public void setSalidas(String salidas) {
        this.salidas = salidas;
    }

}
