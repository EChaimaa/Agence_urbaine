package com.fstg.Agence.urbaine.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.Agence.urbaine.service.TypeCommissionService;

@RestController
@RequestMapping("/urbaine-api/client")
public class TypeCommissionRest {
	@Autowired
	private TypeCommissionService typeCommissionService;

	public TypeCommissionService getTypeCommissionService() {
		return typeCommissionService;
	}

	public void setTypeCommissionService(TypeCommissionService typeCommissionService) {
		this.typeCommissionService = typeCommissionService;
	}
	
}
