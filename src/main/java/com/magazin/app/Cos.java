package com.magazin.app;

import java.util.Map;
import java.util.Map.Entry;

public class Cos {
	

	private Double pretTotalCos = (double) 0;
	
	//lista linii din cos, diferita de lista linii din controllerCos
	private Map<Integer, LinieCos> listaLiniiCos;

	public Cos() {}

	public Cos(Map<Integer, LinieCos> listaLiniiCos) {
		super();
		this.listaLiniiCos = listaLiniiCos;
		for(Map.Entry<Integer, LinieCos> entry : listaLiniiCos.entrySet()) {
			//Integer key = entry.getKey();
			LinieCos value = entry.getValue();
			//LinieCos value = listaLiniiCos.get(e);
			pretTotalCos += value.getPretLinie();
		}
	}
	

	public Double getPretTotalCos() {
		return pretTotalCos;
	}

	public void setPretTotalCos(Double pretTotalCos) {
		this.pretTotalCos = pretTotalCos;
	}

	public Map<Integer, LinieCos> getListaLiniiCos() {
		return listaLiniiCos;
	}

	public void setListaLiniiCos(Map<Integer, LinieCos> listaLiniiCos) {
		this.listaLiniiCos = listaLiniiCos;
	}

	@Override
	public String toString() {
		return "Cos [pretTotalCos=" + pretTotalCos + ", listaLiniiCos=" + listaLiniiCos + "]";
	}
	



	
	
}
