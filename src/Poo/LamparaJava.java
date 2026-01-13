package Poo;


	public class LamparaJava{
		private String color;
		private String marca;
		private boolean estaEncendida;
		
		
		public LamparaJava(String color, String marca){
			this.color = color;
			this.marca = marca;
	}
		public LamparaJava(boolean estaEncendida) {
			this.estaEncendida = estaEncendida;
		}
		
		public void estado() {
			System.out.println("Aqui tenemos una lampara " + marca + " de color " + color );
			if (estaEncendida) {
				System.out.println(" y esta encendida");
			}else {
				System.out.println(" y esta apagada");
			}
		}
		
		public void encender() {
			this.estaEncendida = true;
		}
		
		public void apagar() {
			this.estaEncendida = false;
	}

}
