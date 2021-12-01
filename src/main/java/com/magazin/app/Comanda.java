package com.magazin.app;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Comanda {

	private long id;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dataComenzii;
	//private lista produse
}
