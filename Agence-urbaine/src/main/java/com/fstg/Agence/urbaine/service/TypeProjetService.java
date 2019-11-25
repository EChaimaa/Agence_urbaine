package com.fstg.Agence.urbaine.service;

import java.util.List;

import com.fstg.Agence.urbaine.bean.TypeProjet;

public interface TypeProjetService {
public List<TypeProjet> findAll();
public List<TypeProjet> findByLibelle(String libelle);
}
