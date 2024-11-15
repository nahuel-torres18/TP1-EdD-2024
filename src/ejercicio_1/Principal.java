package ejercicio_1;

import java.util.Scanner;

public class Principal {
	  	public static void mostrarInformacion(Vehiculo vehiculo1, Vehiculo vehiculo2, Vehiculo vehiculo3) {
	        System.out.println(vehiculo1);
	        System.out.println(vehiculo2);
	        System.out.println(vehiculo3);
	    }
	    public static void mostrarMarca(Scanner input, Vehiculo vehiculo1, Vehiculo vehiculo2, Vehiculo vehiculo3) {
	        System.out.print("Ingresa la marca del auto que estas buscando: ");
	        String marca = input.nextLine();
	        while (marca.isEmpty()) {
	            System.out.print("No puede ingresar una cadena vacia. Vuelva a intentarlo: ");
	            marca = input.nextLine();
	        }
	        if (marca.equals(vehiculo1.getMarca())) {
	            System.out.println(vehiculo1);
	        } else if (marca.equals(vehiculo2.getMarca())) {
	            System.out.println(vehiculo2);
	        } else if (marca.equals(vehiculo3.getMarca())) {
	            System.out.println(vehiculo3);
	        } else {
	            System.out.println("No se encontro la marca del auto");
	        }
	    }
	    public static boolean determinarMotor(Vehiculo vehiculo) {
	        if (vehiculo.getTipoMotor().equals("diesel")) {
	            return true;
	        }
	        return false;
	    }
	    public static void contarMotorVehiculor(Vehiculo vehiculo1, Vehiculo vehiculo2, Vehiculo vehiculo3) {
	        int contador1 = 0, contador2 = 0;
	        if (determinarMotor(vehiculo1)) {
	            contador1++;
	        } else {
	            contador2++;
	        }
	        if (determinarMotor(vehiculo2)) {
	            contador1++;
	        } else {
	            contador2++;
	        }
	        if (determinarMotor(vehiculo3)) {
	            contador1++;
	        } else {
	            contador2++;
	        }
	        System.out.println("Cantidad de autos con motor 'diesel': " + contador1);
	        System.out.println("Cantidad de autos con motor 'naftero': " + contador2);
	    }

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        Vehiculo vehiculo1 = new Vehiculo(Helper.leerCadena(input, "Ingresa la marca: "), Helper.leerCadena(input, "Ingresa el modelo: "), Helper.leerCadena(input, "Ingresa el tipo de motor (diesel/naftero): "));
        Vehiculo vehiculo2 = new Vehiculo(Helper.leerCadena(input, "Ingresa la marca: "), Helper.leerCadena(input, "Ingresa el modelo: "), Helper.leerCadena(input, "Ingresa el tipo de motor (diesel/naftero): "));
        Vehiculo vehiculo3 = new Vehiculo(Helper.leerCadena(input, "Ingresa la marca: "), Helper.leerCadena(input, "Ingresa el modelo: "), Helper.leerCadena(input, "Ingresa el tipo de motor (diesel/naftero): "));

        mostrarInformacion(vehiculo1, vehiculo2, vehiculo3);
        mostrarMarca(input, vehiculo1, vehiculo2, vehiculo3);
        contarMotorVehiculor(vehiculo1, vehiculo2, vehiculo3);
	}

}
