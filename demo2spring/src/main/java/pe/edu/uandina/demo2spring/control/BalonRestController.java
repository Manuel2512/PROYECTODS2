package pe.edu.uandina.demo2spring.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.edu.uandina.demo2spring.modelo.Balon;
import pe.edu.uandina.demo2spring.modelo.services.IBalonService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BalonRestController {
    @Autowired
    private IBalonService balonService;

    @GetMapping("/balon")
    public List<Balon> listar(){ return balonService.findAll(); }

    @GetMapping("/balon/{id}")
    public Balon mostrar(@PathVariable Long id){
        return balonService.findById(id);
    }

    @PostMapping("/balon")
    @ResponseStatus(HttpStatus.CREATED)
    public Balon crear(@RequestBody Balon balon){
        return balonService.save(balon);
    }

    @PutMapping("/balon/{id}")
    public Balon actualizar (Balon balon, @PathVariable Long id){
        Balon balonOriginal = balonService.findById(id);
        balonOriginal.setEstado(balon.getEstado());
        return balonService.save(balonOriginal);
    }
    @DeleteMapping("/balon/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id){
        balonService.deleteByid(id);
    }
}
