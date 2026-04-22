package moureDev.clases;

public class Condicionales {

	public static void main(String[] args) {
		//1 Establecer la edad de un usuario y muestra si puede votar(mayor o igual a 18)
		int edadUsuario = 17;
		if(edadUsuario >= 18) {
			System.out.println("El usuario puede votar");
		}else {
			System.out.println("El usuario NO puede votar");
		}
		//2 Declara dos numeros y muestra cual es el mayor, o si son iguales 
		int num1 = 3;
		int num2 = 2;
		if(num1 > num2) {
			System.out.println("El número " + num1 +" es mayor que el número "+num2);
		} else if(num2 > num1) {
			System.out.println("El número " + num2 +" es mayor que el número "+num1);
		} else {
			System.out.println("Los números son iguales.");
		}
		//3 Dadp un numero verifica si es positivo negativo o cero
		var num3 = 0;
		if (num3 > 0) {
			System.out.println("El numero " + num3 + " es positivo");
		}else if (num3 < 0) {
			System.out.println("El numero " + num3 + " es negativo");
		}else {
			System.out.println("El numero: " + num3 + " es cero");
		}
		//4 Crea un programa que diga si un numero es par o impar
		int num4 = 3;
		if( num4 % 2 == 0) {
			
		}
	}

}
