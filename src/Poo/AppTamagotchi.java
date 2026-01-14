package Poo;

import java.util.Scanner;

public class AppTamagotchi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido, ponle un nombre a tu Tamagutchi: ");
		String usuario = sc.nextLine();
		//String entradaUser = "Yamamoto";
		
		Tamagotchi tama1 = new Tamagotchi(usuario);
		Tamagotchi tama2 = new Tamagotchi("Sekun", 25,80);
		Tamagotchi tama3 = new Tamagotchi("Fajardino", 25, 25);
		
		//hacer  menu interactuar con los metodos del tamgotchi.
		int opcion = 0;
		
		do {
			System.out.println("\n--- MENU OPCIONES ---");
			System.out.println("1 Jugar");
			System.out.println("2 comer");
			System.out.println("3 dormir");
			System.out.println("4 status");
			System.out.println("Selecciona una opcion");
			
			opcion = sc.nextInt();
			
			switch (opcion) {
			   case 1:
				   tama1.jugar();
				   break;
			   case 2:
				   tama1.comer();
				   break;
			   case 3:
				   tama1.dormir();
			   case 4:
				   System.out.println("Saliendo del programa...");
				   break;
				default:
					System.out.println("Opcion no valida, intenta de nuevo");
			}
		}while(opcion != 4);
		
		
		/*
		//Metodos mascota usuario tama1
		tama1.status();
		tama1.jugar();
		tama1.comer();
		tama1.dormir();
		tama1.status();
		tama1.jugar();
		
		//Metodos mascota tama2
		tama2.status();
		tama2.jugar();
		tama2.comer();
		tama2.dormir();
		tama2.status();
		
		//Metodos mascota tama3 
		tama3.status();
		*/
		
		
		
		//tama2.status();
		
		//tama3.status();
		
		
		
		

	}

}
