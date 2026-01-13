package juegos;

public class Bingo {
	
	final static int NUMERO_BOLAS = 90; 
	static int[][] tableroBingo = new int [9][10];
	
	public static void mostrarTablero(String[] args) {
		for(int i=0; i<tableroBingo.length;i++) {
			for(int j=0;j<tableroBingo[0].length;i++) {
				if (tableroBingo[j][j]==0) {
					System.out.print("X\t");
				}else {
					System.out.print(tableroBingo[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}
	//Ademas de sacar l bola, apuntamos el numero en el carton
	public static void sacarBola(String[] args) {
		int bola = Recursos.numAleatorio(90);
		int fila = bola/10;
		int columna = bola % 10;
		System.out.println("hemos sacado el: " + bola + "va al afila"+ fila + "colomna " + columna);
		//Tenemos que saber donde la colocamos dividir el numero que sale en 10
		if (columna == 0) {
		    tableroBingo[fila-1][tableroBingo[0].length-1]=bola;
		}else {
			tableroBingo[fila][columna - 1]= bola;
		}
	}
	
	
	public static void main(String[] args) {
		boolean bingo = false; 
		
			}

	}

}
