package com.fstg.Agence.urbaine.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.Agence.urbaine.bean.DossierAnnule;
import com.fstg.Agence.urbaine.dao.DossierAnnuleDao;
import com.fstg.Agence.urbaine.service.DossierAnnuleService;

@Service
public class DossierAnnuleServiceImpl implements DossierAnnuleService{

	@Autowired
	DossierAnnuleDao dd;
	
	@Override
	public void save(DossierAnnule dossier) {
		dd.save(dossier);
	}

}
