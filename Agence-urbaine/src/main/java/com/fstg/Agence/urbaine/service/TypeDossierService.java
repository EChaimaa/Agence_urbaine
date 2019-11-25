package com.fstg.Agence.urbaine.service;

import java.util.List;

import com.fstg.Agence.urbaine.bean.TypeDossier;

public interface TypeDossierService {
public List<TypeDossier> findAll();
public List<TypeDossier> findByNom(String Nom);
}
