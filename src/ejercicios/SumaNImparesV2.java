package ejercicios;

import java.util.Scanner;

public class SumaNImparesV2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Ingresa un numero entero positivo: ");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i += 2) {
			if (i % 2 != 0) {
				System.out.println("Los numeros impares son " + i);
			}
		}
		sc.close();
	}

}
