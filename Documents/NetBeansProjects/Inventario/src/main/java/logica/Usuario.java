package logica;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable {
    @Id
    @GeneratedValue (strategy=GenerationType.AUTO)
    private int id_usuario;
    private String nombreUsu    ;
    private String apellidoUsu;
    private String nombreUsuario;
    private String contraseñaUsu;
    private String tipoDeUsuario;

    public Usuario() {
    }

    public Usuario(int id_usuario, String nombreUsu, String apellidoUsu, String nombreUsuario, String contraseñaUsu, String tipoDeUsuario) {
        this.id_usuario = id_usuario;
        this.nombreUsu = nombreUsu;
        this.apellidoUsu = apellidoUsu;
        this.nombreUsuario = nombreUsuario;
        this.contraseñaUsu = contraseñaUsu;
        this.tipoDeUsuario = tipoDeUsuario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombreUsu() {
        return nombreUsu;
    }

    public void setNombreUsu(String nombreUsu) {
        this.nombreUsu = nombreUsu;
    }

    public String getApellidoUsu() {
        return apellidoUsu;
    }

    public void setApellidoUsu(String apellidoUsu) {
        this.apellidoUsu = apellidoUsu;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseñaUsu() {
        return contraseñaUsu;
    }

    public void setContraseñaUsu(String contraseñaUsu) {
        this.contraseñaUsu = contraseñaUsu;
    }

    public String getTipoDeUsuario() {
        return tipoDeUsuario;
    }

    public void setTipoDeUsuario(String tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }

}