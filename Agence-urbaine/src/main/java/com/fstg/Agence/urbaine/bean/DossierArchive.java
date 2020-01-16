package com.fstg.Agence.urbaine.bean;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class DossierArchive extends Dossier {
	private Date dateArchi;

	public DossierArchive() {
		super();
		Date date = new Date();
		this.dateArchi = date;
	}
	

	public DossierArchive(Dossier dossier) {
		super(dossier);
		Date date =new Date();
		this.dateArchi = date;
	}


	public DossierArchive(Long id, String ref, Date dateArrive, String lieuProjet, String descriptionProjet, int avis,
			User architect, Client client, BigDecimal superficie, User technicien, BigDecimal montantAPayer,
			BigDecimal montantPaye, Date datePaiement, TypeDossier typeDossier, TypeProjet typeProjet,
			Commission commission) {
		super(id, ref, dateArrive, lieuProjet, descriptionProjet, avis, architect, client, superficie, technicien,
				montantAPayer, montantPaye, datePaiement, typeDossier, typeProjet, commission);
	}

	public Date getDateArchi() {
		return dateArchi;
	}

	public void setDateArchi(Date dateArchi) {
		this.dateArchi = dateArchi;
	}

	@Override
	public String toString() {
		return super.toString() + "DossierArchive [dateArchi=" + dateArchi + "]";
	}

}
