package com.fstg.Agence.urbaine.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.Agence.urbaine.bean.Client;
import com.fstg.Agence.urbaine.bean.Commission;
import com.fstg.Agence.urbaine.bean.Dossier;
import com.fstg.Agence.urbaine.bean.TypeDossier;
import com.fstg.Agence.urbaine.bean.User;
import com.fstg.Agence.urbaine.dao.DossierDao;
import com.fstg.Agence.urbaine.service.ClientService;
import com.fstg.Agence.urbaine.service.DossierService;

@Service
public class DossierServiceImpl implements DossierService {

	@Autowired
	DossierDao dd;

	@Autowired
	ClientService clientService;

	@Override
	public Dossier findByRef(String ref) {
		return dd.findByRef(ref);
	}

	@Override
	public List<Dossier> findByDateArrive(Date date) {
		return dd.findByDateArrive(date);
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
	public Dossier findByCommission(Commission commission) {
		return dd.findByCommission(commission);
	}

	@Override
	public List<Dossier> findAll() {
		return dd.findAll();
	}



	@Override
	public boolean exist(Long id) {
		return dd.existsById(id);
	}

	@Override
	public List<Dossier> findByClient(String ref) {

		Client client = clientService.findByRef(ref);
		if (client == null) {
			return null;
		}
		return dd.findByClient(client);
	}

	@Override
	public void save(Dossier dossier) {
		dd.save(dossier);
	}

	@Override
	public List<Dossier> findBySuperficieLessThan(BigDecimal superficie) {
		return dd.findBySuperficieLessThan(superficie);
	}

	@Override
	public List<Dossier> findBySuperficieGreaterThan(BigDecimal superficie) {
		return dd.findBySuperficieGreaterThan(superficie);
	}

	@Override
	public int setAvis(String ref, int avis) {
		if(! dd.existsByRef(ref)) {
			return -1;
		}
		Dossier dossier = new Dossier();
		dossier = dd.findByRef(ref);
		dossier.setAvis(avis);
		return 1;
	}

}
