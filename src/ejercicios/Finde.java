package ejercicios;

import java.util.Scanner;

public class Finde {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dia;
		
		System.out.print("Ingresa un numero del 1 al 7: ");
		dia = scan.nextInt();
		
		if (dia >= 1 && dia <= 5) {
			System.out.print("Es un dia laboral, anda a currar");
		} else if (dia >= 6 && dia <= 7) {
			System.out.print("Es fin de semana, anda pal BAR");
		} else {
			System.out.print("Numero no valido punetero");
		}
		scan.close();
	}

}
