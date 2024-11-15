package ejercicio_6;

public class EntrenamientoPersonalizado extends ActividadFisica {
    private double duracionEntrenamiento;
    private String objetivosEntrenamiento;
    private String rutinaPersonalizada;

    public EntrenamientoPersonalizado(String centroDeEntrenamiento, String actividadFisica, String nombreInstructor, boolean disponible, String diaDeLaSemana, String horaInicio, double duracionEntrenamiento, String objetivosEntrenamiento, String rutinaPersonalizada) {
        super(centroDeEntrenamiento, actividadFisica, nombreInstructor, disponible, diaDeLaSemana, horaInicio);
        this.duracionEntrenamiento = duracionEntrenamiento;
        this.objetivosEntrenamiento = objetivosEntrenamiento;
        this.rutinaPersonalizada = rutinaPersonalizada;
    }
    
    //Getters y Setters
	public double getDuracionEntrenamiento() {
		return duracionEntrenamiento;
	}

	public void setDuracionEntrenamiento(double duracionEntrenamiento) {
		this.duracionEntrenamiento = duracionEntrenamiento;
	}

	public String getObjetivosEntrenamiento() {
		return objetivosEntrenamiento;
	}

	public void setObjetivosEntrenamiento(String objetivosEntrenamiento) {
		this.objetivosEntrenamiento = objetivosEntrenamiento;
	}

	public String getRutinaPersonalizada() {
		return rutinaPersonalizada;
	}

	public void setRutinaPersonalizada(String rutinaPersonalizada) {
		this.rutinaPersonalizada = rutinaPersonalizada;
	}

	public void mostrarEntrenamiento() {
		super.toString();
		System.out.println("Duracion de entrenamiento: " + duracionEntrenamiento);
		System.out.println("Objetivo del entrenamiento: " + objetivosEntrenamiento);
		System.out.println("Rutina personalizada: " + rutinaPersonalizada);
	}
}
