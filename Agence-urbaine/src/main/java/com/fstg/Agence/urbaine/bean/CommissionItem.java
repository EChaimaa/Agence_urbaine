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
public class CommissionItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private MembreCommission membreCommission;
	@ManyToOne
	private Commission commission;
	@Temporal(TemporalType.DATE)
	private Date dateAffectation;
	
	private int vote;

	public CommissionItem() {
	}

	public CommissionItem(MembreCommission membreCommission, Commission commission, Date dateAffectation) {
		super();
		this.membreCommission = membreCommission;
		this.commission = commission;
		this.dateAffectation = dateAffectation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public MembreCommission getMembreCommission() {
		return membreCommission;
	}

	public void setMembreCommission(MembreCommission membreCommission) {
		this.membreCommission = membreCommission;
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

	public int getVote() {
		return vote;
	}

	public void setVote(int vote) {
		this.vote = vote;
	}

	@Override
	public String toString() {
		return "CommissionItem [id=" + id + ", membreCommission=" + membreCommission + ", commission=" + commission
				+ ", dateAffectation=" + dateAffectation + ", vote=" + vote + "]";
	}
	

}
