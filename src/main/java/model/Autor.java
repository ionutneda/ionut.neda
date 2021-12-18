package model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Autor extends EntitateDeBaza {

    private String nume;
    private String prenume;

    @ManyToMany(mappedBy = "autori")
    private Set<Carte> carti = new HashSet<>();

    public Autor() {
    }

    public Autor(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    
    
    public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public Set<Carte> getCarti() {
		return carti;
	}

	public void setCarti(Set<Carte> carti) {
		this.carti = carti;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Autor autor = (Autor) o;

        return getId() != null ? getId().equals(autor.getId()) : autor.getId() == null;
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "id=" + getId() +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                '}';
    }

}
