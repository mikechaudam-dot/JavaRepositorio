package ejercicioJavaV2;

import java.util.Scanner;

public class Ordenar3Numero {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.print("Ingresa tres numeros por fis para ver cual es mayor: ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		
		System.out.print("El primer numero que ingresaste es " + num1 + " El segundo es " + num2 + " Y el tercero es " + num3);

	}

}
