import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Empleado {

    private int id;
    private String dni;
    private String nombre;
    private String apellidos;
    private Date fechaNacimiento;
    private Date fechaContratacion;
    private double salario;
    private List<String> telefonos;
    private String email;

    // Constructor sin parámetros
    public Empleado() {
        this.telefonos = new ArrayList<>();
    }

    // Constructor con parámetros (versión completa)
    public Empleado(int id, String dni, String nombre, String apellidos,
                    Date fechaNacimiento, Date fechaContratacion, double salario,
                    List<String> telefonos, String email) {

        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaContratacion = fechaContratacion;
        this.salario = salario;
        this.email = email;

        // Requisito: mínimo 1 teléfono (1..*)
        if (telefonos == null || telefonos.isEmpty()) {
            throw new IllegalArgumentException("El empleado debe tener al menos un teléfono.");
        }
        this.telefonos = new ArrayList<>(telefonos);
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public List<String> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<String> telefonos) {
        if (telefonos == null || telefonos.isEmpty()) {
            throw new IllegalArgumentException("El empleado debe tener al menos un teléfono.");
        }
        this.telefonos = new ArrayList<>(telefonos);
    }

    public void addTelefono(String telefono) {
        if (telefono == null || telefono.isBlank()) return;
        this.telefonos.add(telefono);
    }

    public void removeTelefono(String telefono) {
        if (telefono == null) return;
        this.telefonos.remove(telefono);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
