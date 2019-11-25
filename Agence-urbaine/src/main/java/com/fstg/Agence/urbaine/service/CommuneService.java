package com.fstg.Agence.urbaine.service;

import java.util.List;

import com.fstg.Agence.urbaine.bean.Commune;

public interface CommuneService {
	List<Commune> findByNom(String nom);
	public List<Commune> findAll();
}
