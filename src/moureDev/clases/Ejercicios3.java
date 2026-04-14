//Ejercicios de operadores
package moureDev.clases;

public class Ejercicios3 {

	public static void main(String[] args) {
		
		//1 Crea una variable con el resultado de cada operacion aritmetica 
		int suma = 10 + 7;
		int resta = 10 - 7;
		double multi = 10 * 7;
		double divi = 10 / 7;
		double modu = 10 % 7;
		
		//2 Crea una variable para cada tipo de operacion de asignacion
		int a = 5;
		a += a;
		System.out.println(a);
		
		int b = 6;
		b -= b; //Esto seria lo equivalente a b = b - b;
		System.out.println(b);
		
		double c = 7;
		c *= c;
		System.out.println(c);
		
		double d = 8;
		d /= d;
		System.out.println(d);
		
		double e = 9;
		e %= e;
		System.out.println(e);
		

	}

}
