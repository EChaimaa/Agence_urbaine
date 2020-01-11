package com.fstg.Agence.urbaine.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	public void save(TypeDossier typeDossier) {
		dossierService.save(typeDossier);
	}
	
	public TypeDossier findByLibelle(String libelle) {
		return dossierService.findByLibelle(libelle);
	}
}
