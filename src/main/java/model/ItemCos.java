package model;

import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
public class ItemCos extends EntitateDeBaza{

	// id auto mostenit
	
	private Produs produs;
	private Utilizator utilizator;
	private Integer cantitate;
	
	public ItemCos() {}
	
	public ItemCos(Produs produs, Utilizator utilizator, Integer cantitate) {
		super();
		this.produs = produs;
		this.utilizator = utilizator;
		this.cantitate = cantitate;
	}
	

	public ItemCos(Produs produs) {
		this.produs = produs;
	}


	public void addCantitate(Integer cantitateAdaugata){
		this.cantitate = this.cantitate + cantitateAdaugata;
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

	public Utilizator getUtilizator() {
		return utilizator;
	}

	public void setUtilizator(Utilizator utilizator) {
		this.utilizator = utilizator;
	}

	@Transient
	public Double getSubtotal() {
		return this.produs.getPret() * cantitate;
	}
	
	@Override
	public String toString() {
		return "ItemCos [produs=" + produs + ", utilizator=" + utilizator + ", cantitate=" + cantitate + "]";
	}
	
	
	
}
