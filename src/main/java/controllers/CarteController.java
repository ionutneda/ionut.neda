package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import repo.CarteRepository;


@Controller
public class CarteController {

    private final CarteRepository carteRepository;

    public CarteController(CarteRepository carteRepository) {
        this.carteRepository = carteRepository;
    }

    @RequestMapping("/carti")
    public String getCarti(Model model) {
        model.addAttribute("carti", carteRepository.findAll());
        return "carti/lista";
    }

}
