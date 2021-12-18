package model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Editura extends EntitateDeBaza {

	    private String nume;
	    private String adresaWeb;

	    @OneToMany
	    @JoinColumn(name = "publisher_id")
	    private Set<Carte> carti = new HashSet<>();

	    public Editura() {
	    }

	    public Editura(String nume, String adresaWeb) {
	        this.nume = nume;
	        this.adresaWeb = adresaWeb;
	    }


	    public String getNume() {
			return nume;
		}

		public void setNume(String nume) {
			this.nume = nume;
		}

		public String getAdresaWeb() {
			return adresaWeb;
		}

		public void setAdresaWeb(String adresaWeb) {
			this.adresaWeb = adresaWeb;
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

	        Editura editura = (Editura) o;

	        return getId() != null ? getId().equals(editura.getId()) : editura.getId() == null;
	    }

	    @Override
	    public int hashCode() {
	        return getId() != null ? getId().hashCode() : 0;
	    }

	    @Override
	    public String toString() {
	        return "Editura{" +
	                "id=" + getId() +
	                ", nume='" + nume + '\'' +
	                ", adresa Web='" + adresaWeb + '\'' +
	                '}';
	    }

	
}
