package services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.ItemCos;
import model.Produs;
import model.Utilizator;
import repo.ItemCosRepository;
import repo.ProdusRepository;

@Service
public class CosService {

	

    @Autowired
    private ItemCosRepository cosRepository;
    
    @Autowired
    private ProdusRepository produsRepository;
    
    
    public List<ItemCos> listaItemiCos(Utilizator utilizator) {
    	return cosRepository.findByUtilizator(utilizator);
    }
    
    public Integer addProdus(Long idProdus, Integer cantitate, Utilizator utilizator) {
    	Integer cantitateAdaugata = cantitate;
    	
    	Produs produs = produsRepository.findById(idProdus).get();
    	
    	ItemCos itemCos = cosRepository.findByUtilizatorAndProdus(utilizator, produs);
    	
    	if (itemCos != null) {
    		cantitateAdaugata = itemCos.getCantitate() + cantitate;
    		itemCos.setCantitate(cantitateAdaugata);
    	} else {
    		itemCos = new ItemCos();
    		itemCos.setCantitate(cantitate);
    		itemCos.setUtilizator(utilizator);
    		itemCos.setProdus(produs);
    	}
    	
    	cosRepository.save(itemCos);
    	
    	return cantitateAdaugata;
    }

    
    
    
}
