package preparacionExamen;

import java.util.Scanner;

public class ContadorMinyMay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// iniciamos el metodo scanner
		Scanner sc = new Scanner(System.in);
		// Declaramos la variables y pedimos la frase
		System.out.println("Ingresa una frase: ");
		String frase = sc.nextLine();
		int contador = 0;

		for (int i = 0; i < frase.length(); i++) {
			if (frase.toLowerCase().charAt(i) == 'a') {
				contador += 1;
			}
		}
		
		// Mostramos por pantalla en mayusculas utilizamos el metodo ToUpperCase
		System.out.println("La frase en mayusculas es: " + frase.toUpperCase());
		// Mostramos cuantas 'a' y 'A' tenemos en el String
		System.out.println("Hay: " + contador + " a y A");		
		if (frase.endsWith(".")) {
			System.out.println("La frase termina en punto.");
		} else {
			System.out.println("La frase no termina en punto.");
		}
		
		sc.close();

	}

}
