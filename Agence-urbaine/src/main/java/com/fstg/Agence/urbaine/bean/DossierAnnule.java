package com.fstg.Agence.urbaine.bean;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class DossierAnnule extends Dossier{
	
	@Temporal(TemporalType.DATE)
	private Date dateAnnule;

	public DossierAnnule() {
		super();
	}

	public DossierAnnule(Dossier dossier) {
		super(dossier);
		Date date =new Date();
		this.dateAnnule = date;
	}

	public DossierAnnule(Long id, String ref, Date dateArrive, String lieuProjet, String descriptionProjet, int avis,
			User architect, Client client, BigDecimal superficie, User technicien, BigDecimal montantAPayer,
			BigDecimal montantPaye, Date datePaiement, TypeDossier typeDossier, TypeProjet typeProjet,
			Commission commission) {
		super(id, ref, dateArrive, lieuProjet, descriptionProjet, avis, architect, client, superficie, technicien,
				montantAPayer, montantPaye, datePaiement, typeDossier, typeProjet, commission);
	}


	public Date getDateAnnule() {
		return dateAnnule;
	}

	public void setDateAnnule(Date dateAnnule) {
		this.dateAnnule = dateAnnule;
	}

	@Override
	public String toString() {
		return "DossierAnnule [dateAnnule=" + dateAnnule + "]";
	}
	
	

}
