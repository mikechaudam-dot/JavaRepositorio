package moureDevPoo;

public class Rectangle {
	double base;
	double altura;
	
	//Constructor 
	public Rectangle(double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	//Creamos los metodos 
	public void calcularArea () {
		double area = base * altura;
		System.out.println("El area del rectangulo es: " + area);
	}
	
	public void calcularPerimetro(){
		double perimetro = ((this.base + this.altura) * 2);
		System.out.println("El perimetro del rectangulo es: " + perimetro);
	}
	
}
