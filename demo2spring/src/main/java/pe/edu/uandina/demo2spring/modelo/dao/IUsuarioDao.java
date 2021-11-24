package pe.edu.uandina.demo2spring.modelo.dao;

import org.springframework.data.repository.CrudRepository;
import pe.edu.uandina.demo2spring.modelo.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {
}
