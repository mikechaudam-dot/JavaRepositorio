package garajeDeCarreras;

public class Engine {
	double horsePower;
	String type;

	// Cosntructores
	public Engine(double horsePower, String type) {
		this.horsePower = horsePower;
		this.type = type;
	}
	
	// Metodo
	public void start() {
		if ("Electrico".equals(type)) {
			System.out.println("Zzzzziiiiiii");
		} else {
			System.out.println("GRououoouooppppp");
		}
	}
}
