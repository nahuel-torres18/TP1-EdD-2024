package ejercicio_4;

import ejercicio_1.Helper;

import java.util.Scanner;

public class Principal {
    public static void mostrarTipoHerramienta(Scanner input, Herramienta herramienta1) {
        System.out.print("Ingrese el tipo de herramienta (eléctrica, mecánica, manual): ");
        String tipo = input.nextLine();
        if (tipo.equals(herramienta1.getTipo())) {
            System.out.println("Nombre: "+herramienta1.getNombre());
            System.out.println("Precio: $"+herramienta1.getPrecioUnitario());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Creacion de los objetos herramientas
        Herramienta herramienta1 = new Herramienta(Helper.leerCadena(input, "Ingrese el codigo: "), Helper.leerCadena(input, "Ingrese el nombre: "), Helper.validarEntero(input, "Ingrese la cantidad: "), Helper.validarFloat(input, "Ingrese el precio unitario: "), Helper.leerCadena(input, "Ingrese el tipo de motor (electrico, mecanico, manual): "));
        Herramienta herramienta2 = new Herramienta(Helper.leerCadena(input, "Ingrese el codigo: "), Helper.leerCadena(input, "Ingrese el nombre: "), Helper.validarEntero(input, "Ingrese la cantidad: "), Helper.validarFloat(input, "Ingrese el precio unitario: "), Helper.leerCadena(input, "Ingrese el tipo de motor (electrico, mecanico, manual): "));
        Herramienta herramienta3 = new Herramienta(Helper.leerCadena(input, "Ingrese el codigo: "), Helper.leerCadena(input, "Ingrese el nombre: "), Helper.validarEntero(input, "Ingrese la cantidad: "), Helper.validarFloat(input, "Ingrese el precio unitario: "), Helper.leerCadena(input, "Ingrese el tipo de motor (electrico, mecanico, manual): "));
        
        //Metodo para calcular el valor total de las herramientas
        herramienta1.valorTotalHerramienta();
        herramienta2.valorTotalHerramienta();
        herramienta3.valorTotalHerramienta();
        
        //Metodo para entregar una cantidad determinada de herramientas
        herramienta1.entregarCantidadHerramientas(Helper.validarEntero(input, "Ingrese la cantidad de herramientas a retirar: "));
        herramienta2.entregarCantidadHerramientas(Helper.validarEntero(input, "Ingrese la cantidad de herramientas a retirar: "));
        herramienta3.entregarCantidadHerramientas(Helper.validarEntero(input, "Ingrese la cantidad de herramientas a retirar: "));

        //Mostrar de forma ordenada los atributos de los objetos
        System.out.println(herramienta1);
        System.out.println(herramienta2);
        System.out.println(herramienta3);
    }
}
