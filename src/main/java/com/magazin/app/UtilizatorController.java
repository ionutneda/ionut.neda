package com.magazin.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtilizatorController {
	
	@Autowired
	private UtilizatorService utilizatorService;
	

	@GetMapping("/utilizatori")
	public List<Utilizator> getAllUtilizatori(Model model){
		List<Utilizator> utilizatori = utilizatorService.getAllUtilizatori();
		model.addAttribute("utilizatori", utilizatori);
		return utilizatori;
	}

	@GetMapping("/utilizatori/{id}")
	public Utilizator getUtilizator(@PathVariable Long id){
		return utilizatorService.getUtilizator(id);
	}

	@PostMapping("/utilizatori/{id}")
	public void addUtilizator(@RequestBody Utilizator utilizator) {
		utilizatorService.addUtilizator(utilizator);
	}
	
	@PostMapping("/utilizatori/{id}")
	public void updateUtilizator(@RequestBody Utilizator utilizator, @PathVariable Long id) {
		utilizatorService.updateUtilizator(id, utilizator);
	}

	@DeleteMapping("/utilizatori/{id}")
	public void deleteUtilizator(@PathVariable Long id) {
		utilizatorService.deleteUtilizator(id);
	}


}
