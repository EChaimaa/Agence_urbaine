package com.fstg.Agence.urbaine.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fstg.Agence.urbaine.bean.Commission;
import com.fstg.Agence.urbaine.bean.CommissionItem;
import com.fstg.Agence.urbaine.bean.MembreCommission;
import com.fstg.Agence.urbaine.service.CommissionItemService;

@Service
public class CommissionItemServiceImpl implements CommissionItemService {

	@Override
	public List<CommissionItem> findByCommission(Commission commission) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CommissionItem> findByMembreCommission(MembreCommission membreCommission) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CommissionItem> findByCommissionAndMembreCommission(Commission commission,
			MembreCommission membreCommission) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CommissionItem> findByDateAffectation(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CommissionItem> findAll() {
		return null;
	}
	
}
