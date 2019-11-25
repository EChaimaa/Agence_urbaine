package com.fstg.Agence.urbaine.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fstg.Agence.urbaine.bean.Dossier;
import com.fstg.Agence.urbaine.bean.Observation;
import com.fstg.Agence.urbaine.bean.User;
import com.fstg.Agence.urbaine.service.ObservationService;

@Service
public class ObservationServiceImpl implements ObservationService {

	@Override
	public List<Observation> findByUserAndDossier(User user, Dossier dossier) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Observation> findByDossier(Dossier dossier) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Observation> findByUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Observation> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
