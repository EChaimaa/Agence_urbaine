package com.fstg.Agence.urbaine.service;

import java.util.Date;
import java.util.List;

import com.fstg.Agence.urbaine.bean.Commission;
import com.fstg.Agence.urbaine.bean.CommissionItem;
import com.fstg.Agence.urbaine.bean.MembreCommission;

public interface CommissionItemService {
	public List<CommissionItem> findByCommission(Commission commission);

	public List<CommissionItem> findByMembreCommission(MembreCommission membreCommission);

	public List<CommissionItem> findByCommissionAndMembreCommission(Commission commission,MembreCommission membreCommission);

	public List<CommissionItem> findByDateAffectation(Date date);
	
	public List<CommissionItem> findAll();
}
