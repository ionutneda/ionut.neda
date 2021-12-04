package com.magazin.app;

public class LinieCos {

	private Produs produsLinie;
	private Integer cantitate;
	private Double pretLinie; // pretul unui produs daca este 1 bucata sau pret total pt un produs cu mai multe bucati

	
	public LinieCos() {}
	
	public LinieCos(Produs produsLinie, Integer cantitate) {
		super();
		this.produsLinie = produsLinie;
		this.cantitate = cantitate;
		this.pretLinie = produsLinie.getPret()*cantitate;
	}

	
	
	public Double getPretLinie() {
		return pretLinie;
	}

	public void setPretLinie(Double pretLinie) {
		this.pretLinie = pretLinie;
	}

	public Produs getProdusLinie() {
		return produsLinie;
	}

	public void setProdusLinie(Produs produsLinie) {
		this.produsLinie = produsLinie;
	}

	public Integer getCantitate() {
		return cantitate;
	}

	public void setCantitate(Integer cantitate) {
		this.cantitate = cantitate;
	}

	@Override
	public String toString() {
		return "LinieCos [produsCos=" + produsLinie + ", cantitate=" + cantitate + ", pretLinie=" + pretLinie + "]";
	}
	
	
	
}
