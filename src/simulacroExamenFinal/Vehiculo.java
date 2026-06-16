package simulacroExamenFinal;

public abstract class Vehiculo implements Auditoria {
	
	private String matricula;
	private double capacidad_carga;
	
	
	public Vehiculo(String matricula, double capacidad_carga) {
		this.matricula = matricula;
		this.capacidad_carga = capacidad_carga;
	}


	public String getMatricula() {
		return matricula;
	}


	public double getCapacidad_carga() {
		return capacidad_carga;
	}
	
	
	
}
