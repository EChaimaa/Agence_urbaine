/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.Agence.urbaine.dao;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fstg.Agence.urbaine.bean.Client;
import com.fstg.Agence.urbaine.bean.Commission;
import com.fstg.Agence.urbaine.bean.Dossier;
import com.fstg.Agence.urbaine.bean.TypeDossier;
import com.fstg.Agence.urbaine.bean.User;


public interface DossierDao extends JpaRepository<Dossier, Long> {
    public Dossier findByRef(String ref);
    public boolean existsByRef(String ref);
    public List<Dossier> findByAvis(int avis);
    public List<Dossier> findByDateArrive(Date date);
    public List<Dossier> findByClient(Client client);
    public List<Dossier> findByArchitect(User architect);
    public List<Dossier> findByTechnicien(User technicien);
    public List<Dossier> findByTypeDossier(TypeDossier typeDossier);
    public Dossier findByCommission(Commission commission);
    public List<Dossier> findBySuperficieLessThan(BigDecimal superficie);
    public List<Dossier> findBySuperficieGreaterThan(BigDecimal superficie);
    
    @Query("Select d from Dossier d where d.montantAPayer > d.montantPaye")
    public List<Dossier> findDossiersNonPayes();
    
    @Query("Select d from Dossier d where d.montantAPayer IS NULL or d.montantAPayer = 0")
    public List<Dossier> findDossierNonFactures();
}
