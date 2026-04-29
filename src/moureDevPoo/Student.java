package moureDevPoo;

//5 Crea una clase Student con atributo score y un metodo si aprobo o suspendio >= 60
public class Student extends Person {
	double score;
	
	//Creamos el coonstructor para instanciar el objeto de una con el score
	public Student (String name, int age, double score){
		super(name,age);
		this.score = score;
	}
	
	// creamos el metodo
	public void aprobo() {
		if(this.score >= 60){
			System.out.println("Aprobaste con nota de: " + this.score);
		}else {
			System.out.println("Has suspendido, buena suerte para la proxima");
		}
	}
}
