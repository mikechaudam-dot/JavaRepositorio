package ejerciciosArrays;

// import java.util.Random;

public class ArrayAleatorio {
	// TODO Auto-generated method stub
	public static void main(String[] args) {
		int[] numeros = new int[10];
		
		//numeros = Math.random();
		
		System.out.print("nuevo array aleatorio ");
		for(int i = 0; i < numeros.length;i++) {
			numeros[i]= (int) (Math.random()*10 );
			System.out.print(numeros[i] + " ");
			System.out.print((int)Math.pow(numeros[i], 2) + " ");
			System.out.print((int)Math.pow(numeros[i], 3) + " ");
			System.out.println("");
		}
	}
}
