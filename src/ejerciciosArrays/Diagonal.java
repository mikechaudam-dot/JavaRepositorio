package ejerciciosArrays;

public class Diagonal {

	public static void main(String[] args) {
		final int DIM =8;
		boolean [][] matriz = new boolean [DIM][DIM];
		
		//Primero la pblamos de datos
		for(int i = 0; i < matriz.length;i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				if (i == j) {
					matriz[i][j]=1;
				}else {
					matriz[i][j]=0;
				}
			}
		}
		//Ahora le mostramos por pantalla 
		for(int i = 0; i < matriz.length;i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("|");
		}
	}

}
