package ejercicio_3;

import java.util.Scanner;

public class Principal {
    public static void menu() {
        System.out.println("1) Mostrar la información de un evento.");
        System.out.println("2) Calcular la duración del evento en días.");
        System.out.println("3) Verificar si el evento está en curso en la fecha actual.");
        System.out.println("4) Calcular la cantidad de días restantes hasta el inicio del evento.");
        System.out.println("5) Calcular la cantidad de días transcurridos desde el inicio del evento.");
        System.out.println("6) Salir");
    }
    public static int opcion(Scanner input) {
        int opcion;
        while (true) {
            try {
                System.out.print("Seleccione una opcion: ");
                opcion = input.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Ingreso no valido. Vuelva a intentarlo");
                input.next();
            }
        }
        return opcion;
    }
    public static void operaciones(int opcion, Evento evento) {
        switch (opcion) {
            case 1:
                System.out.println(evento);
                break;
            case 2:
                evento.duracionDelEvento();
                break;
            case 3:
                evento.eventoEnCurso();
                break;
            case 4:
                evento.cantidadDeDiasHastaIniciarElEvento();
                break;
            case 5:
                evento.cantidadDeDiasTranscurridosDesdeInicioDelEvento();
                break;
            case 6:
                System.out.println("Fin del programa");
                break;
            default:
                System.out.println("Opcion fuera de rango");
                break;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Evento evento = new Evento();
        int opcion;
        do {
            menu();
            opcion = opcion(input);
            operaciones(opcion, evento);
        } while (opcion != 6);
    }
}
