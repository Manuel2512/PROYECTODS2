package pe.edu.uandina.demo2spring.modelo.services;
import pe.edu.uandina.demo2spring.modelo.Balon;
import java.util.List;

public interface IBalonService {
    public List<Balon> findAll();
    public Balon findById(Long id);
    public Balon save(Balon balon);
    public void deleteByid(Long id);
}

