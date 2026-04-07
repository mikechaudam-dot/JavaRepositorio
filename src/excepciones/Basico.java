package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Basico {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int edad;
		
		System.out.println("Ingresa tu edad: ");
		
		
		try {
			edad = sc.nextInt(); 
			System.out.println("Tienes " + edad + " años");
			
		}catch (InputMismatchException e) {
			System.out.println("ERROR: el formato que ingresaste no es valido");
			System.out.println("Detalles del error" + e.toString());
		}finally {
		
		sc.close();
		}
	}
	
	// Exception in thread "main" java.util.InputMismatchException

}
