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
		int num4 = 90;
		if( num4 % 2 == 0) {
			System.out.println("El numero: " + num4 + " Es par");
		}else {
			System.out.println("El numero: " + num4 + " Es impar");
		}

		//5 Verifica si un numero esta en el rango de 1 a 100
		int num5 = 5;
		if(num5 > 0 && num5 <= 100) {
			System.out.println("El numero: " + num5 + " Esta en rango de 1 a 100");
		}else {
			System.out.println("El numero " + num5 + " Esta fuera de rango");
		}

		//6 Declara una variable con el dia de la semana de 1 a 7 muestra su nombre con el switch
		int dia = 4;
		switch(dia) {
		case 1:
			System.out.println("Es lunes");
			break;
		case 2:
			System.out.println("Es martes");
			break;
		case 3:
			System.out.println("Es miercoles");
			break;
		case 4:
			System.out.println("Es jueves");
			break;
		case 5:
			System.out.println("Es viernes");
			break;
		case 6:
			System.out.println("Es sabado");
			break;
		case 7:
			System.out.println("Es domingo");
			break;
		default:
			System.out.println("Numero no valido");
			break;
		}
		//7 muestra un sistema de notas, sobresaliente, aprobado y suspenso segun la nota de 0 a 100
		double nota = 1;
		if(nota >= 8 && nota <= 10) {
			System.out.println("Tu nota es sobresaliente");
		}else if(nota >= 5 && nota < 8) {
			System.out.println("Haz aprobado");
		}else if(nota < 0 || nota > 10) {
			System.out.println("Nota erronea, corrigela");
		}else {
			System.out.println("Has suspendido");
		}
		//8 Escribe un programa que determine si puedes entrar al cine: debes tener almenos 15b años 
		//o ir acompañado
		int edad = 14;
		boolean estaAcompañado = false;
		if (edad >= 15 || estaAcompañado) {
			System.out.println("Bienvenido al cine");
		}else {
			System.out.println("los siento no puedes entrar");
		}
		//9 crea un programa que diga si una letra es vocal o consonante
		char x = 'c';
		x = Character.toLowerCase(x);
		switch(x) {
		case 'a','e','i','o','u':
			System.out.println("Es vocal");
		break;
		case 'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z':
			System.out.println("Es una consonante");
		break;
		default:
			System.out.println("Caracter no valido");
			break;
		}
		//10 Usa tres variables 'a', 'b' y 'c' y muestra cual es la mayor de las tres 
		int a = 6;
		int b = 10;
		int c = 9;
		if(a > b &&  b > c) {
			System.out.println("El numero a: " + a + " es mayor que: " + b + " y " + c);	
		}else if(b > c && c > a) {
			System.out.println("El numero b: " + b + " es mayor que: " + c + " y " + a );
		}else if(a == b || b == c || a == c) {
			System.out.println("Hay almenos dos numeros iguales");
		}else
			System.out.println("El numero c: " + c + " es mayor que: " + a + " y " + b);
	}

}
