package examenFinalProgramacion1Dam;

public abstract class Vehiculo implements Reparacion{
	private String numeroMatricula;

	public Vehiculo(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public String getNumeroMatricula() {
		return numeroMatricula;
	}
	
	
	
	

}
