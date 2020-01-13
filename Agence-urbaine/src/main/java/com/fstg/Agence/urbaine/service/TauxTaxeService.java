package com.fstg.Agence.urbaine.service;

import java.util.Date;
import java.util.List;

import com.fstg.Agence.urbaine.bean.TauxTaxe;
import com.fstg.Agence.urbaine.bean.TypeDossier;
import com.fstg.Agence.urbaine.bean.TypeProjet;

public interface TauxTaxeService {
	public int save(TauxTaxe tauxTaxe);
	public boolean exists(TauxTaxe tauxTaxe);
	public List<TauxTaxe> findByTypeDossier(TypeDossier dossier);
	public List<TauxTaxe> findByTypeProjet(TypeProjet projet);
	public List<TauxTaxe> findByDateDepartApplicationLowerThan(Date date);
	public List<TauxTaxe> findByDateFinApplicationGreaterThan(Date date);
	public TauxTaxe findTaxe(Date dateDepart, Date dateFin, TypeDossier typeDossier, TypeProjet typeProjet);
	public List<TauxTaxe> findAll();
	public List<TauxTaxe> findByTypeDossierAndTypeProjet(TypeDossier typeDossier, TypeProjet typeProjet);
	public TauxTaxe findByTypeDossierAndTypeProjetAndDateDepartApplicationBeforeAndDateFinApplicationAfter(TypeDossier typeDossier, TypeProjet typeProjet, Date date, Date date2Unused);
	public int setMontantDossier(String refDossier);
	
	}
