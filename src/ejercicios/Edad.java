package ejercicios;

import java.util.Scanner;

public class Edad {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int edad; 
		
		System.out.print("Ingresa tu edad: ");
		edad = scan.nextInt();
		
		if (edad < 13) {
			System.out.print("Eres un niño");
		}else if (edad >= 13 && edad <= 17) {
			System.out.print("Eres un adolesente");
		}else if (edad >= 18 && edad <= 64) {
			System.out.print("Eres un adulto");		
		}else if (edad >= 65) {
			System.out.print("Eres jubilado");
		}else {
			System.out.print("Entrada no valida");
		}
		//switch
		//case 
		scan.close();
		}


	}
