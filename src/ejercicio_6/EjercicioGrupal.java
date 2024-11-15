package ejercicio_6;

public class EjercicioGrupal extends ActividadFisica{
	//Zona de atributos
    private String nivelDeDificultad;
    private int cantidadDeParticipantes;
    private String diaDeFinalizacionCiclo;

    //Constructor
    public EjercicioGrupal(String centroDeEntrenamiento, String actividadFisica, String nombreInstructor, boolean disponible, String diaDeLaSemana, String horaInicio, String nivelDeDificultad, int cantidadDeParticipantes, String diaDeFinalizacionCiclo) {
        super(centroDeEntrenamiento, actividadFisica, nombreInstructor, disponible, diaDeLaSemana, horaInicio);
        this.nivelDeDificultad = nivelDeDificultad;
        this.cantidadDeParticipantes = cantidadDeParticipantes;
        this.diaDeFinalizacionCiclo = diaDeFinalizacionCiclo;
    }
    
    //Métodos de la clase
    public void mostrarInforEjercicioGrupal() {
        System.out.println("Centro de entrenamiento: "+getCentroDeEntrenamiento());
        System.out.println("Instructor: "+getNombreInstructor());
        System.out.println("Cantidad de participantes: "+this.cantidadDeParticipantes);
    }
    
    //Getters y Setters
	public String getNivelDeDificultad() {
		return nivelDeDificultad;
	}

	public void setNivelDeDificultad(String nivelDeDificultad) {
		this.nivelDeDificultad = nivelDeDificultad;
	}

	public int getCantidadDeParticipantes() {
		return cantidadDeParticipantes;
	}

	public void setCantidadDeParticipantes(int cantidadDeParticipantes) {
		this.cantidadDeParticipantes = cantidadDeParticipantes;
	}

	public String getDiaDeFinalizacionCiclo() {
		return diaDeFinalizacionCiclo;
	}

	public void setDiaDeFinalizacionCiclo(String diaDeFinalizacionCiclo) {
		this.diaDeFinalizacionCiclo = diaDeFinalizacionCiclo;
	}
}
