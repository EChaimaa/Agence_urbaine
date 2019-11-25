package com.fstg.Agence.urbaine.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fstg.Agence.urbaine.bean.TypeDossier;

public interface TypeDossierDao extends JpaRepository<TypeDossier,Long>{
	public TypeDossier findByNom(String Nom);
}
