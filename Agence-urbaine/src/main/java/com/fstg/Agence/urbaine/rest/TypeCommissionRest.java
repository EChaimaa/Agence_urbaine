package com.fstg.Agence.urbaine.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.Agence.urbaine.bean.TypeCommission;
import com.fstg.Agence.urbaine.service.TypeCommissionService;

@RestController
@RequestMapping("/urbaine-api/client")
public class TypeCommissionRest {
	@Autowired
	 TypeCommissionService typeCommissionService;

	@GetMapping("/")
	public List<TypeCommission> findAll() {
		return typeCommissionService.findAll();
	}
	
	@PostMapping("/")
	public void save(@RequestBody TypeCommission typeCommission) {
		typeCommissionService.save(typeCommission);
	}
	
}
