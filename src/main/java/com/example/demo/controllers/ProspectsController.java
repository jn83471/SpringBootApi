package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.services.users.IprospectsService;
import com.example.demo.models.entity.Prospect;
 
@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class ProspectsController {
	@Autowired
	private IprospectsService clienteservice;
	@PostMapping("/prospects")
	public List<Prospect> create() {
		return clienteservice.withvalue();
	}
	@GetMapping("/prospects/{id}")
	public Prospect create(@PathVariable Long id) {
		return clienteservice.withvalue(id);
	}
}
