package garajeDeCarreras;

public class RacingCar extends Vehicle {
	private double topSpeed;
	
	public RacingCar(String brand,Engine engine, double topSpeed) {
		super(brand, engine);
		setTopSpeed(topSpeed);
	}

	public double getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(double topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	@Override
	public void drive() {
		System.out.println("Es muy veloz");
	}
	
	
}
