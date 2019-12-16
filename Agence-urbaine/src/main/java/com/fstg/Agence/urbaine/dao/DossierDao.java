/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.Agence.urbaine.dao;

import com.fstg.Agence.urbaine.bean.Commission;
import com.fstg.Agence.urbaine.bean.Dossier;
import com.fstg.Agence.urbaine.bean.TypeDossier;
import com.fstg.Agence.urbaine.bean.User;

import ch.qos.logback.core.net.server.Client;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Chaimaa
 */
public interface DossierDao extends JpaRepository<Dossier, Long> {
    public Dossier findByRef(String ref);
    List<Dossier> findByDateArrive(Date date);
    List<Dossier> findByClient(Client client);
    List<Dossier> findByArchitect(User architect);
    List<Dossier> findByTechnicien(User technicien);
    List<Dossier> findByTypeDossier(TypeDossier typeDossier);
    List<Dossier> findByAvis(int avis);
    List<Dossier> findByCommission(Commission commission);
    List<Dossier> findBySuperficieLowerThen(BigDecimal superficie);
    List<Dossier> findBySuperficieGreaterThen(BigDecimal superficie);
}
