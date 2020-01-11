package com.fstg.Agence.urbaine.service;

import java.util.List;

import com.fstg.Agence.urbaine.bean.MembreCommission;

public interface MembreCommissionService {
	public List<MembreCommission> findAll();
	public MembreCommission findByNomAndPrenom(String nom,String prenom);
	public void save(MembreCommission membreCommission);
}
