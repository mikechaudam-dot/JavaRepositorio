package ejerciciosArrays;

public class SumaArray {
	// TODO Auto-generated method stub
	public static void main(String[] args) {
		
		int[] enteros = {5,6,7,8,9,10};
		int sumaTotal = 0;
		
		for(int i = 0; i < enteros.length;i++) {
			//System.out.print("Vamos a sumar " + enteros[i] + "a" + (enteros[i]+sumaTotal));
			sumaTotal = sumaTotal + enteros[i];
		}
		System.out.print("El total de la suma es " + sumaTotal);

	}

}
