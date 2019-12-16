package com.fstg.Agence.urbaine.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.Agence.urbaine.bean.Commission;
import com.fstg.Agence.urbaine.bean.Dossier;
import com.fstg.Agence.urbaine.bean.TypeDossier;
import com.fstg.Agence.urbaine.bean.User;
import com.fstg.Agence.urbaine.dao.DossierDao;
import com.fstg.Agence.urbaine.service.DossierService;

import ch.qos.logback.core.net.server.Client;

@Service
public class DossierServiceImpl implements DossierService{

	@Autowired
	DossierDao dd;
	
	@Override
	public Dossier findByRef(String ref) {
		return dd.findByRef(ref);
	}

	@Override
	public List<Dossier> findByDateArrive(Date date) {
		return dd.findByDateArrive(date);
	}

	@Override
	public List<Dossier> findByClient(Client client) {
		return dd.findByClient(client);
	}

	@Override
	public List<Dossier> findByArchitect(User architect) {
		return dd.findByArchitect(architect);
	}

	@Override
	public List<Dossier> findByTechnicien(User technicien) {
		return dd.findByTechnicien(technicien);
	}

	@Override
	public List<Dossier> findByTypeDossier(TypeDossier typeDossier) {
		return dd.findByTypeDossier(typeDossier);
	}

	@Override
	public List<Dossier> findByAvis(int avis) {
		return dd.findByAvis(avis);
	}

	@Override
	public List<Dossier> findByCommission(Commission commission) {
		return dd.findByCommission(commission);
	}

	@Override
	public List<Dossier> findAll() {
		return dd.findAll();
	}

	@Override
	public List<Dossier> findBySuperficieLowerThen(BigDecimal superficie) {
		return dd.findBySuperficieLowerThen(superficie);
	}

	@Override
	public List<Dossier> findBySuperficieGreaterThen(BigDecimal superficie) {
		return dd.findBySuperficieGreaterThen(superficie);
	}

}
