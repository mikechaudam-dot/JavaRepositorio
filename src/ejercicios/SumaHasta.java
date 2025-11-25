package ejercicios;

import java.util.Scanner;

public class SumaHasta {
	// TODO Auto-generated method stub
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		double sumaTotal = 0.0;
		boolean continuar = true;
		
		while (continuar) {
			System.out.println("Ingresa un numero: ");
			num = sc.nextInt();
			
			if (num == 0) { 
				continuar = false;	
			}	
			sumaTotal += num; 
				System.out.println("Suma parcial: " + sumaTotal);
			}
		System.out.println("Se ingreso 0, La suma total es: " + sumaTotal );
		
		sc.close();
	}
}	

