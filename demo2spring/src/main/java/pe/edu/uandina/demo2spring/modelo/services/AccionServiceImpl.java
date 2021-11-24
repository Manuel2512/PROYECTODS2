package pe.edu.uandina.demo2spring.modelo.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.uandina.demo2spring.modelo.Accion;
import pe.edu.uandina.demo2spring.modelo.dao.IAccionDao;

import java.util.List;

@Service
public class AccionServiceImpl implements IAccionService{
    @Autowired
    private IAccionDao accionDao;
    @Override
    @Transactional(readOnly = true)
    public List<Accion> findAll() {
        return (List<Accion>) accionDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Accion findById(Long id) {
        return accionDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Accion save(Accion accion) {
        return accionDao.save(accion);
    }

    @Override
    @Transactional
    public void deleteByid(Long id) {
        accionDao.deleteById(id);
    }
}
