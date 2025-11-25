package ejercicios;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		//Inicio un escanner usando el import 
		Scanner sc = new Scanner(System.in);
		// Defino variables
		int n;
		long x = 1;
		
		//Solicito el dato al uruario 
		System.out.println("--Calculadora Factorial-- Hola, ingresa un numero entero positivo: ");
		n = sc.nextInt();
		
		
		for(int i = 1;i <= n; i++) {
			//Operacion logica del bucle el corazon del sistema
			x *= i ;
		}
		System.out.print("El factorial de: " + n + "Es: " + x);
		sc.close();
		}

	}


