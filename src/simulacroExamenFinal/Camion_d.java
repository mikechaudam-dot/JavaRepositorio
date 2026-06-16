package simulacroExamenFinal;

public class Camion_d extends Vehiculo implements Auditoria {
	private double consumo_medio;
	private Conductor conductor_asignado;
	

	public Camion_d(String matricula, double capacidad_carga, double consumo_medio, Conductor conductor_asignado) {
		super(matricula, capacidad_carga);
		this.consumo_medio = consumo_medio;
		this.conductor_asignado = conductor_asignado;
	}


	public double getConsumo_medio() {
		return consumo_medio;
	}


	public Conductor getConductor_asignado() {
		return conductor_asignado;
	}


	@Override
	public double calcularImpactoCarbono() {
		double impacto = 0;
		if(this.consumo_medio >= 5 && this.consumo_medio <=10) {
			impacto = this.consumo_medio * 2;
		}else if(this.consumo_medio >= 11 && this.consumo_medio <= 15) {
			impacto = this.consumo_medio * 3;
		}else if(this.consumo_medio >= 16 && this.consumo_medio <= 20) {
			impacto = this.consumo_medio * 4;
		}else {
			System.out.println("Error en lectura de impacto ambiental");
		}
		return impacto;
	}	
	
			
}
