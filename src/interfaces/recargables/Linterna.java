package interfaces.recargables;

public class Linterna implements Recargable {
	
	private String tipoLuz;
	private String potencia;
	private double nivelBateria;
	
	
	public Linterna(String tipoLuz, String potencia, double nivelBateria) {
		this.tipoLuz = tipoLuz;
		this.potencia = potencia;
		this.nivelBateria = nivelBateria;
	}


	public String getTipoLuz() {
		return tipoLuz;
	}


	public String getPotencia() {
		return potencia;
	}


	public double getNivelBateria() {
		return nivelBateria;
	}


	@Override
	public String toString() {
		return "Linterna [tipoLuz=" + tipoLuz + ", potencia=" + potencia + ", nivelBateria=" + nivelBateria + "]";
	}
	
	


	
	
	
	
	

}
