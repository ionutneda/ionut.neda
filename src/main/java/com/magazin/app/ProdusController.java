package com.magazin.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RestController
public class ProdusController {

	@Autowired
	private ProdusService produsService;

	@GetMapping("/produse")
	public List<Produs> getAllProduse(Model model){
		List<Produs> produse = produsService.getAllProduse();
		model.addAttribute("produse", produse);
		return produse;
	}

	@GetMapping("/produse/{id}")
	public Produs getProdus(@PathVariable Long id){
		return produsService.getProdus(id);
	}

	@PostMapping("/produse/{id}")
	public void addProdus(@RequestBody Produs produs) {
		produsService.addProdus(produs);
	}
	
	@PostMapping("/produse/{id}")
	public void updateProdus(@RequestBody Produs produs, @PathVariable Long id) {
		produsService.updateProdus(id, produs);
	}

	@DeleteMapping("/produse/{id}")
	public void deleteProdus(@PathVariable Long id) {
		
		produsService.deleteProdus(id);
	}

	
	


}
