package logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Personal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_pers;
    private String nombrePers;
    private String apellidoPers;
    private String departamentoPers;
    private String correoPers;

    public Personal() {
    }

    public Personal(int id, String nombrePers, String apellidoPers, String departamentoPers, String correoPers) {
        this.id_pers = id_pers;
        this.nombrePers = nombrePers;
        this.apellidoPers = apellidoPers;
        this.departamentoPers = departamentoPers;
        this.correoPers = correoPers;
    }

    public int getId() {
        return id_pers;
    }

    public void setId(int id) {
        this.id_pers = id_pers;
    }

    public String getNombrePers() {
        return nombrePers;
    }

    public void setNombrePers(String nombrePers) {
        this.nombrePers = nombrePers;
    }

    public String getApellidoPers() {
        return apellidoPers;
    }

    public void setApellidoPers(String apellidoPers) {
        this.apellidoPers = apellidoPers;
    }

    public String getDepartamentoPers() {
        return departamentoPers;
    }

    public void setDepartamentoPers(String departamentoPers) {
        this.departamentoPers = departamentoPers;
    }

    public String getCorreoPers() {
        return correoPers;
    }

    public void setCorreoPers(String correoPers) {
        this.correoPers = correoPers;
    }

    
    }
    