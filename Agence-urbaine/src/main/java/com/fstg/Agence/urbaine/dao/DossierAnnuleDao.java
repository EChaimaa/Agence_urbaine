package com.fstg.Agence.urbaine.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.Agence.urbaine.bean.DossierAnnule;

@Repository
public interface DossierAnnuleDao extends JpaRepository<DossierAnnule, Long> {
	public DossierAnnule findByRef(String ref);

	public boolean existsByRef(String ref);

	public List<DossierAnnule> findByAvis(int avis);
}
