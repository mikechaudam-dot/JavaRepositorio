package moureDevPoo;

public class Product {
	String description;
	double price;
	//Constructor
	public Product(String description, double price){
		this.description = description;
		this.price = price;
	}
	//Metodo 
	public void discount(double discount){
		double priceAfter = (price * (1-(discount / 100)));
		System.out.println("Precio inicial: $" + price + ", precio final con un descuento del: " + discount + "% es: $" + priceAfter );
	}

}
