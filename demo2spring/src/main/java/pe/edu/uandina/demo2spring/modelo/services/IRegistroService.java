package pe.edu.uandina.demo2spring.modelo.services;
import pe.edu.uandina.demo2spring.modelo.Registro;
import java.util.List;

public interface IRegistroService {
    public List<Registro> findAll();
    public Registro findById(Long id);
    public Registro save(Registro registro);
    public void deleteByid(Long id);
}

