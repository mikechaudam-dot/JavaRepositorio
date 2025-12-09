package ejercicios;

import java.util.Scanner;

public class PiedraPapelTijera {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		String[] arrayOpciones = {"Piedra", "Papel", "Tijera"};
		//Pedimos al usuario su opcion 
		String opcionPlayer = arrayOpciones[pedirOpcion()-1];
		//Elige el PC
		String opcionPC = arrayOpciones[eleccionPC()-1];
		
		System.out.print("El jugador ha elegido, " + opcionPlayer + " y el pc " + opcionPC);
		
		if(opcionPlayer.equals(opcionPC)) {
			System.out.println("Empate");
		}else if(opcionPlayer.equals("Papel") && opcionPC.equals("Piedra")) || 
		        (opcionPlayer.equals("Tijera") && opcionPC.equals("Papel")) ||
		        (opcionPlayer.equals("Piedra") && opcionPC.equals("Tijera"))
		        ){
		        	
		        }
		sc.close();
	}
	public static int eleccionPC() {
		int eleccion = (int)(Math.random()*3)+1;
		return eleccion;
	}
	
	public static int pedirOpcion() {
		int eleccion;
		System.out.println("Por favor elija una de las siguientes opciones");
		System.out.println("1-Piedra");
		System.out.println("2-Papel");
		System.out.println("3-Tijera");
		
		do {
			eleccion = sc.nextInt();
			if(eleccion < 0 || eleccion > 3) {
				System.out.println("Revisa tu respuesta");
			}
		}while(eleccion < 0 || eleccion > 3);
		
		return eleccion;
	}

}
