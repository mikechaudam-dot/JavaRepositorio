package moureDevPoo;

//1 - Crea una clase person y establece atributos privados de name y age 
//y usa los metodos getName(), setName(), getAge() y setAge() para asignar 
//y mostrar valores desde otra clase

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		setName(name);
		setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name != null && !name.isEmpty()){
			this.name = name;
		}else {
			System.out.println("ERROR, el nombre no puede estar vacio");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			System.out.println("Edad no valida");
		}
	}

}
