package com.fstg.Agence.urbaine.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fstg.Agence.urbaine.bean.TypeDossier;

public interface TypeDossierDao extends JpaRepository<TypeDossier,Long>{
	public List<TypeDossier> findByNom(String Nom);
}
