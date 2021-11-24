package pe.edu.uandina.demo2spring.modelo.dao;

import org.springframework.data.repository.CrudRepository;
import pe.edu.uandina.demo2spring.modelo.Registro;

public interface IRegistroDao extends CrudRepository<Registro, Long> {
}
