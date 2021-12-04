package com.magazin.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerCos {

	// creez lista listaLinii (integer este id-ul liniei luat din id-ul produsului
	private Map<Integer, LinieCos> listaLinii = new HashMap<>();

		
	public Map<Integer, LinieCos> getListaLinii() {
		return listaLinii;
	}

	public void setListaLinii(Map<Integer, LinieCos> listaLinii) {
		this.listaLinii = listaLinii;
	}

	// creez obiect cos care ia ca parametru listaLinii
	//private Cos cos = new Cos(listaLinii);
	private Cos cos = new Cos();
	{
		cos.setListaLiniiCos(listaLinii);
	}
	
	// creez linii cu produse si le adaug in listaLinii
	{
	listaLinii.put(3, new LinieCos(ControllerProdus.listaProduse.get(3), 1));
	LinieCos lc = new LinieCos(ControllerProdus.listaProduse.get(2), 1);
	listaLinii.put(lc.getProdusLinie().getId(), lc);
	}
	
	@GetMapping("/cos")
	public Cos getCos() {
		return cos;
	}
	
//	@PostMapping(value = "/cos/add")
//	public List<LinieCos> addLinie (Produs produs) {
//		listaLinii.add(new LinieCos(produs, 1));
//		return listaLinii;
//	}

	@PostMapping(value = "/cos/add")
	public Cos addLinie (@RequestBody Produs produs) {
		LinieCos lc = new LinieCos(produs, 1);
		listaLinii.put(lc.getProdusLinie().getId(), lc);
		return cos;
	}
	

}
