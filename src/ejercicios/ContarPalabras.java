package ejercicios;

import java.util.Scanner;

public class ContarPalabras {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println ("Escribe una frase");
		
		String frase = sc.nextLine();
		int contador = 1;
		
		for(int i = 0; i <= frase.length()-1;i++) {
			if(frase.charAt(i) == ' '){
				contador++;
			}
		}
		System.out.print("El numero de palabras son " + contador);
		sc.close();
		// TODO Auto-generated method stub

	}

}
