package com.magazin.app;

public class Produs {
	
	private final long id;
	private double pret;
	private String titlu, autor, linkCoperta, linkDescarcare;
	
	public Produs(long id, String titlu, String autor, String linkCoperta, String linkDescarcare, double pret) {
		super();
		this.id = id;
		this.pret = pret;
		this.titlu = titlu;
		this.autor = autor;
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

	@Override
	public String toString() {
		return "Produs [id=" + id + ", pret=" + pret + ", titlu=" + titlu + ", autor=" + autor + ", linkCoperta="
				+ linkCoperta + ", linkDescarcare=" + linkDescarcare + "]";
	}


	
	
	

}
