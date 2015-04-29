package gestionemerende;

import java.time.LocalDateTime;
import java.util.Vector;

public class Ordine {
	private Classe classe;
	private double costoTotale;
	private LocalDateTime giorno;
	private Vector<Articolo> articoli;
	
	public LocalDateTime getGiorno() {
		return giorno;
	}

	public Ordine(Classe classe, double costoTotale) {
		super();
		this.classe = classe;
		this.costoTotale = costoTotale;
	}

	public double getCostoTotale() {
		return costoTotale;
	}

	public Vector<Articolo> getArticoli() {
		return articoli;
	}

	public Classe getClasse() {
		return classe;
	}

}
