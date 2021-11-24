package pe.edu.uandina.demo2spring.control;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.edu.uandina.demo2spring.modelo.Accion;
import pe.edu.uandina.demo2spring.modelo.services.IAccionService;

import java.util.List;

@RestController
@RequestMapping("/api")

public class AccionRestController {
    @Autowired
    private IAccionService accionService;

    @GetMapping("/accion")
    public List<Accion> listar(){ return accionService.findAll(); }

    @GetMapping("/accion/{id}")
    public Accion mostrar(@PathVariable Long id){
        return accionService.findById(id);
    }

    @PostMapping("/accion")
    @ResponseStatus(HttpStatus.CREATED)
    public Accion crear(@RequestBody Accion accion){
        return accionService.save(accion);
    }

    @PutMapping("/accion/{id}")
    public Accion actualizar (Accion accion, @PathVariable Long id){
        Accion accionOriginal = accionService.findById(id);
        accionOriginal.setNombre(accion.getNombre());
        return accionService.save(accionOriginal);
    }
    @DeleteMapping("/accion/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id){
        accionService.deleteByid(id);
    }
}
