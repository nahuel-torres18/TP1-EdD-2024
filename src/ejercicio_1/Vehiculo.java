package ejercicio_1;

public class Vehiculo {
	private String marca;
    private String modelo;
    private String tipoMotor;

    public Vehiculo() {
        this.marca = "Desconocido";
        this.modelo = "Sin modelo";
        this.tipoMotor = "Desconocido";
    }
    public Vehiculo(String marca, String modelo, String tipoMotor) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoMotor = tipoMotor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
    
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", tipoMotor=" + tipoMotor + "]";
	}
    
}
