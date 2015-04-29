package gestionemerende;

public class Articolo {
	private String ID;
	private double costoUnitario;
	private String descrizione;
	private double apportoCalorico;
	
	public Articolo(String iD, double costoUnitario, String descrizione, double apportoCalorico) {
		super();
		ID = iD;
		this.costoUnitario = costoUnitario;
		this.descrizione = descrizione;
		this.apportoCalorico = apportoCalorico;
	}

	public String getID() {
		return ID;
	}

	public double getCostoUnitario() {
		return costoUnitario;
	}

	public void setCostoUnitario(double costoUnitario) {
		this.costoUnitario = costoUnitario;
	}

	public double getApportoCalorico() {
		return apportoCalorico;
	}

	@Override
	public String toString() {
		return "Articolo [ID=" + ID + ", costoUnitario=" + costoUnitario
				+ ", descrizione=" + descrizione + ", apportoCalorico="
				+ apportoCalorico + "]";
	}		

}
