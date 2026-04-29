package moureDevHerencia;

public class Vehicle {

	private int model;
	private String brand;

	public Vehicle(int model, String brand) {
		setModel(model);
		this.brand = brand;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		if (model >= 2010) {
			this.model = model;
		} else {
			System.out.println("Error, coche muy viejo");
		}
	}

	public String getBrand() {
		return brand;
	}
	
	//Metodos
	public void move() {
		System.out.println("El vehiculo se mueve");
	}

}
