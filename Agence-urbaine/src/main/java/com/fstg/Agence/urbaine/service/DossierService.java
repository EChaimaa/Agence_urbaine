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
	List<Dossier> findByDateArrive(Date date);
	List<Dossier> findByClient(String ref);
	List<Dossier> findByArchitect(User architect);
	List<Dossier> findByTechnicien(User technicien);
	List<Dossier> findByTypeDossier(TypeDossier typeDossier);
	List<Dossier> findByCommission(Commission commission);
//	List<Dossier> findBySuperficieLowerThan(BigDecimal superficie);
//    List<Dossier> findBySuperficieGreaterThan(BigDecimal superficie);
    public void save(Dossier dossier);
}
