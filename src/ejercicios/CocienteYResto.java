package ejercicios;

import java.util.Scanner;

public class CocienteYResto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//Correcion cambiar el tipo de dato por un int ya que uno de los requisitos 
//del ejercicio es que funcione con enteros. 
		System.out.print("Ingresa dos numeros: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int divi = num1 / num2;
		int resto = num1 % num2;
		// *** RETO
		//poner un condicional if que identifique si el numero ingresado es 0
		// *** RETO
		
		System.out.println("El resultado de la division entre " + num1 + " y " + num2 + " es: " + divi);
		System.out.println("El resultado del modulo entre " + num1 + " y " + num2 + " es: " + resto );
		
		sc.close();
	}

}
