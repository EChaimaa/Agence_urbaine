package com.fstg.Agence.urbaine.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.Agence.urbaine.bean.MembreCommission;
import com.fstg.Agence.urbaine.dao.MembreCommissionDao;
import com.fstg.Agence.urbaine.service.MembreCommissionService;

@Service
public class MembreCommissionServiceImpl implements MembreCommissionService{
	@Autowired
	MembreCommissionDao mcd;
	
	@Override
	public List<MembreCommission> findAll() {
		return mcd.findAll();
	}

	
	@Override
	public void save(MembreCommission membreCommission) {
		mcd.save(membreCommission);
	}


	@Override
	public MembreCommission findByNomAndPrenom(String nom, String prenom) {
		return mcd.findByNomAndPrenom(nom, prenom);
	}

}
