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
import com.fstg.Agence.urbaine.bean.CommissionItem;
import com.fstg.Agence.urbaine.bean.MembreCommission;
import com.fstg.Agence.urbaine.service.CommissionItemService;
import com.fstg.Agence.urbaine.service.CommissionService;
import com.fstg.Agence.urbaine.service.MembreCommissionService;

@RestController
@RequestMapping("/urbaine-api/CommissionItem")
public class CommissionItemRest {

	@Autowired
	private CommissionItemService commissionItemService;

	@Autowired
	CommissionService cs;
	@Autowired
	MembreCommissionService mcs;

	public CommissionItemService getCommissionItemService() {
		return commissionItemService;
	}

	public void setCommissionItemService(CommissionItemService commissionItemService) {
		this.commissionItemService = commissionItemService;
	}

	@GetMapping("/commission/")
	public List<CommissionItem> findByCommission(@RequestBody Commission commission) {
		return commissionItemService.findByCommission(commission);
	}

	@GetMapping("/Membre/")
	public List<CommissionItem> findByMembreCommission(@RequestBody MembreCommission membrecommission) {
		return commissionItemService.findByMembreCommission(membrecommission);
	}

	@GetMapping("/commission//Membre/{membreCommission}")
	public List<CommissionItem> findByCommissionAndMembreCommission(@PathVariable String refCommission,
			@PathVariable String refMembreCommission) {

		Commission commission = cs.findByRef(refCommission);
		if (commission == null) {
			return null;
		}

		MembreCommission membreCommission = mcs.findByRef(refMembreCommission);
		
		if (membreCommission == null) {
			return null;
		}

		return commissionItemService.findByCommissionAndMembreCommission(commission, membreCommission);

	}

	@GetMapping("/date/{date}")
	public List<CommissionItem> findByDate(@PathVariable Date date) {
		return commissionItemService.findByDateAffectation(date);
	}

	@GetMapping("/")
	public List<CommissionItem> findAll() {
		return commissionItemService.findAll();
	}
}
