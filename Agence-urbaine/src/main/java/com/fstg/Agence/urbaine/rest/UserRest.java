package com.fstg.Agence.urbaine.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.Agence.urbaine.bean.Role;
import com.fstg.Agence.urbaine.bean.User;
import com.fstg.Agence.urbaine.service.UserService;

@RestController
@RequestMapping("/urbaine-api/user")
public class UserRest {
	@Autowired
	private UserService userService;
	
	public UserService getUserService(UserService userService) {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;	
	}
	@PostMapping("/")
	public void save(@RequestBody User user) {
		userService.save(user);
	}
	@GetMapping("/login/{login}")
	public List<User> findByLogin(@PathVariable String login) {
		return userService.findByLogin(login);
	}
	@GetMapping("/email/{email}")
	public List<User> findByEmail(@PathVariable String email) {
		return userService.findByEmail(email);
	}
	@GetMapping("/role/")
	public List<User> findByRole(@RequestBody Role role) {
		return userService.findByRole(role);
	}
	@GetMapping("/")
	public List<User> findAll() {
		return userService.findAll();
	}
	@GetMapping("/exist/")
	public int exists(@RequestBody User user) {
		return userService.exists(user);
	}
	@GetMapping("/block/")
	public void Block(@RequestBody User user) {
		userService.Block(user);
	}

}
