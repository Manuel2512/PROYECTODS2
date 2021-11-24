package pe.edu.uandina.demo2spring.modelo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.uandina.demo2spring.modelo.Balon;
import pe.edu.uandina.demo2spring.modelo.dao.IBalonDao;

import java.util.List;

@Service
public class BalonServiceImpl implements IBalonService{
    @Autowired
    private IBalonDao balonDao;

    @Override
    @Transactional(readOnly = true)
    public List<Balon> findAll() {return (List<Balon>) balonDao.findAll();}

    @Override
    @Transactional(readOnly = true)
    public Balon findById(Long id) {
        return balonDao.findById(id).orElse(null);}

    @Override
    @Transactional
    public Balon save(Balon balon) {
        return balonDao.save(balon);
    }

    @Override
    @Transactional
    public void deleteByid(Long id) {
        balonDao.deleteById(id);
    }
}
