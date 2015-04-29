package gestionemerende;

public class Bibita {
	private double quantità;
	private String ID;
	private double costoUnitario;
	private String descrizione;

	public Bibita(double quantità, String iD, double costoUnitario, String descrizione) {
		super();
		this.quantità = quantità;
		ID = iD;
		this.costoUnitario = costoUnitario;
		this.descrizione = descrizione;
	}

	public double getQuantità() {
		return quantità;
	}	

}
