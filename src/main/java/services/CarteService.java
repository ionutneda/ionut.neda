package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Carte;
import repo.CarteRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarteService {

    @Autowired
    private CarteRepository carteRepository;

    public List<Carte> getAllCarti(){
        List<Carte> carti = new ArrayList<>();
        carteRepository.findAll().forEach(carti::add);
        return carti;
    }

    public Carte getCarte(Long id) {
        return carteRepository.findById(id).get();
    }

    public void addCarte(Carte carte) {
        carteRepository.save(carte);
    }

    public void updateCarte(Long id, Carte carte) {
        carteRepository.save(carte);
    }

    public void deleteCarte(Long id) {
        carteRepository.deleteById(id);
    }
}
