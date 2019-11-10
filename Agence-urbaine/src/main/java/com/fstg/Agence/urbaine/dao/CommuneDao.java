package com.fstg.Agence.urbaine.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.Agence.urbaine.bean.Commune;

@Repository
public interface CommuneDao extends JpaRepository<Commune, Long> {
	List<Commune> findByNom(String nom);
}
