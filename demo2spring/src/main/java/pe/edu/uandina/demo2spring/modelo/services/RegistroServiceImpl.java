package pe.edu.uandina.demo2spring.modelo.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.uandina.demo2spring.modelo.Cliente;
import pe.edu.uandina.demo2spring.modelo.Registro;
import pe.edu.uandina.demo2spring.modelo.dao.IRegistroDao;

import java.util.List;

@Service
public class RegistroServiceImpl implements IRegistroService{
    @Autowired
    private IRegistroDao registroDao;

    @Override
    @Transactional(readOnly = true)
    public List<Registro> findAll() {return (List<Registro>) registroDao.findAll();}

    @Override
    @Transactional(readOnly = true)
    public Registro findById(Long id) {
        return registroDao.findById(id).orElse(null);}

    @Override
    @Transactional
    public Registro save(Registro registro) {
        return registroDao.save(registro);
    }

    @Override
    @Transactional
    public void deleteByid(Long id) {registroDao.deleteById(id);}
}
