package com.magazin.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CosService {

	

    @Autowired
    private CosRepository cosRepository;

//    public Cos getcos(){
//        Cos cos = new Cos();
//        cosRepository.findAll().toString();
//        return utilizatori;
//    }
//
//    public Utilizator getUtilizator(Long id) {
//        return utilizatorRepository.findById(id).get();
//    }
//
//    public void addUtilizator(Utilizator utilizator) {
//    	utilizatorRepository.save(utilizator);
//    }
//
//    public void updateUtilizator(Long id, Utilizator utilizator) {
//    	utilizatorRepository.save(utilizator);
//    }
//
//    public void deleteUtilizator(Long id) {
//    	utilizatorRepository.deleteById(id);
//    }
    
    
}
