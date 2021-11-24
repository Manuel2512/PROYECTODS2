package pe.edu.uandina.demo2spring.modelo.dao;

import org.springframework.data.repository.CrudRepository;
import pe.edu.uandina.demo2spring.modelo.Balon;

public interface IBalonDao extends CrudRepository<Balon, Long> {
}
