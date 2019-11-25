package com.fstg.Agence.urbaine.service;

import java.util.Date;
import java.util.List;

import com.fstg.Agence.urbaine.bean.TauxTaxe;
import com.fstg.Agence.urbaine.bean.TypeDossier;
import com.fstg.Agence.urbaine.bean.TypeProjet;

public interface TauxTaxeService {
	public void save(TauxTaxe tauxTaxe);
	public int exists(TauxTaxe tauxTaxe);
	public List<TauxTaxe> findByTypeDossier(TypeDossier dossier);
	public List<TauxTaxe> findByTypeProjet(TypeProjet projet);
	public List<TauxTaxe> findByDateDepartApplicationLowerThan(Date date);
	public List<TauxTaxe> findByDateFintApplicationGreaterThan(Date date);
	public TauxTaxe findTaxe(Date daateDepart, Date dateFin, TypeDossier typeDossier, TypeProjet typeProjet);
}
