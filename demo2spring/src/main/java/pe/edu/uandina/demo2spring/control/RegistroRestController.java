package pe.edu.uandina.demo2spring.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.edu.uandina.demo2spring.modelo.Registro;
import pe.edu.uandina.demo2spring.modelo.services.IRegistroService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RegistroRestController {
    @Autowired
    private IRegistroService registroService;

    @GetMapping("/registro")
    public List<Registro> listar(){ return registroService.findAll(); }

    @GetMapping("/registro/{id}")
    public Registro mostrar(@PathVariable Long id){
        return registroService.findById(id);
    }

    @PostMapping("/registro")
    @ResponseStatus(HttpStatus.CREATED)
    public Registro crear(@RequestBody Registro cliente){
        return registroService.save(cliente);
    }

    @PutMapping("/registro/{id}")
    public Registro actualizar (Registro registro, @PathVariable Long id){
        Registro registroOriginal = registroService.findById(id);
        registroOriginal.setFechaEntrada(registro.getFechaEntrada());
        return registroService.save(registroOriginal);
    }
    @DeleteMapping("/registro/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id){
        registroService.deleteByid(id);
    }
}
