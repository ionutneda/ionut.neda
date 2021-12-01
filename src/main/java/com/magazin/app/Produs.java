package com.magazin.app;

import org.springframework.context.annotation.Configuration;


public class Produs {
	

	private long id;
	private double pret;
	private String titlu, autor, descriere, linkCoperta, linkDescarcare;
	
	public Produs() {}
	
	public Produs(long id, String titlu, String autor, String descriere, String linkCoperta, String linkDescarcare, double pret) {
		super();
		this.id = id;
		this.pret = pret;
		this.titlu = titlu;
		this.autor = autor;
		this.descriere = descriere;
		this.linkCoperta = linkCoperta;
		this.linkDescarcare = linkDescarcare;
	}
	
	public long getId() {
		return id;
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

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Produs [id=" + id + ", pret=" + pret + ", titlu=" + titlu + ", autor=" + autor + ", descriere="
				+ descriere + ", linkCoperta=" + linkCoperta + ", linkDescarcare=" + linkDescarcare + "]";
	}


	
	
	

}
