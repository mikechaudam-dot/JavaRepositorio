package examenFinalProgramacion1Dam;

public class Camion extends Vehiculo implements Reparacion {
	private double tonelajeMaximo;

	public Camion(String numeroMatricula, double tonelajeMaximo) {
		super(numeroMatricula);
		this.tonelajeMaximo = tonelajeMaximo;
	}

	public double getTonelajeMaximo() {
		return tonelajeMaximo;
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
