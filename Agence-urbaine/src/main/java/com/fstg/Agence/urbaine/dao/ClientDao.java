package com.fstg.Agence.urbaine.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.Agence.urbaine.bean.Client;


@Repository
public interface ClientDao extends JpaRepository<Client, Long> {
	public Client findByRef(String Ref);
    public Client findByNomAndPrenom(String nom, String prenom);
    public Client findByTel(Long tel);
}
