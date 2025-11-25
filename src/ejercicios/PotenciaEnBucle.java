package ejercicios;

import java.util.Scanner;

public class PotenciaEnBucle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		// Defino variables 
		float base;
		int exponente;
		float resultado = 1;
		
		System.out.print("Ingresa un numero base: ");
		base = sc.nextFloat();
		System.out.print("Ingresa un numero exponente: ");
		exponente = sc.nextInt();
		
		for ( int i = 1; i <= exponente; i++ ) {
			resultado *= base ;
		};
		System.out.print(base + " elevado a la potencia " + exponente + " es " + resultado);
		sc.close();
		
		

	}

}
