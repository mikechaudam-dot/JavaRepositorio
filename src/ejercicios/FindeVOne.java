package ejercicios;

import java.util.Scanner;

public class FindeVOne {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dia;
		
		System.out.print("Ingresa un numero de 1 a 7: ");
		dia = scan.nextInt();
		
		if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5) {
			System.out.print("Es un dia laboral, anda a trabajar pelotudo");
		}else if(dia == 6 || dia == 7) {
			System.out.print("Es fin de semana, anda a descansar");
		}else {
			System.out.print("Opcion no valida");
		}
		scan.close();

	}

}
