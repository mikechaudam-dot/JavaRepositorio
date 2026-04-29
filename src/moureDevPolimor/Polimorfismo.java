package moureDevPolimor;

public class Polimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculadora bebop = new Calculadora();
		
		System.out.println(bebop.sumar(2,5));
		System.out.println(bebop.sumar(29,24, 23));
		System.out.println(bebop.sumar(2.1,5.3));
	}

}
