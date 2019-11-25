package com.fstg.Agence.urbaine.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.Agence.urbaine.bean.TauxTaxe;
import com.fstg.Agence.urbaine.bean.TypeDossier;
import com.fstg.Agence.urbaine.bean.TypeProjet;

@Repository
public interface TauxTaxeDao extends JpaRepository<TauxTaxe, Long> {
	 //public List<TauxTaxe> findByDateFinApplicationGreaterThanAndDateDepartApplicationLowerThan(Date date);
	 public List<TauxTaxe> findByTypeDossier(TypeDossier typeDossier);
	 public List<TauxTaxe> findByTypeProjet(TypeProjet typeProjet);
	 public void save(TypeDossier typeDossier);
}
