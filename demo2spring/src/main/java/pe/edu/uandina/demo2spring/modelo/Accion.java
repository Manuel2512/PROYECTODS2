package pe.edu.uandina.demo2spring.modelo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "accion")
public class Accion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAccion")
    public long idAccion;
    @Column(name = "nombre")
    public String nombre;

    //-----

    @OneToMany(cascade = CascadeType.ALL)
    private List<Registro> perteneceRegistro;


    public Accion() {
    }


    public Accion(String nombre, List<Registro> perteneceRegistro) {
        this.nombre = nombre;this.perteneceRegistro = perteneceRegistro;
    }

    public long getIdAccion() {
        return idAccion;
    }

    public void setIdAccion(long idAccion) {
        this.idAccion = idAccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}