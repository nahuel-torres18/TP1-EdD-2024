package ejercicio_4;

public class Herramienta {
	
    private String codigo;
    private String nombre;
    private int cantidad;
    private float precioUnitario;
    private String tipo; //Ejemplo: electrica, mecanica, manual
    
    public Herramienta(String codigo, String nombre, int cantidad, float precioUnitario, String tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 30;
        }
        if (precioUnitario > 0) {
            this.precioUnitario = precioUnitario;
        } else {
            this.precioUnitario = 1000.56f;
        }
    }
    
    public Herramienta(String codigo, String nombre, float precioUnitario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
    }
    
    public void valorTotalHerramienta() {
        float valorTotal = this.precioUnitario * this.cantidad;
        System.out.println("El valor total de la herramienta es: "+valorTotal);
    }
    
    public void entregarCantidadHerramientas(int cantidad) {
        if (cantidad > 0) {
            if (cantidad <= this.cantidad) {
                this.cantidad -= cantidad;
                System.out.println("Se entregaron "+cantidad+" herramientas");
                System.out.println("En el inventario quedan "+this.cantidad+" herramientas");
            } else {
                System.out.println("Cantidad insuficiente en el inventario");
            }
        } else {
            System.out.println("No se puede entregar un numero negativo de herramientas");
        }
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

	@Override
	public String toString() {
		return "Herramienta [codigo=" + codigo + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precioUnitario="
				+ precioUnitario + ", tipo=" + tipo + "]";
	}
}
