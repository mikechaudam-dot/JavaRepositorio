package ejercicios;

import java.util.Scanner;

public class CalculadoraSimple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingresa dos numeros: ");
// Se cmabia tipo de datos de int por double ya que es mejor para una calculadora 		

		double num1 = sc.nextInt();
		double num2 = sc.nextInt();
		double suma = num1 + num2;
		double resta = num1 - num2;
		double multi = num1 * num2;
		
		System.out.println("La suma de " + num1 + " y " + num2 + " es: "  + suma);
		System.out.println("La resta de " + num1 + " y " + num2 + " es: "  + resta);
		System.out.println("La multiplicacion de " + num1 + " y " + num2 + " es: "  + multi);
		
		sc.close();
	}

}
