package ejercicios;

import java.util.Scanner;

public class CuentaAtras {

	public static void main(String[] args) {
		//While
		
		//1. Inicializacion 
		int contador = 5;
		
		//2. Condicion 
		while (contador > 0) {
			System.out.println("El contador vale: " + contador);
			//3. Actualizacion 
			contador = contador - 1; // o contador--;
		}
		
		System.out.println("¡Despegue!");
		
		//do while 
		
		Scanner scanner = new Scanner(System.in);
		String claveSecreta = "1234";
		String claveIngresada;
				
		
	}

}
