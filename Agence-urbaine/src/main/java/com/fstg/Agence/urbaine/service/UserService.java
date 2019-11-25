package com.fstg.Agence.urbaine.service;

import java.util.List;

import com.fstg.Agence.urbaine.bean.Role;
import com.fstg.Agence.urbaine.bean.User;

public interface UserService {
	public User findByLogin(String login);
	public User findByEmail(String email);
	public User findByRole(Role role);
	public List<User> findAll();
}
