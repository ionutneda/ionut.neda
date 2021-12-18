package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import repo.AutorRepository;

@Controller
public class AutorController {

    private final AutorRepository autorRepository;

    public AutorController(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    @RequestMapping("/autori")
    public String getAuthors(Model model) {
        model.addAttribute("authors", autorRepository.findAll());
        return "autori/lista";
    }
}
