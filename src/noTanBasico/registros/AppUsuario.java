package noTanBasico.registros;

public class AppUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		try{
			Usuario user = new Usuario("Ed ", "@");
			System.out.println("Mi usuario es " +user.username() + " y correo: " + user.email());
		} catch(IllegalArgumentException e){
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	/*Pruebas
	 * new Usuario("Eduardo", "eduardoj.niegar@educa.jcyl.es");
	 * new Usuario("", "eduardoj.niegar@educa.jcyl.es");
	 * new Usuario(null, "eduardoj.niegar@educa.jcyl.es");
	 * new Usuario("Eduardo", null); PETAA se le ingresa otra condicion
	 * new Usuario("   ", "eduardoj.niegar@educa.jcyl.es");
	 * new Usuario("Eduardo", "eduardoj.niegareduca.jcyl.es");
	 * new Usuario("Eduardo", "@");
	 * new Usuario("Ed", "@");
	 * new Usuario("Ed ", "@");
	 */

}
