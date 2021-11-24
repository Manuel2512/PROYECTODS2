package pe.edu.uandina.demo2spring.control;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.edu.uandina.demo2spring.modelo.Administrador;
import pe.edu.uandina.demo2spring.modelo.services.IAdministradorService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AdministradorRestController {
    @Autowired
    private IAdministradorService administradorService;

    @GetMapping("/administrador")
    public List<Administrador> listar(){ return administradorService.findAll(); }

    @GetMapping("/administrador/{id}")
    public Administrador mostrar(@PathVariable Long id){
        return administradorService.findById(id);
    }

    @PostMapping("/administrador")
    @ResponseStatus(HttpStatus.CREATED)
    public Administrador crear(@RequestBody Administrador administrador){
        return administradorService.save(administrador);
    }

    @PutMapping("/administrador/{id}")
    public Administrador actualizar (Administrador administrador, @PathVariable Long id){
        Administrador administradorOriginal = administradorService.findById(id);
        administradorOriginal.setNombre(administrador.getNombre());
        return administradorService.save(administradorOriginal);
    }
    @DeleteMapping("/administrador/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id){
        administradorService.deleteByid(id);
    }
}
