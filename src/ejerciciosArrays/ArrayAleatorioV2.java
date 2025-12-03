package ejerciciosArrays;

import java.util.Scanner;

public class ArrayAleatorioV2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Cual es el tamaño del array? ");
		int dimension = sc.nextInt();
		
		int[] numeros = new int[dimension];
		
		System.out.println("Tengo un array de loingitud: " + numeros.length);
		
		for (int i = 0; i < numeros.length;i++) {
			numeros[i] = (int)(Math.random()*10+1);
		}
		
		for(int num: numeros) {
			System.out.println("El numero es " + num + " su cuadrado " + (int) Math.pow(num, 2) +" y su cubo " + (int) Math.pow(num,3));
		}

	}

}
