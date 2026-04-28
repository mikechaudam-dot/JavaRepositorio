package moureDevPoo;

public class Car {
	
	String brand;
	String model;
	
	//Constructor
	
	public Car(String brand, String model) {
		this.brand = brand;
		this.model = model; 
	}
	
	//Metodo 
	
	public void showData() {
		System.out.println("Soy optimos, marca: " + brand + " modelo: " + model);
	}

}
