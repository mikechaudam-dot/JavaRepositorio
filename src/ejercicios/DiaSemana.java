package ejercicios;

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int dia;
		
		System.out.print("Ingresa un numero del 1 al 7: ");
		dia = scan.nextInt();
		
		if (dia == 1) {
			System.out.print("Es lunes");
		} else if (dia == 2) {
			System.out.print("Es martes");
		} else if (dia == 3) {
			System.out.print("Es miercoles");
		} else if (dia == 4) {
			System.out.print("Es jueves");
		} else if (dia == 5) {
			System.out.print("Es viernes");
		} else if (dia == 6) {
			System.out.print("Es Sabado");
		} else if (dia == 7) {
			System.out.print("Es domingo");
		} else {
			System.out.print("Numero no valido");
			}
		scan.close();
		}
	}
	
