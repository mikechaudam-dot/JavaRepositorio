package ejercicios;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int anio;
		
		System.out.print("Ingresa un año para saber si es bisiesto: ");
		anio = scan.nextInt(); 
		
		// System.out.print(anio);
		
		if (anio % 4 == 0 && anio % 100 != 0) {
			System.out.print("El año " + anio + " Es bisiesto");
		}else if (anio % 100 == 0 && anio % 400 != 0) {
			System.out.print("El año " + anio + " No es bisiesto");
		}else if (anio % 100 == 0 && anio % 400 == 0) {			
			System.out.print("El año " + anio + " Es bisiesto");
		}else {
			System.out.print("El año " + anio + " No es bisiseto" );
		}
		scan.close();
	}

}
