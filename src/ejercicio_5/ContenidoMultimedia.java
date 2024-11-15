package ejercicio_5;

public class ContenidoMultimedia {
    private String titulo;
    private String director;
    private int año;
    private double duracion;
    private boolean disponible;
    public ContenidoMultimedia(String titulo, String director, int año, double duracion, boolean disponible) {
        this.titulo = titulo;
        this.director = director;
        this.año = año;
        this.duracion = duracion;
        this.disponible = disponible;
    }
    public boolean contenidoDisponible() {
        return this.disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public boolean isDisponible() {
        return disponible;
    }
    
	@Override
	public String toString() {
		return "ContenidoMultimedia [titulo=" + titulo + ", director=" + director + ", año=" + año + ", duracion="
				+ duracion + ", disponible=" + disponible + "]";
	}
}
