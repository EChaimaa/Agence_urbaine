package com.fstg.Agence.urbaine.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.Agence.urbaine.bean.Role;
import com.fstg.Agence.urbaine.bean.User;

@Repository
public interface userDao extends JpaRepository<User, Long> {
	public User findByLogin(String login);
	public User findByEmail(String email);
	public User findByRole(Role role);
}
