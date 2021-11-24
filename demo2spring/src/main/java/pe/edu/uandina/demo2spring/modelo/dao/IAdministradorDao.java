package pe.edu.uandina.demo2spring.modelo.dao;

import org.springframework.data.repository.CrudRepository;
import pe.edu.uandina.demo2spring.modelo.Administrador;

public interface IAdministradorDao extends CrudRepository<Administrador, Long>{
}
