import java.util.Date;
import java.util.List;

public class Contable extends Empleado {

    private EspecialidadFiscal especialidadFiscal;
    private int experienciaAnios;

    // Constructor sin parámetros
    public Contable() {
        super(); // llama al constructor vacío de Empleado
    }

    // Constructor completo (con super)
    public Contable(int id, String dni, String nombre, String apellidos,
                    Date fechaNacimiento, Date fechaContratacion, double salario,
                    List<String> telefonos, String email,
                    EspecialidadFiscal especialidadFiscal, int experienciaAnios) {
    
    	// "Super" llama al constructor de Empleado y evita duplicar código
        super(id, dni, nombre, apellidos, fechaNacimiento, fechaContratacion,
              salario, telefonos, email);

        this.especialidadFiscal = especialidadFiscal;
        this.experienciaAnios = experienciaAnios;
    }

    public EspecialidadFiscal getEspecialidadFiscal() {
        return especialidadFiscal;
    }

    public void setEspecialidadFiscal(EspecialidadFiscal especialidadFiscal) {
        this.especialidadFiscal = especialidadFiscal;
    }

    public int getExperienciaAnios() {
        return experienciaAnios;
    }

    public void setExperienciaAnios(int experienciaAnios) {
        this.experienciaAnios = experienciaAnios;
    }
}
