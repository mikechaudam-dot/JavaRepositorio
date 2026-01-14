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
		this.hambre = hambre;
		this.energia = energia;
		
	}
	
	public void status() {
		System.out.println("Tu mascota: " + nombre + ", nivel de hambre: " + hambre + ", energia: " + energia);
	}
	
	public void comer() {
		if (hambre <= 10) {
			this.hambre = 0;
		}else {
			this.hambre -= 10;
		}
		System.out.println("!Ñami Ñami! Gracias por la comida!");
	}
	
	public void dormir() {
		this.energia=100;
		System.out.println("zzZZzzZZ ZZzzZZ");
	}
	
	public void jugar() {
		if(this.energia >=20) {
			if (this.hambre<85) {
				this.hambre+=15;
			}else {
				this.hambre = 100;
			}
			this.energia -= 20;
			System.out.print("Yupi me gusta jugar!!!");
		}else {
			System.out.println("Estoy muy cansado para jugar, necesito una siesta");
		}
	}
	
}
