package ejercicios;

import java.util.Scanner;

public class MayorQue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Escribe el primer numero: ");
		num1 = scan.nextInt();

		System.out.print("Escribe el segundo numero: ");
		num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.print("El numero " + num1 + " es mayor que el numero "+ num2 );
		}else {
			System.out.print("El numero " + num1 + " NO es mayor que el numero " + num2);
		}
		
		scan.close();
	}

}
