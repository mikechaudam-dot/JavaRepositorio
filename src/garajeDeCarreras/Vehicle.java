package garajeDeCarreras;

public abstract class Vehicle {
	private String brand;
	private Engine engine;  //No se instancia aqui el la clase Engine 

	public Vehicle(String brand, Engine engine ) {
		setBrand(brand);
		setEngine(engine);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		if (brand != null && !brand.isEmpty()) {
			this.brand = brand;
		} else {
			this.brand = "Marca desconocida";
			System.out.println("La marca no puede estar vacia");
		}
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public abstract void drive();

}
