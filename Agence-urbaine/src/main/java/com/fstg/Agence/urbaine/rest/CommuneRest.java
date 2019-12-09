package com.fstg.Agence.urbaine.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.Agence.urbaine.bean.Commune;
import com.fstg.Agence.urbaine.service.CommuneService;

@RestController
@RequestMapping("/urbaine-api/Commune")
public class CommuneRest {
	@Autowired
	private CommuneService  communeService;

	public CommuneService getCommuneService() {
		return communeService;
	}

	public void setCommuneService(CommuneService communeService) {
		this.communeService = communeService;
	}
	
	@GetMapping("/")
	public List<Commune> findAll() {
		return communeService.findAll();
	}
	
}
