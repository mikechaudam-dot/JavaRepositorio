package juegos;

import java.util.Arrays;

import java.util.Scanner;

public class TresEnRaya {
	
	static char[][] tablero = new char [3][3];
	
	
	
	public static void mostrarTablero () {
		for( int i=0; i < tablero.length; i++) {
			for(int j=0; j< tablero[i].length;j++) {
				System.out.print(tablero[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("******************");
	}
	
	public static void colocarFicha(int fila, int columna, char ficha) {
		if (tablero[fila][columna] == '-'){
			//Esta libre podemos poner la ficha
			tablero[fila][columna]=ficha;
		}else {
			System.out.print("ya hay una ficha");
		}
	}

	public static void main(String[] args) {
		
		for(int i = 0; i < tablero.length; i ++) {
			Arrays.fill(tablero[i], '-');
		}
		
		mostrarTablero();
		colocarFicha(1,1,'x');
		mostrarTablero();
		
	}

}
