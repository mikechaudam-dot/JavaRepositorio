package poo;

public class Repartidor extends Empleado {
	private String zona;
	
	public Repartidor(String nombre, String zona) {
		super (nombre);
		this.zona = zona;
	}
	
	@Override
	public double calcularSalario() {
		if (zona.equals("Zona 1")) {
			return super.calcularSalario() + 100;
		}
		else {
			return super.calcularSalario();
		}
	}

}
