package pe.edu.uandina.demo2spring.modelo.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.uandina.demo2spring.modelo.Cliente;
import pe.edu.uandina.demo2spring.modelo.dao.IClienteDao;

import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteService{
    @Autowired
    private IClienteDao clienteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {return (List<Cliente>) clienteDao.findAll();}

    @Override
    @Transactional(readOnly = true)
    public Cliente findById(Long id) {
        return clienteDao.findById(id).orElse(null);}

    @Override
    @Transactional
    public Cliente save(Cliente cliente) {
        return clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void deleteByid(Long id) {clienteDao.deleteById(id);}
}
