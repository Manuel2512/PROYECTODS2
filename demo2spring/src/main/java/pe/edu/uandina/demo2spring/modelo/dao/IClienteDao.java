package pe.edu.uandina.demo2spring.modelo.dao;

import org.springframework.data.repository.CrudRepository;
import pe.edu.uandina.demo2spring.modelo.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
}
