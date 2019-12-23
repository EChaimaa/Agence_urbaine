package com.fstg.Agence.urbaine.service;

import java.util.List;

import com.fstg.Agence.urbaine.bean.TypeCommission;

public interface TypeCommissionService {
public List<TypeCommission> findAll();
public List <TypeCommission> findbyLibelle(String libelle);
}
