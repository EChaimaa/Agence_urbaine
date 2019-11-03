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
public class CommisionItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private MembreCommision membreCommision;
	@ManyToOne
	private Commission commission;
	@Temporal(TemporalType.DATE)
	private Date dateAffectation;

	public CommisionItem() {
	}

	public CommisionItem(MembreCommision membreCommision, Commission commission, Date dateAffectation) {
		super();
		this.membreCommision = membreCommision;
		this.commission = commission;
		this.dateAffectation = dateAffectation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public MembreCommision getMembreCommision() {
		return membreCommision;
	}

	public void setMembreCommision(MembreCommision membreCommision) {
		this.membreCommision = membreCommision;
	}

	public Commission getCommission() {
		return commission;
	}

	public void setCommission(Commission commission) {
		this.commission = commission;
	}

	public Date getDateAffectation() {
		return dateAffectation;
	}

	public void setDateAffectation(Date dateAffectation) {
		this.dateAffectation = dateAffectation;
	}

	@Override
	public String toString() {
		return "CommisionItem [membreCommision=" + membreCommision + ", commission=" + commission + ", dateAffectation="
				+ dateAffectation + "]";
	}

}
