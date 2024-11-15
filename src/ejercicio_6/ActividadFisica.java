package ejercicio_6;

public class ActividadFisica {
    private String centroDeEntrenamiento;
    private String actividadFisica;
    private String nombreInstructor;
    private boolean disponible;
    private String diaDeLaSemana;
    private String horaInicio;
    
    public ActividadFisica(String centroDeEntrenamiento, String actividadFisica, String nombreInstructor, boolean disponible, String diaDeLaSemana, String horaInicio) {
        this.centroDeEntrenamiento = centroDeEntrenamiento;
        this.actividadFisica = actividadFisica;
        this.nombreInstructor = nombreInstructor;
        this.disponible = disponible;
        this.diaDeLaSemana = diaDeLaSemana;
        this.horaInicio = horaInicio;
    }

    public String getCentroDeEntrenamiento() {
		return centroDeEntrenamiento;
	}

	public void setCentroDeEntrenamiento(String centroDeEntrenamiento) {
		this.centroDeEntrenamiento = centroDeEntrenamiento;
	}

	public String getNombreInstructor() {
		return nombreInstructor;
	}

	public void setNombreInstructor(String nombreInstructor) {
		this.nombreInstructor = nombreInstructor;
	}

	public boolean actividadDisponible() {
        return disponible;
    }
	
	public void mostrarActividad() {
		System.out.println("Centro: " + centroDeEntrenamiento);
		System.out.println("Actividad fisica: " + actividadFisica);
		System.out.println("Nombre del instructor: " + nombreInstructor);
		System.out.println("Disponible: " + disponible);
		System.out.println("Dia de la semana: " + diaDeLaSemana);
		System.out.println("Hora de inicio: " + horaInicio);
	}
}
