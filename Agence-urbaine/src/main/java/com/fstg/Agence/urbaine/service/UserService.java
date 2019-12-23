package com.fstg.Agence.urbaine.service;

import java.util.List;

import com.fstg.Agence.urbaine.bean.Role;
import com.fstg.Agence.urbaine.bean.User;

public interface UserService {
	public List<User> findByLogin(String login);
	public List<User> findByEmail(String email);
	public List<User> findByRole(Role role);
	public List<User> findAll();
	public User save(User user);
	public int exists(User user);
	public void Block(User user);
	
}
