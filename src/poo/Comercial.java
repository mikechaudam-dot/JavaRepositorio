package poo;

public class Comercial extends Empleado{
	private double comision;
	
	public Comercial(String nombre, double comision) {
		super(nombre);
		this.comision = comision;
	}
	
	@Override
	public double calcularSalario() {
		return super.calcularSalario() + comision;
	}
	
	

}
