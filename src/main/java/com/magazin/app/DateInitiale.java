package com.magazin.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import model.Autor;
import model.Carte;
import model.Editura;
import repo.AutorRepository;
import repo.CarteRepository;
import repo.EdituraRepository;

@Component
public class DateInitiale implements CommandLineRunner {

    private final AutorRepository autorRepository;
    private final CarteRepository carteRepository;
    private final EdituraRepository edituraRepository;

    public DateInitiale(AutorRepository autorRepository, CarteRepository carteRepository, 
    		EdituraRepository edituraRepository) {
        this.autorRepository = autorRepository;
        this.carteRepository = carteRepository;
        this.edituraRepository = edituraRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Editura editura = new Editura("Corint", "corint.ro");
        edituraRepository.save(editura);

        Autor ionCreanga = new Autor("Ion", "Creanga");
        Carte amintiri = new Carte(55, "Amintiri din copilarie", "123456789");
        ionCreanga.getCarti().add(amintiri);
        amintiri.getAutori().add(ionCreanga);
        amintiri.setEditura(editura);
        editura.getCarti().add(amintiri);
        autorRepository.save(ionCreanga);
        carteRepository.save(amintiri);

        Autor ionutNeda = new Autor("Ionut", "Neda");
        Carte carteaMea = new Carte(85, "Cartea Mea", "3136464987");
        ionutNeda.getCarti().add(carteaMea);
        carteaMea.getAutori().add(ionutNeda);
        carteaMea.setEditura(editura);
        editura.getCarti().add(carteaMea);
        autorRepository.save(ionutNeda);
        carteRepository.save(carteaMea);

        edituraRepository.save(editura);

        System.out.println("date initiale");
        System.out.println("numar de carti: " + carteRepository.count());
        System.out.println("numar de edituri: " + edituraRepository.count());
        System.out.println("numar de carti ale editurii: " + editura.getCarti().size());
    }

}