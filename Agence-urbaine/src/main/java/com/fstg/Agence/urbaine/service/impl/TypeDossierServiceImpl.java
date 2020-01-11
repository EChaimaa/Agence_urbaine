package com.fstg.Agence.urbaine.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.Agence.urbaine.bean.TypeDossier;
import com.fstg.Agence.urbaine.dao.TypeDossierDao;
import com.fstg.Agence.urbaine.service.TypeDossierService;

@Service
public class TypeDossierServiceImpl implements TypeDossierService {
	
	@Autowired
	TypeDossierDao tdd;

	@Override
	public List<TypeDossier> findAll() {
		return tdd.findAll();
	}

	@Override
	public TypeDossier findByLibelle(String libelle) {
		return tdd.findByLibelle(libelle);
	}

	@Override
	public void save(TypeDossier typeDossier) {
		tdd.save(typeDossier);
	}

	

}
