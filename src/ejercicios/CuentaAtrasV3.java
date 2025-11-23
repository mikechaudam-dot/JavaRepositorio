package ejercicios;

import java.util.Scanner;

public class CuentaAtrasV3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n;
		
		System.out.print("Ingrese un numero entero positivo: ");
		n = sc.nextInt();
		
		for(int i = n; i >= 0; i = i -1) {
			System.out.println(i);
		}
		sc.close();

	}

}
