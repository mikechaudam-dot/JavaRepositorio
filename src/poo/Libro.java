package poo;

public class Libro {
	protected String titulo;
	protected int sibn;
	
	public Libro(String titulo, int sibn) {
		this.titulo = titulo;
		this.sibn = sibn;
	}
	
	public void mostrarLibro() {
		System.out.print("Libro: " + titulo + " ISBN: " + sibn);
	}
}
