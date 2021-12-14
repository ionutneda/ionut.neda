package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import model.ItemCos;
import model.Utilizator;
import services.CosService;
import services.UtilizatorService;

@RestController
public class CosController {


	@Autowired
	private CosService cosService;
	
	@Autowired
	private UtilizatorService utilizatorService;
	
	
	@GetMapping("/cos")
	public String arataCos(Model model, Utilizator utilizator) {
		List<ItemCos> itemiCos = cosService.listaItemiCos(utilizator);
		model.addAttribute("itemiCos", itemiCos); //inserare in bloc
		model.addAttribute("pageTitle", "Cosul dumneavoastra");
		return "cos"; //numele paginii .html
	}
	
	@PostMapping("/cos/add/{pid}/{cantitate}")
	public String addProdusInCos(@PathVariable ("pid") Long idProdus,
								@PathVariable("cantitate") Integer cantitate) {
		Utilizator utilizator = utilizatorService.getUtilizator(idProdus);
		Integer cantitateAdaugata = cosService.addProdus(idProdus, cantitate, utilizator);
		return cantitateAdaugata + " bucata/bucati din acest produs au fost adaugate in cos.";
	}
	
	


}
