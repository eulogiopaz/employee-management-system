import java.util.Date;
import java.util.List;

public class Informatico extends Empleado {

    private LenguajePrincipal lenguajePrincipal;
    private NivelTecnico nivelTecnico;

    // Constructor sin parámetros
    public Informatico() {
        super(); // llama al constructor vacío de Empleado
    }

    // Constructor completo (con super)
    public Informatico(int id, String dni, String nombre, String apellidos,
                       Date fechaNacimiento, Date fechaContratacion, double salario,
                       List<String> telefonos, String email,
                       LenguajePrincipal lenguajePrincipal, NivelTecnico nivelTecnico) {
   
    	// "Super" llama al constructor de Empleado y evita duplicar código 
        super(id, dni, nombre, apellidos, fechaNacimiento, fechaContratacion,
              salario, telefonos, email);

        this.lenguajePrincipal = lenguajePrincipal;
        this.nivelTecnico = nivelTecnico;
    }

    public LenguajePrincipal getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    public void setLenguajePrincipal(LenguajePrincipal lenguajePrincipal) {
        this.lenguajePrincipal = lenguajePrincipal;
    }

    public NivelTecnico getNivelTecnico() {
        return nivelTecnico;
    }

    public void setNivelTecnico(NivelTecnico nivelTecnico) {
        this.nivelTecnico = nivelTecnico;
    }
}
