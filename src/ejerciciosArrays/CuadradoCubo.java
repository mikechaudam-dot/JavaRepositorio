package ejerciciosArrays;

public class CuadradoCubo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numeros = new int [5][3];
		for(int i=0;i<numeros.length;i++){
			for(int j=0;j<numeros[0].length;j++){
				numeros[i][j]=(int) Math.pow(i+1, j+1);
				System.out.print(numeros[i][j] + " | ");
			}
			System.out.println("");
		}

	}

}
