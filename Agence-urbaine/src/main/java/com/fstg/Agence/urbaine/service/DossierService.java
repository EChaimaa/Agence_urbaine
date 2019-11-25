package com.fstg.Agence.urbaine.service;

import java.util.Date;
import java.util.List;

import com.fstg.Agence.urbaine.bean.Commission;
import com.fstg.Agence.urbaine.bean.Dossier;
import com.fstg.Agence.urbaine.bean.TypeDossier;
import com.fstg.Agence.urbaine.bean.User;

import ch.qos.logback.core.net.server.Client;

public interface DossierService {
	public Dossier findByRef(String ref);

	List<Dossier> findByDateArrive(Date date);

	List<Dossier> findByClient(Client client);

	List<Dossier> findByArchitect(User architect);

	List<Dossier> findByTechnicien(User technicien);

	List<Dossier> findByTypeDossier(TypeDossier typeDossier);

	List<Dossier> findByAvis(int Avis);

	List<Dossier> findByCommission(Commission commission);
	public List<Dossier> findAll();
}
