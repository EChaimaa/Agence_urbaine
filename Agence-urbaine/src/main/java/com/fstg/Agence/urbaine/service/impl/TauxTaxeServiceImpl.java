package com.fstg.Agence.urbaine.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.Agence.urbaine.bean.TauxTaxe;
import com.fstg.Agence.urbaine.bean.TypeDossier;
import com.fstg.Agence.urbaine.bean.TypeProjet;
import com.fstg.Agence.urbaine.dao.TauxTaxeDao;
import com.fstg.Agence.urbaine.service.TauxTaxeService;

@Service
public class TauxTaxeServiceImpl implements TauxTaxeService{
	@Autowired
	TauxTaxeDao tauxTaxeDao;
	
	@Override
	public void save(TauxTaxe tauxTaxe) {
		tauxTaxeDao.save(tauxTaxe);
	}

	@Override
	public int exists(TauxTaxe tauxTaxe) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<TauxTaxe> findByTypeDossier(TypeDossier dossier) {
		return tauxTaxeDao.findByTypeDossier(dossier);
	}

	@Override
	public List<TauxTaxe> findByTypeProjet(TypeProjet projet) {
		return tauxTaxeDao.findByTypeProjet(projet);
	}

	@Override
	public List<TauxTaxe> findByDateDepartApplicationGreaterThan(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TauxTaxe> findByDateFintApplication(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TauxTaxe findTaxe(Date daateDepart, Date dateFin, TypeDossier typeDossier, TypeProjet typeProjet) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TauxTaxe> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
