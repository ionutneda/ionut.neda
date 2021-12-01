package com.magazin.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerCart {
	
	public static Map<Integer, Produs> listaProduseCart = new HashMap<>();
	static {
		listaProduseCart.put(1, ControllerProdus.listaProduse.get(1));
		listaProduseCart.put(2, ControllerProdus.listaProduse.get(4));
		}
	
	//public Cart cart = new Cart(1, ControllerProdus.listaProduse.get(1));

	@GetMapping("/cart")
	public Map<Integer, Produs> continutCart (){
		//return cart;
		return listaProduseCart;
	}
	
}
