package com.example.demo.model.services.users;

import java.util.List;

import com.example.demo.models.entity.User;

public interface IclienteService {
	public List<User> findAll();
	
	public User save(User clientes);
	
	public User findById(Long id);
	
	public void delete(Long id);
	
	User findByNameData(String name,String password);
}
