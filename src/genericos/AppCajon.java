package genericos;

public class AppCajon {

	public static void main(String[] args) {
		
		Cajon <String> cajonString = new Cajon<>();
		Cajon <String> cajonString2 = new Cajon<>();
		
		cajonString.guardar("Zapatos");
		
		System.out.println(cajonString.extraer());
		System.out.println(cajonString2.extraer());

	}

}
