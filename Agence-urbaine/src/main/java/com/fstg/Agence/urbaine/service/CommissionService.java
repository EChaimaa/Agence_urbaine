package com.fstg.Agence.urbaine.service;

import java.util.Date;
import java.util.List;

import com.fstg.Agence.urbaine.bean.Commission;
import com.fstg.Agence.urbaine.bean.MembreCommission;

public interface CommissionService {
	public Commission findByRef(String ref);

	public List<Commission> findByDateDepartCommission(Date date);

	public List<Commission> findByDateFinCommission(Date date);

	public List<Commission> findByDateCommission(Date dateDepart, Date dateFin);

	public List<Commission> findByChefCommission(MembreCommission chefCommission);

	public List<Commission> findAll();
}
