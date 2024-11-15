package ejercicio_2;

public class ArticuloDeLibreria {
    private String codigo;
    private String nombre;
    private float precio;
    private int cantidad;
    public ArticuloDeLibreria() {
        this.precio = 0;
        this.cantidad = 0;
    }

    public ArticuloDeLibreria(String codigo, String nombre, float precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void depositarEnStock(int cantidad) {
        this.cantidad += cantidad;
    }
    public int retirarDeStock(int cantidad) {
        if (cantidad > this.cantidad) {
            System.out.println("No se puede retirar la cantidad solicitada. Ingrese un numero mas bajo");
        } else {
            this.cantidad -= cantidad;
        }
        return this.cantidad;
    }

	@Override
	public String toString() {
		return "ArticuloDeLibreria [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", cantidad="
				+ cantidad + "]";
	}
}
