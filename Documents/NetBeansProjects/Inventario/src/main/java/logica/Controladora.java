
package logica;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.metamodel.SingularAttribute;
import persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearUsuario(String nombre, String apellido, String nombreUsuario, String contrasenia, String tipoDeUsuario){
        
        Usuario usu = new Usuario();
        
        usu.setNombreUsu(nombre);
        usu.setApellidoUsu(apellido);
        usu.setNombreUsuario(nombreUsuario);
        usu.setContraseñaUsu(contrasenia);
        usu.setTipoDeUsuario(tipoDeUsuario);
        
        
        controlPersis.crearUsuario(usu);
    }
       public void crearPersonal(String nombrePersonal, String apellidoPersonal, String departamentoPersonal, String correoPersonal) {
        
        Personal per = new Personal();
        
        per.setNombrePers(nombrePersonal);
        per.setApellidoPers(apellidoPersonal);
        per.setDepartamentoPers(departamentoPersonal);
        per.setCorreoPers(correoPersonal);
        
        controlPersis.crearPersonal(per);
       }

        public void altaCosumible(String cantidadConsumible, String marcaConsumible, String tipoConsumible){
        
        Consumible consu = new Consumible();  
        
        consu.setCantidadConsumible(0);
        consu.setMarcaConsumible(marcaConsumible);
        consu.setTipoConsumible(tipoConsumible);
        
       controlPersis.altaCosumible(consu);
        
        }

    
            }
