package pe.edu.uandina.demo2spring.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.edu.uandina.demo2spring.modelo.Cliente;
import pe.edu.uandina.demo2spring.modelo.services.IClienteService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClienteRestController {
    @Autowired
    private IClienteService clienteService;

    @GetMapping("/cliente")
    public List<Cliente> listar(){ return clienteService.findAll(); }

    @GetMapping("/cliente/{id}")
    public Cliente mostrar(@PathVariable Long id){
        return clienteService.findById(id);
    }

    @PostMapping("/cliente")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente crear(@RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }

    @PutMapping("/cliente/{id}")
    public Cliente actualizar (Cliente cliente, @PathVariable Long id){
        Cliente clienteOriginal = clienteService.findById(id);
        clienteOriginal.setApellidos(cliente.getApellidos());
        return clienteService.save(clienteOriginal);
    }
    @DeleteMapping("/cliente/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id){
        clienteService.deleteByid(id);
    }
}
