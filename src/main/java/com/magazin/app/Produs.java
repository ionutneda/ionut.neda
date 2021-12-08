package com.magazin.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produs extends EntitateDeBaza{


	private double pret;
	private String titlu, autor, descriere, linkCoperta, linkDescarcare;
	
	public Produs() {}
	
	public Produs(String titlu, String autor, String descriere, String linkCoperta, String linkDescarcare, double pret) {
		super();
		this.pret = pret;
		this.titlu = titlu;
		this.autor = autor;
		this.descriere = descriere;
		this.linkCoperta = linkCoperta;
		this.linkDescarcare = linkDescarcare;
	}

	public String getTitlu() {
		return titlu;
	}
	public String getAutor() {
		return autor;
	}
	public String getLinkCoperta() {
		return linkCoperta;
	}
	public String getLinkDescarcare() {
		return linkDescarcare;
	}
	
	public double getPret() {
		return pret;
	}
	
	public void setPret(double pret) {
		this.pret = pret;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setLinkCoperta(String linkCoperta) {
		this.linkCoperta = linkCoperta;
	}

	public void setLinkDescarcare(String linkDescarcare) {
		this.linkDescarcare = linkDescarcare;
	}

	public String getDescriere() {
		return descriere;
	}

	public void setDescriere(String descriere) {
		this.descriere = descriere;
	}

	@Override
	public String toString() {
		return "Produs [id=" + super.getId() + ", pret=" + pret + ", titlu=" + titlu + ", autor=" + autor + ", descriere="
				+ descriere + ", linkCoperta=" + linkCoperta + ", linkDescarcare=" + linkDescarcare + "]";
	}

}
