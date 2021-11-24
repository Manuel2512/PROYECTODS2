package pe.edu.uandina.demo2spring.modelo.services;
import pe.edu.uandina.demo2spring.modelo.Accion;
import pe.edu.uandina.demo2spring.modelo.Cliente;
import java.util.List;

public interface IClienteService {
    public List<Cliente> findAll();
    public Cliente findById(Long id);
    public Cliente save(Cliente cliente);
    public void deleteByid(Long id);
}
