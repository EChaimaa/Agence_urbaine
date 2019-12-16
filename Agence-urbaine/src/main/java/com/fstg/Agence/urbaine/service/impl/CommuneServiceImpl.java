package com.fstg.Agence.urbaine.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.Agence.urbaine.bean.Commune;
import com.fstg.Agence.urbaine.dao.CommuneDao;
import com.fstg.Agence.urbaine.service.CommuneService;

@Service
public class CommuneServiceImpl implements CommuneService {
	@Autowired
	CommuneDao cd;

	@Override
	public List<Commune> findByNom(String nom) {
		return cd.findByNom(nom);
	}

	@Override
	public List<Commune> findAll() {
		return cd.findAll();
	}

}
