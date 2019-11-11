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
public class Observation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Temporal(TemporalType.DATE)
	private Date dateObservation;
	private String objet;
	private String message;
	@ManyToOne
	private User user;

	@ManyToOne
	private Dossier dossier;

	public Observation() {
	}

	public Observation(Date dateObservation, String objet, String message, User user, Dossier dossier) {
		this.dateObservation = dateObservation;
		this.objet = objet;
		this.message = message;
		this.user = user;
		this.dossier = dossier;
	}

	public Date getDateObservation() {
		return dateObservation;
	}

	public void setDateObservation(Date dateObservation) {
		this.dateObservation = dateObservation;
	}

	public String getObjet() {
		return objet;
	}

	public void setObjet(String objet) {
		this.objet = objet;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Dossier getDossier() {
		return dossier;
	}

	public void setDossier(Dossier dossier) {
		this.dossier = dossier;
	}

	@Override
	public String toString() {
		return "Observation [dateObservation=" + dateObservation + ", objet=" + objet + ", message=" + message
				+ ", user=" + user + "]";
	}
}
