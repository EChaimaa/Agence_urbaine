package com.fstg.Agence.urbaine.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.Agence.urbaine.bean.Role;
import com.fstg.Agence.urbaine.bean.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
	public List<User> findByLogin(String login);
	public List<User> findByEmail(String email);
	public List<User> findByRole(Role role);
	public List<User> findByBlocked(boolean blocked);
	public User findByNomAndPrenom(String Nom,String Prenom);
}
