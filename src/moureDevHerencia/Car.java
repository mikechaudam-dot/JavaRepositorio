package moureDevHerencia;

public class Car extends Vehicle{ 
	private int tires;
	
	public Car (int model, String brand, int tires) {
		super(model,brand);
		setTires(tires);
	}

	public int getTires() {
		return tires;
	}

	public void setTires(int tires) {
		if(tires == 4) {
		this.tires = tires;
	}else {
		System.out.println("Un coche debe tener solo 4 llantas");
	}
		}
	
	//Metodo 
	public void honk() {
		System.out.println("MIT MIT MIT MIIIIIIIIT");
	}
	
	
	
}
