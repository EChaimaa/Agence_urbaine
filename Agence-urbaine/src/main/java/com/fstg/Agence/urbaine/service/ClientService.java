package com.fstg.Agence.urbaine.service;

import java.util.List;

import com.fstg.Agence.urbaine.bean.Client;

public interface ClientService {
	
	public void save(Client client);
	public Client findByRef(String Ref);
	public List<Client> findAll();
	public Client findByNomAndPrenom(String nom, String prenom);
    public Client findByTel(Long tel);
    public boolean exists(Long id);
    
}
