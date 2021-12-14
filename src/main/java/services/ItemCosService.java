package services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.ItemCos;
import repo.ItemCosRepository;

@Service
public class ItemCosService {
	
    @Autowired
    private ItemCosRepository itemCosRepository;

//    public List<ItemCos> getAllLiniiCos(){
//        List<ItemCos> liniiCos = new ArrayList<>();
//        itemCosRepository.findAll().forEach(liniiCos::add);
//        return liniiCos;
//    }
//
//    public ItemCos getLineCos(Long id) {
//        return itemCosRepository.findById(id).get();
//    }
//
//    public void addLinieCos(ItemCos itemCos) {
//        itemCosRepository.save(itemCos);
//    }
//
//    public void updateLinieCos(Long id, ItemCos itemCos) {
//        itemCosRepository.save(itemCos);
//    }
//
//    public void deleteLinieCos(Long id) {
//        itemCosRepository.deleteById(id);
//    }

}
