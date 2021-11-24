package pe.edu.uandina.demo2spring.modelo.dao;

import org.springframework.data.repository.CrudRepository;
import pe.edu.uandina.demo2spring.modelo.Accion;

public interface IAccionDao extends CrudRepository<Accion, Long> {
}
