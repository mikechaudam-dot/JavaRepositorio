package ejerciciosArrays;

import java.util.Arrays;
import java.util.Scanner;

public class InvertirArray {
	// TODO Auto-generated method stub
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Declaro las variables de array 
		int[] arrayA = {1,2,3,4,5,6};
		int[] invertido = new int [arrayA.length];
		
		for(int i = 0; i < arrayA.length;i++) {
			invertido[arrayA.length - 1 - i] = arrayA[i];
			System.out.print(invertido[i]);
		}
		//System.out.print(Arrays.toString(invertido));
		sc.close();
		
		
		
		
		

	}

}
