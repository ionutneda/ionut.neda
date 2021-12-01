package com.magazin.app;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cart {

	public Map<Integer, Produs> listaProduseCart;

	public Cart() {}
	
	public Cart(Map<Integer, Produs> listaProduseCart) {
		super();
		this.listaProduseCart = listaProduseCart;
	}


	public Map<Integer, Produs> getListaProduseCart() {
		return listaProduseCart;
	}


	public void setListaProduseCart(Map<Integer, Produs> listaProduseCart) {
		this.listaProduseCart = listaProduseCart;
	}


	@Override
	public String toString() {
		return "Cart [listaProduseCart=" + listaProduseCart + "]";
	}
	
	
	
//	
//	private Integer pozitie;
//	private Produs produs;
//	
//	public Cart() {}
//	
//	public Cart(Integer pozitie, Produs produs) {
//		super();
//		this.pozitie = pozitie;
//		this.produs = produs;
//	}
//	
//	public Integer getPozitie() {
//		return pozitie;
//	}
//	public void setPozitie(Integer pozitie) {
//		this.pozitie = pozitie;
//	}
//	public Produs getProdus() {
//		return produs;
//	}
//	public void setProdus(Produs produs) {
//		this.produs = produs;
//	}
//	
//	
//	@Override
//	public String toString() {
//		return "Cart [pozitie=" + pozitie + ", produs=" + produs + "]";
//	}
//	
//	
	
}
