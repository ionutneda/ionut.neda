package services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Comanda;
import model.ItemCos;
import model.Produs;
import model.Utilizator;
import repo.ComandaRepository;
import repo.ItemCosRepository;
import repo.ProdusRepository;

@Service
public class ComandaService {

    @Autowired
    private ItemCosRepository cosRepository;
    
    @Autowired
    private ComandaRepository comandaRepository;
    
    
   //data utilizator listaproduse

    public void creareComanda (Comanda comanda) {
    	comandaRepository.save(comanda);
    }
    public List<ItemCos>getListaProduse() {
    	List<ItemCos> listaProduse = new ArrayList<>();
    	cosRepository.findAll().forEach(listaProduse::add);
    	return listaProduse;
    }
    
    public void deleteComanda(Long id) {
        cosRepository.deleteById(id);
    }
    
}
