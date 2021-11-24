package pe.edu.uandina.demo2spring.modelo;

import javax.persistence.*;

@Entity
@Table(name = "administrador")
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idAdministrador")
    private long idAdministrador;
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellidos")
    private String apellidos;

    @OneToOne
    @JoinColumn(name = "tieneUsuario", referencedColumnName = "idUsuario")
    private pe.edu.uandina.demo2spring.modelo.Usuario tieneUsuario;


    @ManyToOne
    @JoinColumn(name = "administraBalon", referencedColumnName = "idBalon")
    private pe.edu.uandina.demo2spring.modelo.Balon administraBalon;

    public Administrador() {
    }

    public Administrador(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.administraBalon = administraBalon;
    }

    public long getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(long idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public pe.edu.uandina.demo2spring.modelo.Usuario getTieneUsuario() {
        return tieneUsuario;
    }

    public void setTieneUsuario(pe.edu.uandina.demo2spring.modelo.Usuario tieneUsuario) {
        this.tieneUsuario = tieneUsuario;
    }

    public pe.edu.uandina.demo2spring.modelo.Balon getAdministraBalon() {
        return administraBalon;
    }

    public void setAdministraBalon(pe.edu.uandina.demo2spring.modelo.Balon administraBalon) {
        this.administraBalon = administraBalon;
    }

    @Entity
    @Table(name = "accion")
    public static class Accion {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "idAccion")
        public long idAccion;
        @Column(name = "nombre")
        public String nombre;

        @ManyToOne
        @JoinColumn(name = "perteneceRegistro", referencedColumnName = "idRegistro")
        private pe.edu.uandina.demo2spring.modelo.Registro perteneceRegistro;

        public Accion() {
        }

        public Accion(String nombre) {
            this.nombre = nombre;
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

        public pe.edu.uandina.demo2spring.modelo.Registro getPerteneceRegistro() {
            return perteneceRegistro;
        }

        public void setPerteneceRegistro(pe.edu.uandina.demo2spring.modelo.Registro perteneceRegistro) {
            this.perteneceRegistro = perteneceRegistro;
        }
    }
}
