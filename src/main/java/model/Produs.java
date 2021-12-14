package model;

import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
public class Produs extends EntitateDeBaza{


	private double pret;
	private String titlu, autor, descriereScurta, descriereLunga, linkCoperta, linkDescarcare;
	
	
	public Produs() {}
	
	public Produs(String titlu, String autor, String descriereScurta, String descriereLunga, String linkCoperta, String linkDescarcare, double pret) {
		super();
		this.pret = pret;
		this.titlu = titlu;
		this.autor = autor;
		this.descriereScurta = descriereScurta;
		this.descriereLunga = descriereLunga;
		this.linkCoperta = linkCoperta;  // sau imagine
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

	public String getDescriereScurta() {
		return descriereScurta;
	}

	public void setDescriereScurta(String descriereScurta) {
		this.descriereScurta = descriereScurta;
	}
	
	public String getDescriereLunga() {
		return descriereLunga;
	}

	public void setDescriereLunga(String descriereLunga) {
		this.descriereLunga = descriereLunga;
	}

	@Transient
	public String getLinkCopertaPath() {
		if (linkCoperta == null || getId() == null) return null;
		return "imagini-produs/" + getId() + "/" + linkCoperta;  // sau imagine
	}
	
	@Override
	public String toString() {
		return "Produs [id=" + super.getId() + ", pret=" + pret + ", titlu=" + titlu + ", autor=" + autor + ", descriereScurta="
				+ descriereScurta + ", linkCoperta=" + linkCoperta + ", linkDescarcare=" + linkDescarcare + "]";
	}


}
