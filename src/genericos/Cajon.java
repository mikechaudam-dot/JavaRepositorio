package genericos;

public class Cajon <T>{
	
	private T contenido;
	
	public void guardar (T nuevoContenido) {
		this.contenido = nuevoContenido;
	}
	
	public boolean estaVacio(){
		/*
		if(this.contenido == null) {
			return true;
		}
		return false;
		*/
		//Esto hace lo mismo del if
		return this.contenido == null;
	}
	public T extraer(){
		T cosa = contenido;
		/*
		try{
		}catch (IllegalStateException e) {
			System.out.println("No se puede extraer un objeto");
		}
		*/
		return cosa;
	}
	
	

}
