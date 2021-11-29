package com.magazin.app;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerProdus {
	
		//Produs(long id, String titlu, String autor, String linkCoperta, String linkDescarcare, pret)
	
	@GetMapping("/")
	public ArrayList<Produs> listaProduse() {
		ArrayList<Produs> listaProd = new ArrayList<>();
		Produs p1 = new Produs((long)1, "Introducere in Java", "Ionut Neda", "link-coperta", "link-descarcare", 70);
		Produs p2 = new Produs((long)2, "Spring Boot", "Vasile Dumitru", "link-coperta", "link-descarcare", 80);
		listaProd.add(p1);
		listaProd.add(p2);
		return listaProd;
	}
	


}
