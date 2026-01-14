package Poo;

import java.util.Scanner;

public class AppSuperHeroe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SuperHeroe heroe1 = new SuperHeroe ("Batman", "Dinero");
		
		heroe1.describir();
		heroe1.quitarCapa();
		heroe1.describir();

	}

}
