package logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Consumible implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_consumible;
    private int cantidadConsumible;
    private String marcaConsumible;
    private String tipoConsumible;

    public Consumible() {
    }

    public Consumible(int id_consumible, int cantidadConsumible, String marcaConsumible, String tipoConsumible) {
        this.id_consumible = id_consumible;
        this.cantidadConsumible = cantidadConsumible;
        this.marcaConsumible = marcaConsumible;
        this.tipoConsumible = tipoConsumible;
    }

    Consumible(int id_consumible, String cantidadConsumible, String marcaConsumible, String tipoConsumible) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId_consumible() {
        return id_consumible;
    }

    public void setId_consumible(int id_consumible) {
        this.id_consumible = id_consumible;
    }

    public int getCantidadConsumible() {
        return cantidadConsumible;
    }

    public void setCantidadConsumible(int cantidadConsumible) {
        this.cantidadConsumible = cantidadConsumible;
    }

    public String getMarcaConsumible() {
        return marcaConsumible;
    }

    public void setMarcaConsumible(String marcaConsumible) {
        this.marcaConsumible = marcaConsumible;
    }

    public String getTipoConsumible() {
        return tipoConsumible;
    }

    public void setTipoConsumible(String tipoConsumible) {
        this.tipoConsumible = tipoConsumible;
    }

    }
