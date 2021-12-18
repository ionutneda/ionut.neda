package controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.Utilizator;
import services.UtilizatorService;

@RestController
@RequestMapping(value="/utilizator")
public class UtilizatorController {
	
	
	private UtilizatorService utilizatorService;
	
	@Autowired
    public UtilizatorController(UtilizatorService utilizatorService) {
		this.utilizatorService = utilizatorService;
	}
	
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addUtilizator(Model model) {
        Utilizator utilizator = new Utilizator();
        
        model.addAttribute("utilizator", utilizator);
        return "register_form";
    }
    


	@RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addBookPost(@ModelAttribute("utilizator") Utilizator utilizator, HttpServletRequest request) {
        utilizatorService.save(utilizator);

        return "redirect:register_success";
    }
	
	
//
//	@GetMapping("/register_success")
//	public List<Utilizator> getAllUtilizatori(Model model){
//		List<Utilizator> utilizatori = utilizatorService.getAllUtilizatori();
//		Utilizator u1 = new Utilizator();
//		u1.setNume("neda");
//		u1.setPrenume("ion");
//		u1.setEmail("ion@gmail.com");
//		utilizatori.add(u1);
//		model.addAttribute("utilizatori", utilizatori);
//		return utilizatori;
//	}
//
//	@GetMapping("/utilizatori/{id}")
//	public Utilizator getUtilizator(@PathVariable Long id){
//		return utilizatorService.getUtilizator(id);
//	}
//
//	@PostMapping("/utilizatori/{id}")
//	public void addUtilizator(@RequestBody Utilizator utilizator) {
//		utilizatorService.addUtilizator(utilizator);
//	}
//	
//	@PostMapping("/utilizatori/{id}")
//	public void updateUtilizator(@RequestBody Utilizator utilizator, @PathVariable Long id) {
//		utilizatorService.updateUtilizator(id, utilizator);
//	}
//
//	@DeleteMapping("/utilizatori/{id}")
//	public void deleteUtilizator(@PathVariable Long id) {
//		utilizatorService.deleteUtilizator(id);
//	}


}
