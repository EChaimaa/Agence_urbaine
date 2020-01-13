package com.fstg.Agence.urbaine.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.Agence.urbaine.bean.Dossier;
import com.fstg.Agence.urbaine.bean.TauxTaxe;
import com.fstg.Agence.urbaine.bean.TypeDossier;
import com.fstg.Agence.urbaine.bean.TypeProjet;
import com.fstg.Agence.urbaine.dao.TauxTaxeDao;
import com.fstg.Agence.urbaine.service.DossierService;
import com.fstg.Agence.urbaine.service.TauxTaxeService;

@Service
public class TauxTaxeServiceImpl implements TauxTaxeService{
	
	@Autowired
	TauxTaxeDao tauxTaxeDao;
	
	@Autowired
	DossierService dossierService;
	
	@Override
	public int save(TauxTaxe tauxTaxe) {
		if(tauxTaxeDao.existsByTypeDossierAndTypeProjetAndDateDepartApplicationAndDateFinApplication(tauxTaxe.getTypeDossier(), tauxTaxe.getTypeProjet(), tauxTaxe.getDateDepartApplication(), tauxTaxe.getDateFinApplication())) {
			return -1;
		}
		tauxTaxeDao.save(tauxTaxe);
		return 1;
		
	}

	@Override
	public boolean exists(TauxTaxe tauxTaxe) {
		if(tauxTaxeDao.existsById(tauxTaxe.getId())) return true;
		return false;
	}

	@Override
	public List<TauxTaxe> findByTypeDossier(TypeDossier dossier) {
		return tauxTaxeDao.findByTypeDossier(dossier);
	}

	@Override
	public List<TauxTaxe> findByTypeProjet(TypeProjet projet) {
		return tauxTaxeDao.findByTypeProjet(projet);
	}

	@Override
	public List<TauxTaxe> findByDateDepartApplicationLowerThan(Date date) {
		return tauxTaxeDao.findByDateDepartApplicationBefore(date);
	}

	@Override
	public List<TauxTaxe> findByDateFinApplicationGreaterThan(Date date) {
		return tauxTaxeDao.findByDateFinApplicationAfter(date);
	}

	@Override
	public TauxTaxe findTaxe(Date dateDepart, Date dateFin, TypeDossier typeDossier, TypeProjet typeProjet) {
		return null;
	}

	@Override
	public List<TauxTaxe> findAll() {
		return tauxTaxeDao.findAll();
	}

	@Override
	public List<TauxTaxe> findByTypeDossierAndTypeProjet(TypeDossier typeDossier, TypeProjet typeProjet) {
		return tauxTaxeDao.findByTypeDossierAndTypeProjet(typeDossier, typeProjet);
	}

	@Override
	public TauxTaxe findByTypeDossierAndTypeProjetAndDateDepartApplicationBeforeAndDateFinApplicationAfter(
			TypeDossier typeDossier, TypeProjet typeProjet, Date date, Date date2Unsed) {
		return tauxTaxeDao.findByTypeDossierAndTypeProjetAndDateDepartApplicationBeforeAndDateFinApplicationAfter(typeDossier, typeProjet, date, date);
	}

	@Override
	public int setMontantDossier(String refDossier) {
		Dossier dossier = dossierService.findByRef(refDossier);
		
		
		if(dossier == null) return -1;
		
		TauxTaxe tauxTaxe = findByTypeDossierAndTypeProjetAndDateDepartApplicationBeforeAndDateFinApplicationAfter(dossier.getTypeDossier(), dossier.getTypeProjet(), dossier.getDateArrive(), null);
		
		
		if(tauxTaxe == null) return -2;
		
		if(dossier.getSuperficie() == null || tauxTaxe.getTaux() == null) return -3;
		
		BigDecimal montantAPayer = dossier.getSuperficie().multiply(tauxTaxe.getTaux());
		dossierService.setMontantAPayer(dossier, montantAPayer);
		
		return 3;
	}
	
}
