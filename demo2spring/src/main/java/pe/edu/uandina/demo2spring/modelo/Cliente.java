package pe.edu.uandina.demo2spring.modelo;
import javax.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCliente")
    private long idCliente;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "DNI")
    private String DNI;
    @Column(name = "celular")
    private String celular;
    @Column(name = "domicilio")
    private String domicilio;
    @Column(name = "fechaNacimiento")
    private String fechaNacimiento;

    @ManyToOne
    @JoinColumn(name = "solicitaRegistro", referencedColumnName = "idRegistro")
    private Registro solicitaRegistro;

    public Cliente() {
    }

    public Cliente(String nombre, String apellidos, String DNI, String celular, String domicilio, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.celular = celular;
        this.domicilio = domicilio;
        this.fechaNacimiento = fechaNacimiento;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
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

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Registro getSolicitaRegistro() {
        return solicitaRegistro;
    }

    public void setSolicitaRegistro(Registro solicitaRegistro) {
        this.solicitaRegistro = solicitaRegistro;
    }
}
