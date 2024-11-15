package ejercicio_3;

import java.time.LocalDate;
public class Evento {
    private String nombre;
    private String descripcion;
    private int fechaInicio;
    private int fechaFin;
    public Evento() {
        this.nombre = "Sin nombre";
        this.descripcion = "Sin descripcion";
        this.fechaInicio = 20;
        this.fechaFin = 27;
    }
    public Evento(String nombre, String descripcion, int fechaInicio, int fechaFin) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    public void validarFecha(int fechaInicio, int fechaFin) {
        if ((fechaInicio >= 1 || fechaInicio <= 30) && (fechaFin >= 1 || fechaFin <= 30)) {
            if (fechaInicio < fechaFin) {
                System.out.println("Las fechas de inicio y fin son validas");
            } else {
                System.out.println("Las fechas ingresadas no eran validas. Se les dio el valor del constructor por defecto");
                this.fechaInicio = 20;
                this.fechaFin = 27;
            }
        } else {
            System.out.println("Las fechas ingresadas no eran validas. Se les dio el valor del constructor por defecto");
            this.fechaInicio = 20;
            this.fechaFin = 27;
        }
    }
    public void duracionDelEvento() {
        int aux = 0;
        for (int i = this.fechaInicio; i <= this.fechaFin; i++) {
            aux += 1;
        }
        System.out.println("La duracion del evento es de " + aux + " dias");
    }
    public void eventoEnCurso() {
        LocalDate fechaActual = LocalDate.now();
        int dia = fechaActual.getDayOfMonth();
        if (dia >= this.fechaInicio && dia <= fechaFin) {
            System.out.println("El evento esta en curso en la fecha actual");
        } else {
            System.out.println("El evento no esta en curso actualmente");
        }
    }
    public void cantidadDeDiasHastaIniciarElEvento() {
        int suma = 0;
        for (int i = 0; i < this.fechaInicio; i++) {
            suma += 1;
        }
        System.out.println("Cantidad de dias que faltan para que inicie el evento: "+suma);
    }
    public void cantidadDeDiasTranscurridosDesdeInicioDelEvento() {
        int suma = 0;
        for (int i = this.fechaInicio; i <= 30; i++) {
            suma += 1;
        }
        System.out.println("Desde el dia del evento han transcurrido "+suma+" dias");
    }
    @Override
    public String toString() {
        return "Evento{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                '}';
    }
}
