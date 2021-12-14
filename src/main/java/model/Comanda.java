package model;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;

@Entity
public class Comanda extends EntitateDeBaza{


	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dataComenzii;
	private Utilizator utilizator;
	private List<ItemCos> listaProduse;
	
	public Comanda(Utilizator utilizator, List<ItemCos> listaProduse) {
		super();
		this.dataComenzii = new Date();
		this.utilizator = utilizator;
		this.listaProduse = listaProduse;
	}

	public Date getDataComenzii() {
		return dataComenzii;
	}

	public void setDataComenzii(Date dataComenzii) {
		this.dataComenzii = dataComenzii;
	}

	public Utilizator getUtilizator() {
		return utilizator;
	}

	public void setUtilizator(Utilizator utilizator) {
		this.utilizator = utilizator;
	}

	public List<ItemCos> getListaProduse() {
		return listaProduse;
	}

	public void setListaProduse(List<ItemCos> listaProduse) {
		this.listaProduse = listaProduse;
	}

	@Override
	public String toString() {
		return "Comanda [dataComenzii=" + dataComenzii + ", utilizator=" + utilizator + ", listaProduse=" + listaProduse
				+ "]";
	}
	
	


	
	
	
	// de implementat status
//	private enum status {
//		IN_CURS_DE_PROCESARE,
//		IN_ASTEPTARE,
//		ESUATA,
//		ANULATA,
//		FINALIZATA,
//		PLATA_IN_ASTEPTARE,
//		RAMBURSATA
//	}

	

}
