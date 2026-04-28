package moureDevPoo;

public class Worker {
	String name;
	double salary;
	
	public Worker(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	//Metodo mostrar salario 
	public void showSalary() {
		System.out.println("El salario del empreado: " + name + " es: $" + salary  );
	}
	@Override 
	public String toString(){
		return "Empleados [Nombre=" + name + " , Salario=" + salary + "]";
	}
}
