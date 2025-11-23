package ejercicios;

import java.util.Scanner;

public class SumaNImpares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("Ingresa un numero entero positivo: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if (i % 2 != 0 ) {
				System.out.println("los numero impares son: " + i);
			}
		}
		sc.close();
	}

}
