package moureDevPoo;

//-1- Crea una clase book con atributos title y autor 
public class Book {
	private String title;
	String autor;
	
	public Book (String title, String autor) {
		this.title = title;
		this.autor = autor;
	}
	// 4 ejercicion(Encapsulamiento) Establce el atributo tittle privado, permite leerlo con el metodo
	//getTitle 
		

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	

	

}
