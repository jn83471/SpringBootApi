package com.example.demo.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.services.users.IclienteService;
import com.example.demo.models.entity.Prospect;
import com.example.demo.models.entity.User;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class UsersController {
	@Autowired
	private IclienteService clienteservice;
	@GetMapping("/user")
	public List<User> index(){
		return clienteservice.findAll();
	}
	@GetMapping("/usuarios/{id}")
	public User show(@PathVariable Long id) {
		return clienteservice.findById(id);
	}
	@PostMapping("/user")
	public User create(@RequestParam("user") String user,@RequestParam("pass") String password) {
		return clienteservice.findByNameData(user, password);
	}

}
