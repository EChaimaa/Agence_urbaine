package com.fstg.Agence.urbaine.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fstg.Agence.urbaine.bean.TypeCommission;

public interface TypeCommissionDao extends JpaRepository<TypeCommission,Long> {
	
	public List<TypeCommission> findByLibelle(String libelle);
}