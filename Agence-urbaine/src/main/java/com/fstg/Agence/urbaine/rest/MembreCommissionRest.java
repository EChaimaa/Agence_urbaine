package com.fstg.Agence.urbaine.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.Agence.urbaine.bean.MembreCommission;
import com.fstg.Agence.urbaine.service.MembreCommissionService;

@RestController
@RequestMapping("/urbaine-api/membreCommission")
public class MembreCommissionRest {
	@Autowired
	MembreCommissionService mcs;
	
	@GetMapping("/nom/{nom}/prenom/{prenom}")
	public MembreCommission findByNomAndPrenom(@PathVariable String nom,@PathVariable String prenom) {
		return mcs.findByNomAndPrenom(nom, prenom);
	}
	@PostMapping("/")
	public void save(@RequestBody MembreCommission membreCommission) {
		mcs.save(membreCommission);
	}
	@GetMapping("/")
	public List<MembreCommission> findAll() {
		return mcs.findAll();
	}
}

