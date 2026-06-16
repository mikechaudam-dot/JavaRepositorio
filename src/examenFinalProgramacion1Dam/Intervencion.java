package examenFinalProgramacion1Dam;

public class Intervencion {
	
	private Vehiculo elemento1;
	private String descripcionAveria;
	private double horasOperario;
	private double costoPiezas;
	
	
	public Intervencion(Vehiculo elemento1, String descripcionAveria, double horasOperario, double costoPiezas) {
		super();
		this.elemento1 = elemento1;
		this.descripcionAveria = descripcionAveria;
		this.horasOperario = horasOperario;
		this.costoPiezas = costoPiezas;
	}


	public Vehiculo getElemento1() {
		return elemento1;
	}


	public String getDescripcionAveria() {
		return descripcionAveria;
	}


	public double getHorasOperario() {
		return horasOperario;
	}


	public double getCostoPiezas() {
		return costoPiezas;
	}
	
	
	
	
}
