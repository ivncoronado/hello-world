package persistencia;

import logica.Consumible;
import logica.Personal;
import logica.Usuario;

public class ControladoraPersistencia {

    UsuarioJpaController usuJPA = new UsuarioJpaController();
    PersonalJpaController perJPA = new PersonalJpaController();
    EquipoJpaController equiJPA = new EquipoJpaController();
    DepartamentoJpaController depaJPA = new DepartamentoJpaController();
    ConsumibleJpaController consuJPA = new ConsumibleJpaController();
    entradasSalidasJpaController ensaJPA = new entradasSalidasJpaController();

    public ControladoraPersistencia() {
    }
    
    

    public void crearUsuario(Usuario usu) {
        usuJPA.create(usu);
    }

    public void crearPersonal(Personal per) {
        perJPA.create(per);
    }

    public void altaCosumible(Consumible consu) {
        consuJPA.create(consu);
    }

}
