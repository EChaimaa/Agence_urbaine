package com.fstg.Agence.urbaine.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.Agence.urbaine.bean.Client;
import com.fstg.Agence.urbaine.bean.Commission;
import com.fstg.Agence.urbaine.bean.Dossier;
import com.fstg.Agence.urbaine.bean.DossierAnnule;
import com.fstg.Agence.urbaine.bean.DossierArchive;
import com.fstg.Agence.urbaine.bean.TypeDossier;
import com.fstg.Agence.urbaine.bean.User;
import com.fstg.Agence.urbaine.dao.DossierDao;
import com.fstg.Agence.urbaine.service.ClientService;
import com.fstg.Agence.urbaine.service.DossierAnnuleService;
import com.fstg.Agence.urbaine.service.DossierArchiveService;
import com.fstg.Agence.urbaine.service.DossierService;
import com.fstg.Agence.urbaine.service.TauxTaxeService;

@Service
public class DossierServiceImpl implements DossierService {

	@Autowired
	DossierDao dd;

	@Autowired
	ClientService clientService;

	@Autowired
	DossierAnnuleService dossierAnnuleServ;

	@Autowired
	DossierArchiveService dossierArchiServ;
	
	@Autowired
	TauxTaxeService ts;

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

	
	// Chaimaa
	@Override
	public int setAvis(Dossier dossier, int avis) {
		if (dossier == null) {
			return -1;
		}
		
		if(dossier.getFois() == 3) archiver(dossier, false, false);//archiver le dossier si il a deja eu 3 chances
		
		dossier.setAvis(avis);
		dossier.setFois(dossier.getFois() + 1);
		dd.save(dossier);
		return 1;
	}

	@Override
	public int setSerficie(Dossier dossier, BigDecimal superficie) {
		if (dossier == null) {
			return -1;
		}
		dossier.setSuperficie(superficie);
		dd.save(dossier);
		
		ts.setMontantDossier(dossier.getRef());
		
		return 1;
	}

	
	// Chaimaa
	@SuppressWarnings("deprecation")
	@Override
	public int setMontantAPayer(Dossier dossier, BigDecimal montantAPayer) {
		if (dossier == null) {
			return -1;
		}

		dossier.setMontantAPayer(montantAPayer);

		Date date = new Date();  // today' date
		date.setMonth(date.getMonth() + 1); // add a month to dotay's date

		dossier.setDateLimitPaiement(date);  // set it as delay for payment
		dd.save(dossier);
		return 1;
	}

	@Override
	public List<Dossier> dossiersNonPayes() {
		return dd.findDossiersNonPayes();
	}

	
	// Chaimaa
	@Override
	public int payer(String refDossier, BigDecimal montant, Date date) {
		if (montant == null || date == null || montant.doubleValue() <= 0)
			return -1;

		Dossier dossier = findByRef(refDossier);
		if (dossier == null || dossier.getMontantAPayer() == BigDecimal.ZERO || dossier.getAvis() != 1)
			return -2;

		if (date.after(dossier.getDateLimitPaiement())) {
			DossierAnnule dossierAnnule = new DossierAnnule(dossier);

			dossierAnnuleServ.save(dossierAnnule);

			dd.delete(dossier);

			return -3;
		}

		if (montant.compareTo(dossier.getMontantAPayer()) != 0)
			return -4;

		dossier.setMontantPaye(montant);
		dossier.setDatePaiement(date);
		save(dossier);

		archiver(dossier, false, false);

		return 1;
	}

	@Override
	public List<Dossier> findDossierNonFactures() {
		return dd.findDossierNonFactures();
	}

	@Override
	public List<Dossier> findDossierValides() {
		return dd.findByAvis(1);
	}

	@Override
	public List<Dossier> findDossierNonValides() {
		return dd.findByAvis(-1);
	}

	@Override
	public List<Dossier> findDossierWithAvisNeutre() {
		return dd.findByAvis(0);
	}

	
	// Chaimaa
	@Override
	public int archiver(Dossier dossier, boolean simul, boolean forcer) {

		if (dossier == null)
			return -1;

		if (dossier.getAvis() == 1) {

			if (dossier.getMontantAPayer() == null || dossier.getMontantAPayer() == BigDecimal.ZERO
					|| dossier.getMontantPaye() == null
					|| dossier.getMontantAPayer().compareTo(dossier.getMontantPaye()) != 0) { // not paid
				return -2;
			} else {
				if (simul = false) {

					DossierArchive dossierArchive = new DossierArchive(dossier);

					dossierArchiServ.save(dossierArchive);

					dd.delete(dossier);

				}
				return 1;
			}

		} else {
			if (dossier.getFois() == 3) {
				if (simul = false) {

					DossierArchive dossierArchive = new DossierArchive(dossier);

					dossierArchiServ.save(dossierArchive);

					dd.delete(dossier);

				}
				return 1;
			} else {
				if (forcer) { // le mode forcer pour archiver un dossier sans avoir atteint la troisieme
								// chance
					if (simul = false) {

						DossierArchive dossierArchive = new DossierArchive(dossier);

						dossierArchiServ.save(dossierArchive);

						dd.delete(dossier);

					}
					return 1;
				}
				return -3; // si on n'active pas le mode forcer
			}
		}

	}

}
