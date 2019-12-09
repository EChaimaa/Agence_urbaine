package com.fstg.Agence.urbaine.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fstg.Agence.urbaine.bean.Commission;
import com.fstg.Agence.urbaine.bean.MembreCommission;
import com.fstg.Agence.urbaine.service.CommissionService;

@Service
public class CommissionServiceImpl implements CommissionService {

	@Override
	public Commission findByRef(String ref) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Commission> findByDateDepartCommission(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Commission> findByDateFinCommission(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Commission> findByChefCommission(MembreCommission chefCommission) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Commission> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Commission> findByDateCommission(Date dateDepart, Date dateFin) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
