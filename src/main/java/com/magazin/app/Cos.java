package com.magazin.app;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cos extends EntitateDeBaza{
	

	private Double pretTotalCos = (double) 0;

	private List<LinieCos> liniiCos = new ArrayList<>();

	public Cos(){}

	public Cos(List<LinieCos> liniiCos) {
		this.liniiCos = liniiCos;
		for (LinieCos linie: liniiCos ) {
			pretTotalCos += linie.getPretLinie();
		}
	}

	public void addLinieInCos(LinieCos linie){
		liniiCos.add(linie);
	}

	public Double getPretTotalCos() {
		return pretTotalCos;
	}

	public void setPretTotalCos(Double pretTotalCos) {
		this.pretTotalCos = pretTotalCos;
	}

	public List<LinieCos> getLiniiCos() {
		return liniiCos;
	}

	public void setLiniiCos(List<LinieCos> liniiCos) {
		this.liniiCos = liniiCos;
	}

	@Override
	public String toString() {
		return "Cos{" +
				"pretTotalCos=" + pretTotalCos +
				", liniiCos=" + liniiCos +
				'}';
	}
}
