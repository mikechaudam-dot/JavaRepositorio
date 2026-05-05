package examenV1Repaso;

import java.util.Scanner;

public class Tabla {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero de filas y columnas de la tablas: ");
		int dimension = sc.nextInt();
		
		//Generamos el bucle que va a ir imprimiento la tabla
		for(int i = 1; i <= dimension; i++) {
			System.out.println();
			for(int j = 1; j <= dimension; j++) {
				System.out.print(j + " \t" );
			}
		}
		sc.close();
	}
	


}
