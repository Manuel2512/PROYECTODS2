package pe.edu.uandina.demo2spring.modelo;

import javax.persistence.*;
import java.sql.Date;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "registro")
public class Registro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRegistro")
    private long idRegistro;
    @Column(name = "fechaEntrada")
    private Date fechaEntrada;
    @Column(name = "fechaSalida")
    private Calendar fechaSalida;

    @ManyToOne
    @JoinColumn(name = "tieneBalon", referencedColumnName = "idBalon")
    private Balon tieneBalon;

    @OneToMany
    private List<Cliente> perteneceCliente;

    @OneToMany
    private List<Accion> tieneAccion;


    public Registro() {
    }

    public Registro(Date fechaEntrada, Calendar fechaSalida, List<Cliente> perteneceCliente, List<Accion> tieneAccion) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.perteneceCliente = perteneceCliente;
        this.tieneAccion = tieneAccion;
    }

    public long getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(long idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Calendar getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Calendar fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Balon getTieneBalon() {
        return tieneBalon;
    }

    public void setTieneBalon(Balon tieneBalon) {
        this.tieneBalon = tieneBalon;
    }
}
