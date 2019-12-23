package com.fstg.Agence.urbaine.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.Agence.urbaine.bean.Role;
import com.fstg.Agence.urbaine.bean.User;
import com.fstg.Agence.urbaine.dao.UserDao;
import com.fstg.Agence.urbaine.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;

	@Override
	public List<User> findByLogin(String login) {
		return userDao.findByLogin(login);
	}

	@Override
	public List<User> findByEmail(String email) {
		return userDao.findByEmail(email);
	}

	@Override
	public List<User> findByRole(Role role) {
		return userDao.findByRole(role);
	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public User save(User user) {
		return userDao.save(user);
	}

	@Override
	public int exists(User user) {
		if (userDao.existsById(user.getId())) {
			return 1;
		}
		return 0;
	}

	@Override
	public void Block(User user) {
		user.setBlocked(false);
	}

}
