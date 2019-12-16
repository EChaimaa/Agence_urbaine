package com.fstg.Agence.urbaine.rest;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.Agence.urbaine.bean.Commission;
import com.fstg.Agence.urbaine.bean.MembreCommission;
import com.fstg.Agence.urbaine.service.CommissionService;

@RestController
@RequestMapping("/urbaine-api/commission")
public class CommissionRest {
	@Autowired
	private CommissionService commissionService;
	public CommissionService getCommissionService() {
		return commissionService;
	}
	public void setCommissionService(CommissionService commissionService) {
		this.commissionService = commissionService;
	}
	@GetMapping("/ref/{Ref}")
	public Commission findByRef(@PathVariable String Ref) {
		return commissionService.findByRef(Ref);
	}
	@GetMapping("/")
	public List<Commission> findAll() {
		return commissionService.findAll();
	}
	@GetMapping("/dateDepart/{date}")
	public List<Commission> findByDateDepartCommission(@PathVariable Date date) {
		return commissionService.findByDateDepartCommission(date);
	}
	@GetMapping("/dateFin/{date}")
	public List<Commission> findByDateFinCommission(@PathVariable Date date) {
		return commissionService.findByDateFinCommission(date);
	}

	@GetMapping("/chef/")
	public List<Commission> findByChefCommission(@RequestBody MembreCommission chefCommission) {
		return commissionService.findByChefCommission(chefCommission);
	}
	
	@GetMapping("/dateSup/{date}")
	public List<Commission> findByDateFinCommissionBefore(@PathVariable Date date) {
		return commissionService.findByDateFinCommissionBefore(date);
	}
	
	@GetMapping("/dateInf/{date}")
	public List<Commission> findByDateFinCommissionAfter(@PathVariable Date date) {
		return commissionService.findByDateDepartCommissionAfter(date);
	}
}
