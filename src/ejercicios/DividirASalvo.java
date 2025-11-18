package ejercicios;

import java.util.Scanner;

public class DividirASalvo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dividendo, divisor;
		
		System.out.print("Ingresa el dividendo: ");
		dividendo = scan.nextInt();
		
		System.out.print("Ingresa el divisor: ");
		divisor = scan.nextInt();
		
		if(divisor == 0) {
			System.out.print("¡Error!: No se puede dividir por cero");
		}else {
			System.out.print("La division entre " + dividendo + " y " + divisor + " es: " + (dividendo/divisor));
		}
		scan.close();
	}

}
