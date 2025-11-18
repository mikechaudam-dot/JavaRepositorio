package ejercicios;

import java.util.Scanner;

public class Ordenar3Numeros {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num1, num2, num3;

		System.out.print("Ingresa tres numeros por fis para ver cual es mayor: ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();

		System.out.println(
				"El primer numero que ingresaste es " + num1 + " El segundo es " + num2 + " Y el tercero es " + num3);

		if (num1 > num2 && num2 > num3) {
			System.out.print("El orden de mayor aa menor es: " + num1 + " " + num2 + " " + num3);
		} else if (num1 > num3 && num3 > num2) {
			System.out.print("El orden de mayor aa menor es: " + num1 + " " + num3 + " " + num2);
		} else if (num2 > num1 && num1 > num3) {
			System.out.print("El orden de mayor a menor es: " + num2 + " " + num1 + " " + num3);
		} else if (num2 > num3 && num3 > num1) {
			System.out.print("El orden de mayor a menor es: " + num2 + " " + num3 + " " + num1);
		} else if (num3 > num1 && num1 > num2) {
			System.out.print("El orden de mayor a menor es: " + num3 + " " + num1 + " " + num2);
		} else if (num3 > num2 && num2 > num1) {
			System.out.print("El orden de mayor a menor es: " + num3 + " " + num2 + " " + num1);
		} else {
			System.out.print("Informacion no valida");
		}
		scan.close();
	}

}
