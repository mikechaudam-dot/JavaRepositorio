package excepciones;

import java.util.Scanner;

public class ErrorDivision {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numerador;
		int denominador;
		
		try {
			System.out.println("Ingresa el primer numero: ");
			numerador = sc.nextInt();
			System.out.println("Ingresa el segundo numero: ");
			denominador = sc.nextInt();
			int resultado = numerador/denominador;
			System.out.println("El resultado de la division es: " + resultado);
		}catch(ArithmeticException e) {
			System.out.println("ERROR, no es posible realizar una division por 0");
			System.out.println("Detalles del error" + e.toString());
		}finally {
			sc.close();
		}

	}

}
