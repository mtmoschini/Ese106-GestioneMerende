package gestionemerende;

public class Bibita {
	private double quantit�;
	private String ID;
	private double costoUnitario;
	private String descrizione;

	public Bibita(double quantit�, String iD, double costoUnitario, String descrizione) {
		super();
		this.quantit� = quantit�;
		ID = iD;
		this.costoUnitario = costoUnitario;
		this.descrizione = descrizione;
	}

	public double getQuantit�() {
		return quantit�;
	}	

}
