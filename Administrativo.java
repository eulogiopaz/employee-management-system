import java.util.Date;
import java.util.List;

public class Administrativo extends Empleado {

    private Departamento departamento;
    private NivelOfimatica nivelOfimatica;
    private String horario;
    private boolean gestionaDocumentacion;

    // Constructor sin parámetros
    public Administrativo() {
        super(); // llama al constructor vacío de Empleado
    }

    // Constructor completo (con super)
    public Administrativo(int id, String dni, String nombre, String apellidos,
                           Date fechaNacimiento, Date fechaContratacion, double salario,
                           List<String> telefonos, String email,
                           Departamento departamento, NivelOfimatica nivelOfimatica,
                           String horario, boolean gestionaDocumentacion) {
    
    	// "Super" llama al constructor de Empleado y evita duplicar código
        super(id, dni, nombre, apellidos, fechaNacimiento, fechaContratacion,
              salario, telefonos, email);

        this.departamento = departamento;
        this.nivelOfimatica = nivelOfimatica;
        this.horario = horario;
        this.gestionaDocumentacion = gestionaDocumentacion;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public NivelOfimatica getNivelOfimatica() {
        return nivelOfimatica;
    }

    public void setNivelOfimatica(NivelOfimatica nivelOfimatica) {
        this.nivelOfimatica = nivelOfimatica;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public boolean isGestionaDocumentacion() {
        return gestionaDocumentacion;
    }

    public void setGestionaDocumentacion(boolean gestionaDocumentacion) {
        this.gestionaDocumentacion = gestionaDocumentacion;
    }
}
