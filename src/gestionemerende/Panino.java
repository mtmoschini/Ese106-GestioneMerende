package gestionemerende;

public class Panino {
	private boolean vegetariano;
	private boolean carneSuina;
	private double apportoCalorico;
	private String ID;
	private double costoUnitario;
	private String descrizione;
	
	public Panino(boolean vegetariano, boolean carneSuina, double apportoCalorico, String iD, double costoUnitario, String descrizione) {
		super();
		this.vegetariano = vegetariano;
		this.carneSuina = carneSuina;
		this.apportoCalorico = apportoCalorico;
		ID = iD;
		this.costoUnitario = costoUnitario;
		this.descrizione = descrizione;
	}
	public boolean isVegetariano() {
		return vegetariano;
	}

	public boolean isCarneSuina() {
		return carneSuina;
	}

	

}
