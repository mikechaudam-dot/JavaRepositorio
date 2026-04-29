package moureDevPoo;

public class Encapsulamiento {

	public static void main(String[] args) {
		// 1 - Crea una clase person y establece atributos privados de name y age 
		//y usa los metodos getName(), setName(), getAge() y setAge() para asignar 
		//y mostrar valores desde otra clase
		Person persona1 = new Person(" ", -1);
		
		System.out.println(persona1.getName());
		System.out.println(persona1.getAge());
		
		// 2 Encapsulamiento: Con la clase producto establece el precio en privado y con
		// el setPrice(double price)
		// que solo permita precios mayores a 0.
		Product mando = new Product("Spark N9", 123);
		System.out.println(mando.getPrice());
		
		// 3 ejercicio (encapsulaciones) Establece el atributo balance como privado y
		// establece deposit
		// y withDraw que validen las cantidades correctamente.
		BankAccount cuentaA = new BankAccount(50);
		
		cuentaA.deposit(30);
		//cuentaA.withDraw(81);
		cuentaA.withDraw(79);
		
		// 4 ejercicion(Encapsulamiento) Establce el atributo tittle privado, permite leerlo con el metodo
		//getTitle 
		Book libroA = new Book("El principito", "XXX");
		
		System.out.println(libroA.getTitle());
		
		
		

	}

}
