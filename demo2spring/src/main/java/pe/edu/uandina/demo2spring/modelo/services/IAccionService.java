package pe.edu.uandina.demo2spring.modelo.services;
import pe.edu.uandina.demo2spring.modelo.Accion;
import java.util.List;

public interface IAccionService {
    public List<Accion> findAll();
    public Accion findById(Long id);
    public Accion save(Accion accion);
    public void deleteByid(Long id);
}
