package ejercicios;

import java.util.Scanner;

public class Renta {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int edad; 
		
		System.out.print("Cuantos años tienes: ");
		edad = scan.nextInt();
		
		System.out.print("Cuanto cobras al mes: ");
		float salario = scan.nextFloat();
		
		if (edad > 18 && salario > 1000 ) {
			System.out.print("tienes que tributar, anda a hacienda");
		}else {
			System.out.print("No tienes que tributar");
		}
		scan.close();
	}

}
