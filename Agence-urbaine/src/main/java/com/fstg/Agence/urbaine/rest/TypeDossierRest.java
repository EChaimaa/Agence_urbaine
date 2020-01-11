package com.fstg.Agence.urbaine.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.Agence.urbaine.bean.TypeDossier;
import com.fstg.Agence.urbaine.service.TypeDossierService;

@RestController
@RequestMapping("/urbaine-api/typeDossier")
public class TypeDossierRest {
	@Autowired
	TypeDossierService dossierService;
	
	@GetMapping("/")
	public List<TypeDossier> findAll() {
		return dossierService.findAll();
	}
	
	@PostMapping("/")
	public void save(@RequestBody TypeDossier typeDossier) {
		dossierService.save(typeDossier);
	}
	
	@GetMapping("/libelle/{libelle}")
	public TypeDossier findByLibelle(@PathVariable String libelle) {
		return dossierService.findByLibelle(libelle);
	}
}
