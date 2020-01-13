package com.fstg.Agence.urbaine.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.Agence.urbaine.bean.TauxTaxe;
import com.fstg.Agence.urbaine.service.TauxTaxeService;

@RestController
@RequestMapping("/urbaine-api/taux")
public class TauxTaxeRest {
	
	@Autowired
	TauxTaxeService tauxTaxeService;
	
	@PostMapping("/")
	public int save(@RequestBody TauxTaxe tauxTaxe) {
		return tauxTaxeService.save(tauxTaxe);
	}
	
	@GetMapping("/")
	public List<TauxTaxe> findAll(){
		return tauxTaxeService.findAll();
	}
	
	@PutMapping("/montantDossier/{ref}")
	public int setMontantDossier(@PathVariable String ref) {
		return tauxTaxeService.setMontantDossier(ref);
	}
}
