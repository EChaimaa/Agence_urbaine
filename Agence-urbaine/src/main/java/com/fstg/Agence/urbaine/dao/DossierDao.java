/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.Agence.urbaine.dao;

import com.fstg.Agence.urbaine.bean.Dossier;
import com.fstg.Agence.urbaine.bean.User;

import ch.qos.logback.core.net.server.Client;

import java.util.Date;
import java.util.List;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;

/**
 *
 * @author Chaimaa
 */
public interface DossierDao extends JpaAttributeConverter<Dossier, Long> {
    public Dossier findByRef(String ref);
    List<Dossier> findByDateArrive(Date date);
    List<Dossier> findByClient(Client client);
    List<Dossier> findByArchitect(User architect);
    List<Dossier> findByTechnicien(User technicien);
}
