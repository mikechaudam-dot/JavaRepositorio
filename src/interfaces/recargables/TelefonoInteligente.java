package interfaces.recargables;

public class TelefonoInteligente extends Telefono implements Recargable{
	private boolean tactil = true;
	private String sisOperativo;
	private double nivelBateria;
	
	
	public TelefonoInteligente(String marca, String modelo, boolean tactil, String sisOperativo, double nivelBateria) {
		super(marca, modelo);
		this.tactil = tactil;
		this.sisOperativo = sisOperativo;
		this.nivelBateria = nivelBateria;
	}


	public boolean isTactil() {
		return tactil;
	}


	public String getSisOperativo() {
		return sisOperativo;
	}


	public double getNivelBateria() {
		return nivelBateria;
	}


	public void setNivelBateria(double nivelBateria) {
		this.nivelBateria = nivelBateria;
	}


	@Override
	public String toString() {
		return "TelefonoInteligente [tactil=" + tactil + ", sisOperativo=" + sisOperativo + ", nivelBateria="
				+ nivelBateria + ", isTactil()=" + isTactil() + ", getSisOperativo()=" + getSisOperativo()
				+ ", getNivelBateria()=" + getNivelBateria() + "]";
	}
	
	
	
	
	
	
}
