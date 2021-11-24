package pe.edu.uandina.demo2spring.modelo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "balon")
public class Balon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBalon")
    private long idBalon;
    @Column(name = "capacidad")
    private String capacidad;
    @Column(name = "estado")
    private String estado;

    @OneToMany
    private List<Administrador> perteneceAdministrador;

    @OneToMany
    private List<pe.edu.uandina.demo2spring.modelo.Registro> perteneceRegistro;

    public Balon() {
    }

    public Balon(String capacidad, String estado, List<Administrador> perteneceAdministrador, List<Registro> perteneceRegistro) {
        this.capacidad = capacidad;
        this.estado = estado;
        this.perteneceAdministrador = perteneceAdministrador;
        this.perteneceRegistro = perteneceRegistro;
    }

    public long getIdBalon() {
        return idBalon;
    }

    public void setIdBalon(long idBalon) {
        this.idBalon = idBalon;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
