package com.fstg.Agence.urbaine.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.Agence.urbaine.bean.Commission;
import com.fstg.Agence.urbaine.bean.CommissionItem;
import com.fstg.Agence.urbaine.bean.MembreCommission;

@Repository
public interface CommissionItemDao extends JpaRepository<CommissionItem, Long> {
	public List<CommissionItem> findByCommission(Commission commission);

	public List<CommissionItem> findByMembreCommission(MembreCommission membreCommission);

	public List<CommissionItem> findByCommissionAndMembreCommission(Commission commission, MembreCommission membreCommission);

	public List<CommissionItem> findByDateAffectation(Date date);
}
