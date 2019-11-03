package com.fstg.Agence.urbaine.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ch.qos.logback.core.net.server.Client;

@Repository
public interface ClientDao extends JpaRepository<Client, Long> {
    public Client findByNomAndPrenom(String nom, String prenom);
    public Client findByTel(Long tel);
}
