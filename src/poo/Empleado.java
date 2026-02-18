package poo;

public class Empleado {
	protected String nombre;
	private static double salarioBase = 1000;
	
	public Empleado(String nombre) {
		this.nombre = nombre;
	}
	
	public double calcularSalario() {
		return salarioBase;
	}

}
