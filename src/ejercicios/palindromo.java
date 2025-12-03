package ejercicios;

import java.util.Scanner;

public class palindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String palabra;
		boolean esPalindrmo = true;
		
		System.out.print("Ingresa una palabra para ver si es palindromo: ");
		palabra = sc.next();
		
		System.out.print("Palabra ingresada es " + palabra );
		
		for(int i = 0; i < palabra.length(); i++){
			if(chartAt(i) palabra.length - 1 - i = palabra(i));
		}

	}

}
