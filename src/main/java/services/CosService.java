package services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Carte;
import model.ItemCos;
import model.Utilizator;
import repo.ItemCosRepository;
import repo.CarteRepository;

@Service
public class CosService {

	

    @Autowired
    private ItemCosRepository cosRepository;
    
    @Autowired
    private CarteRepository carteRepository;
    
    
    public List<ItemCos> listaItemiCos(Utilizator utilizator) {
    	return cosRepository.findByUtilizator(utilizator);
    }
    
    public Integer addCarte(Long idCarte, Integer cantitate, Utilizator utilizator) {
    	Integer cantitateAdaugata = cantitate;
    	
    	Carte carte = carteRepository.findById(idCarte).get();
    	
    	ItemCos itemCos = cosRepository.findByUtilizatorAndCarte(utilizator, carte);
    	
    	if (itemCos != null) {
    		cantitateAdaugata = itemCos.getCantitate() + cantitate;
    		itemCos.setCantitate(cantitateAdaugata);
    	} else {
    		itemCos = new ItemCos();
    		itemCos.setCantitate(cantitate);
    		itemCos.setUtilizator(utilizator);
    		itemCos.setCarte(carte);
    	}
    	
    	cosRepository.save(itemCos);
    	
    	return cantitateAdaugata;
    }

    
    
    
}
