package moureDevPoo;

public class Product {
	String description;
	private double price;

	// Constructor
	public Product(String description, double price) {
		this.description = description;
		setPrice(price);
	}

	// Metodo
	public void discount(double discount) {
		double priceAfter = (price * (1 - (discount / 100)));
		System.out.println("Precio inicial: $" + price + ", precio final con un descuento del: " + discount + "% es: $"
				+ priceAfter);
	}

	public double getPrice() {
		return price;
	}
	// 2 Encapsulamiento: Con la clase producto establece el precio en privado y con
	// el setPrice(double price)
	// que solo permita precios mayores a 0.

	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		} else {
			System.out.println("ERROR, el precio no puede ser negativo");
		}
	}



}
