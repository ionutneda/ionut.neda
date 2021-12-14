package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import model.Produs;
import repo.ProdusRepository;
import services.ProdusService;


@RestController
public class ProdusController {

	@Autowired
	private ProdusService produsService;
	
	private ProdusRepository produsRepository;

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

	@PostMapping("/produse/add")
	public void addProdus(@RequestBody Produs produs) {
		produsService.addProdus(produs);
	}
	
	@PostMapping("/creareProdus")
	public String creareProdus(@ModelAttribute Produs produs, Model model) {
		model.addAttribute("produs", produs);
		produsRepository.save(produs);
		return "redirect:/produse";
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
