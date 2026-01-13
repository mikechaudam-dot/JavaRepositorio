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
	
	public void status() {
		System.out.println("Tu mascota " + nombre + " nivel de hambre " + hambre + " energia " + energia);
	}
	
	public void comer() {
		if (hambre <= 10) {
			this.hambre = 0;
		}else {
			this.hambre -= 10;
		}
	}
	
	public void dormir() {
		this.energia=100;
	}
	
	public void jugar() {
		if(this.energia >=20) {
			if (this.hambre<85) {
				this.hambre+=15;
			}
		}
	}
	
}
