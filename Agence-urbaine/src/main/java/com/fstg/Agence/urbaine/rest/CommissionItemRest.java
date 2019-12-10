package com.fstg.Agence.urbaine.rest;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.Agence.urbaine.bean.Commission;
import com.fstg.Agence.urbaine.bean.CommissionItem;
import com.fstg.Agence.urbaine.bean.MembreCommission;
import com.fstg.Agence.urbaine.service.CommissionItemService;

@RestController
@RequestMapping("/urbaine-api/CommissionItem")
public class CommissionItemRest {
	@Autowired
	private CommissionItemService commissionItemService;

	public CommissionItemService getCommissionItemService() {
		return commissionItemService;
	}

	public void setCommissionItemService(CommissionItemService commissionItemService) {
		this.commissionItemService = commissionItemService;
	}
	
	@GetMapping("/commission/{commission}")
	public List<CommissionItem> findByCommission(@PathVariable Commission commission) {
		return  commissionItemService.findByCommission(commission);
	}
	
	@GetMapping("/Membre/{membrecommission}")
	public List<CommissionItem> findByMembreCommission(@PathVariable MembreCommission membrecommission) {
		return  commissionItemService.findByMembreCommission(membrecommission);
	}

	@GetMapping("/commission/{commission}/Membre/{membreCommission}")
	public List<CommissionItem> findByCommissionAndMembreCommission(@PathVariable Commission commission,MembreCommission membreCommission) {
		return  commissionItemService.findByCommissionAndMembreCommission(commission,membreCommission);
	}
	@GetMapping("/date/{date}")
	public List<CommissionItem> findByDate(@PathVariable Date date) {
		return  commissionItemService.findByDateAffectation(date);
	}
	@GetMapping("/")
	public List<CommissionItem> findAll() {
		return  commissionItemService.findAll();
	}
}
