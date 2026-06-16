package simulacroExamenFinal;

public class Furgo_elec extends Vehiculo implements Auditoria {
	private double porcentaje_bateria;
	private Conductor conductor_asignado;
	
	
	public Furgo_elec(String matricula, double capacidad_carga, double porcentaje_bateria,
			Conductor conductor_asignado) {
		super(matricula, capacidad_carga);
		this.porcentaje_bateria = porcentaje_bateria;
		this.conductor_asignado = conductor_asignado;
	}


	public double getPorcentaje_bateria() {
		return porcentaje_bateria;
	}


	public Conductor getConductor_asignado() {
		return conductor_asignado;
	}


	@Override
	public double calcularImpactoCarbono() { //No hace falta parentesis ya que al estar el metodo ya tiene 
		                                     //Acceso directo
		double impacto = 0;
		if(this.porcentaje_bateria > 1 && this.porcentaje_bateria <= 10 ) {
			impacto = 0.0;
		}else if (this.porcentaje_bateria >= 11 && this.porcentaje_bateria <= 50) {
			impacto = 5.0;
		}else if(this.porcentaje_bateria >= 51 && this.porcentaje_bateria <= 100) {
			impacto = 10.0;
		}else {
			impacto = 0;
		}
		return impacto;
	}	
	
}
