package com.fstg.Agence.urbaine.rest;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.Agence.urbaine.bean.Dossier;
import com.fstg.Agence.urbaine.service.DossierService;

@RestController
@RequestMapping("/urbaine-api/Dossier")
public class DossierRest {
	@Autowired
	private DossierService dossierService;

	public DossierService getDossierService() {
		return dossierService;
	}

	public void setDossierService(DossierService dossierService) {
		this.dossierService = dossierService;
	}
	@GetMapping("/ref/{Ref}")
	public Dossier findByRef(@PathVariable String Ref) {
		return dossierService.findByRef(Ref);
	}
	@GetMapping("/date{date}")
	public List<Dossier> findByDateArrive(Date date) {
		return dossierService.findByDateArrive(date);
	}
//	@GetMapping("/Client{client}")
//	public List<Dossier> findByClient(Client client) {
//		return dossierService.findByClient(client);
//	}
}
