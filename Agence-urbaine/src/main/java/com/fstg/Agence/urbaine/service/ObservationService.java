package com.fstg.Agence.urbaine.service;

import java.util.List;

import com.fstg.Agence.urbaine.bean.Dossier;
import com.fstg.Agence.urbaine.bean.Observation;
import com.fstg.Agence.urbaine.bean.User;

public interface ObservationService {
	 public List<Observation> findByUserAndDossier(User user, Dossier dossier);
	    public List<Observation> findByDossier(Dossier dossier);
	    public List<Observation> findByUser(User user);
	    public List<Observation> findAll();
}
