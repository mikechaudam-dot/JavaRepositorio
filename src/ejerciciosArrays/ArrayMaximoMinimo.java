package ejerciciosArrays;

public class ArrayMaximoMinimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5,6,7,8,9,10};
		int masBajo = array[0];
		int masAlto = array[0];
		
		for(int i = 0; i < array.length;i++) {
			if (array[i] < masBajo ) {
				masBajo = array[i];
			}else if (array[i] > masAlto) {
				masAlto = array[i];
			}
			//System.out.print("Vamos a sumar " + enteros[i] + "a" + (enteros[i]+sumaTotal));
		}
		System.out.print("El mas alto es " + masAlto + " el mas bajo es " + masBajo);

	}

}
