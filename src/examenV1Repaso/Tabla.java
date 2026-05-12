package examenV1Repaso;

import java.util.Scanner;

public class Tabla {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero de filas y columnas de la tablas: ");
		int dimension = sc.nextInt();
		
		//Generamos el bucle que va a ir imprimiento la tabla
		for(int i = 0; i <= dimension; i++) {
			System.out.println();
			for(int j = 0; j <= dimension; j++) {
				if(i == j){
					System.out.print("\t" + "X");
				}else if(i > j) {
					System.out.print("\t" + (i + j));
				}else if(i < j) {
					System.out.print("\t" + (j - i));
				}
			}
		}
		sc.close();
	}
	


}
