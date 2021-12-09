package com.magazin.app;

import java.util.Date;
import java.util.Map;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity
public class Comanda extends EntitateDeBaza{


	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dataComenzii;

	//@ManyToOne(fetch = FetchType.LAZY)
	private Utilizator utilizator;
	private Map<Produs, Integer> listaProduseCos;


    public void setUtilizator(Utilizator utilizator) {
		this.utilizator = utilizator;
    }
}
