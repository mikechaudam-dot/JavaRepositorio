package ejercicios;

import java.util.Scanner;

public class ParOImpar {
	
	public static void main(String[]args) {
		
		Scanner escaner = new Scanner(System.in);
	
		System.out.print("Por favor, escribe un numero por pantalla: ");
		int num = escaner.nextInt();
		
		
		if(num % 2 == 0) {
			System.out.print("El numero: " + num + " es par");
		} else {
			System.out.print("El numero: " + num + " es impar");
		}
		
		escaner.close();
		
	}

}
