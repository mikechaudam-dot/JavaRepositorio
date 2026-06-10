package interfaces.recargables;

public class CocheElectrico extends Vehiculo implements Recargable {
	private boolean motor = true;
	private double nivelBateria;

	public CocheElectrico(String color, String combustible, TipoVehiculo tipo, boolean motor, double nivelBateria) {
		super(color, combustible, tipo);
		this.motor = motor;
		this.nivelBateria = nivelBateria;
	}

	public boolean isMotor() {
		return motor;
	}
	
	

	public double getNivelBateria() {
		return nivelBateria;
	}

	@Override
	public String toString() {
		return "CocheElectrico [motor=" + motor + ", nivelBateria=" + nivelBateria + ", getColor()=" + getColor()
				+ ", getCombustible()=" + getCombustible() + ", getTipo()=" + getTipo() + "]";
	}
	
	
	

	
	
	
	
	
	
}
