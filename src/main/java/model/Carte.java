package model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
//import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Carte extends EntitateDeBaza{


	private double pret;
	private String titlu, isbn, descriereScurta, descriereLunga, linkCoperta, linkDescarcare;

    @ManyToOne
    private Editura editura;

    @ManyToMany
//    @JoinTable(name = "autor_carte", joinColumns = @JoinColumn(name = "carte_id"),
//            inverseJoinColumns = @JoinColumn(name = "autor_id"))
    private Set<Autor> autori = new HashSet<>();

	
	public Carte() {}

    public Carte(double pret, String titlu, String isbn, String descriereScurta, String descriereLunga,
			String linkCoperta, String linkDescarcare) {
		super();
		this.pret = pret;
		this.titlu = titlu;
		this.isbn = isbn;
		this.descriereScurta = descriereScurta;
		this.descriereLunga = descriereLunga;
		this.linkCoperta = linkCoperta;
		this.linkDescarcare = linkDescarcare;
	}




	public Carte(double pret, String titlu, String isbn) {
		super();
		this.pret = pret;
		this.titlu = titlu;
		this.isbn = isbn;
	}

	public double getPret() {
		return pret;
	}

	public void setPret(double pret) {
		this.pret = pret;
	}

	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
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

	public String getLinkCoperta() {
		return linkCoperta;
	}

	public void setLinkCoperta(String linkCoperta) {
		this.linkCoperta = linkCoperta;
	}

	public String getLinkDescarcare() {
		return linkDescarcare;
	}

	public void setLinkDescarcare(String linkDescarcare) {
		this.linkDescarcare = linkDescarcare;
	}

	public Editura getEditura() {
		return editura;
	}

	public void setEditura(Editura editura) {
		this.editura = editura;
	}

	public Set<Autor> getAutori() {
		return autori;
	}

	public void setAutori(Set<Autor> autori) {
		this.autori = autori;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Carte carte = (Carte) o;

        return getId() != null ? getId().equals(carte.getId()) : carte.getId() == null;
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "id=" + getId() +
                ", titlu='" + titlu + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }


}
