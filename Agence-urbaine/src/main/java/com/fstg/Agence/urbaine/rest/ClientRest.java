package com.fstg.Agence.urbaine.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.Agence.urbaine.bean.Client;
import com.fstg.Agence.urbaine.service.ClientService;

@RestController
@RequestMapping("/urbaine-api/client")
public class ClientRest {
	@Autowired
	private ClientService clientService;
	
	public ClientService getClientService() {
		return clientService;
	}
	public void setClientService(ClientService clientService) {
		this.clientService = clientService;
	}
	@PostMapping("/")
	public void save(@RequestBody Client client) {
		clientService.save(client);
	}
	@GetMapping("/ref/{Ref}")
	public Client findByRef(@PathVariable String Ref) {
		return clientService.findByRef(Ref);
	}
	@GetMapping("/")
	public List<Client> findAll() {
		return clientService.findAll();
	}
	
	public Client findByNomAndPrenom(String nom, String prenom) {
		return clientService.findByNomAndPrenom(nom, prenom);
	}
	@GetMapping("/tel/{tel}")
	public Client findByTel(@PathVariable Long tel) {
		return clientService.findByTel(tel);
	}

}
