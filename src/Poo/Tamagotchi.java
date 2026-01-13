package Poo;


public class Tamagotchi {
	private String nombre;
	private int hambre;
	private int energia;
	
	public Tamagotchi(String nombre) {
		this.nombre = nombre;
		this.hambre = 100;
		this.energia = 0;
	}
	
	public Tamagotchi(String nombre, int hambre, int energia) {
		this.nombre = nombre;
		this.hambre = energia;
		this.energia = hambre;
		
	}
	
	public void comer() {
		System.out.print("Alimentaste a tu mascota " + " hambre : " + (hambre - 10));
	}
	
	public void jugar() {
		System.out.print("Tu mascota se divierte jugando " + " hambre: " + (hambre + 15) + "energia" );
	}
	
}
