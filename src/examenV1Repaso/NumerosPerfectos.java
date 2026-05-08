package examenV1Repaso;

import java.util.Scanner;

public class NumerosPerfectos {

	public static boolean esNumeroPerfecto(int numero) {
		//Declaramos una variable donde se iran añadiendo los divisores del numero 
		int sumaDivisores = 0;
		//Con el bucle for recorremos todos los divisores y colocamos la condicion 
		//que si el modulo (%) entre la division del numero y el numero (i) entonces
		//ese numero se guardara en la variable sumaDivisores;
		for(int i = 1; i < numero; i++) {
			if(numero % i == 0) {
				//Aqui se ira guardando y cadas vez que descubra un numero nuevo 
				//que cumpla la condicion se ira guardando 
				sumaDivisores += i;
			}
		//Una vez haya terminado de recorrer el bucle lo que hacemos es con una estructura 
		//condicional realizar la comparacion de sumaDivisores == y numero si son iguales 
		//retornamos true si no false y ya estaria, el programa funciona correctamente. 
		}
		if(sumaDivisores == numero) {
			return true;
		}else {
		}return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce una serie de números separados por comas (ej: 6, 28, 12, 496):");

		String entrada = scanner.nextLine();
		String[] numerosComoTexto = entrada.split(",");

		System.out.println("\n--- Analizando los números ---");

		for (String texto : numerosComoTexto) {
			String textoLimpio = texto.trim();
			try {
				int numero = Integer.parseInt(textoLimpio);

				boolean esPerfecto = esNumeroPerfecto(numero);

				if (esPerfecto) {
					System.out.println("El número " + numero + " SÍ es un número perfecto.");
				} else {
					System.out.println("El número " + numero + " NO es un número perfecto.");
				}

			} catch (NumberFormatException e) {
				System.err.println("'" + textoLimpio + "' no es un número válido y ha sido ignorado.");
			}
		}

		scanner.close();
		System.out.println("\n--- Análisis completado ---");
	}

}
