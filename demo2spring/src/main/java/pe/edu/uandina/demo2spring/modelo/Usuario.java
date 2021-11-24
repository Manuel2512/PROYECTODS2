package pe.edu.uandina.demo2spring.modelo;

import javax.persistence.*;


@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="idUsuario")
    private long idUsuario;
    @Column(name="identificacion")
    private String identificacion;
    @Column(name="contrasena")
    private String contrasena;

    @OneToOne(mappedBy = "tieneUsuario")
    private Administrador perteneceAdministrador;

    public Usuario() {
    }

    public Usuario(String identificacion, String password) {
        this.identificacion = identificacion;
        this.contrasena = contrasena;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getidentificacion() {
        return identificacion;
    }

    public void setidentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getcontrasena() {
        return contrasena;
    }

    public void setcontrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
