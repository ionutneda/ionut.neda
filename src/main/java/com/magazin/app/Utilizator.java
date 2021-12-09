package com.magazin.app;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Utilizator extends EntitateDeBaza{

	private String nume, prenume, email, parola;

	@OneToMany(
			mappedBy = "comenziUser",
			cascade = CascadeType.ALL,
			orphanRemoval = true)
	private List<Comanda> comenziUtilizator = new ArrayList<>();
	
	public Utilizator() {}
	
	public Utilizator(String nume, String prenume, String email, String parola, List<Comanda> comenziUtilizator) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.email = email;
		this.parola = parola;
		this.comenziUtilizator = comenziUtilizator;
	}

	public void addComanda(Comanda comanda){
		comenziUtilizator.add(comanda);
		comanda.setUtilizator(this);
	}
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

	public List<Comanda> getComenziUser() {
		return comenziUtilizator;
	}

	public void setComenziUser(List<Comanda> comenziUser) {
		this.comenziUtilizator = comenziUser;
	}

	@Override
	public String toString() {
		return "User [id=" + super.getId() +
				", nume=" + nume +
				", prenume=" + prenume +
				", email=" + email +
				", parola=" + parola
				+ ", comenziUser=" + comenziUtilizator + "]";
	}
	
	
	
	
}
