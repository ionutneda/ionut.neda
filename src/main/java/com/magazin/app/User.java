package com.magazin.app;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User extends EntitateDeBaza{

	private String nume, prenume, email, parola;

	@OneToMany(
			mappedBy = "comenziUser",
			cascade = CascadeType.ALL,
			orphanRemoval = true)
	private List<Comanda> comenziUser = new ArrayList<>();
	
	public User() {}
	
	public User(String nume, String prenume, String email, String parola, List comenziUser) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.email = email;
		this.parola = parola;
		this.comenziUser = comenziUser;
	}

	public void addListaComenziUser(Comanda comanda){
		comenziUser.add(comanda);
		comanda.setUser(this);
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

	public List getComenziUser() {
		return comenziUser;
	}

	public void setComenziUser(List comenziUser) {
		this.comenziUser = comenziUser;
	}

	@Override
	public String toString() {
		return "User [id=" + super.getId() +
				", nume=" + nume +
				", prenume=" + prenume +
				", email=" + email +
				", parola=" + parola
				+ ", comenziUser=" + comenziUser + "]";
	}
	
	
	
	
}
