package ejercicios;

import java.util.Scanner; 

public class SumaNNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int suma = 0;
		
		System.out.print("Ingresa un numero entero positivo: ");
		n = sc.nextInt();
		
		for (int i = 0; i <= n; i++) {
			suma += i;
		} 
		
		System.out.print("La sumatoria total es de: " + suma);
		
		sc.close();
	}
	
}
