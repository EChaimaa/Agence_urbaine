package com.fstg.Agence.urbaine.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fstg.Agence.urbaine.bean.Commission;
import com.fstg.Agence.urbaine.bean.Dossier;
import com.fstg.Agence.urbaine.bean.TypeDossier;
import com.fstg.Agence.urbaine.bean.User;


public interface DossierService {
	public List<Dossier> findAll();
	public Dossier findByRef(String ref);
	public boolean exist(Long id);
	public void save(Dossier dossier);
	public List<Dossier> findByDateArrive(Date date);
	public List<Dossier> findByClient(String ref);
	public List<Dossier> findByArchitect(User architect);
	public List<Dossier> findByTechnicien(User technicien);
	public List<Dossier> findByTypeDossier(TypeDossier typeDossier);
	public Dossier findByCommission(Commission commission);
	public List<Dossier> findBySuperficieLessThan(BigDecimal superficie);
	public List<Dossier> findBySuperficieGreaterThan(BigDecimal superficie);
	public int setAvis(Dossier dossier, int avis);
	public int setSerficie(Dossier dossier, BigDecimal superficie);
	public int setMontantAPayer(Dossier dossier, BigDecimal montantAPayer);
	
	public int payer(String refDossier, BigDecimal montant, Date date);
	
	public List<Dossier> dossiersNonPayes();
	
	public List<Dossier> findDossierNonFactures();
	
	public List<Dossier> findDossierValides();
	
	public List<Dossier> findDossierNonValides();
	
	public List<Dossier> findDossierWithAvisNeutre();
	
	public int archiver(Dossier dossier, boolean simul, boolean forcer);
}
