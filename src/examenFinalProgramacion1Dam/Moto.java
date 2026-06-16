package examenFinalProgramacion1Dam;

public class Moto extends Vehiculo implements Reparacion {
	private int cilindrada;
	
	

	public Moto(String numeroMatricula, int cilindrada) {
		super(numeroMatricula);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
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
