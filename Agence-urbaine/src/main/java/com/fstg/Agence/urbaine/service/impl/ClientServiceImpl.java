package com.fstg.Agence.urbaine.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.Agence.urbaine.bean.Client;
import com.fstg.Agence.urbaine.dao.ClientDao;
import com.fstg.Agence.urbaine.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService{
	@Autowired
	private ClientDao clientDao;

	public ClientDao getClientDao() {
		return clientDao;
	}

	public void setClientDao(ClientDao clientDao) {
		this.clientDao = clientDao;
	}

	@Override
	public void save(Client client) {
		clientDao.save(client);
	}

	@Override
	public List<Client> findAll() {
		return clientDao.findAll();
	}

	@Override
	public Client findByNomAndPrenom(String nom, String prenom) {
		return clientDao.findByNomAndPrenom(nom, prenom);
	}

	@Override
	public Client findByTel(Long tel) {
		return clientDao.findByTel(tel);
	}

	@Override
	public Client findByRef(String Ref) {
		return clientDao.findByRef(Ref);
	}

	@Override
	public boolean exists(Long id) {
		return clientDao.existsById(id);
	}

}
