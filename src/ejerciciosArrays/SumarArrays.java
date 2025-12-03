package ejerciciosArrays;

import java.util.Scanner;

import java.util.Arrays;

public class SumarArrays {

	// TODO Auto-generated method stub
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Declaro las variasbles de array 
		int[] array1 = new int[5];
		int[] array2 = new int[5];
		int[] array3 = new int[5];
		
		System.out.print("Primera lista, Ingresa cinco numeros enteros, ");
		for(int i = 0; i < array1.length; i++) {
			System.out.print("Ingresa el numero " + (i + 1) + " :");
			array1[i] = sc.nextInt();
		}
		System.out.print("Segunda lista, Ingresa otros cinco numeros enteros");
		for(int i = 0; i < array2.length; i++) {
			System.out.print("Ingresa el numero " + (i + 1) + " ");
			array2[i] = sc.nextInt();
		}
		System.out.print("La suma de los arrays es: ");
		for(int i = 0; i < array3.length; i++) {
			array3[i] = array1[i] + array2[i];
			System.out.print(array3[i] + " ");
		}
		
		System.out.print("Impresion con metodo Arrays: " + (Arrays.toString(array3)));
		sc.close();
		//+ (array3 = array1 + array2));
		
		
	}

}
