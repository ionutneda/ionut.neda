package com.magazin.app;

import java.util.List;

public abstract class User {

	private Integer id;
	private String nume, prenume, email, parola;
	private List listaComenziUser;
	
	public User() {}
	
	public User(Integer id, String nume, String prenume, String email, String parola, List listaComenziUser) {
		super();
		this.id = id;
		this.nume = nume;
		this.prenume = prenume;
		this.email = email;
		this.parola = parola;
		this.listaComenziUser = listaComenziUser;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public List getListaComenziUser() {
		return listaComenziUser;
	}

	public void setListaComenziUser(List listaComenziUser) {
		this.listaComenziUser = listaComenziUser;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", nume=" + nume + ", prenume=" + prenume + ", email=" + email + ", parola=" + parola
				+ ", listaComenziUser=" + listaComenziUser + "]";
	}
	
	
	
	
}
