package ejercicios;

import java.util.Scanner;

public class CuentaAtrasV2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Ingresa un numero entero positivo: ");
		n = sc.nextInt();
		
		int i = n;
		
		// do while 
		do {
			System.out.println(i);
			i = i - 1;
		} while (i >= 0);
		sc.close();
		
	}

}
