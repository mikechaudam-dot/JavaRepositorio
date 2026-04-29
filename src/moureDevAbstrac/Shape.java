package moureDevAbstrac;
// 1. Crea una clase abstracta Shape con el método calculateArea(). Luego implementa dos subclases: 
//Circle y Rectangle, y haz que cada una calcule su propia área.

public abstract class Shape {
	private String color;
	
	public Shape(String color) {
		this.color = color;
		
		}
	public abstract double calcularArea(double a, double b);

}
