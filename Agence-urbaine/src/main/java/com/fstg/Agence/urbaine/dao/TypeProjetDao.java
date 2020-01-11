package com.fstg.Agence.urbaine.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.fstg.Agence.urbaine.bean.TypeProjet;

public interface TypeProjetDao extends JpaRepository<TypeProjet, Long> {
	
	public TypeProjet findByLibelle(String libelle);
}
