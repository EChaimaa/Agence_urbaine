package com.fstg.Agence.urbaine.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fstg.Agence.urbaine.bean.MembreCommission;

public interface MembreCommissionDao extends JpaRepository<MembreCommission, Long>{
	public MembreCommission findByNomAndPrenom(String nom,String prenom);
	

}
