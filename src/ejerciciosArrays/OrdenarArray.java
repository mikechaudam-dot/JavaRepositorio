package ejerciciosArrays;

public class OrdenarArray {

	public static void main(String[] args) {
		//Declaramos el array
		int[] array1 = {6,4,7,9,7,2,1};

		for(int i = 0; i < array1.length; i++) {      
			System.out.println("Comparamos: "  + array1[i] +" > "+ array1[i + 1]);
			if( array1[i] >  array1[i + 1]) {
				int b = array1[i];
				array1[i] = array1[i + 1];
				array1[i + 1] = b; 
				System.out.println("cambio: " + array1[i + 1]);
			}
		}
	}
}
