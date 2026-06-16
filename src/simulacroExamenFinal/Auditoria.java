package simulacroExamenFinal;

public interface Auditoria {
	
	public abstract double calcularImpactoCarbono(); //Los metodos abstractos no tienen implementacion
	
	public default void comprobarAlertaVerde(){
		double umbralSeguro = 7;
		if(this.calcularImpactoCarbono() < umbralSeguro) {
			System.out.println("Vehiculo ecologico para transitar");
		}else if(this.calcularImpactoCarbono() == umbralSeguro) {
			System.out.println("Vehiculos niveles aceptables");
		}else {
			System.out.println("ALERTA vehiculo contaminante");
		}
	}
	
	
	
	
}
