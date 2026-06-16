package examenFinalProgramacion1Dam;

public class Coche extends Vehiculo implements Reparacion {
	private String tipoCombustible;

	public Coche(String numeroMatricula, String tipoCombustible) {
		super(numeroMatricula);
		this.tipoCombustible = tipoCombustible;
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = "Diesel";
		this.tipoCombustible = "Gasolina";
		this.tipoCombustible = "Electrico";
	}

	@Override
	public void obtenerIdentificador() {
		System.out.println("Numero de matricula");
	}

	@Override
	public double calculoCosteFinal() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
