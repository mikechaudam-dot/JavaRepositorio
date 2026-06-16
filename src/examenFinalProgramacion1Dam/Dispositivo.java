package examenFinalProgramacion1Dam;

public class Dispositivo implements Reparacion {
	private String numeroSerie;

	public Dispositivo(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	@Override
	public void obtenerIdentificador() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calculoCosteFinal() {
		// TODO Auto-generated method stub
		return 0;
	}




}
