package Poo;

public class Estudiante {
	private String nombre;
	private int numMatricula;
	
	private static int siguienteMatricula=1001;
	
	public Estudiante(String nombre) {
		this.nombre = nombre;
		this.numMatricula= siguienteMatricula;
	}
}
