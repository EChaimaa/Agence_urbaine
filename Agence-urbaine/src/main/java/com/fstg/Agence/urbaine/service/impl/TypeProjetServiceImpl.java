package com.fstg.Agence.urbaine.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.Agence.urbaine.bean.TypeProjet;
import com.fstg.Agence.urbaine.dao.TypeProjetDao;
import com.fstg.Agence.urbaine.service.TypeProjetService;

@Service
public class TypeProjetServiceImpl implements TypeProjetService{
	@Autowired
	TypeProjetDao tpd;

	@Override
	public List<TypeProjet> findAll() {
		return tpd.findAll();
	}

	@Override
	public TypeProjet findByLibelle(String libelle) {
		return tpd.findByLibelle(libelle);
	}

	@Override
	public void save(TypeProjet typeProjet) {
		tpd.save(typeProjet);
	}

}
