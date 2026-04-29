package moureDevAbstrac;

public class Rectangel extends Shape {
	
	public Rectangel(String color) {
		super(color);
	}
	
	@Override
	public double calcularArea(double a, double b) {
		return (2 * (a + b));
	}
	
	

}
