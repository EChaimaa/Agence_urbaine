package com.fstg.Agence.urbaine.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fstg.Agence.urbaine.bean.Commission;
import com.fstg.Agence.urbaine.bean.Dossier;
import com.fstg.Agence.urbaine.bean.DossierArchive;
import com.fstg.Agence.urbaine.bean.TypeDossier;
import com.fstg.Agence.urbaine.bean.User;

public interface DossierArchiveService {
	public List<DossierArchive> findAll();
	public DossierArchive findByRef(String ref);
	public boolean exist(Long id);
	public void save(DossierArchive dossier);
	public List<DossierArchive> findByDateArrive(Date date);
	public List<DossierArchive> findByClient(String ref);
	public List<DossierArchive> findByArchitect(User architect);
	public List<DossierArchive> findByTechnicien(User technicien);
	public List<DossierArchive> findByTypeDossier(TypeDossier typeDossier);
	public Dossier findByCommission(Commission commission);
	public List<DossierArchive> findBySuperficieLessThan(BigDecimal superficie);
	public List<DossierArchive> findBySuperficieGreaterThan(BigDecimal superficie);
	
	public List<DossierArchive> findDossierValides();
	
	public List<DossierArchive> findDossierNonValides();
	
}
