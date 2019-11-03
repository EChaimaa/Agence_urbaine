/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.Agence.urbaine.bean;

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
	private Date dateFintApplication;
	private Double montant;

	@ManyToOne
	private TypeDossier typeDossier;
	@ManyToOne
	private TypeProjet typeProjet;

	public TauxTaxe() {
	}

	public TauxTaxe(Long id, Date dateDepartApplication, Date dateFintApplication, Double montant,
			TypeDossier typeDossier, TypeProjet typeProjet) {
		this.id = id;
		this.dateDepartApplication = dateDepartApplication;
		this.dateFintApplication = dateFintApplication;
		this.montant = montant;
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

	public Date getDateFintApplication() {
		return dateFintApplication;
	}

	public void setDateFintApplication(Date dateFintApplication) {
		this.dateFintApplication = dateFintApplication;
	}

	public Double getMontant() {
		return montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
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
				+ dateFintApplication + ", montant=" + montant + ", typeDossier=" + typeDossier + ", typeProjet="
				+ typeProjet + "]";
	}

}
