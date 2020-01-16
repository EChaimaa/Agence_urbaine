package com.fstg.Agence.urbaine.dao;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fstg.Agence.urbaine.bean.Client;
import com.fstg.Agence.urbaine.bean.Commission;
import com.fstg.Agence.urbaine.bean.DossierArchive;
import com.fstg.Agence.urbaine.bean.TypeDossier;
import com.fstg.Agence.urbaine.bean.User;

@Repository
public interface DossierArchiveDao extends JpaRepository<DossierArchive, Long> {
	public DossierArchive findByRef(String ref);

	public boolean existsByRef(String ref);

	public List<DossierArchive> findByAvis(int avis);

	public List<DossierArchive> findByDateArrive(Date date);

	public List<DossierArchive> findByClient(Client client);

	public List<DossierArchive> findByArchitect(User architect);

	public List<DossierArchive> findByTechnicien(User technicien);

	public List<DossierArchive> findByTypeDossier(TypeDossier typeDossier);

	public DossierArchive findByCommission(Commission commission);

	public List<DossierArchive> findBySuperficieLessThan(BigDecimal superficie);

	public List<DossierArchive> findBySuperficieGreaterThan(BigDecimal superficie);

	@Query("Select d from Dossier d where d.montantAPayer > d.montantPaye")
	public List<DossierArchive> findDossiersNonPayes();

	@Query("Select d from Dossier d where d.montantAPayer IS NULL or d.montantAPayer = 0")
	public List<DossierArchive> findDossierNonFactures();
}
