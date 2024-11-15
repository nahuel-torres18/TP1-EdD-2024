package ejercicio_1;

import java.util.Scanner;

public class Helper {
	public static int validarEntero(Scanner input, String mensaje) {
        int numero;
        String valorIngresado;
        while (true) {
            try {
                System.out.print(mensaje);
                valorIngresado = input.nextLine();
                numero = Integer.parseInt(valorIngresado);
                break;
            } catch (Exception e) {
                System.out.println("¡Error! El numero debe ser ENTERO");
                input.next();
            }
        }
        return numero;
    }

    public static double validarDouble(Scanner input, String mensaje) {
        double numero;
        String valorIngresado;
        while (true) {
            try {
                System.out.print(mensaje);
                valorIngresado = input.nextLine();
                numero = Double.parseDouble(valorIngresado);
                break;
            } catch (Exception e) {
                System.out.println("¡Error! El valor debe ser DOUBLE");
                input.next();
            }
        }
        return numero;
    }

    public static float validarFloat(Scanner input, String mensaje) {
        float numero;
        String valorIngresado;
        while (true) {
            try {
                System.out.print(mensaje);
                valorIngresado = input.nextLine();
                numero = Float.parseFloat(valorIngresado);
                break;
            } catch (Exception e) {
                System.out.println("¡Error! El valor debe ser FLOAT");
                input.next();
            }
        }
        return numero;
    }

    public static char validarCaracter(Scanner input, String mensaje) {
        char caracter;
        while (true) {
            try {
                System.out.print(mensaje);
                caracter = input.nextLine().charAt(0);
                break;
            } catch (Exception e) {
                System.out.println("¡Error! El valor debe ser de tipo CHAR");
                input.next();
            }
        }
        return caracter;
    }

    public static String leerCadena(Scanner input, String mensaje) {
        System.out.print(mensaje);
        String cadena = input.nextLine();
        while (cadena.isEmpty()) {
            System.out.println("La cadena no puede estar vacia");
            cadena = input.nextLine();
        }
        return cadena;
    }
    
    public static boolean leerBoolean(Scanner input, String mensaje) {
    	boolean verdad;
    	String valorIngresado;
    	while (true) {
    		try {
    			System.out.print(mensaje);
            	valorIngresado = input.nextLine();
            	verdad = Boolean.parseBoolean(valorIngresado);
            	break;
			} catch (Exception e) {
				System.out.println("¡Error! El valor debe ser de tipo BOOLEAN");
				input.next();
			}
		}
    	return verdad;
    }
}
