package com.magazin.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerCos {

//	// creez lista listaLinii (integer este id-ul liniei luat din id-ul produsului
//	private List<LinieCos> listaLinii = new ArrayList<>();


//	public Map<Integer, LinieCos> getListaLinii() {
//		return listaLinii;
//	}
//
//	public void setListaLinii(Map<Integer, LinieCos> listaLinii) {
//		this.listaLinii = listaLinii;
//	}
//
	// creez obiect cos care ia ca parametru listaLinii
	//private Cos cos = new Cos(listaLinii);

	private LinieCos l1 = new LinieCos(ProdusController.listaProduse.get(1) ,2);
	private LinieCos l2 = new LinieCos(ProdusController.listaProduse.get(0));
	private Cos cos = new Cos();
	{
		cos.addLinieInCos(l1);
		cos.addLinieInCos(l2);
	}

	
	@GetMapping("/cos")
	public Cos getCos() {
		return cos;
	}
	
//	@PostMapping(value = "/cos/add-linie")
//	public <LinieCos> addLinie (Produs produs) {
//		cos.addLinieInCos(new LinieCos(produs));
//		return listaLinii;
//	}

//	public void addLinieInCos(LinieCos linie){
//		liniiCos.add(linie);
//	}

//	@PostMapping(value = "/cos/add")
//	public Cos addLinie (@RequestBody Produs produs) {
//		LinieCos lc = new LinieCos(produs, 1);
//		listaLinii.put(lc.getProdus().getId(), lc);
//		return cos;
//	}
	

}
