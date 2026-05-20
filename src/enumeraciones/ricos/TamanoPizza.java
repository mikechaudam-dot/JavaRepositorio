package enumeraciones.ricos;

public enum TamanoPizza {
	
	FAMILIAR(20,15.00),
	MEDIANA(15,10.00),
	PEQUENA(10,8.00);
		
		private final int diametro;
		private final double precio;
		
		private TamanoPizza(int diametro, double precio) {
			this.diametro = diametro;
			this.precio = precio;
		}
		//Metodo calcular area 
		
		public double calcularArea(int diametro) {
			double radio = diametro/2;
			return Math.PI * (radio * radio);
		}
		

	

}
