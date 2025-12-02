package ejercicios;

import java.util.Scanner;

public class CambiaAPor4 {
	
	public static String replaceMejorado (String f, char viejo, char nuevo) {
		
		StringBuilder aux = new StringBuilder();
		
		for (int i = 0; i<f.length();i++) {
			if (f.charAt(i)==Character.toLowerCase(viejo) || f.charAt(i)==Character.toUpperCase(viejo)) {
				aux.append(f.charAt(i));
			}else {
				aux.append(f.charAt(i));
			}
		}
		return aux.toString();

	}
	
	public static String cambiaA (String f) {
		//Codigo con StringBuilder
		StringBuilder aux = new StringBuilder();
		
		for (int i = 0; i < f.length();i++) {
			System.out.println(f.charAt(i));
			if (f.charAt(i)=='a' || f.charAt(i) == 'A') {
				aux.append('4');
			}else {
				aux.append(f.charAt(i));
			}
		}
		return aux.toString();
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in); 
		System.out.println("Escribe una frase");
		
		String frase = sc.nextLine();
		String fraseSinA= frase.replace('a', '4');
		System.out.println("La frase modificada es: " + fraseSinA);
		sc.close();
	}

}
