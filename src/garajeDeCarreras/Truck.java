package garajeDeCarreras;

public class Truck extends Vehicle {
	private double loadCapacity;
	
	
	public Truck(String brand,Engine engine, double loadCapacity) {
		super(brand,engine);
		setLoadCapacity(loadCapacity);
	}


	public double getLoadCapacity() {
		return loadCapacity;
	}


	public void setLoadCapacity(double loadCapacity) {
		this.loadCapacity = loadCapacity;
	}
	
	@Override
	public void drive() {
		System.out.println("Es muy pesado");
	}
	
	public double acelerate() {
		return 10;
	}
	
	public double acelerate(int amount) {
		return amount;
	}
}
