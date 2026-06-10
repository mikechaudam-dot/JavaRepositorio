package noTanBasico.registros;

public record Usuario(String username, String email) {
	//Esto es un constructor compacto
	public Usuario {
		//Restricciones
		if(username == null || username.length() < 4){
			throw new IllegalArgumentException("El usuario no puede ir vacio");
		}
		if(email == null || !email.contains("@")) {
			throw new IllegalArgumentException("El email del usuario no valido");
		}
	}
}
