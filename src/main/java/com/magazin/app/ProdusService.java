package com.magazin.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdusService {

    @Autowired
    private ProdusRepository produsRepository;

    public List<Produs> getAllProduse(){
        List<Produs> produse = new ArrayList<>();
        produsRepository.findAll().forEach(produse::add);
        return produse;
    }

    public Produs getProdus(Long id) {
        return produsRepository.findById(id).get();
    }

    public void addProdus(Produs produs) {
        produsRepository.save(produs);
    }

    public void updateProdus(Long id, Produs produs) {
        produsRepository.save(produs);
    }

    public void deleteProdus(Long id) {
        produsRepository.deleteById(id);
    }
}
