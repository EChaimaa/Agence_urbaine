package com.fstg.Agence.urbaine.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fstg.Agence.urbaine.bean.TypeProjet;

public interface TypeProjetDao extends JpaRepository<TypeProjet, Long> {
	
	public List<TypeProjet> findByLibelle(String libelle);
}
