package ejercicio_5;

import ejercicio_1.Helper;
import java.util.Scanner;

public class Principal {
    public static void contenidoDisponible(ContenidoMultimedia contenidoMultimedia, SerieTV serieTV) {
        if (contenidoMultimedia.contenidoDisponible()) {
            System.out.println("La serie "+contenidoMultimedia.getTitulo()+" esta disponible");
        } else {
            System.out.println("La serie "+contenidoMultimedia.getTitulo()+" no esta disponible");
        }
        if (serieTV.contenidoDisponible()) {
            System.out.println("La serie "+serieTV.getTitulo()+" esta disponible");
        } else {
            System.out.println("La serie "+serieTV.getTitulo()+" no esta disponible");
        }
    }
    public static void determinarEstadoDeAlquiler(Scanner input, ContenidoMultimedia contenidoMultimedia) {
        String titulo = Helper.leerCadena(input, "Ingrese el titulo que esta buscando: ");
        if (contenidoMultimedia.getTitulo().equals(titulo)) {
            if (contenidoMultimedia.contenidoDisponible()) {
                System.out.println("El contenido " + contenidoMultimedia.getTitulo() + " esta disponible para alquilar");
            } else {
                System.out.println("Contenido no disponible para alquilar");
            }
        } else {
            System.out.println("El titulo ingresado no existe");
        }

    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ContenidoMultimedia contenidoMultimedia = new ContenidoMultimedia(
        		Helper.leerCadena(input, "Ingrese el titulo del contenido multimedia: "), Helper.leerCadena(input, "Nombre del director: "),
        		Helper.validarEntero(input, "Ingrese el año de creacion del contenido: "), Helper.validarDouble(input, "Duracion del contenido: "),
        		Helper.leerBoolean(input, "¿Esta disponible? (true/false): "));
        SerieTV serieTV = new SerieTV(Helper.leerCadena(input, "Titulo de la serie: "), Helper.leerCadena(input, "Nombre del director: "),
        		Helper.validarEntero(input, "Ingrese el año de creacion de la serie: "), Helper.validarFloat(input, "Duracion de la serie: "),
        		Helper.leerBoolean(input, "¿Esta disponible? (true/false): "), Helper.validarEntero(input, "Ingrese la cantidad de temporadas que tiene la serie: "),
        		Helper.leerCadena(input, "Ingrese el genero de la serie: "));
        
        System.out.println(contenidoMultimedia);
        System.out.println(serieTV);
        
        contenidoDisponible(contenidoMultimedia, serieTV);
        determinarEstadoDeAlquiler(input, contenidoMultimedia);
    }
}
