package gestionemerende;

import java.util.Vector;

public class Istituto {
	private String nome;
	private Vector<Classe> classi;

	public Istituto(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public Vector<Classe> getClassi() {
		return classi;
	}

}
