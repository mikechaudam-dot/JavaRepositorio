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


	@Override
	public void cargar() {
		if(nivelBateria <= 30){
			System.out.println("Bateria baja, cargando bateria....");
			System.out.println("......");
			System.out.println("....");
			nivelBateria = 100;
		}else{
			System.out.println("Bateria con buen nivel de carga");
		}
	}


	@Override
	public double obtenerNivelBateria() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	


	
	
	
	
	

}
