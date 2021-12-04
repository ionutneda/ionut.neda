package com.magazin.app;

import java.util.Date;
import java.util.Map;

import org.springframework.format.annotation.DateTimeFormat;

public class Comanda {

	private Integer id;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dataComenzii;
	private User userId;
	private Map<Produs, Integer> listaProduseCos;
	
	
}
