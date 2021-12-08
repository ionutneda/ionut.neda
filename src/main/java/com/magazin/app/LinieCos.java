package com.magazin.app;

import javax.persistence.Entity;

@Entity
public class LinieCos extends EntitateDeBaza{

	private Produs produs;
	private Integer cantitate;
	private Double pretLinie; // pretul unui produs daca este 1 bucata sau pret total pt un produs cu mai multe bucati

	
	public LinieCos() {}
	
	public LinieCos(Produs produs, Integer cantitate) {
		super();
		this.produs = produs;
		this.cantitate = cantitate;
		this.pretLinie = produs.getPret()*cantitate;
	}

	public LinieCos(Produs produs) {
		this.produs = produs;
	}



	public void addCantitate(Integer cantitateAdaugata){
		this.cantitate = this.cantitate + cantitateAdaugata;
	}
	
	public Double getPretLinie() {
		return pretLinie;
	}

	public void setPretLinie(Double pretLinie) {
		this.pretLinie = pretLinie;
	}

	public Produs getProdus() {
		return produs;
	}

	public void setProdus(Produs produs) {
		this.produs = produs;
	}

	public Integer getCantitate() {
		return cantitate;
	}

	public void setCantitate(Integer cantitate) {
		this.cantitate = cantitate;
	}

	@Override
	public String toString() {
		return "LinieCos [produsCos=" + produs + ", cantitate=" + cantitate + ", pretLinie=" + pretLinie + "]";
	}
	
	
	
}
