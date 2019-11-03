/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.Agence.urbaine.dao;

import com.fstg.Agence.urbaine.bean.Dossier;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;

/**
 *
 * @author Chaimaa
 */
public interface DossierDao extends JpaAttributeConverter<Dossier, Long> {
    public Dossier findByRef(String ref);
}
