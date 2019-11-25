package com.fstg.Agence.urbaine.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fstg.Agence.urbaine.bean.Commission;
import com.fstg.Agence.urbaine.bean.Dossier;
import com.fstg.Agence.urbaine.bean.TypeDossier;
import com.fstg.Agence.urbaine.bean.User;
import com.fstg.Agence.urbaine.service.DossierService;

import ch.qos.logback.core.net.server.Client;

@Service
public class DossierServiceImpl implements DossierService{

	@Override
	public Dossier findByRef(String ref) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dossier> findByDateArrive(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dossier> findByClient(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dossier> findByArchitect(User architect) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dossier> findByTechnicien(User technicien) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dossier> findByTypeDossier(TypeDossier typeDossier) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dossier> findByAvis(int Avis) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dossier> findByCommission(Commission commission) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dossier> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
