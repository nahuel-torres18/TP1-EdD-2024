package ejercicio_6;

import ejercicio_1.Helper;
import java.util.Scanner;

public class Principal {
    public static void mostrarActividadDisponibleGrupal(EjercicioGrupal ejercicioGrupal) {
        if (ejercicioGrupal.actividadDisponible()) {
            System.out.println("Actividad disponible para inscripcion");
        } else {
            System.out.println("Actividad no disponible");
        }
    }
    
    public static void mostrarActividadDisponiblePersonalizada(EntrenamientoPersonalizado entrenamientoPersonalizado) {
        if (entrenamientoPersonalizado.actividadDisponible()) {
            System.out.println("Actividad disponible para inscripcion");
        } else {
            System.out.println("Actividad no disponible");
        }
    }
    
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	EjercicioGrupal ejercicioGrupal = new EjercicioGrupal(
    			Helper.leerCadena(input, "Nombre del centro de entrenamineto: "),
    			Helper.leerCadena(input, "Nombre de la actividad fisica: "),
    			Helper.leerCadena(input, "Nombre del instructor: "),
    			Helper.leerBoolean(input, "¿Actividad disponible? (true/false): "),
    			Helper.leerCadena(input, "Dia de la semana: "),
    			Helper.leerCadena(input, "Hora de inicio del ejercicio: "),
    			Helper.leerCadena(input, "Nivel de dificultad: "),
    			Helper.validarEntero(input, "Cantidad de participantes: "),
    			Helper.leerCadena(input, "Fecha de finalizacion: "));
    	
    	EntrenamientoPersonalizado entrenamientoPersonalizado = new EntrenamientoPersonalizado(
    			Helper.leerCadena(input, "Nombre del centro de entrenamineto: "),
    			Helper.leerCadena(input, "Nombre de la actividad fisica: "),
    			Helper.leerCadena(input, "Nombre del instructor: "),
    			Helper.leerBoolean(input, "¿Actividad disponible? (true/false): "),
    			Helper.leerCadena(input, "Dia de la semana: "),
    			Helper.leerCadena(input, "Hora de inicio del ejercicio: "),
    			Helper.validarDouble(input, "Duracion de entrenamiento: "),
    			Helper.leerCadena(input, "Objetivo del enetrenamiento: "),
    			Helper.leerCadena(input, "Rutina personalizada: "));
    	
    	System.out.println("Entrenamiento Grupal");
    	System.out.println();
    	ejercicioGrupal.mostrarActividad();
    	
    	System.out.println();
    	System.out.println("Entrenamiento personalizado");
    	entrenamientoPersonalizado.mostrarActividad();
    	
    	System.out.println();
    	mostrarActividadDisponibleGrupal(ejercicioGrupal);
    	mostrarActividadDisponiblePersonalizada(entrenamientoPersonalizado);
    	System.out.println();
    	
    	ejercicioGrupal.mostrarInforEjercicioGrupal();
    	System.out.println();
    	entrenamientoPersonalizado.mostrarEntrenamiento();
    }
}
