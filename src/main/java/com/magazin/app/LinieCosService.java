package com.magazin.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LinieCosService {
	

    @Autowired
    private LinieCosRepository linieCosRepository;

    public List<LinieCos> getAllLiniiCos(){
        List<LinieCos> liniiCos = new ArrayList<>();
        linieCosRepository.findAll().forEach(liniiCos::add);
        return liniiCos;
    }

    public LinieCos getLineCos(Long id) {
        return linieCosRepository.findById(id).get();
    }

    public void addLinieCos(LinieCos linieCos) {
        linieCosRepository.save(linieCos);
    }

    public void updateLinieCos(Long id, LinieCos linieCos) {
        linieCosRepository.save(linieCos);
    }

    public void deleteLinieCos(Long id) {
        linieCosRepository.deleteById(id);
    }

}
