package com.fstg.Agence.urbaine.rest;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.Agence.urbaine.bean.Commission;
import com.fstg.Agence.urbaine.bean.Dossier;
import com.fstg.Agence.urbaine.service.ClientService;
import com.fstg.Agence.urbaine.service.DossierService;

@RestController
@RequestMapping("/urbaine-api/dossier")
public class DossierRest {
	@Autowired
	private DossierService dossierService;
	
	@Autowired
	private ClientService cs;
	

	public ClientService getCs() {
		return cs;
	}

	public void setCs(ClientService cs) {
		this.cs = cs;
	}

	public DossierService getDossierService() {
		return dossierService;
	}

	public void setDossierService(DossierService dossierService) {
		this.dossierService = dossierService;
	}
	
	@PostMapping("/")
	public void save(@RequestBody Dossier dossier) {
		dossierService.save(dossier);
	}
	
	@GetMapping("/")
	public List<Dossier> findAll(){
		return dossierService.findAll();
	}

	@GetMapping("/exist/{id}")
	public boolean exists(@PathVariable Long id) {
		return dossierService.exist(id);
	}
	
	@GetMapping("/ref/{ref}")
	public Dossier findByRef(@PathVariable String ref) {
		return dossierService.findByRef(ref);
	}

	@GetMapping("/date{date}")
	public List<Dossier> findByDateArrive(@PathVariable Date date) {
		return dossierService.findByDateArrive(date);
	}
	
	@GetMapping("/client/{ref}")
	public List<Dossier> findByClient(@PathVariable String ref){
		return dossierService.findByClient(ref);
	}
	
	@GetMapping("/commission/")
	public Dossier findByCommission(@RequestBody Commission commission) {
		return dossierService.findByCommission(commission);
	}
	
	@GetMapping("/nonPayes/")
	public List<Dossier> findDossiersNonPayes() {
		return dossierService.dossiersNonPayes();
	}
	
	@PutMapping("/payer/{ref}/{montant}/{date}")
	public int payer(@PathVariable String ref, @PathVariable BigDecimal montant, @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date date) {
		return dossierService.payer(ref, montant, date);
	}
	
	
	@GetMapping("/nonFactures/")
	public List<Dossier> findDossierNonFactures(){
		return dossierService.findDossierNonFactures();
	}

	@GetMapping("/valides/")
	public List<Dossier> findDossierValides() {
		return dossierService.findDossierValides();
	}

	@GetMapping("/nonValides/")
	public List<Dossier> findDossierNonValides() {
		return dossierService.findDossierNonValides();
	}

	@GetMapping("/avisNeutre/")
	public List<Dossier> findDossierWithAvisNeutre() {
		return dossierService.findDossierWithAvisNeutre();
	}
}
