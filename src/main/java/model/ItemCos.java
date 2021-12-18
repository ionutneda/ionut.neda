package model;

import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
public class ItemCos extends EntitateDeBaza{

	// id  mostenit
	
	private Carte carte;
	private Utilizator utilizator;
	private Integer cantitate;
	
	public ItemCos() {}
	
	public ItemCos(Carte carte, Utilizator utilizator, Integer cantitate) {
		super();
		this.carte = carte;
		this.utilizator = utilizator;
		this.cantitate = cantitate;
	}
	

	public ItemCos(Carte carte) {
		this.carte = carte;
	}


	public void addCantitate(Integer cantitateAdaugata){
		this.cantitate = this.cantitate + cantitateAdaugata;
	}
	

	public Carte getCarte() {
		return carte;
	}


	public Integer getCantitate() {
		return cantitate;
	}

	public void setCantitate(Integer cantitate) {
		this.cantitate = cantitate;
	}

	public Utilizator getUtilizator() {
		return utilizator;
	}

	public void setUtilizator(Utilizator utilizator) {
		this.utilizator = utilizator;
	}

	@Transient
	public Double getSubtotal() {
		return this.carte.getPret() * cantitate;
	}
	
	@Override
	public String toString() {
		return "ItemCos [carte=" + carte + ", utilizator=" + utilizator + ", cantitate=" + cantitate + "]";
	}

	public void setCarte(Carte carte) {
		this.carte = carte;
		
	}
	
	
	
}
