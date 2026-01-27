package Poo;

public class Asensor {
	private int pisoActual;
	
	// Constructor
	public Asensor() {
		this.pisoActual = 0;
	}
	
	public void subir(int n) {
		this.pisoActual += n;
		System.out.println("Subiendo " + n + " pisos " + "ahora en la planta " + this.pisoActual );
	}
	
	public void bajar(int n) {
		this.pisoActual -= n;
		System.out.println("Bajando " + n + " pisos " + " ahora en la planta " + this.pisoActual);
	}
	
	public int getpisoActual() {
		return this.pisoActual;
	}

}


