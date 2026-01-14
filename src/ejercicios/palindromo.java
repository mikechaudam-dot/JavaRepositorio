package ejercicios;

import java.util.Scanner;

public class palindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean esPalindromo = true;
		
		System.out.print("Ingresa una palabra para ver si es palindromo: ");
		String palabra = sc.nextLine();
		
		System.out.print("Palabra ingresada es " + palabra );
		
		for(int i = 0; i < palabra.length()/2; i++){
			if(palabra.charAt(i) != palabra.charAt(palabra.length()- 1 - i)) {
				esPalindromo = false;
				break;
			}else if(palabra.charAt(i) == palabra.charAt(palabra.length()- 1 - i)) {
			}
		}

	}

}
