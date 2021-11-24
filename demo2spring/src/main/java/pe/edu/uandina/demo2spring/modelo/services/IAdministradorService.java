package pe.edu.uandina.demo2spring.modelo.services;
import pe.edu.uandina.demo2spring.modelo.Administrador;
import java.util.List;

public interface IAdministradorService {
    public List<Administrador> findAll();
    public Administrador findById(Long id);
    public Administrador save(Administrador administrador);
    public void deleteByid(Long id);
}

