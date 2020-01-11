package com.fstg.Agence.urbaine.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.Agence.urbaine.bean.Commission;
import com.fstg.Agence.urbaine.bean.CommissionItem;
import com.fstg.Agence.urbaine.bean.MembreCommission;
import com.fstg.Agence.urbaine.dao.CommissionDao;
import com.fstg.Agence.urbaine.service.CommissionService;
import com.fstg.Agence.urbaine.service.DossierService;

@Service
public class CommissionServiceImpl implements CommissionService {

	@Autowired
	CommissionDao cd;
	
	@Autowired
	DossierService ds;
	
	@Override
	public Commission findByRef(String ref) {
		return cd.findByRef(ref);
	}

	@Override
	public List<Commission> findByDateDepartCommission(Date date) {
		return cd.findByDateDepartCommission(date);
	}

	@Override
	public List<Commission> findByDateFinCommission(Date date) {
		return cd.findByDateFinCommission(date);
	}

	@Override
	public List<Commission> findByChefCommission(MembreCommission chefCommission) {
		return cd.findByChefCommission(chefCommission);
	}

	@Override
	public List<Commission> findAll() {
		return cd.findAll();
	}

	@Override
	public List<Commission> findCommissionGoingOn(Date date) {
		return cd.findCommissionGoingOn(date);
	}

	@Override
	public List<Commission> findByDateDepartCommissionAfter(Date date) {
		return cd.findByDateDepartCommissionAfter(date);
	}

	@Override
	public List<Commission> findByDateFinCommissionBefore(Date date) {
		return cd.findByDateFinCommissionBefore(date);
	}

	@Override
	public void save(Commission commission) {
		cd.save(commission);
	}

	@Override
	public void setAvisDossier(Commission commission) {
		int count = 0;
		for (CommissionItem commissionItem : commission.getCommissionItems()) {
			count += commissionItem.getVote();
		}
		
		
		//ds.setAvis(ds.findByCommission(commission), count);
		
	}

	
	
	

}
