package com.fstg.Agence.urbaine.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.Agence.urbaine.bean.Commission;
import com.fstg.Agence.urbaine.bean.CommissionItem;
import com.fstg.Agence.urbaine.bean.MembreCommission;
import com.fstg.Agence.urbaine.dao.CommissionItemDao;
import com.fstg.Agence.urbaine.service.CommissionItemService;

@Service
public class CommissionItemServiceImpl implements CommissionItemService {
	@Autowired
	CommissionItemDao cid;

	@Override
	public List<CommissionItem> findByCommission(Commission commission) {
		return cid.findByCommission(commission);
	}

	@Override
	public List<CommissionItem> findByMembreCommission(MembreCommission membreCommission) {
		return cid.findByMembreCommission(membreCommission);
	}

	@Override
	public List<CommissionItem> findByCommissionAndMembreCommission(Commission commission,
			MembreCommission membreCommission) {
		return cid.findByCommissionAndMembreCommission(commission, membreCommission);
	}

	@Override
	public List<CommissionItem> findByDateAffectation(Date date) {
		return cid.findByDateAffectation(date);
	}

	@Override
	public List<CommissionItem> findAll() {
		return cid.findAll();
	}

}
