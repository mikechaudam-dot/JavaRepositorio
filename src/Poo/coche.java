package Poo;

public class coche extends vehiculo {
	protected int numeroPuertas;
	
	public coche (String marca, String modelo, int numeroPuertas) {
		super(marca, modelo);
		this.numeroPuertas = numeroPuertas;
	}

}
