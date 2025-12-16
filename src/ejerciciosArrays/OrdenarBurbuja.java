package ejerciciosArrays;

import java.util.Arrays;

public class OrdenarBurbuja {

	public static void main(String[] args) {
		//Declaramos el array
		int[] array1 = {8,7,6,5,4,3};

		for(int j = 0; j < array1.length; j ++) {
			for(int i = 0; i < array1.length - 1; i++) {      
				//System.out.println("Comparamos: "  + array1[i] +" > "+ array1[i + 1]);
				if( array1[i] >  array1[i + 1]) {
					int b = array1[i];
					array1[i] = array1[i + 1];
					array1[i + 1] = b; 
				}
			}
			System.out.println(Arrays.toString(array1));
		}

	}

}