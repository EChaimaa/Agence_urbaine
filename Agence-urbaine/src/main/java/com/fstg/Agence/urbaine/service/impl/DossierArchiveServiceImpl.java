package com.fstg.Agence.urbaine.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.Agence.urbaine.bean.Client;
import com.fstg.Agence.urbaine.bean.Commission;
import com.fstg.Agence.urbaine.bean.Dossier;
import com.fstg.Agence.urbaine.bean.DossierArchive;
import com.fstg.Agence.urbaine.bean.TypeDossier;
import com.fstg.Agence.urbaine.bean.User;
import com.fstg.Agence.urbaine.dao.DossierArchiveDao;
import com.fstg.Agence.urbaine.service.ClientService;
import com.fstg.Agence.urbaine.service.DossierArchiveService;

@Service
public class DossierArchiveServiceImpl implements DossierArchiveService {
	
	@Autowired
	DossierArchiveDao dd;
	
	@Autowired
	ClientService clientService;

	@Override
	public List<DossierArchive> findAll() {
		return dd.findAll();
	}

	@Override
	public DossierArchive findByRef(String ref) {
		return dd.findByRef(ref);
	}

	@Override
	public boolean exist(Long id) {
		return dd.existsById(id);
	}

	@Override
	public void save(DossierArchive dossier) {
		dd.save(dossier);		
	}

	@Override
	public List<DossierArchive> findByDateArrive(Date date) {
		return dd.findByDateArrive(date);
	}

	@Override
	public List<DossierArchive> findByClient(String ref) {
		Client client = clientService.findByRef(ref);
		if (client == null) {
			return null;
		}
		return dd.findByClient(client);
	}

	@Override
	public List<DossierArchive> findByArchitect(User architect) {
		return dd.findByArchitect(architect);
	}

	@Override
	public List<DossierArchive> findByTechnicien(User technicien) {
		return dd.findByTechnicien(technicien);
	}

	@Override
	public List<DossierArchive> findByTypeDossier(TypeDossier typeDossier) {
		return dd.findByTypeDossier(typeDossier);
	}

	@Override
	public Dossier findByCommission(Commission commission) {
		return dd.findByCommission(commission);
	}

	@Override
	public List<DossierArchive> findBySuperficieLessThan(BigDecimal superficie) {
		return dd.findBySuperficieLessThan(superficie);
	}

	@Override
	public List<DossierArchive> findBySuperficieGreaterThan(BigDecimal superficie) {
		return dd.findBySuperficieGreaterThan(superficie);
	}

	@Override
	public List<DossierArchive> findDossierValides() {
		return dd.findByAvis(1);
	}

	@Override
	public List<DossierArchive> findDossierNonValides() {
		return dd.findByAvis(-1);
	}

}
