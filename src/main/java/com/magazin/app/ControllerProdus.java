package com.magazin.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ControllerProdus {
		
	private Integer id; //id produs?
	public static Map<Integer,Produs> listaProduse = new HashMap<>();
	
	
	public static Map<Integer, Produs> getListaProduse() {
		return listaProduse;
	}

	public static void setListaProduse(Map<Integer, Produs> listaProduse) {
		ControllerProdus.listaProduse = listaProduse;
	}

	// produse test
	static {
		Produs p1 = new Produs();
		p1.setId(1);
		p1.setTitlu("Git");
		p1.setAutor("Linus Torwalds");
		p1.setDescriere("descriere");
		p1.setLinkCoperta("link-coperta");
		p1.setLinkDescarcare("Link-descarcare");
		p1.setPret(70);
		listaProduse.put(p1.getId(), p1);
		
		Produs p2 = new Produs();
		p2.setId(2);
		p2.setTitlu("Introducere in Java");
		p2.setAutor("Ionut Neda");
		p2.setDescriere("descriere");
		p2.setLinkCoperta("link-coperta");
		p2.setLinkDescarcare("Link-descarcare");
		p2.setPret(65);
		listaProduse.put(p2.getId(), p2);
		
		Produs p3 = new Produs();
		p3.setId(3);
		p3.setTitlu("Spring Boot");
		p3.setAutor("Mary May");
		p3.setDescriere("descriere");
		p3.setLinkCoperta("link-coperta");
		p3.setLinkDescarcare("Link-descarcare");
		p3.setPret(80);
		listaProduse.put(p3.getId(), p3);
		
		Produs p4 = new Produs();
		p4.setId(4);
		p4.setTitlu("Advanced Java");
		p4.setAutor("Rick Palm");
		p4.setDescriere("descriere");
		p4.setLinkCoperta("link-coperta");
		p4.setLinkDescarcare("Link-descarcare");
		p4.setPret(120.50);
		listaProduse.put(p4.getId(), p4);
		
	}
	
	@GetMapping("/produse")
	public Map<Integer, Produs> getAllProduse() {
		return listaProduse;
	}

	
	@GetMapping("/produse/{id}")
	public Produs getProdus(@PathVariable("id") Integer id) {
		return listaProduse.get(id);
	}
	
	@PostMapping(value = "/produse/add")
	public Produs creareProdus(@RequestBody Produs produsNou) {
		listaProduse.put(produsNou.getId(), produsNou);
		System.out.println(produsNou);
		return produsNou;
	}

	
	


}
