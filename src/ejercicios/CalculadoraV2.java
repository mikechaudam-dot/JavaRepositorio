package ejercicios;

import java.util.Scanner;

public class CalculadoraV2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingresa dos numeros por fis: ");
		
// Se cmabia tipo de datos de int por double ya que es mejor para una calculadora 		
		double num1 = sc.nextInt();
		double num2 = sc.nextInt();

// Correccion se agrega ln para que la impresion no se haga en una sola linea 
		System.out.println("La suma de " + num1 + " y " + num2 + " Es: " + (num1+num2));
		System.out.println("La resta de " + num1 + " y " + num2 + " Es: " + (num1-num2));
		System.out.println("La multiplicacion de " + num1 + " y " + num2 + " Es: " + (num1*num2));
		
		sc.close();

	}

}
