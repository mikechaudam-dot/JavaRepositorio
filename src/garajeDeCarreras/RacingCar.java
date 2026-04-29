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
	
	public double acelerate() {
		return 10;
	}
	
	public double acelerate(int amount) {
		return amount;
	}
	
	@Override
	public void drive() {
		System.out.println("Es muy veloz");
	}
	
	
}
