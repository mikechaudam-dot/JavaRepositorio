package ejerciciosArrays;

import java.util.Scanner;

public class ImprimirHasta0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		int contador = 0;
		//Con do while y condicion multiple
		do {
			System.out.print("Introduce un valor ");
			numeros[contador] = sc.nextInt();
			contador++;
		}while (numeros[contador-1] > 0 && contador < numeros.length); 
		
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] <= 0) {
				break;
			}
			System.out.print(numeros[i] + " ");
		}
		sc.close();
		
	}

}
