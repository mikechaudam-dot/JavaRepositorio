package ejercicios;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1;
		
		System.out.print("Ingresa un numero entero: ");
		num1 = scan.nextInt();
		
		if (num1 < 0) {
			System.out.print("El numero " + num1 + " Es negativo");
		}else if (num1 == 0) {
			System.out.print("El numero " + num1 + " Es cero");
		}else {
			System.out.print("El numero " + num1 + " Es positivo");
		}
		scan.close();
	}

}
