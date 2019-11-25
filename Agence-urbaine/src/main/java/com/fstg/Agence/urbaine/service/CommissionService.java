package com.fstg.Agence.urbaine.service;

import java.util.Date;
import java.util.List;

import com.fstg.Agence.urbaine.bean.Commission;

public interface CommissionService {
	public Commission findByRef(String ref);

	public List<Commission> findByDateDepartCommission(Date date);

	public List<Commission> findByDateFinCommission(Date date);

	public List<Commission> findByChefCommission(Date date);
	
	public List<Commission> findAll();
}
