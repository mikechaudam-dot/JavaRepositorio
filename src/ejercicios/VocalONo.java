package ejercicios;

import java.util.Scanner;

public class VocalONo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ingresa una letra: ");
		//declaro el dato con "char" seguido la variable, scan.next la entrada que voy a leer
		//y el chartAT(0) conbierte la entrada en char y elige el caracter en la posicion 0
		char vocalONo = scan.next().charAt(0);
		
		switch(vocalONo) {
		case 'a', 'e', 'i', 'o', 'u','A', 'E', 'I', 'O','U' -> System.out.println("Es vocal");
		default -> System.out.print("No es vocal");
		}
		scan.close();
	}

}
