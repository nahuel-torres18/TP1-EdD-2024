package ejercicio_2;

import ejercicio_1.Helper;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String codigo = Helper.leerCadena(input, "Ingrese el codigo del producto: ");
        String nombre = Helper.leerCadena(input, "Ingrese el nombre del producto: ");
        float precio = Helper.validarFloat(input, "Ingrese el precio del producto: ");
        int cantidad = Helper.validarEntero(input, "Ingrese la cantidad de productos: ");

        ArticuloDeLibreria articuloDeLibreria = new ArticuloDeLibreria(codigo, nombre, precio, cantidad);
        articuloDeLibreria.depositarEnStock(Helper.validarEntero(input, "Deposite una cantidad especifica: "));
        System.out.println(articuloDeLibreria.retirarDeStock(Helper.validarEntero(input, "Ingrese la cantidad a extraer: ")));
        System.out.println(articuloDeLibreria);
    }
}
