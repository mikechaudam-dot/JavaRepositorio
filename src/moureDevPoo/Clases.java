package moureDevPoo;

import java.util.ArrayList;

public class Clases {

	public static void main(String[] args) {
		
		//-1 ejercicio 
		//-3 ejercicio 
		var book1 = new Book("Cien años de soledad", "Gabo");
		
		System.out.println(book1.title + " "  + book1.autor);
		
		//- 2 ejercicio
		var dog = new Dog("Bodeguero", 1);
		Dog.bark();
		//-4 ejercicio 
		var car1 = new Car("Seat", "Arona");
		car1.showData();
		//-5 ejercicio
		var student1 = new Student(60);
		student1.aprobo();
		//-6 ejercicio 
		var account1 = new BankAccount(100);
		account1.deposit(50.5);
		//-7 ejercicio 
		var rectangulo = new Rectangle(30,15);
		rectangulo.calcularArea();
		rectangulo.calcularPerimetro();
		//-8 ejercicio
		var worker1 = new Worker("Mickael", 1200);
		var worker2 = new Worker("Juan", 1158);
		var worker3 = new Worker("Miguel", 1384);
		var worker4 = new Worker("Sito", 1034);
		var worker5 = new Worker("Chungo", 1950);
		worker1.showSalary();
		//-9 crea varios objetos person y guardalos en un arraylist 
		ArrayList<Worker> staff = new ArrayList<Worker>();
		staff.add(worker1);
		staff.add(worker2);
		staff.add(worker3);
		staff.add(worker4);
		staff.add(worker5);
		System.out.println(staff.toString());
		//-10 ejercicio
		var producto1 = new Product("Control", 100);
		producto1.discount(20);

	}

}
