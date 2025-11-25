package ejercicios;

import java.util.Scanner;

public class MediaEdades {
	// TODO Auto-generated method stub
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int edad;
		double sumaTotal = 0;
		double contador = -1; 
		double mediaEdad = 0;
		boolean continuar = true; 
		
		while (continuar) {
			System.out.print("Ingresa la edad de una persona: ");
			edad = sc.nextInt();
			
			if (edad < 0) {
				continuar = false;
			}
			sumaTotal += edad;
			contador++;
		}
		mediaEdad = sumaTotal/contador;
		
		System.out.print("La cantidad de personas es: "+ contador + " y la media de edad es: "+ mediaEdad);
		
		sc.close();

	}

}
