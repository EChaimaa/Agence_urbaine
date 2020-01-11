package com.fstg.Agence.urbaine.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.Agence.urbaine.bean.TypeProjet;
import com.fstg.Agence.urbaine.service.TypeProjetService;

@RestController
@RequestMapping("/urbaine-api/typeProjet")
public class TypeProjetRest {
	
	@Autowired
	TypeProjetService typeProjetService;
	
	@PostMapping("/")
	public void save(TypeProjet typeProjet) {
		typeProjetService.save(typeProjet);
	}
	
	@GetMapping("/")
	public List<TypeProjet> findAll(){
		return typeProjetService.findAll();
	}
	
	@GetMapping("/libelle/{libelle}")
	public TypeProjet findByLibelle(@PathVariable String libelle) {
		return typeProjetService.findByLibelle(libelle);
	}
	
}
