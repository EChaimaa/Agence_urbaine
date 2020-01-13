/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.Agence.urbaine.bean;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class TauxTaxe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Temporal(TemporalType.DATE)
	private Date dateDepartApplication;
	@Temporal(TemporalType.DATE)
	private Date dateFinApplication;
	private BigDecimal taux;

	@ManyToOne
	private TypeDossier typeDossier;
	@ManyToOne
	private TypeProjet typeProjet;

	public TauxTaxe() {
		this.taux = BigDecimal.ZERO;
	}

	public TauxTaxe(Long id, Date dateDepartApplication, Date dateFintApplication, BigDecimal taux,
			TypeDossier typeDossier, TypeProjet typeProjet) {
		this.id = id;
		this.dateDepartApplication = dateDepartApplication;
		this.dateFinApplication = dateFintApplication;
		
		if(taux == null) this.taux = BigDecimal.ZERO;
		else this.taux = taux;
		
		this.typeDossier = typeDossier;
		this.typeProjet = typeProjet;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateDepartApplication() {
		return dateDepartApplication;
	}

	public void setDateDepartApplication(Date dateDepartApplication) {
		this.dateDepartApplication = dateDepartApplication;
	}

	

	public Date getDateFinApplication() {
		return dateFinApplication;
	}

	public void setDateFinApplication(Date dateFinApplication) {
		this.dateFinApplication = dateFinApplication;
	}

	public BigDecimal getTaux() {
		return taux;
	}

	public void setTaux(BigDecimal taux) {
		this.taux = taux;
	}

	public TypeDossier getTypeDossier() {
		return typeDossier;
	}

	public void setTypeDossier(TypeDossier typeDossier) {
		this.typeDossier = typeDossier;
	}

	public TypeProjet getTypeProjet() {
		return typeProjet;
	}

	public void setTypeProjet(TypeProjet typeProjet) {
		this.typeProjet = typeProjet;
	}

	@Override
	public String toString() {
		return "TauxTaxe [id=" + id + ", dateDepartApplication=" + dateDepartApplication + ", dateFintApplication="
				+ dateFinApplication + ", taux=" + taux + ", typeDossier=" + typeDossier + ", typeProjet="
				+ typeProjet + "]";
	}

}
