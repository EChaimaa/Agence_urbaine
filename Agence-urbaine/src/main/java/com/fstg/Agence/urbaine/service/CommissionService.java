package com.fstg.Agence.urbaine.service;

import java.util.Date;
import java.util.List;

import com.fstg.Agence.urbaine.bean.Commission;
import com.fstg.Agence.urbaine.bean.MembreCommission;

public interface CommissionService {
	public List<Commission> findAll();

	public Commission findByRef(String ref);

	public List<Commission> findByDateDepartCommission(Date date);

	public List<Commission> findByDateFinCommission(Date date);

	public List<Commission> findCommissionGoingOn(Date date);

	public List<Commission> findByDateDepartCommissionAfter(Date date);

	public List<Commission> findByDateFinCommissionBefore(Date date);

	public List<Commission> findByChefCommission(MembreCommission chefCommission);
	
}
