package ejercicios;

import java.util.Scanner;

public class FindeVTwo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dia;
		
		System.out.print("Ingresa un numero de 1 a 7: ");
		dia = scan.nextInt();
		
		switch(dia) {
		case 1,2,3,4,5 -> System.out.print("Es dia laborable anda a trabajar");
		case 6,7 -> System.out.print("Es fin de semana anda a descansar");
		default -> System.out.print("Opcion no valida");
		}
		scan.close();
	}

}
