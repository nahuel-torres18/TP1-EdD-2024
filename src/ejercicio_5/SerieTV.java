package ejercicio_5;

public class SerieTV extends ContenidoMultimedia {
    private int temporadas;
    private String genero;

    public SerieTV(String titulo, String director, int año, float duracion, boolean disponible, int temporadas, String genero) {
        super(titulo, director, año, duracion, disponible);
        this.temporadas = temporadas;
        this.genero = genero;
    }

	@Override
	public String toString() {
		return super.toString() + "SerieTV [temporadas=" + temporadas + ", genero=" + genero + "]";
	}
}
